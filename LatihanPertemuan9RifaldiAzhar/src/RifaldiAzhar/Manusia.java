/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RifaldiAzhar;

/**
 *
 * @author ACER
 */
public class Manusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        classmanusia[] informasi =  new Manusia[2];
        
        informasi[0] = new programmer("Programmer", "Futsal", "Mengetik Sintak");
        informasi[1] = new polisi("Polisi", "Fusal", "Operasi Keliling");
        
        for(int i = 0; i < informasi.length; i++){
            System.out.println("------------------------");
            System.out.println(informasi[i].tampilManusia());
        }
}
