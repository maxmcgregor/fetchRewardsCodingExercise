package com.fetchcodingexercise.controllers;

import javax.xml.ws.RespectBinding;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TransactionController {

	@RequestMapping(path = "ping", method = RequestMethod.GET)
	@ResponseBody
	public String ping() {
		return "pong";
	}
	
}
