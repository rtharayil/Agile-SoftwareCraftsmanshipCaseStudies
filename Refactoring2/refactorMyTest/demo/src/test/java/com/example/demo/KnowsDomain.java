package com.example.demo;

import com.example.demo.domain.*;

public class KnowsDomain {
    public Item buildItem(String Name, int SellIn, int Quality, int batch_ID) {

        Item  item = null;
        switch(Name){
            case "Forest Honey" :
                item = new ForestHoney(Name,SellIn,Quality,batch_ID);
                break;

            case "Indian Wine" :

                item = new IndianWine(Name,SellIn,Quality,batch_ID);

                break;

            case "Movie Tickets":
                item = new MovieTicket(Name,SellIn,Quality,batch_ID);
                break;

            default:
                item= new Item(Name,SellIn,Quality,batch_ID);
                break;

        }

        return item;
    }

    public QualityRuleEngine GetQualityRuleEngine(Item[] items) {

        return new QualityRuleEngine(items);
    }
}
