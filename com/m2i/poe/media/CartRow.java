package com.m2i.poe.media;

public class CartRow {

    private IMedia media;
    private int quantity = 1;

    public CartRow(){}

    public CartRow(Media media){
        this.media= media;
    }


    public double getNetPrice(){
        return media.getNetPrice()*quantity;
    }

    public void increment(Media m){
        quantity ++;
    }
    public void decrement(Media m){
        if (quantity>1) {
            quantity--;
        }else{
            System.out.println("Quantity error");
        }
    }

    public int getQuantity(){
        return quantity;
    }

    public String getTitle(){
        return media.getTitle();
    }

}
