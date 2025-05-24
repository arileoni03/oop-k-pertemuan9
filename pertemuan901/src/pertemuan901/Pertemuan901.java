/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan901;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author arile
 * TGL 17 MAY 2025
 */
public class Pertemuan901 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        dbkoneksi dbk = new dbkoneksi();
        Statement stm = dbk.koneksi().createStatement();
        String sql = "SELECT * FROM data_teman;";
        ResultSet rs = stm.executeQuery(sql);

        while(rs.next()){
            System.out.println("Nama: "+ rs.getString("namateman"));
        }
    }
    
}
