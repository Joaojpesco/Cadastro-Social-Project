package com.mycompany.DAO;

import Dados.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {
    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public boolean Autenticar(String login, String senha){
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        try {
            stmt = connection.prepareStatement("select * from usuario where login = '"+login+"' and senha = '"+senha+"'");
            rs = stmt.executeQuery();
            if(rs.next()){
                check = true;
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return check;
    }
}
