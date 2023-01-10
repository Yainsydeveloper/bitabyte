package com.app.bitabyte.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.bitabyte.entity.Usuario;
import com.app.bitabyte.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin


public class UsuarioService {
	
    @Autowired
	
	UsuarioRepository usuarioRepository;
	
	
	@GetMapping( path = "/buscar")
	public List<Usuario> getAllRol(){
		return usuarioRepository.findAll();
	}	
	
	@PostMapping(path = "/guardar")
	public Usuario saveUsuario(@RequestBody Usuario usuario) {
		
		return usuarioRepository.save(usuario);
	}
	
	@DeleteMapping(path = "/eliminar/{correo}")
	public void deletUsuario(@PathVariable ("correo") String correo){

		
		Optional<Usuario> usuario;
		
		usuario = usuarioRepository.findById(correo);
		
		if(usuario.isPresent()) {
			usuarioRepository.delete(usuario.get());
		}
		
	}
	
	@GetMapping(path = "/login/{correo}/{password}")	
	public String login(@PathVariable("correo") String correo, @PathVariable("password") String password){
		
		String login = "ERROR";
		
		List<Usuario> usuario = usuarioRepository.findByCorreoAndPassword(correo, password);
		if(!usuario.isEmpty()) {
			login = "OK";
		}
		
		return login;
	}
	
	
}