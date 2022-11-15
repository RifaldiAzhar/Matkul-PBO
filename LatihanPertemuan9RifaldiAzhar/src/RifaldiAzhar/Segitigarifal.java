/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RifaldiAzhar;
import javax.swing.*;

/**
 *
 * @author ACER
 */
public class Segitigarifal {
     String alas,tinggi;
    public void input(){
        alas=JOptionPane.showInputDialog("Masukan Alas");
        tinggi=JOptionPane.showInputDialog("Masukan Tinggi"); 
    }
    
    public double hitung(){
        long a=Long.parseLong(alas);
        long t=Long.parseLong(tinggi);
        return (0.5*a*t);
    }
    public void hasil(){
         JOptionPane.showMessageDialog(null,"0.5*"+alas+"*"+tinggi+" = "+hitung());
    }
}
    

