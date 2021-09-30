package com.example.demo.domain;

import com.example.demo.domain.Item;

public class IndianWine extends Item {
    public IndianWine(String name, int sellIn, int quality, int batch_ID) {
        super(name, sellIn, quality, batch_ID);
    }

    @Override
    public void updateQualityAndSellIn(){

        this.quality= this.quality+1;
        if(this.sellIn<=0){
            this.quality = this.quality+1;
        }
        this.sellIn= this.sellIn-1;
    }
}
