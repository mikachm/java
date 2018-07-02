package com.m2i.poe.media;


import java.util.List;
import java.util.ArrayList;

public abstract class  Media implements IMedia {

    private double price;
    private int id;
    private String title;
    private Publisher publisher;
    //private ArrayList<Author> authorList = new ArrayList<>();
    private List<Author> authorList = new ArrayList<>();

    public Media() {}

    public Media(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double getNetPrice() {
        return price * 1.2;
    }

    @Override
    public Publisher getPublisher() {
        return publisher;
    }

    @Override
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public List<Author> getAuthorList() {
        return authorList;
    }

    @Override
    public void setAuthorList(ArrayList<Author> authorList) {
        this.authorList = authorList;
    }
}
