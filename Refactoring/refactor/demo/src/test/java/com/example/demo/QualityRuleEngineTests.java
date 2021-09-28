package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QualityRuleEngineTests {



	@Test
	void qualaityengine(){

		System.out.println("OMGHAI!");

		Item[] items = new Item[] {
				new Item("Indian Wine", 10, 20,123), //
				new Item("Forest Honey", 2, 0,123), //
				new Item("Movie Tickets", 5, 7,123), //
				new Item("Tooth Paste", 0, 80,123), //
				new Item("Soap", -1, 80,123),
				new Item("Shampoo", 23, 80,123)};



		QualityRuleEngine app = new QualityRuleEngine(items);

		int days = 2;


		for (int i = 0; i < days; i++) {
			System.out.println("-------- day " + i + " --------");
			System.out.println("name, sellIn, quality");
			for (Item item : items) {
				System.out.println(item);
			}
			System.out.println();
			app.updateQuality();
		}

	}

	@Test
	void DB_getAll(){

		Model model= Model.getModel();
		System.out.println( model.getAll());
	}

}
