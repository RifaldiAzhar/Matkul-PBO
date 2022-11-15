/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RifaldiAzhar;
import static java.lang.Integer.parseInt;
import javax.swing.*;

/**
 *
 * @author ACER
 */
public class Pertambahan2angka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String angka1, angka2;
        angka1 = JOptionPane.showInputDialog("Masukan Angka Kesatu : ");
        angka2 = JOptionPane.showInputDialog("Masukan Angka Kedua :");
        JOptionPane.showMessageDialog(null, parseInt(angka1) + parseInt (angka2));
        
        
    }
    
}
