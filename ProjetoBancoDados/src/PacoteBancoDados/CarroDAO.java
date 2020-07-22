package PacoteBancoDados;

import java.sql.*;
import java.util.*;
import java.util.concurrent.locks.StampedLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CarroDAO {

    //Definindo o atributo/variável global       
    private Connection con;

    //Criar o construtor
    public CarroDAO(Connection con) {
        this.con = con;
    }

    //Definindo os getters e setters
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public String inserir(CarroBean carro) {

        String sql = "insert into carro(placa,cor,descricao)values(?,?,?)";

        try {
            //Preparando a variáveil sql para receber os dados
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());

            if (ps.executeUpdate() > 0) {
                return "Carro cadastrado com sucesso!!!";
            } else {
                return "Erro ao cadastrar!!!";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }
    }

    public String alterar(CarroBean carro) {

        String sql = "update carro set cor = ?, descricao = ? where placa = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, carro.getCor());
            ps.setString(2, carro.getDescricao());
            ps.setString(3, carro.getPlaca());

            if (ps.executeUpdate() > 0) {
                return "Carro alterado com sucesso!!!";
            } else {
                return "Erro ao alterar!!!";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }

    }

    public String excluir(CarroBean carro) {

        String sql = "delete from carro where placa=?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, carro.getPlaca());

            if (ps.executeUpdate() > 0) {
                return "Carro excluido com sucesso!!!";
            } else {
                return "Erro ao excluir!!!";
            }

        } catch (SQLException ex) {
            return ex.getMessage();
        }

    }

    public List<CarroBean> listarTodos() {

        //Retornar todos os dados dos carros
        String sql = "select * from carro";

        //Criando o objeto para inserir os dados dos carros
        List<CarroBean> listaCarro = new ArrayList<CarroBean>();

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    CarroBean cb = new CarroBean();

                    cb.setPlaca(rs.getString(1));
                    cb.setCor(rs.getString(2));
                    cb.setDescricao(rs.getString(3));

                    //adicionando valores na lista
                    listaCarro.add(cb);

                }
                return listaCarro;

            } else {
                return null;
            }

        } catch (SQLException ex) {
            return null;
        }
    }
  
}
