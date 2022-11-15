import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;

public class ProgramUpdate {

    public static void main(String[] args) {
        Connection koneksi = KoneksiDatabase.getkoneksi();
        Statement statement= null;
        try {
            statement = koneksi.createStatement();
            System.out.println("Statement berhasil dibuat");
            String url ="UPDATE barang SET nama_barang='PENSIL 2B',jumlah=20,harga=2500 WHERE kode_barang='B001'";
                    statement.executeUpdate (url);
        }catch(SQLException ex){
            System.out.println("Statement gagal dibuat");
            System.out.println("Pesan:"+ex.getMessage());
            }
        finally{
            if (statement !=null){
                try {
                    statement.close();
                    System.out.println("Statement berhasil ditutup");
                }catch(SQLException ex){
                    System.out.println("Statement gagal ditutup");
                    System.out.println("Pesan :"+ex.getMessage());
                    
                }
            }
        }
}
        
        
    
    
}
