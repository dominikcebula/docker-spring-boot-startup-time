#!/bin/bash

docker build -t exchange-rates-docker-layers -f Dockerfile-layers .
docker run --rm -p 8080:8080 -e DB_HOST=host.docker.internal exchange-rates-docker-layers
