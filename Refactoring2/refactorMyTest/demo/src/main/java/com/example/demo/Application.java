package com.example.demo;

import com.example.demo.domain.Item;
import com.example.demo.domain.QualityRuleEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		}, 2*60*1000, 12*60*60*1000);
	}



}
