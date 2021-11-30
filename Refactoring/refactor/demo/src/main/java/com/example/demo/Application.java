package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		Timer timer = new Timer();
		SpringApplication.run(Application.class, args);
		Model model = Model.getModel();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				Item[] items = model.getAll();
				QualityRuleEngine q = new QualityRuleEngine(items);
			}
		}, 2*60*1000, 24*60*60*1000);
	}



}
