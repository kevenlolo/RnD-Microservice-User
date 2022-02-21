package com.rnd.pos.user.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("user")
public class IndexController {
	
	@GetMapping("/index")
	public String index() {		
		return "Index";
	}
}