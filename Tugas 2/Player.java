// Package
/* 
file ini berada pada folder com/tutorial/Player.java
*/
package com.tutorial;

// Public Modifier (Public Class)
public class Player {
    // Private Modifier (Private Variable)
    private String name;

    // Public Modifier (Public Method) & Setter Method
    public void setName(String name) {
        // this keyword
        this.name = name;
    }

    // Public Modifier (Public Method) & Getter Method
    public String getName() {
        return this.name;
    }

    // Protected Modifier
    /*
     * protected modifier dapat diakses pada package dan subclass yang sama
     */
    protected void showName() {
        System.out.println("Name\t:" + getName());
    }
}

// inheritence (subclass dari Player)
class Status extends Player {
    // final keyword
    final double hp = 100;
    double atk;

    // Default Modifier
    void showStat() {
        // this.hp = 150;
        /*
         * "this.hp" tidak dapat diubah nilainya, karena menggunakan final keyword saat
         * mendeklarasikan variablenya jadi nilainya tidak dapat berubah
         */
        this.atk = 200;
        // showName();
        System.out.println("Health\t:" + this.hp);
        System.out.println("Attack\t:" + this.atk);
    }
}
