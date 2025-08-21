# Docker Spring Boot Startup Time Measurements

## Introduction

This repository contains a sample Spring Boot application with a Dockerfile to measure startup time under different
configurations.

## Used Technologies

- Java 21, Java 24
- Spring Boot
- Spring Native
- Spring Indexer
- layertools
- CDS
- AOT
- Docker
- Docker Compose
- Maven

## Measurement Results

TBD

## Execution

### Prerequisites

Some measurements require access to the database used by the application. You can use PostgreSQL running in a
Docker container. To run it, execute the following command:

```bash
docker compose up
```

### Running measurements

To run measurements, execute each helper bash script that will build the application for the specific configuration
type and run it.

```bash
Dockerfile-simple.sh
Dockerfile-simple-indexer.sh
Dockerfile-simple-cds.sh
Dockerfile-simple-aot-cache.sh
Dockerfile-layers.sh
Dockerfile-layers-indexer.sh
Dockerfile-layers-cds.sh
Dockerfile-layers-cds-indexer.sh
Dockerfile-layers-aot-cache.sh
Dockerfile-native.sh
```

## Author

Dominik Cebula

- https://dominikcebula.com/
- https://blog.dominikcebula.com/
- https://www.udemy.com/user/dominik-cebula/
