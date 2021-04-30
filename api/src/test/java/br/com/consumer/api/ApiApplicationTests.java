package br.com.consumer.api;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.consumer.modelo.Topico;

@SpringBootTest
public class ApiApplicationTests {

	@Test
	public void contextLoads() {
	RestTemplate template = new RestTemplate();
		
		UriComponents uri = UriComponentsBuilder.newInstance()
				.scheme("http")
				.host("localhost:8080")
				.path("topicos/2")
				.build();
		
	    ResponseEntity<Topico> topico = template.getForEntity(uri.toUriString(), Topico.class);
	    
	    System.out.println(topico.getBody().getId());
	    System.out.println(topico.getBody().getTitulo());
	}

}
