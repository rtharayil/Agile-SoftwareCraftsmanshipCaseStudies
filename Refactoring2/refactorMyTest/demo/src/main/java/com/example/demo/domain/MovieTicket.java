package com.example.demo.domain;

import com.example.demo.domain.Item;

public class MovieTicket extends Item {
    public MovieTicket(String name, int sellIn, int quality, int batch_ID) {
        super(name, sellIn, quality, batch_ID);
    }

    @Override
    public void updateQualityAndSellIn(){

        if(this.sellIn<=0){
            this.quality =0;
        }
        else if(this.sellIn >= 10){
            this.quality = this.quality+1;
        }
        else if(this.sellIn < 10 && this.sellIn>5){
            this.quality = this.quality+2;
        }
        else{
            this.quality = this.quality+3;
        }
        this.sellIn= this.sellIn-1;

    }
}
