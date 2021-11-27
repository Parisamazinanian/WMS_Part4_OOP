package main.java.data;

import java.util.*;

public class Warehouse {
    private int id;
    private List<Item> stock;
    //private String capacity;
    //private String location;

    public Warehouse(int id) {
        this.id = id;
        this.stock = new ArrayList<Item>();
    }


    public void Warehouse(int warehouseId){

    }

    public int occupancy(){
        return this.stock.size();
    }

    public void addItem(Item item){
        this.stock.add(item);

    }

    public List<Item> search(String searchTerm) {
        List<Item> result = new ArrayList<>();
        for (Item item:this.stock) {
            //depends how we want to search
            if(searchTerm.toLowerCase().equals(item.toString())){
                result.add(item);
            }
        }
        return result;
    }

    public int getId() {
        return this.id;
    }

    public List<Item> getStock() {
        return this.stock;
    }
}


