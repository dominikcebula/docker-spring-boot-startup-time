# Docker Spring Boot Startup Time Measurements

## Introduction

This repository contains a sample Spring Boot application and a Dockerfile to measure startup times under different
configurations.

## Technologies Used

- Java 21, Java 24
- Spring Boot
- Spring Native
- Spring Indexer
- Layertools
- CDS
- AOT
- Docker
- Docker Compose
- Maven

## Measurement Results

TBD

## How to Run

### Prerequisites

Some measurements require access to the application's database. You can use PostgreSQL running in a Docker container. To
start it, run the following command:

```bash
docker compose up
```

### Running Measurements

To run the measurements, execute each helper bash script. Each script will build the application for a specific
configuration and run it.

```bash
./Dockerfile-simple.sh
./Dockerfile-simple-indexer.sh
./Dockerfile-simple-cds.sh
./Dockerfile-simple-aot-cache.sh
./Dockerfile-layers.sh
./Dockerfile-layers-indexer.sh
./Dockerfile-layers-cds.sh
./Dockerfile-layers-cds-indexer.sh
./Dockerfile-layers-aot-cache.sh
./Dockerfile-native.sh
```

## Author

Dominik Cebula

- https://dominikcebula.com/
- https://blog.dominikcebula.com/
- https://www.udemy.com/user/dominik-cebula/
