#!/bin/bash

docker build -t exchange-rates-docker-simple -f Dockerfile-simple .
docker run -p 8080:8080 -e DB_HOST=host.docker.internal exchange-rates-docker-simple
