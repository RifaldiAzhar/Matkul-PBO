/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.Rifal;
import java.util.List;

/**
 *
 * @author ACER
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fasilitas perintah = new fasilitas();
        List<barang> list = perintah.selectAll();
 for(barang barang : list){
    System.out.println(barang.getKode_barang());
    System.out.println(barang.getNama_barang());
    System.out.println(barang.getJumlah());
    System.out.println(barang.getHarga());
    System.out.println("-------------------------");
        }
    }
        
    }
    

