# Accenture

## Despliegue local

para lanzar la aplicacion desde un ambiente local 

instalar docker y docker compose 

ejecutar

### docker compose -f profile/deploylocal.yml up --build -d

lista de endpoint para localhost

### endpoint para agregar una nueva franquicia
ejemplo
curl --location 'localhost:8080/savefranchise' \
--header 'Content-Type: application/json' \
--data '{"name":"franquicia10"}'

metodo post 

localhost:8080/savefranchise

cuerpo mensaje ejemplo
JSON
{"name":"franquicia10"}

### endpoint para agregar una nueva sucursal a la franquicia

curl --location 'localhost:8080/2/branch' \
--header 'Content-Type: application/json' \
--data '{"name":"sucursal3"}'

cuerpo mensaje ejemplo

{"name":"sucursal3"}


http://localhost:8080/{franchiseId}/branch

este endoint agrega una sucursal a una franquicia, recibe el id de una franquicia existente

### endpoint para agregar un nuevo producto a la sucursal

