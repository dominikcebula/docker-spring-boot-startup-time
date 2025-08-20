#!/bin/bash

set -xe

mvn clean install

java -XX:AOTMode=record -XX:AOTConfiguration=app.aotconf -Dspring.context.exit=onRefresh -jar target/exchange-rates-sample-*.jar
java -XX:AOTMode=create -XX:AOTConfiguration=app.aotconf -XX:AOTCache=app.aot -jar target/exchange-rates-sample-*.jar \
      && rm app.aotconf

docker build -t exchange-rates-docker-layers-aot-cache -f Dockerfile-layers-aot-cache .
docker run --rm --cpus 0.5 -m 768mb -p 8080:8080 --add-host=host.docker.internal:host-gateway -e DB_HOST=host.docker.internal exchange-rates-docker-layers-aot-cache
