/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RifaldiAzhar;

/**
 *
 * @author ACER
 */
public class Pelajar {
    private String nama;
    private long tinggi, berat;
    
    public Pelajar(String nama, long tinggi, long berat){
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }
    
    public String tampilPelajar(){
        return ("Nama\t: " + nama + "\nTinggi\t: " + tinggi + "\nBerat\t: " + berat + "\n");
    }
}

class Siswa extends Pelajar{
    private String nim, asalSekolah;
    private long nilai;
    public Siswa(String nama, long tinggi, long berat, String nim, String asalSekolah, long nilai){
        super(nama, tinggi, berat);
        this.nim = nim;
        this.asalSekolah = asalSekolah;
        this.nilai = nilai;
    }
    
    public String tampilSiswa(){
        return (super.tampilPelajar() + "nim\t: " + nim + "\nAsal Sekolah\t " + asalSekolah + "\nNilai\t: " + nilai);
    }
}



    

