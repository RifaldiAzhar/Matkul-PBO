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
public class jawaban_no2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int  nilai = 80;
     int absen = 30;
        
        boolean lulusNilai = nilai >= 75;
        boolean lulusAbsen = absen >= 75;
        
        boolean lulus = lulusNilai && lulusAbsen; 
        
         if (nilai >=75 && absen <= 75) {
            System.out.println("selamat anda lulus");
    }else {
     System.out.println("silahkan coba tahun depan");       
        }
    if (nilai >= 80 && absen >= 80){
        System.out.println("nilai anda A"); 
    }else if (nilai >= 70 && absen >= 70 ) {
        System.out.println("nilai anda B");
    }else if (nilai >= 60 && absen >= 60 ) {
        System.out.println("nilai anda C");
    }else if (nilai >= -50 && absen >= -50 ) {
        System.out.println("nilai anda D");
    }else{
        System.out.println("nilai anda E");
    }
    }
}
    

    
