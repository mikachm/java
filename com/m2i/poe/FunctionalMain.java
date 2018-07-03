package com.m2i.poe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalMain {

    public static  void main(String[] args) {
        //fonctionnel
        //f(x)= x+1, x € R
        Function<Double, Double> f = x -> x + 1; //class Double!! wrapper du double // -> donn
        System.out.println(f.apply(1.0));
        Function<Double, Boolean> predicat = x -> x < 10;//f(x) = x<10
        //-> expression lambda
        ArrayList<Double> l = new ArrayList<>(Arrays.asList(2.0, 41.0, 72.0, 8.0));

        List<Double> res = new ArrayList<>();
        res = l.stream().filter(x -> x < 10).collect(Collectors.toList());//filter est un predicat
        Stream<Double> stream = l.stream().filter(x -> x < 10);//lazy loading --> chargement différé
        stream = l.stream().filter(x -> x < 10).filter(x -> x > 2);
        res = stream.collect(Collectors.toList()); //déclenche le lazy loading
        System.out.println(res);

        //map algorithme
        stream = l.stream().map(x -> x + 1);//applique à tous les éléments de la liste
        System.out.println(stream.collect(Collectors.toList()));
        stream = l.stream().map(x -> Math.cos(x)).filter(x -> Math.abs(x) < 0.5);
        System.out.println(stream.collect(Collectors.toList()));
        Stream<Boolean> stream2 = l.stream().map(x -> x < 10);
        System.out.println(stream2.collect(Collectors.toList()));


        //variable qui contient une fonction
        //un objet peut avoir comme objet une fonction

        //1.créer une collection de 10 doubles
        ArrayList<Double> c = new ArrayList<>(Arrays.asList(23.0, 43.5, 2.0, 34.0, 45.0, 15.6, 0.5, 23.0, 12.2, 8.3));
        //2.Filtrer les chiffres pairs
        stream = c.stream().filter(x -> x %2 == 0);
        System.out.println(stream.collect(Collectors.toList()));
        //3.Filtrer les chiffres pairs et appliquer un cos
        stream = c.stream().filter(x -> x %2 == 0).map(x -> Math.cos(x));
        System.out.println(stream.collect(Collectors.toList()));
        //4.filtrer les nombres premiers + appliquer une tangeante + filtrer les positifs
        stream = c.stream().filter(x -> Main.isPrime((int)Math.floor(x)));
        System.out.println(stream.collect(Collectors.toList()));
        //5.Filtrer les nombres pairs + appliquer une tangeante + filtrer les positifs;
        stream = c.stream().filter(x-> x % 2 == 0).map(x -> Math.tan(x)).filter(x -> x<0);


        //Reduce  abaisse la dimension de l, c'est une fonction de réduction
        //map/reduce
        double i = l.stream().mapToDouble(x -> x).sum();
        i = l.stream().mapToDouble(x -> x).reduce(0, (x,y)-> x+y); //x equivalent n-1//y équivalent n// 0 début de la série = valeur de départ



    }
    public double f(double d){
        return d + 1;
    }

}
