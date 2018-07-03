package com.m2i.poe.media;

public class MediaMain {

    public static void main(String[] args) {
        Media m = new Book(1,"Java",10);
        m = new Cd(2,"A que Johnny",20);
        m = new Dvd(3, "Rambo 12", -30);
        System.out.println(m.getNetPrice());
        System.out.println(m.getTitle());
        m.setPublisher(new Publisher(4,"Gaumont"));
        m.getAuthorList().add(new Author(5,"Silvester","Stallone"));
        int zone = ((Dvd) m).getZone();

        try{
        Cart cart = new Cart();
        //CartRow cr = new CartRow(m);
        //cr.getMedia().getTitle();
        //System.out.println("cartRow: "+cr.getTitle()+" quantité: "+cr.getQuantity());
        Media n = new Cd(2,"A que Johnny",20);
        CartRow crr = new CartRow(n);
        cart.addItem(n);
        cart.addItem(m);
        cart.affichePanier();
        System.out.println("Prix de votre panier ---> "+cart.getTotalNetPrice());

            cart.removeItem(m);
            cart.removeItem(m);
            cart.validate();
            cart.affichePanier();
        } catch (MediaException e) {
            e.printStackTrace();
        }

        //cart.

        }
        }
