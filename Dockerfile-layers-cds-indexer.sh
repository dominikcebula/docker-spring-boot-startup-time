#!/bin/bash

set -xe

docker build -t exchange-rates-docker-layers-cds-indexer -f Dockerfile-layers-cds --network=host --build-arg MVN_PROFILE=-Pwith-spring-indexer .
docker run --rm --cpus 0.5 -m 768mb -p 8080:8080 --add-host=host.docker.internal:host-gateway -e DB_HOST=host.docker.internal exchange-rates-docker-layers-cds-indexer
