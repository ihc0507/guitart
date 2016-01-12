package com.ihc.sharer.action;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Index {
	@RequestMapping(value = "/index",method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	@RequestMapping(value = "/methodSecured",method=RequestMethod.GET)
	public String methodSecuredTest() {
		return "method_secured";
	}
}
