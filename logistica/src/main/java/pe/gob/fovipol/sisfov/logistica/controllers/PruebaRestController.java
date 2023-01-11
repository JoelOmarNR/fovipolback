package pe.gob.fovipol.sisfov.logistica.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.gob.fovipol.sisfov.logistica.models.Usuario;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@RestController
@RequestMapping(name = "/")
public class PruebaRestController {

    public String prueba(){
        return "hola mundo";
    }


    public List<Usuario>usuarios= new ArrayList<>();
    @GetMapping
    public List<Usuario> listar(){



        return usuarios;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    Usuario crear (@RequestBody Usuario usuario){
        usuario.setId(new Random().nextInt(256));
        usuario.setFechaCreacion(LocalDateTime.now());

        usuarios.add(usuario);
        return usuario;

    }

}
