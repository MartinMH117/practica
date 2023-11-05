package com.speddymovil.practica.service;

import com.speddymovil.practica.controller.UsuarioDTO;
import com.speddymovil.practica.entity.Usuario;
import com.speddymovil.practica.repository.UsuarioRepository;
import com.speddymovil.practica.util.UsuarioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    public UsuarioRepository repository;

    public Usuario save(UsuarioDTO usuarioDTO){
        Usuario usuario = UsuarioMapper.convertirUsuarioDTOAUsuario(usuarioDTO);
        return repository.save(usuario);
    }

    public UsuarioDTO findById(Long id){
        Usuario usuario = repository.findById(id).orElseThrow();
        return UsuarioMapper.convertirUsuarioAUsuarioDTO(usuario);
    }
}
