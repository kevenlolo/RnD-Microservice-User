package com.rnd.pos.user.endpoints;

import javax.annotation.security.RolesAllowed;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@GetMapping("/index")
	@RolesAllowed("ROLE_TEST")
	public String index() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		return "Index";
	}
	
	@GetMapping("/test")
	public String test() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		return "Test";
	}
}