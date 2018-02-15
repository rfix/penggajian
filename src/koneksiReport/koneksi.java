/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksiReport;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author rofiq
 */
public class koneksi {
        private Connection koneksi;
        private ResultSet rs;
        private PreparedStatement ps;
        
        public Connection getKoneksi(){
            if(koneksi == null){
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    try{
                        String url = "jdbc:mysql://localhost:3306/penggajian";
                        koneksi = DriverManager.getConnection(url, "root", "");
                        System.out.println("Isoh Konex Kang");
                    } catch (SQLException ex){
                        System.out.println("Ora Iso Konex Kang " + ex);
                        System.exit(0);
                    }    
                } catch (ClassNotFoundException ex){
                    System.out.println("Class Ra Ketemu " + ex);
                    System.exit(0);
                }
            }
            return koneksi;
        }
        public ResultSet getRs(){
            return rs;
        }
        public boolean eksekusiQuery(String query, boolean status){
            try {
                ps = koneksi.prepareStatement(query);
                if (status){
                    rs = ps.executeQuery();
                }else{
                    ps.executeUpdate();
                }
                return true;
            } catch (SQLException ex){
                return false;
            }
        }
        public static void main(String[] args) {
            new koneksi().getKoneksi();
    }
}
