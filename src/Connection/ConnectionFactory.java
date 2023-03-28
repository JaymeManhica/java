/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

/**
 *
 * @author MANHICA
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class ConnectionFactory {

       private static final  String DRIVER = "com.mysql.jdbc.Driver";
       private static final String URL = "jdbc:mysql://localhost:3306/carro";
       private static final String USER ="root";
       private static final String PASS = "";
       
   public static Connection getConnection(){
       
       try {
           Class.forName(DRIVER);
           return DriverManager.getConnection(URL,  USER, PASS);
       } catch (ClassNotFoundException | SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro com Banco de Dados");
           throw new RuntimeException("Erro na conexao",ex);
       }
   }

    
    public static void fecharConexao(Connection con) {

        try {
            if (con != null) {
                con.close();
            }

        } catch (SQLException e) {
        } 
    }
    
    public static void fecharConexao(Connection con, PreparedStatement stmt) {

        try {
            if (con != null) {
                fecharConexao(con);
            }
            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException e) {            
        }
    }
    
    public static void fecharConexao(Connection conn, PreparedStatement stmt, ResultSet rs) {

        try {
            if (conn != null || stmt != null) {
                fecharConexao(conn, stmt);
            }
            if (rs != null) {
                rs.close();
            }

        } catch (SQLException e) {
        }
    }
   
}
