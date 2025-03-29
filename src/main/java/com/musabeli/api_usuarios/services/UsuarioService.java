package com.musabeli.api_usuarios.services;

import com.musabeli.api_usuarios.models.MensajeError;
import com.musabeli.api_usuarios.models.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private List<Usuario> usuariosList = new ArrayList<>();

    public UsuarioService(){
        this.usuariosList.add(new Usuario(1,"albania123", "sdfsdfsdf4564ghfg", "albania@gmail.com", "ADMIN"));
        this.usuariosList.add(new Usuario(2,"antonio77", "fjsdklgjlvclb567s", "antonio@gmail.com", "DUEÑO_MASCOTA"));
        this.usuariosList.add(new Usuario(3,"sofia94", "trtfdlf6456rgrfgd", "sofia@gmail.com", "DUEÑO_MASCOTA"));
        this.usuariosList.add(new Usuario(4,"esteban98", "tjreo232435ldfj", "esteban@gmail.com", "CONDUCTOR"));
    }

    /**
     * Metodo que retorna una lista de Usuarios
     * @return List<Usuario>
     */
    public List<Usuario> getAllUsuarios(){
        return this.usuariosList;
    }

    /**
     * Busca un usuario por su ID.
     *
     * @param id el identificador del usuario a buscar.
     * @return el objeto Usuario si se encuentra, o un objeto MensajeError si no existe.
     */
    public Object getUsuarioById(int id){
        for (Usuario usuario : this.usuariosList){
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return new MensajeError("El usuario con el id " + id + " no está registrado.");
    }

}
