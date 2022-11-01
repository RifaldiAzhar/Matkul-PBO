/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RifaldiAzhar;

/**
 *
 * @author Rifaldi Azhar
 * A22100112
 */
public class jawaban_no5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankRifal saldo = new BankRifal(100000);
        
        saldo.getSaldo();
        saldo.simpanUang(500000);
        saldo.ambilUang(1500000);
        
    }
    
}
