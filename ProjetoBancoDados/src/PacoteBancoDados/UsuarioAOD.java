package PacoteBancoDados;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

//Objeto com a lógica de acesso a dados (insert,delete,update e select)
public class UsuarioAOD {

    Connection con;

    public UsuarioAOD(Connection con) {
        this.con = con;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    //método que irá autenticar o usuário.
    public boolean autenticarUsuario(UsuarioAOD usuario) {

        String sql = "select nomeusu,senhausu from tbusuario where nomeusu=? and senhausu=?";

        try {

            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(0, sql);

            ResultSet rs = ps.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioAOD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return true;
    }

    public String cadastrarUsuario(UsuarioAOD usuario) {

        String sql = "insert into tbUsuario(nomeUsu,senhaUsu)values('?','?');";

        PreparedStatement ps;
        try {
            ps = getCon().prepareStatement(sql);
            ps.setString(0, sql);
            
            ps.executeUpdate();
            
            
            
            

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioAOD.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

}
