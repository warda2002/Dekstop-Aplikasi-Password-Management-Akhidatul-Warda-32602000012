/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foldertugasbesar;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author NO 1
 */
public class koneksi {
    static Connection nyambung() {
        throw new UnsupportedOperationException(""); 
    }
    private Connection koneksi;
    public Connection konek(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("berhasil konek");
        }catch(ClassNotFoundException ex){
            System.out.println("gagal koneksi"+ex);
        }
        String url = "jdbc:mysql://localhost:3306/desktop";
        try{
            koneksi = DriverManager.getConnection(url,"root","");
            System.out.println("berhasil koneksi database");
        } catch (SQLException ex) {
            System.out.println("gagal koneksi database"+ex);
        }
        return koneksi;
        
    }
    
}

