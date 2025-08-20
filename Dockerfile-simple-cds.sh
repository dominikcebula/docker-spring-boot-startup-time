#!/bin/bash

set -xe

mvn clean install
docker build -t exchange-rates-docker-simple-cds -f Dockerfile-simple-cds --network=host .
docker run --rm --cpus 0.5 -m 768mb -p 8080:8080 --add-host=host.docker.internal:host-gateway -e DB_HOST=host.docker.internal exchange-rates-docker-simple-cds
