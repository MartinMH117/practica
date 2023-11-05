package com.speddymovil.practica.controller;

import com.speddymovil.practica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @PostMapping("/guardar")
    public ResponseEntity<?> guardar(@RequestBody UsuarioDTO usuarioDTO){
        try {
            return ResponseEntity.ok(service.save(usuarioDTO));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("BAD REQUEST");
        }
    }

    @GetMapping("/mostrar/{idUsuario}")
    public ResponseEntity<?> mostrar(@PathVariable Long idUsuario){
        try {
            return ResponseEntity.ok(service.findById(idUsuario));
        }catch (Exception e){
            return ResponseEntity.badRequest().body("BAD REQUEST");
        }
    }
}
