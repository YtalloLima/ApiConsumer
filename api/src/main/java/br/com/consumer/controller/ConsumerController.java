package br.com.consumer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.consumer.modelo.Topico;

@RestController
@RequestMapping(value = "/busca")
public class ConsumerController {

	@RequestMapping("/topicos")
	public void consumerApi() {
		System.out.println("frifjrifjrij");
		RestTemplate template = new RestTemplate();
		
		UriComponents uri = UriComponentsBuilder.newInstance()
				.scheme("http")
				.host("localhost:8080")
				.build();
		
	    ResponseEntity<Topico> topico = template.getForEntity(uri.toUriString(), Topico.class);
	    
	    System.out.println(topico.getBody().getTitulo());
	}
}
