package com.tutorial;

// Pemilihan Bahasa
// abstract class
abstract class Language {
    // abstract method
    abstract void getLanguage();

    // reguler method
    void regularMethod() {
        System.out.println("Ini adalah Method Regular");
    }

    // constructor Language tanpa parameter
    Language() {
        System.out.println("Ini adalah Language Constructor tanpa parameter");
    }

    // constructor Language dengan parameter
    Language(String name) {
        System.out.println("Kamu memilih bahasa " + name);
    }
}

class Bahasa extends Language {
    // implementasi abstract method dari abstract class Language
    public void getLanguage() {
        System.out.println("Bahasa yang digunakan : Bahasa Indonesia");
    }

    // constructor Bahasa
    Bahasa() {
        // keyword super untuk memanggil constructor Language secara spesifik
        super("Indo");
        System.out.println("Bahasa yang kamu pilih adalah Bahasa Indonesia!");
    }
}

// Player
// membuat interface
interface Status {
    // abstract method dari interface
    void getStatus(String name, double hp, double atk);

    // default method
    default void getDesc() {
        System.out.println("Ini adalah deskripsinya");
    }
}

// membuat interface
interface Equipment {
    // abstract method dari interface
    void getEquip(String weapon, String armor);
}

// implements interface
class Player implements Status, Equipment {
    public void getStatus(String name, double hp, double atk) {
        System.out.println("Nama\t: " + name);
        System.out.println("Health\t: " + hp);
        System.out.println("Attack\t: " + atk);
    }

    public void getEquip(String weapon, String armor) {
        System.out.println("Senjata\t: " + weapon);
        System.out.println("Armor\t: " + armor);
    }

    // overides getDesc()
    public void getDesc() {
        System.out.println("Berikut info status dan equipment kamu:");
    }
}

// Enemy
// Multiple interface
interface EnemyStatus {
    void getEnemyStatus();
}

interface EnemyEquip {
    void getEnemyEquip();
}

interface EnemyInfo extends EnemyStatus, EnemyEquip {
    void getEnemyInfo();
}

// implements interface
class Enemy implements EnemyInfo {
    public void getEnemyInfo() {
        System.out.println("Berikut info status dan equipment dari musuh:");
    }

    public void getEnemyStatus() {
        System.out.println("Ini adalah statusnya");
    }

    public void getEnemyEquip() {
        System.out.println("Ini adalah equipmentnya");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Abstract Method & Class ===\n");
        // membuat object dari Bahasa
        Bahasa indo = new Bahasa();

        indo.getLanguage();

        System.out.println();
        System.out.println("=== Java Interface ===\n");
        // membuat object Player
        Player player1 = new Player();
        player1.getDesc();
        player1.getStatus("Riofuad", 500, 100);
        player1.getEquip("Katana", "Shogun Armor");

        System.out.println();

        // membuat object Enemy
        Enemy enemy1 = new Enemy();
        enemy1.getEnemyInfo();
        enemy1.getEnemyStatus();
        enemy1.getEnemyEquip();

    }
}
