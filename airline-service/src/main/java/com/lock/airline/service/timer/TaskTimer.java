package com.lock.airline.service.timer;

import org.springframework.stereotype.Component;


@Component("taskTimer")
public class TaskTimer {
	
	private static int counter = 1;  

	public void execute() {
		System.out.println();
		System.out.println("------------------");
		System.out.println(counter++);
		System.out.println("------------------");
		System.out.println();
	}
	
	
}
