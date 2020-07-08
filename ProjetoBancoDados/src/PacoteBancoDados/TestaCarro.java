package PacoteBancoDados;

import java.sql.*;
import java.util.*;

public class TestaCarro {

    public static void main(String[] args) {

        Connection con = Conexao.abrirConexao();
        //Objeto carro
        CarroBean carroBean = new CarroBean();
        //O objeto com os métodos de insert, delete, update e select
        CarroDAO carroDAO = new CarroDAO(con);

        carroBean.setPlaca("DNH9817");
        carroBean.setCor("Cinza");
        carroBean.setDescricao("Gol");

        //inserir
        //String resultado = carroDAO.inserir(carroBean);
        // System.out.println(resultado);
        //Alterar
        // System.out.println(carroDAO.alterar(carroBean));
        //Excluir
        //System.out.println(carroDAO.excluir(carroBean));
        //Consultar / Pesquisar
        List<CarroBean> lista = carroDAO.listarTodos();

        if (lista != null) {

            for (CarroBean carro : lista) {
                System.out.println("Placa: " + carro.getPlaca());
                System.out.println("Cor: " + carro.getCor());
                System.out.println("Descrição: " + carro.getDescricao());
                System.out.println("\n");
            }

        }
    }

}
