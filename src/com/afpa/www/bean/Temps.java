package com.afpa.www.bean;

public class Temps {
    private int heures;
    private int minutes;
    private int secondes;

    public Temps(int heures, int minutes, int secondes){
        this.heures = heures;
        this.minutes = minutes;
        this.secondes = secondes;
    }
    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }

    public void calculer(){

        this.setSecondes(++this.secondes);

        if(getSecondes()>59){
            this.setMinutes(++this.minutes);
            this.setSecondes(00);
        }
        if (getMinutes()>59){
            this.setHeures(++this.heures);
            this.setMinutes(0);
        }
        if (getHeures()>23){
            this.setHeures(0);
        }
        System.out.println("Dans une seconde il sera : " + heures + " heures, " + minutes+ " minutes" + " et " + secondes + " secondes.");
    }
}
