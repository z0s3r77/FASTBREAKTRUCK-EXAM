package edu.craptocraft.fastbreaktruck.domain;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.fastbreaktruck.behaviour.Item;

public class Desayuno {
    
    List<Item> items = new ArrayList<Item>();
    private Float total = (float) 0; 

    public void addItem(Item item){

        this.total += item.pvp();
        this.items.add(item);

    }

    public List<Item> getItems(){

        return this.items;
    }

    public Float getCoste(){
        return this.total;
    }
}
