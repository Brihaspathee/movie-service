# Sample Movie Service project

## Project Highlights
* Connects to local MySQL when ran in local
* Connects to in memory h2 database for test
* Containerized with logs mapped to local drive
* Connects to MySql Container when ran as a docker container
* Multiple services with REST API calls between them
* Uses localhost in the application.yaml file to connect between services when ran locally
* Uses container names provided in docker-compose.yaml to connect between service when ran in docker