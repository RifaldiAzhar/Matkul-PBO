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
public class Mainclasslatihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         classlatihan4 brg = new classlatihan4();
        brg.input(JOptionPane.showInputDialog("Kode Barang"),
                JOptionPane.showInputDialog("Nama Barang"),
                parseInt(JOptionPane.showInputDialog("HPP")),
                parseInt(JOptionPane.showInputDialog("Harga Jual")),
                parseInt(JOptionPane.showInputDialog("Stok")));
        brg.Pembelian(parseInt(JOptionPane.showInputDialog("Masukan Jumlah Beli")));
        
        brg.hitungLaba ();
        
    }
    }
    

