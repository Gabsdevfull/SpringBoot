package br.org.generation.blogpessoal.repository;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.org.generation.blogpessoal.model.Usuario;





@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest {
	
	@Autowired
	private UsuarioReporitory usuarioRepository;
	
	@BeforeAll
	void start() {
		
		usuarioRepository.save(new Usuario(0L, "Gabriel Varandas","Gabriel@gmail.com","12345678"));
		usuarioRepository.save(new Usuario(0L, "Rennan Mendes","renan@gmail.com","12345678"));
		usuarioRepository.save(new Usuario(0L, "Igor Mendes","igor@gmail.com","12345678"));
		usuarioRepository.save(new Usuario(0L, "Nycolas Mendes","nycolas@gmail.com","12345678"));
	}
	
	@Test
	@DisplayName("Retorna 1 usuario")
	public void deveRetornarUmUsuario() {
		
		Optional<Usuario> usuario = usuarioRepository.findByUsuario("Gabriel@gmail.com");
		assertTrue(usuario.get().getUsuario().equals("Gabriel@gmail.com"));
		
		
	}
	
	@Test
	@DisplayName("Retorna 3 usuarios")
	public void deveRetornarTresUsuarios() {
		List<Usuario> listaDeUsuarios = usuarioRepository.findAllByNomeContainingIgnoreCase("Mendes");
		assertEquals(3, listaDeUsuarios.size());
		assertTrue(listaDeUsuarios.get(0).getNome().equals("Rennan Mendes"));
		assertTrue(listaDeUsuarios.get(1).getNome().equals("Igor Mendes"));
		assertTrue(listaDeUsuarios.get(2).getNome().equals("Nycolas Mendes"));
	}

	
		
}

