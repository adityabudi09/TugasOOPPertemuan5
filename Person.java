/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.oop.pertemuan.pkg5;

/**
 *
 * @author DWI ADITYA BUDI
 */
public class Person {
    private String name;
    private char jenisKelamin;
    private int umur;

    // SETTER
    public void setName(String name){
        this.name = name;
    }

    public void setUmur(int umur){
        this.umur = umur;
    }

    public void setJenisKelamin(char jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }

    // GETTER
    public String getName(){
        return this.name;
    }

    public int getUmur(){
        return this.umur;
    }

    public char getJenisKelamin(){
        return this.jenisKelamin;
    }
}
