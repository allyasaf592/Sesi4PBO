/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author allya saffira
 */

//Overloading

public class Parfum {
    public void sprayParfum(String brand) {
        System.out.println("Spraying " + brand + " perfume");
    }

    public void sprayParfum(String brand, String type) {
        System.out.println("Spraying " + type + " " + brand + " perfume");
    }

    public static void main(String[] args) {
        Parfum parfum = new Parfum();
        parfum.sprayParfum("Chanel");
        parfum.sprayParfum("Dior", "Eau de Parfum");
    }
}
