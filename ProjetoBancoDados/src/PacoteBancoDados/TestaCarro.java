package PacoteBancoDados;

import java.sql.*;
import java.util.*;

public class TestaCarro {
    
    public static void main(String[] args) {
        
        Connection con = Conexao.abrirConexao();
        
        CarroBean carroBean = new CarroBean();
        
        CarroDAO carroDAO = new CarroDAO(con);
        
        carroBean.setPlaca("JHA3592");
        carroBean.setCor("Preto");
        carroBean.setDescricao("Gol");
        
        String resultado = carroDAO.inserir(carroBean);
        
        System.out.println(resultado);
        
        
        
        
    }
    
}
