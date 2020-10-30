package com.naga.medev.DockerGitSprinBootService.RestAPI;



import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/dgs")
public class DockerGitSprinBootServiceRestAPI {
	
	private Logger log=LoggerFactory.getLogger(DockerGitSprinBootServiceRestAPI.class);
	
	@GetMapping("/welcome")
	public String sayHello() {
		
		log.info("Inside hello method");
		return "Welcome to RespAPI";
		}
	
	@GetMapping("/ddate")
	public String getDate() {
		
		log.info("Inside Get date method");
//		String dt;
//			try {
//				
//				dt="Today date : "+ new Date().toString();
//				log.info(dt);
//			} catch (Exception ex){
//				
//				log.error("Date Error"+ ex.getMessage());
//				dt="Something went wrong with date";
//			}
//		return dt;
		return "this is a date method";
		}

}
