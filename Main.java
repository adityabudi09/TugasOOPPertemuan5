/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.oop.pertemuan.pkg5;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person();

        // ANTON
        person.setName("Anton");
        person.setJenisKelamin('L');
        person.setUmur(20);
        System.out.println("Nama: " + person.getName());
        System.out.println("Jenis Kelamin: " + person.getJenisKelamin());
        System.out.println("Umur: " + person.getUmur());

        System.out.println();

        // RIKO
        person2.setName("Riko");
        person2.setJenisKelamin('L');
        person2.setUmur(25);
        System.out.println("Nama: " + person2.getName());
        System.out.println("Jenis Kelamin: " + person2.getJenisKelamin());
        System.out.println("Umur: " + person2.getUmur());
    }    
}
