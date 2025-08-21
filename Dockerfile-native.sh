#!/bin/bash

docker stop docker-bridge
set -xe
docker run --name docker-bridge --rm -p 2375:2375 -v //var/run/docker.sock://var/run/docker.sock alpine/socat tcp-listen:2375,reuseaddr,fork unix-connect:/var/run/docker.sock &
docker build --add-host=host.docker.internal:host-gateway -f Dockerfile-native .
docker stop docker-bridge

docker run --rm --cpus 0.5 -m 768mb -p 8080:8080 --add-host=host.docker.internal:host-gateway -e DB_HOST=host.docker.internal docker.io/library/exchange-rates-sample:1.0.0-SNAPSHOT
