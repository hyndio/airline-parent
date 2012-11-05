package com.lock.airline.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lock.airline.ws.client.SlowlyRequsetClient;

@Controller
public class SlowlyController {
	
	@Autowired
	private SlowlyRequsetClient slowlyRequsetClient;
	
	@RequestMapping("/slowlySpead")
	public void sendSlowlyData() {
		this.slowlyRequsetClient.sendSlowlyData();
	}

}
