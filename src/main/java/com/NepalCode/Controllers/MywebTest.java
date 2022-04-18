package com.NepalCode.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MywebTest {
	
	@RequestMapping("/title")
	public String getTitle() {
		return "my-web";
	}
	

}
