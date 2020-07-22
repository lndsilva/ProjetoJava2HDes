package PacoteBancoDados;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    //Variavel global
    private Connection con;

    //Construtor
    public UsuarioDAO(Connection con) {
        this.con = con;
    }

    //getter e setter
    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    //cadastrar o usuário no sistema
    public String cadastraUsuario(UsuarioBean usuario) {

        String sql = "insert into tbUsuario(nomeUsu,senhaUsu)values(?,?)";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, usuario.getNomeUsu());
            ps.setString(2, usuario.getSenhaUsu());

            if (ps.executeUpdate() > 0) {
                return "Usuário cadastrado com sucesso!!!";
            } else {
                return "Erro ao cadastrar usuário!!!";
            }
        } catch (SQLException ex) {
            return ex.getMessage();
        }

    }

    public boolean autenticaUsuario(UsuarioBean usuario) {

        //implementar a autenticação do usuario aqui...
        boolean autenticado = false;

        String sql = "select nomeUsu, senhaUsu from tbUsuario where nomeUsu=? and senhaUsu=?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, usuario.getNomeUsu());
            ps.setString(2, usuario.getSenhaUsu());

            ResultSet rs;
            //executando o código de forma segura evitando sql injection
            rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }

        return false;
    }

    public List<UsuarioBean> listaUsuario() {

        String sql = "select nomeUsu,senhaUsu from tbusuario";

        List<UsuarioBean> listarUsu = new ArrayList<>();

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if (rs != null) {

                while (rs.next()) {

                    UsuarioBean ub = new UsuarioBean();

                    ub.setNomeUsu(rs.getString(1));
                    ub.setSenhaUsu(rs.getString(2));

                    listarUsu.add(ub);
                }
                return listarUsu;

            } else {
                return null;
            }

        } catch (SQLException ex) {
            return null;
        }
    }

}
