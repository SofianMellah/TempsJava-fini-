package com.afpa.www.main;

import com.afpa.www.bean.Temps;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heure = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Donnez l'heure");
        int heures = sc1.nextInt();
        System.out.println(heures);

        int minute = 0;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Donnez les minutes");
        int minutes = sc2.nextInt();
        System.out.println(minutes);


        int seconde = 0;
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Donnez les secondes");
        int secondes = sc3.nextInt();
        System.out.println(secondes);


        Temps maVar = new Temps(heures, minutes, secondes);
        maVar.calculer();
    }
}