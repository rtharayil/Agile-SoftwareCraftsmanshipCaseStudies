package com.example.demo;

import java.util.ArrayList;

public class Model {
    ArrayList <Item> items = new ArrayList<Item>();

    static Model _instance;

    public void addItem( Item item){
        items.add(item);
    }

    public void removeItem( int id){

        for(Item i : items){
            if(i.batch_ID == id){
                items.remove(i);
            }

        }

    }

    public Item[] getAll(){

        Item[] arr = new Item[items.size()];
        arr = items.toArray(arr);
        return arr;
    }

    public static Model getModel(){
        if (_instance == null){
            _instance = new Model();
        }
        return _instance;
    }
}
