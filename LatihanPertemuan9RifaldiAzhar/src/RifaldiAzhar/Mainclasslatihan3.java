/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RifaldiAzhar;

/**
 *
 * @author ACER
 */
public class Mainclasslatihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          classlatihan3 brg = new classlatihan3();
    brg.inputKodeBarang("B001");
    brg.inputNamaBarang("BUKU GAMBAR");
    brg.inputHPP(2500);
    brg.inputHargaJual(3000);
    brg.inputStok(5);
    brg.inputJumlahJual(2);
    brg.inputStokSekarang (3);
    brg.inputTotalBayar(6000);
    brg.inputLaba(1000);
    System.out.println("INPUT : ");
    System.out.println("Kode Barang : " + brg.tampilKodeBarang());
    System.out.println("Nama Barang : " + brg.tampilNamaBarang());
    System.out.println("HPP : " + brg.tampilHPP());
    System.out.println("Harga Jual : " + brg.tampilHargaJual());
    System.out.println("Stok : " + brg.tampilStok());
    System.out.println("Jumlah Jual : " + brg.tampilJumlahJual());
    System.out.println("OUTPUT : ");
    System.out.println("Stok Sekarang : " + brg.tampilStokSekarang());
    System.out.println("Total Bayar : " + brg.tampilTotalBayar());
    System.out.println("Laba : " + brg.tampilLaba());
    }
    
}

    
    

