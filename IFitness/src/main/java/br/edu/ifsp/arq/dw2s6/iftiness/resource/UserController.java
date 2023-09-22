package br.edu.ifsp.arq.dw2s6.iftiness.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.arq.dw2s6.iftiness.domain.model.Gender;
import br.edu.ifsp.arq.dw2s6.iftiness.domain.model.User;

@RestController
public class UserController {
	
	// atualizando no STS
	@GetMapping("/users")
	public List<User> list(){
		var user1 = new User();
		user1.setId(1L);
		user1.setName("Fernando Duarte");
		user1.setEmail("fernandoduarte@ifsp.edu.br");
		user1.setPassword("dw2s6");
		user1.setAge(47);
		user1.setGender(Gender.MASCULINO);
		
		var user2 = new User();
		user2.setId(2L);
		user2.setName("Gislaine Rosales");
		user2.setEmail("gislainerosales@ifsp.edu.br");
		user2.setPassword("coord");
		user2.setAge(40);
		user2.setGender(Gender.FEMININO);
		
		return Arrays.asList(user1, user2);
		
	}
}
