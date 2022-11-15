/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RifaldiAzhar;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class BarangMainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Barang brn =new Barang();
        
        brn.input(JOptionPane.showInputDialog("Masukan Kode"), 
                JOptionPane.showInputDialog("Masukan Nama"), 
                parseInt(JOptionPane.showInputDialog("Masukan HPP")), 
                parseInt(JOptionPane.showInputDialog("Masukan Harga")), 
                parseInt(JOptionPane.showInputDialog("Masukan Stok")));
        
        brn.Pembelian( parseInt(JOptionPane.showInputDialog("Masukan JumlahBeli")));
        
        brn.hitungLaba();
    }
    }
    

