package com.naga.medev.DockerGitSprinBootService.RestAPI;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello")
public class DockerGitSprinBootServiceRestAPI {
	
	private Logger log=LoggerFactory.getLogger(DockerGitSprinBootServiceRestAPI.class);
	
	@GetMapping
	public String sayHello() {
		
		log.info("Inside hello method");
		return "Welcome to RespAPI";
		}

}
