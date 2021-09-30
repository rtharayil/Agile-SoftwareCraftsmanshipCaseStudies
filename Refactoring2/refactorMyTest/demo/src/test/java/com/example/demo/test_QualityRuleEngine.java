package com.example.demo;

import com.example.demo.domain.Item;
import com.example.demo.domain.QualityRuleEngine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class test_QualityRuleEngine {


    KnowsDomain domain = new KnowsDomain();
    private Item[] BuildListWithOneElement(String name, int Sellin, int Quality, int batch_ID) {

        Item[] items = new Item[] {
                domain.buildItem(name, Sellin, Quality,batch_ID)};

        return items;
    }

    private Item getFirstItem( Item[]  items) {
        return items[0];
    }




    @Test
    public void SellInShouldDecreaseByOneForGenericProducts(){

        int Quality = 55;
        int SellIn = 15;
        Item[] items = BuildListWithOneElement("Shampoo", SellIn, Quality,123);
        QualityRuleEngine ruleEngine = domain.GetQualityRuleEngine(items);


        ruleEngine.updateQuality();
        Item item = getFirstItem(items);
        Assertions.assertEquals(14,item.getSellIn());
    }

    @Test
    public void QualityShouldDecreasesByOneForGenericProducts(){

        int Quality = 20;
        int SellIn = 15;
        Item[] items = BuildListWithOneElement("Shampoo", SellIn, Quality,123);
        QualityRuleEngine ruleEngine = domain.GetQualityRuleEngine(items);


        ruleEngine.updateQuality();
        Item item = getFirstItem(items);
        Assertions.assertEquals(19,item.getQuality());

    }


    @Test
    public void QualityShouldDecreasesByTwoForGenericProductsWhenSellInIsLessThanZero(){

        int Quality = 20;
        int SellIn = -1;
        Item[] items = BuildListWithOneElement("Shampoo", SellIn, Quality,123);
        QualityRuleEngine ruleEngine = domain.GetQualityRuleEngine(items);


        ruleEngine.updateQuality();
        Item item = getFirstItem(items);
        Assertions.assertEquals(Quality-2,item.getQuality());

    }

    @Test
    public void QualityShouldDecreasesByOneForGenericProductsWhenSellInIsZero(){

        int Quality = 20;
        int SellIn = 0;
        Item[] items = BuildListWithOneElement("Shampoo", SellIn, Quality,123);
        QualityRuleEngine ruleEngine = domain.GetQualityRuleEngine(items);


        ruleEngine.updateQuality();
        Item item = getFirstItem(items);
        Assertions.assertEquals(Quality-1,item.getQuality());

    }

    @Test
    public void SellInRemainsConstantForForestHoney(){
        int Quality = 20;
        int SellIn = 10;
        Item[] items = BuildListWithOneElement("Forest Honey", SellIn, Quality,123);
        QualityRuleEngine ruleEngine = domain.GetQualityRuleEngine(items);

        ruleEngine.updateQuality();
        Item item = getFirstItem(items);
        Assertions.assertEquals(SellIn,item.getSellIn());

    }

    @Test
    public void QualityRemainsConstantForForestHoney(){
        int Quality = 20;
        int SellIn = 10;
        Item[] items = BuildListWithOneElement("Forest Honey", SellIn, Quality,123);
        QualityRuleEngine ruleEngine = domain.GetQualityRuleEngine(items);

        ruleEngine.updateQuality();
        Item item = getFirstItem(items);
        Assertions.assertEquals(Quality,item.getQuality());

    }

    @Test
    public void QualityCapsAt50ForForestHoney(){
        int Quality = 55;
        int SellIn = 10;
        Item[] items = BuildListWithOneElement("Forest Honey", SellIn, Quality,123);
        QualityRuleEngine ruleEngine = domain.GetQualityRuleEngine(items);

        ruleEngine.updateQuality();
        Item item = getFirstItem(items);
        Assertions.assertEquals(50,item.getQuality());

    }

    @Test
    public void QualityCapsAt50ForMovieTicket(){
        int Quality = 55;
        int SellIn = 10;
        Item[] items = BuildListWithOneElement("Forest Honey", SellIn, Quality,123);
        QualityRuleEngine ruleEngine = domain.GetQualityRuleEngine(items);

        ruleEngine.updateQuality();
        Item item = getFirstItem(items);
        Assertions.assertEquals(50,item.getQuality());

    }

    @Test
    public void QualityDipsTo0ForMovieTicketWhenSellByIsLessThenZero(){
        int Quality = 55;
        int SellIn = -1;
        Item[] items = BuildListWithOneElement("Movie Tickets", SellIn, Quality,123);
        QualityRuleEngine ruleEngine = domain.GetQualityRuleEngine(items);

        ruleEngine.updateQuality();
        Item item = getFirstItem(items);
        Assertions.assertEquals(0,item.getQuality());

    }

    @Test
    public void QualityDipsTo0ForMovieTicketWhenSellByIsLessEqualToZero(){
        int Quality = 5;
        int SellIn =0 ;
        Item[] items = BuildListWithOneElement("Movie Tickets", SellIn, Quality,123);
        QualityRuleEngine ruleEngine = domain.GetQualityRuleEngine(items);

        ruleEngine.updateQuality();
        Item item = getFirstItem(items);
        Assertions.assertEquals(0,item.getQuality());

    }

    @Test
    public void QualityIncreasesByOneForMovieTicketWhenSellByIsGraterThan10(){
        int Quality = 5;
        int SellIn =11 ;
        Item[] items = BuildListWithOneElement("Movie Tickets", SellIn, Quality,123);
        QualityRuleEngine ruleEngine = domain.GetQualityRuleEngine(items);

        ruleEngine.updateQuality();
        Item item = getFirstItem(items);
        Assertions.assertEquals(6,item.getQuality());

    }
    @Test
    public void QualityDoublesForMovieTicketWhenSellByIsLessThanAndEqualTo10(){
        int Quality = 5;
        int SellIn =9;
        Item[] items = BuildListWithOneElement("Movie Tickets", SellIn, Quality,123);
        QualityRuleEngine ruleEngine = domain.GetQualityRuleEngine(items);

        ruleEngine.updateQuality();
        Item item = getFirstItem(items);
        Assertions.assertEquals(7,item.getQuality());

    }

    @Test
    public void QualityTriplesForMovieTicketWhenSellByIsLessThanAndEqualTo5(){
        int Quality = 5;
        int SellIn =5;
        Item[] items = BuildListWithOneElement("Movie Tickets", SellIn, Quality,123);
        QualityRuleEngine ruleEngine = domain.GetQualityRuleEngine(items);

        ruleEngine.updateQuality();
        Item item = getFirstItem(items);
        Assertions.assertEquals(8,item.getQuality());

    }


    @Test
    public void QualityCapsAt50ForIndianWineWhenQualityRuleIsApplied(){
        int Quality = 55;
        int SellIn = 10;
        Item[] items = BuildListWithOneElement("Indian Wine", SellIn, Quality,123);
        QualityRuleEngine ruleEngine = domain.GetQualityRuleEngine(items);

        ruleEngine.updateQuality();
        Item item = getFirstItem(items);
        Assertions.assertEquals(50,item.getQuality());

    }

    @Test
    public void QualityIncreasesByOneForIndianWineWhenSellInIsGraterThanZero(){
        int Quality = 5;
        int SellIn = 1;
        Item[] items = BuildListWithOneElement("Indian Wine", SellIn, Quality,123);
        QualityRuleEngine ruleEngine = domain.GetQualityRuleEngine(items);

        ruleEngine.updateQuality();
        Item item = getFirstItem(items);
        Assertions.assertEquals(6,item.getQuality());

    }

    @Test
    public void QualityIncreasesByTwoForIndianWineWhenSellInIsLessThanOne(){
        int Quality = 5;
        int SellIn = 0;
        Item[] items = BuildListWithOneElement("Indian Wine", SellIn, Quality,123);
        QualityRuleEngine ruleEngine = domain.GetQualityRuleEngine(items);

        ruleEngine.updateQuality();
        Item item = getFirstItem(items);
        Assertions.assertEquals(7,item.getQuality());

    }

    @Test
    public void QualityShouldNotIncreaseBeyondFiftyForAnyProducts(){

        int Quality = 55;
        int SellIn = 15;
        Item[] items = BuildListWithOneElement("Shampoo", SellIn, Quality,123);
        QualityRuleEngine ruleEngine = domain.GetQualityRuleEngine(items);


        ruleEngine.updateQuality();

        Item item = getFirstItem(items);
        Assertions.assertEquals(50,item.getQuality());


    }

    @Test
    public void QualityShouldNotDecreaseBeyondZeroForAnyProducts(){

        int Quality = 0;
        int SellIn = 15;
        Item[] items = BuildListWithOneElement("Shampoo", SellIn, Quality,123);
        QualityRuleEngine ruleEngine = domain.GetQualityRuleEngine(items);


        ruleEngine.updateQuality();

        Item item = getFirstItem(items);
        Assertions.assertEquals(0,item.getQuality());


    }


}
