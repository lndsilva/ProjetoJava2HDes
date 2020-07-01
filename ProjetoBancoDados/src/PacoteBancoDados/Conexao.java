package PacoteBancoDados;

import java.sql.*;
import java.util.*;


public class Conexao {

    public static Connection abrirConexao() {

        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            String url = "jdbc:mysql://127.0.0.1/estacionamento?user=root&password=";

            con = DriverManager.getConnection(url);

            System.out.println("Conexão aberta...");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        } catch (ClassNotFoundException ex) {
            
            System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());

        }

        return con;

    }
    public static void fecharConexao(Connection con){
        
        try {
            con.close();
            System.out.println("Conexão Fechada...");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }

}
