package spring.controller;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/apiarchivos")
public class ArchivoController {

    private final String basePath = "src/main/resources/static/";

    @GetMapping("/imagen/{nombre}")
    public ResponseEntity<Resource> cargarImagen(@PathVariable String nombre) {
        return cargarArchivo(basePath + "imagenes/" + nombre + ".jpg", MediaType.IMAGE_JPEG);
    }

    @GetMapping("/html/{nombre}")
    public ResponseEntity<Resource> cargarHtml(@PathVariable String nombre) {
        return cargarArchivo(basePath + "html/" + nombre + ".html", MediaType.TEXT_HTML);
    }

    @GetMapping("/xml/{nombre}")
    public ResponseEntity<Resource> cargarXml(@PathVariable String nombre) {
        return cargarArchivo(basePath + "xml/" + nombre + ".xml", MediaType.APPLICATION_XML);
    }

    @GetMapping("/pdf/{nombre}")
    public ResponseEntity<Resource> cargarPdf(@PathVariable String nombre) {
        return cargarArchivo(basePath + "pdf/" + nombre + ".pdf", MediaType.APPLICATION_PDF);
    }

    @GetMapping("/json/{nombre}")
    public ResponseEntity<Resource> cargarJson(@PathVariable String nombre) {
        return cargarArchivo(basePath + "json/" + nombre + ".json", MediaType.APPLICATION_JSON);
    }

    private ResponseEntity<Resource> cargarArchivo(String ruta, MediaType mediaType) {
        try {
            Path path = Paths.get(ruta);
            Resource resource = new UrlResource(path.toUri());
            if (resource.exists() || resource.isReadable()) {
                return ResponseEntity.ok()
                        .contentType(mediaType)
                        .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + resource.getFilename() + "\"")
                        .body(resource);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (MalformedURLException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
