/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RifaldiAzhar;

/**
 *
 * @author ACER
 */
public class classlatihan4 {
    String Kode, Nama;
    int Harga, Stok, JumlahJual, HPP;
    
    void input(String Kode, String Nama, int HPP, int Harga, int Stok){
        this.Kode = Kode;
        this.HPP = HPP;
        this.Nama = Nama;
        this.Harga = Harga;
        this.Stok = Stok;
        this.JumlahJual = JumlahJual;
        
        System.out.println("KodeBarang  : " + this.Kode);
        System.out.println("NamaBarang  : " + this.Nama);
        System.out.println("HPP         : " + this.HPP);
        System.out.println("HargaJual   : " + this.Harga);
        System.out.println("Stok        : " + this.Stok);
    }
    void Pembelian(int Jumlah) {
        if (this.Stok>0) {
            this.JumlahJual = this.JumlahJual + Jumlah;
            this.Stok = this.Stok - Jumlah;
            
            System.out.println("Pembelian Berhasil, Jumlah Pembelian : " + Jumlah);
        } else {
            System.out.println("Stok        : " + this.Stok);
        }
}
    void hitungLaba (){
            int Laba = (this.JumlahJual * this.Harga) - (this.HPP * this.JumlahJual);
             System.out.println("Stok saat ini : " + this.Stok );
             System.out.println("Total Bayar : " + this.JumlahJual * this.Harga);
             System.out.println("Laba : " + Laba);
    }
}

    

