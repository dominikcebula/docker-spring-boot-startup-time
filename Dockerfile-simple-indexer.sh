#!/bin/bash

set -xe

mvn clean install -Pwith-spring-indexer
docker build -t exchange-rates-docker-simple-indexer -f Dockerfile-simple .
docker run --rm --cpus 0.5 -m 768mb -p 8080:8080 --add-host=host.docker.internal:host-gateway -e DB_HOST=host.docker.internal exchange-rates-docker-simple-indexer
