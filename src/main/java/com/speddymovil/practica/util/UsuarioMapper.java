package com.speddymovil.practica.util;

import com.speddymovil.practica.controller.UsuarioDTO;
import com.speddymovil.practica.entity.Usuario;

public class UsuarioMapper {
    public static UsuarioDTO convertirUsuarioAUsuarioDTO(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setNombre(usuario.getNombre());
        usuarioDTO.setNumero(usuario.getNumero());
        usuarioDTO.setCorreo(usuario.getCorreo());
        return usuarioDTO;
    }
    public static Usuario convertirUsuarioDTOAUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setNumero(usuarioDTO.getNumero());
        usuario.setCorreo(usuarioDTO.getCorreo());
        return usuario;
    }
}
