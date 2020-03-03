package com.example.loteria;

import java.io.Serializable;

public class Registros implements Serializable {
    String nombre;
    String pass;
    String emails;
    int edad;
    String sorteo;
    int dinero;
    int comb1;
    int comb2;
    int comb3;

    public Registros(){
        this.sorteo=null;
        this.dinero=0;
        this.comb1=0;
        this.comb2=0;
        this.comb3=0;
    }



    public Registros(String nombre, String emails, int edad, String pass) {
        this.nombre = nombre;
        this.pass = pass;
        this.emails = emails;
        this.edad = edad;


    }
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSorteo() {
        return sorteo;
    }

    public void setSorteo(String sorteo) {
        this.sorteo = sorteo;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getComb1() {
        return comb1;
    }

    public void setComb1(int comb1) {
        this.comb1 = comb1;
    }

    public int getComb2() {
        return comb2;
    }

    public void setComb2(int comb2) {
        this.comb2 = comb2;
    }

    public int getComb3() {
        return comb3;
    }

    public void setComb3(int comb3) {
        this.comb3 = comb3;
    }
}
