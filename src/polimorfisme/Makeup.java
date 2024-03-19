/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author allya saffira
 */

//Overriding

// Kelas utama untuk merepresentasikan produk makeup
class MakeupProduct {
    String name;
    String brand;

    MakeupProduct(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    // Metode untuk mengaplikasikan makeup (akan dioverride oleh kelas turunannya)
    void apply() {
        System.out.println("Menerapkan " + name + " merek " + brand);
    }
}

// Kelas turunan untuk lipstik
class Lipstick extends MakeupProduct {
    String shade;

    Lipstick(String name, String brand, String shade) {
        super(name, brand);
        this.shade = shade;
    }

    @Override
    void apply() {
        System.out.println("Mengoleskan lipstik " + shade + " dari " + brand);
    }
}

// Kelas turunan untuk eyeliner
class Eyeliner extends MakeupProduct {
    String color;

    Eyeliner(String name, String brand, String color) {
        super(name, brand);
        this.color = color;
    }

    @Override
    void apply() {
        System.out.println("Mengaplikasikan eyeliner " + color + " dari " + brand);
    }
}

// Kelas turunan untuk foundation
class Foundation extends MakeupProduct {
    String shade;

    Foundation(String name, String brand, String shade) {
        super(name, brand);
        this.shade = shade;
    }

    @Override
    void apply() {
        System.out.println("Menggunakan foundation " + shade + " dari " + brand);
    }
}

public class Makeup {
    public static void main(String[] args) {
        // Membuat objek-objek dari kelas turunan
        Lipstick lipstick = new Lipstick("Lipstik Matte", "Maybelline", "Merah");
        Eyeliner eyeliner = new Eyeliner("Eyeliner Cair", "Loreal", "Hitam");
        Foundation foundation = new Foundation("Foundation Liquid", "Revlon", "Natural");

        // Memanggil metode apply dari setiap objek
        lipstick.apply();
        eyeliner.apply();
        foundation.apply();
    }
}

