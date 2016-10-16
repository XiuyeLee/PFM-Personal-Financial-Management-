package com.pfm.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
 
	public IndexController() {
	}

	@RequestMapping("index.do")
	public String index(){
		return "index";
	}
	
}
