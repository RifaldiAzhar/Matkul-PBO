/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RifaldiAzhar;


/**
 *
 * @author ACER
 */
public class Barang {
    String kode,nama;
    int harga,stok,jumlahJual,HPP;
    
    void input(String kode,String nama, int HPP, int harga,int stok){
        this.kode=kode;
        this.HPP=HPP;
        this.nama=nama;
        this.harga=harga;
        this.stok=stok;
        
        System.out.println("Kode Barang     : "+this.kode);
        System.out.println("Nama Barang     : "+this.nama);
        System.out.println("HPP             : "+this.HPP);
        System.out.println("Harga Jual      : "+this.harga);
        System.out.println("Stok            : "+this.stok);

    }
    void Pembelian(int jumlah){
        if(this.stok-jumlah >0){
            this.jumlahJual=this.jumlahJual+jumlah;
            this.stok=this.stok-this.jumlahJual;
            
            System.out.println("Pembelian Berhasil, Jumlah Pembelian : "+jumlah);
        }else{
            System.out.println("Stok            : "+this.stok);
        }   
    }
    void hitungLaba(){
        int laba= (this.jumlahJual*this.harga)-(this.HPP * this.jumlahJual);
        System.out.println("Stok Saat ini   : "+this.stok);
        System.out.println("Total Bayar     : "+this.jumlahJual*this.harga);
        System.out.println("Laba            : "+laba);
    }
    
}
    
    

