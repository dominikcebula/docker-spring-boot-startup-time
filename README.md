# Docker Spring Boot Startup Time Measurements

## Introduction

This repository is dedicated to measuring the startup times of a Spring Boot application under various configurations.
The goal is to compare different techniques and configurations that can be used to optimize the startup time of Spring
Boot applications, especially in the context of containerized environments like Kubernetes.

The measurements are performed using Docker, and the results will help in understanding how different configurations
affect the startup time of a Spring Boot application. The focus is on configurations such as using Spring Native, Spring
Indexer, Layertools, Class Data Sharing (CDS), Ahead-of-Time (AOT) compilation.

## Technologies Used

- Java 21, Java 24
- Spring Boot 3.5.x
- Spring Native
- Spring Indexer
- Layertools
- CDS
- AOT
- Docker
- Docker Compose
- Maven

## Measurements

### Methodology

Each different type of configuration is built using a separate Dockerfile. The application is started in each
configuration, and the startup time is measured.

To simulate a real-world scenario, the application contains REST API and is configured to connect to a PostgreSQL
database. Liquibase is used to manage the database schema.

Additionally, **resources are limited** to **0.5 vCPU** and **768MB of memory** to simulate limited resources under the
Kubernetes Cluster.

### Hardware and Limits

- CPU: Intel(R) Core(TM) i7-12700 12th Gen 12 Cores, 20 Threads, 25M Cache, up to 4.90 GHz
- OS: Linux, Ubuntu 24.04.3 LTS, Kernel 6.8.0-78-generic SMP x86_64
- Limits during measurements
  - CPU: 0.5 vCPU
  - Memory: 768MB RAM

### Measurements Results

#### Summary

TBD

#### Raw data

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
