// Package
/* 
file ini berada pada folder com/tutorial/Main.java
*/
package com.tutorial;

public class Main {
    public static void main(String[] args) {
        // Memanggil object dari class Status pada file Player.java
        Status p1Status = new Status();
        // Mengakses method dari superclassnya (class Player)
        p1Status.setName("Iman Mustika Ismail");
        p1Status.showName();
        // Mengakses method dari subclassnya (class Status)
        p1Status.showStat();
    }
}
