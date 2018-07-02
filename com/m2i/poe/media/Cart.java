package com.m2i.poe.media;

import java.util.ArrayList;
import java.util.List;


//mettre media et get NetPrice en abstract
public class Cart {

    private List<CartRow> cartRowList = new ArrayList<>();



    public Cart(){};

    //public Cart( ArrayList<Media> mediaList){}


        public List<CartRow> getMediaList(){
        return cartRowList;
        }

        public double getTotalNetPrice(){
            double total = 0;
            for (CartRow cartRow: cartRowList){
            total = total + cartRow.getNetPrice();
            }
            return total;
        }

        private CartRow isMediaInCart(IMedia m){
            CartRow res = null;
            for (CartRow row: cartRowList){
                if(m== row.getMedia()){
                    res = row ;
                    break;
                }
            }
            return res;
        }

        public void addItem(IMedia media){
                CartRow row = isMediaInCart(media);
                if (row==null){
                    row = new CartRow(media)
                cartRowList.add(row);
                }
    }

        public void removeItem(IMedia m){
            CartRow row = isMediaInCart(m);
            if(row == nul){
                System.out.println("quantity error");
            }else{
                cartRowList.remove(m);
            }
        }


        //retourne le titre des media contenu dans le raw
        public void affichePanier(){
            System.out.println("Panier:");
            System.out.println("======");
            for (CartRow cartRow:mediaRowList)
                  {
                      System.out.println("titre: "+cartRow.getTitle()+" | quantité: "+cartRow.getQuantity());
            }
        }










}