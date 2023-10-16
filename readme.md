# build
## crear el paquete jar
- limpiar la consola
  - ./mvnw clean
- compilar
  - ./mvnw clean package -DskipTests
## docker
- constuir el docker
  - docker-compose build
- iniciar el docker
  - docker-compose up