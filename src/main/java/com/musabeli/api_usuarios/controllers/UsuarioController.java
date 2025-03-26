package com.musabeli.api_usuarios.controllers;

import com.musabeli.api_usuarios.models.Usuario;
import com.musabeli.api_usuarios.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios/getAllUsuarios")
    public ResponseEntity<List<Usuario>> getAllUsuarios(){
        return ResponseEntity.status(HttpStatus.OK).body(this.usuarioService.getAllUsuarios());
    }

    @GetMapping("/usuarios/{id}")
    public ResponseEntity<Object> getUsuarioById(@PathVariable int id){
        Object objeto = this.usuarioService.getUsuarioById(id);

        if (objeto instanceof Usuario){
            return ResponseEntity.status(HttpStatus.OK).body(objeto);
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(objeto);
        }
    }

}
