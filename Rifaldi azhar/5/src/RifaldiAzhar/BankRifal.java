/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RifaldiAzhar;

/**
 *
 * @author Rifaldi azhar
 * A22100112
 */
public class BankRifal {
   int Mysaldo;
    int total;
    BankRifal(int saldo){
        Mysaldo = saldo;
    }
    void getSaldo(){
        System.out.println("Selamat datang di Bank ABC");
        System.out.println("Saldo saat ini : Rp." + Mysaldo); 
    }
    void simpanUang(int simpan){
        total = simpan + Mysaldo;
        System.out.println("Simpan uang : " + simpan);
        System.out.println("Saldo saat ini : Rp." + total);
        System.out.println("==============================");
    }
    void ambilUang(int ambil){
        if (ambil < Mysaldo){
            Mysaldo -= ambil;
         System.out.println("Ambil uang : " + ambil);
         System.out.println("Saldo saat ini : "+"RP."+ Mysaldo);
          System.out.println("==============================");
    } else {
    System.out.println("saldo anda kurang");
    }
    }
}
