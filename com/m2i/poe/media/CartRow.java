package com.m2i.poe.media;

public class CartRow {

    private IMedia media;
    private int quantity = 1;

    public CartRow(){}

    public CartRow(IMedia media){
        this.media= media;
    }


    public double getNetPrice(){
        return media.getNetPrice()*quantity;
    }

    public void increment(){
        quantity ++;
    }
    public void decrement() throws MediaException{
        if (quantity>1) {
            quantity--;
        }else{
            throw new MediaException("decrement <= 0");
            //System.out.println("Quantity error");
        }
    }

    public int getQuantity(){
        return quantity;
    }

    public String getTitle(){
        return media.getTitle();
    }

    public IMedia getMedia() {
        return media;
    }
}
