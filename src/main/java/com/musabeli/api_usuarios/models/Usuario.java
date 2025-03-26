package com.musabeli.api_usuarios.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private int id;
    private String usuario;
    private String password;
    private String correo;
    private String rol;
}
