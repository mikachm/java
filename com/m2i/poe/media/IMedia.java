package com.m2i.poe.media;

import java.util.List;
import java.util.ArrayList;

public interface IMedia {
    double getPrice();

    void setPrice(double price);

    int getId();

    void setId(int id);

    String getTitle();

    void setTitle(String title);

    double getNetPrice();

    Publisher getPublisher();

    void setPublisher(Publisher publisher);

    List<Author> getAuthorList();

    void setAuthorList(ArrayList<Author> authorList);
}
