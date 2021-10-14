/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasql;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author helmi
 */
public class JavaSql {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/ebookshop";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stmt;
    static ResultSet result;
    
    public static void main(String[] args) {
        
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM books";
            result = stmt.executeQuery(sql);
            
            System.out.println("Daftar Buku Tersedia:");
            System.out.println("------------------------------");
            // tampilkan hasil query
            while(result.next()){
                System.out.println("ID Buku: " + result.getInt("id"));
                System.out.println("Judul: " + result.getString("title"));
                System.out.println("Penulis: " + result.getString("author"));
                System.out.println("Harga: " + result.getString("price"));
                System.out.println("Jumlah: " + result.getString("qty"));
                System.out.println("------------------------------");
            }
            
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }  
}
