/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author reraparius
 */
public class Pelajar extends Orang {
    private String nim;
    private String asalSekolah;
    private double nilai;
    
    public Pelajar (String nama, double tinggi, double berat, String nim, String sekolah, double nilai) {
        super(nama, tinggi, berat);
        this.nim = nim;
        asalSekolah = sekolah;
        this.nilai = nilai;
    }
    
    public String toString() {
        return (super.toString()+ "\nNim : " +nim+ "\nSekolah : " + asalSekolah+ "\nNilai : " + nilai);
    }
}

