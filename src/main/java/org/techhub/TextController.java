package org.techhub;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TextController {
    
	@GetMapping("/")
	public String home() {
		return "index";
		
	}
	
}
