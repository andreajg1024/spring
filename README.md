# Proyecto: archivosapi

Este proyecto es un microservicio básico en Spring Boot que permite cargar archivos JSON, XML, HTML, PDF e imágenes (JPG) a través de endpoints REST. Cada archivo es accesible mediante un identificador único en la URI correspondiente.

## Estructura de Carpetas
En la carpeta `src/main/resources/static` se encuentran subcarpetas para almacenar los archivos de diferentes tipos:
- **json**: para archivos JSON (.json)
- **xml**: para archivos XML (.xml)
- **html**: para archivos HTML (.html)
- **pdf**: para archivos PDF (.pdf)
- **imagenes**: para archivos de imagen en formato JPG (.jpg)

## Endpoints

### JSON
- **Descripción**: Endpoint para cargar archivos JSON.
- **Ruta**: `/json/{nombre}`
- **Ejemplo de uso**: [http://localhost:8080/json/gato.json](http://localhost:8080/json/gato.json)
- **Nota**: Reemplaza `{nombre}` con el nombre del archivo sin la extensión `.json`.

### XML
- **Descripción**: Endpoint para cargar archivos XML.
- **Ruta**: `/xml/{nombre}`
- **Ejemplo de uso**: [http://localhost:8080/xml/sapo.xml](http://localhost:8080/xml/sapo.xml)
- **Nota**: Reemplaza `{nombre}` con el nombre del archivo sin la extensión `.xml`.

### HTML
- **Descripción**: Endpoint para cargar archivos HTML.
- **Ruta**: `/html/{nombre}`
- **Ejemplo de uso**: [http://localhost:8080/html/perro.html](http://localhost:8080/html/perro.html)
- **Nota**: Reemplaza `{nombre}` con el nombre del archivo sin la extensión `.html`.

### PDF
- **Descripción**: Endpoint para cargar archivos PDF.
- **Ruta**: `/pdf/{nombre}`
- **Ejemplo de uso**: [http://localhost:8080/pdf/Andrea.pdf](http://localhost:8080/pdf/Andrea.pdf)
- **Nota**: Reemplaza `{nombre}` con el nombre del archivo sin la extensión `.pdf`.

### Imágenes (JPG)
- **Descripción**: Endpoint para cargar archivos de imagen en formato JPG.
- **Ruta**: `/imagen/{nombre}`
- **Ejemplo de uso**: [http://localhost:8080/imagen/Fondo.jpg](http://localhost:8080/imagen/Fondo.jpg)
- **Nota**: Reemplaza `{nombre}` con el nombre del archivo sin la extensión `.jpg`.
