/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RifaldiAzhar;
import java.io.*;

/**
 *
 * @author ACER
 */
public class inputmerk1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{ 
        // TODO code application logic here
         BufferedReader input = new BufferedReader (
        new InputStreamReader(System.in));
        String merk;
        System.out.println("Masukan Merk : ");
        merk = input.readLine();
        System.out.println("Merk motor ini adalah " + merk);
    }
}
        
    
    

