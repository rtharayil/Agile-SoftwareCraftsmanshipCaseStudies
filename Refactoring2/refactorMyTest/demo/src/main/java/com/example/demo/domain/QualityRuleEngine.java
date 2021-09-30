package com.example.demo.domain;

public class QualityRuleEngine {

    Item[] items;

    public QualityRuleEngine(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {

            Item item = items[i];
            item.updateQualityAndSellIn();

            capAndCeilQuality(item);

        }
    }



    private void capAndCeilQuality(Item item) {
        if(item.quality > 50 ){
            item.quality= 50;
        }
        if(item.quality<0){
            item.quality= 0;
        }
    }
}
