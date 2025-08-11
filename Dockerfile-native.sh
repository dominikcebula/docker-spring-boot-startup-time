#!/bin/bash

mvn clean install -Pnative
mvn -Pnative spring-boot:build-image

docker run --rm --cpus 0.5 -m 768mb -p 8080:8080 --add-host=host.docker.internal:host-gateway -e DB_HOST=host.docker.internal docker.io/library/exchange-rates-sample:1.0.0-SNAPSHOT
