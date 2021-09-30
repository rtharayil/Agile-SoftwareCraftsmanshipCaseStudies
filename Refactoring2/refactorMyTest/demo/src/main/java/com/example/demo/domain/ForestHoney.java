package com.example.demo.domain;

import com.example.demo.domain.Item;

public class ForestHoney extends Item {
    public ForestHoney(String name, int sellIn, int quality, int batch_ID) {
        super(name, sellIn, quality, batch_ID);
    }

    @Override
    public void updateQualityAndSellIn(){

    }

}
