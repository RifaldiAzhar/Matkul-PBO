/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RifaldiAzhar;

/**
 *
 * @author ACER
 */
public class classlatihan3 {
     private String kodebarang, namabarang;
    private int HPP, stok, jumlahjual, stoksekarang, totalbayar, laba;
    private long hargajual;
    void inputKodeBarang (String kodebarang) {
        this.kodebarang = kodebarang;
    }
    void inputNamaBarang (String namabarang) {
        this.namabarang = namabarang;
    }
    void inputHPP(int HPP) {
        this.HPP = HPP;
    }
    void inputStok(int stok) {
        this.stok = stok;
    }
    void inputJumlahJual(int jumlahjual) {
        this.jumlahjual = jumlahjual;
    }
    void inputHargaJual(long hargajual) {
        this.hargajual = hargajual;
    }
    public String tampilKodeBarang(){
        return kodebarang;
    }
    public String tampilNamaBarang(){
        return namabarang;
    }
    public int tampilHPP(){
        return HPP;
    }
    public int tampilStok(){
        return stok;
    }
    public int tampilJumlahJual(){
        return jumlahjual;
    }
    public long tampilHargaJual(){
        return hargajual;
    }
    void inputStokSekarang(int stoksekarang){
        this.stoksekarang = stok - jumlahjual;
    }
    void inputTotalBayar(int totalbayar) {
        this.totalbayar = (int) (hargajual * jumlahjual);
    }
    void inputLaba(int laba) {
        this.laba = (int) ((this.jumlahjual * this.hargajual) - (this.HPP * this.jumlahjual));
    }
    public int tampilStokSekarang() {
        return stoksekarang;
    }
    public int tampilTotalBayar() {
        return totalbayar;
    }
    public int tampilLaba() {
        return laba;
    }
}

    
    

