
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        try {
        Driver driver =new Driver ();
        DriverManager.registerDriver(driver);
        System.out.println("Berhasil Meregistrasi Driver");
        }
        catch (SQLException ex) {
                System.out.println("Gagal Meregistrasi Driver");
                System.out.println("Pesan: "+ex.getMessage());
                }
        try {
            String url = ("jdbc:mysql://localhost:3306/db_toko");
            String user=("root");
            String pass="";
            Connection koneksi = DriverManager.getConnection(url,user,pass);
        System.out.println("Koneksi ke database berhasil");
        }
        catch(SQLException ex) {
            System.out.println("Koneksi ke database gagal");
            System.out.println("Pesan:"+ex. getMessage());
        }
        }
    }
        
    
    

