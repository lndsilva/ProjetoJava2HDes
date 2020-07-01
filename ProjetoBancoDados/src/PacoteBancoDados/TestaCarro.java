package PacoteBancoDados;

import java.sql.*;
import java.util.*;

public class TestaCarro {
    
    public static void main(String[] args) {
        
        Connection con = Conexao.abrirConexao();
        
        CarroBean carroBean = new CarroBean();
        
        CarroDAO carroDAO = new CarroDAO(con);
        
        carroBean.setPlaca("NHD8971");
        carroBean.setCor("Vermelho");
        carroBean.setDescricao("Honda");
        
       //inserir
        //String resultado = carroDAO.inserir(carroBean);
        //System.out.println(resultado);
        
        //Alterar
       // System.out.println(carroDAO.alterar(carroBean));
       
       //Excluir
       //System.out.println(carroDAO.excluir(carroBean));
       
       //Consultar / Pesquisar
       
       List<CarroBean> lista = carroDAO.listarTodos();
       
        if (lista != null) {
            
            for(CarroBean carro : lista){
                System.out.println("Placa: "+carro.getPlaca());
                System.out.println("Cor: "+carro.getCor());
                System.out.println("Descrição: "+carro.getDescricao());
                System.out.println("\n");
            }
            
        }
       
       
        
        
        
        
    }
    
}
