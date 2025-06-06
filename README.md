# Accenture

## Despliegue local

Para lanzar la aplicación desde un ambiente local

Instalar docker y docker compose

Ejecutar

### docker compose -f profile/deploylocal.yml up --build -d

Lista de endpoints para localhost

## Endpoints de Franquicias

### Endpoint para agregar una nueva franquicia

**Método:** POST  
**URL:** `localhost:8080/savefranchise`

**Ejemplo con curl:**
```bash
curl --location 'localhost:8080/savefranchise' \
--header 'Content-Type: application/json' \
--data '{"name":"franquicia10"}'
```

**Cuerpo del mensaje (JSON):**
```json
{"name":"franquicia10"}
```

### Endpoint para modificar el nombre de una franquicia

**Método:** PATCH  
**URL:** `localhost:8080/{franchiseId}/updatenamefranchise`

**Ejemplo con curl:**
```bash
curl --location 'localhost:8080/1/updatenamefranchise' \
--header 'Content-Type: application/json' \
--data '{"name":"franquicia1 modificada"}'
```

**Cuerpo del mensaje (JSON):**
```json
{"name":"franquicia1 modificada"}
```

## Endpoints de Sucursales

### Endpoint para agregar una nueva sucursal a la franquicia

**Método:** POST  
**URL:** `localhost:8080/{franchiseId}/branch`

**Ejemplo con curl:**
```bash
curl --location 'localhost:8080/2/branch' \
--header 'Content-Type: application/json' \
--data '{"name":"sucursal3"}'
```

**Cuerpo del mensaje (JSON):**
```json
{"name":"sucursal3"}
```

Este endpoint agrega una sucursal a una franquicia, recibe el ID de una franquicia existente.

### Endpoint para modificar el nombre de una sucursal

**Método:** PATCH  
**URL:** `localhost:8080/{branchId}/updatenamebranch`

**Ejemplo con curl:**
```bash
curl --location 'localhost:8080/2/updatenamebranch' \
--header 'Content-Type: application/json' \
--data '{"name":"sucursal modificada"}'
```

**Cuerpo del mensaje (JSON):**
```json
{"name":"sucursal modificada"}
```

## Endpoints de Productos

### Endpoint para agregar un nuevo producto a la sucursal

**Método:** POST  
**URL:** `localhost:8080/{branchId}/product`

**Ejemplo con curl:**
```bash
curl --location 'localhost:8080/1/product' \
--header 'Content-Type: application/json' \
--data '{"name": "Café Orgánico5", "stock": 10}'
```

**Cuerpo del mensaje (JSON):**
```json
{
  "name": "Café Orgánico5",
  "stock": 10
}
```

### Endpoint para modificar el nombre de un producto

**Método:** PATCH  
**URL:** `localhost:8080/{productId}/updatenameproduct`

**Ejemplo con curl:**
```bash
curl --location 'localhost:8080/2/updatenameproduct' \
--header 'Content-Type: application/json' \
--data '{"name":"producto modificado"}'
```

**Cuerpo del mensaje (JSON):**
```json
{"name":"producto modificado"}
```

### Endpoint para actualizar el stock de un producto

**Método:** PATCH  
**URL:** `localhost:8080/{productId}/stock`

**Ejemplo con curl:**
```bash
curl --location 'localhost:8080/2/stock' \
--header 'Content-Type: application/json' \
--data '{"stock": 300}'
```

**Cuerpo del mensaje (JSON):**
```json
{
  "stock": 300
}
```

### Endpoint para eliminar un producto

**Método:** DELETE  
**URL:** `localhost:8080/{branchId}/product/{productId}`

**Ejemplo con curl:**
```bash
curl --location --request DELETE 'localhost:8080/1/product/1'
```

### Endpoint para obtener el producto con mayor stock por sucursal

**Método:** GET  
**URL:** `localhost:8080/{branchId}/maxproducts`

**Ejemplo con curl:**
```bash
curl --location 'localhost:8080/2/maxproducts'
```

## Despliegue en la nube

Para el despliegue en la nube, utilizar el siguiente endpoint:

**URL:** `46.183.112.36:8443/savefranchise`

**Ejemplo con curl:**
```bash
curl --location '46.183.112.36:8443/savefranchise' \
--header 'Content-Type: application/json' \
--data '{"name":"franquiciadesde web"}'
```

# pruebas en nube
** cambiar localhost:8080 por 46.183.112.36:8443 **