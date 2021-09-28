package com.example.demo;

public class Item {



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    public int sellIn;

    public int quality;

    public int batch_ID;


    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getBatch_ID() {
        return batch_ID;
    }

    public void setBatch_ID(int batch_ID) {
        this.batch_ID = batch_ID;
    }

    public Item(String name, int sellIn, int quality, int batch_ID){
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.batch_ID =batch_ID;
    }

    public Item() {
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
