package com.mycompany.DAO;

import Model.Integrante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class IntegranteDAO {
    private final Connection connection;

    public IntegranteDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Integrante it) throws SQLException{
        String sql = "insert into integrante (idassistido,nomea,datanascimento,parentesco,frequenciacentro,escolaridade,estudando) "
                + "values('"+it.getIdassistido()+"','"+it.getNomea()+"','"+it.getDatanascimento()+"','"+it.getParentesco()+"',"
                + "'"+it.getFrequenciacentro()+"','"+it.getEscolaridade()+"','"+it.getEstudando()+"')";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();
    }
    public void update(Integrante it) throws SQLException{
        String sql = "update integrante set nomea ='"+it.getNomea()+"',datanascimento ='"+it.getDatanascimento()+"',parentesco ='"+it.getParentesco()+"',"
                + "frequenciacentro = '"+it.getFrequenciacentro()+"',escolaridade ='"+it.getEscolaridade()+"',estudando ='"+it.getEstudando()+"',"
                + "idassistido ='"+it.getIdassistido()+"'"
                + "where idintegrante = '"+it.getIdintegrante()+"'";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();  
    }
    
    public void delete(Integrante it) throws SQLException{
        String sql = "DELETE from integrante where idintegrante = '"+it.getIdintegrante()+"'";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();
    }
    
    public List<Integrante> listar(){
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Integrante> integrantes = new ArrayList<>();
        
        try {
            stmt = connection.prepareStatement("select integrante.idintegrante,integrante.nomea,assistido.nome,integrante.parentesco,integrante.frequenciacentro from integrante\n" 
                   + "inner join assistido \n" 
                   + "on integrante.idassistido = assistido.idassistido");
            rs = stmt.executeQuery();
            while(rs.next()){
                Integrante it = new Integrante();
                it.setIdintegrante(rs.getInt("idintegrante"));
                it.setNomea(rs.getString("nomea"));
                it.setNomeassistido(rs.getString("nome"));
                it.setParentesco(rs.getString("parentesco"));
                it.setFrequenciacentro(rs.getBoolean("frequenciacentro"));
                integrantes.add(it);  
                
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return integrantes;
    }
    
    public Integrante BuscarDados(int a){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integrante itdao = new Integrante();
        try {
            stmt = connection.prepareStatement("select nomea,escolaridade,datanascimento,parentesco,frequenciacentro,estudando "
                    + "from integrante where idintegrante = '"+a+"'");
            rs = stmt.executeQuery();
            if(rs.next()){
                itdao.setNomea(rs.getString("nomea"));
                itdao.setEscolaridade(rs.getString("escolaridade"));
                itdao.setDatanascimento(rs.getString("datanascimento"));
                itdao.setParentesco(rs.getString("parentesco"));
                itdao.setFrequenciacentro(rs.getBoolean("frequenciacentro"));
                itdao.setEstudando(rs.getBoolean("estudando"));
            }
            connection.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "erro ao buscar dados!");
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return itdao;
    }
    
    public List<Integrante> listarBuscar(String nome){
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Integrante> integrantes = new ArrayList<>();
        
        try {
            stmt = connection.prepareStatement("select integrante.idintegrante,integrante.nomea,assistido.nome,integrante.parentesco,integrante.frequenciacentro from integrante" +
                    " inner join assistido " +
                    " on integrante.idassistido = assistido.idassistido where integrante.nomea like '%"+nome+"%'");
            rs = stmt.executeQuery();
            while(rs.next()){
                Integrante it = new Integrante();
                it.setIdintegrante(rs.getInt("idintegrante"));
                it.setNomea(rs.getString("nomea"));
                it.setNomeassistido(rs.getString("nome"));
                it.setParentesco(rs.getString("parentesco"));
                it.setFrequenciacentro(rs.getBoolean("frequenciacentro"));
                integrantes.add(it);  
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return integrantes;
    }
    
    
}
