package com.mycompany.DAO;

import Dados.Voluntarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author joaoj
 */
public class VoluntarioDAO {
    private final Connection connection;

    public VoluntarioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void insert(Voluntarios voluntario) throws SQLException{
        String sql = "insert into voluntarios(nome,datanascimento,endereco,bairro,cep,cidade,telefone,categoria)\n" +
                "values('"+voluntario.getNome()+"','"+voluntario.getDatanascimento()+"','"+voluntario.getEndereco()+"','"+voluntario.getBairro()+"',"
                + "'"+voluntario.getCep()+"','"+voluntario.getCidade()+"','"+voluntario.getTelefone()+"','"+voluntario.getCategoria()+"')";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();
    }
    
    public void update(Voluntarios vl) throws SQLException{
        String sql = "update voluntarios set nome ='"+vl.getNome()+"',datanascimento ='"+vl.getDatanascimento()+"',endereco ='"+vl.getEndereco()+"',"
                + "bairro ='"+vl.getBairro()+"',cep ='"+vl.getCep()+"',cidade ='"+vl.getCidade()+"',telefone ='"+vl.getTelefone()+"',"
                + "categoria ='"+vl.getCategoria()+"' where idvoluntario ='"+vl.getIdvoluntario()+"'";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();  
    }
    
    public void delete(Voluntarios a) throws SQLException{
        String sql = "DELETE from voluntarios where idvoluntario = '"+a.getIdvoluntario()+"'";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();
    }
    
    public List<Voluntarios> listar(){
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Voluntarios> voluntarios = new ArrayList<>();
        
        try {
            stmt = connection.prepareStatement("select idvoluntario, nome, telefone, categoria, endereco from voluntarios order by nome");
            rs = stmt.executeQuery();
            while(rs.next()){
                Voluntarios vs = new Voluntarios();
                vs.setIdvoluntario(rs.getInt("idvoluntario"));
                vs.setNome(rs.getString("nome"));
                vs.setTelefone(rs.getString("telefone"));
                vs.setCategoria(rs.getString("categoria"));
                vs.setEndereco(rs.getString("endereco"));
                voluntarios.add(vs);  
                
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return voluntarios;
    }
    
    public List<Voluntarios> listarBuscar(String nome){
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Voluntarios> voluntarios = new ArrayList<>();
        
        try {
            stmt = connection.prepareStatement("select idvoluntario, nome, telefone, categoria, endereco from voluntarios where nome like '%"+nome+"%'");
            rs = stmt.executeQuery();
            while(rs.next()){
                Voluntarios vs = new Voluntarios();
                vs.setIdvoluntario(rs.getInt("idvoluntario"));
                vs.setNome(rs.getString("nome"));
                vs.setTelefone(rs.getString("telefone"));
                vs.setCategoria(rs.getString("categoria"));
                vs.setEndereco(rs.getString("endereco"));
                voluntarios.add(vs);  
                
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return voluntarios;
    }
    
    public Voluntarios BuscarDados(int a){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Voluntarios vldao = new Voluntarios();
        try {
            stmt = connection.prepareStatement("select nome,datanascimento,endereco,bairro,cep,cidade,telefone,categoria"
                    + " from voluntarios where idvoluntario = '"+a+"'");
            rs = stmt.executeQuery();
            if(rs.next()){
                vldao.setNome(rs.getString("nome"));
                vldao.setDatanascimento(rs.getString("datanascimento"));
                vldao.setEndereco(rs.getString("endereco"));
                vldao.setBairro(rs.getString("bairro"));
                vldao.setCep(rs.getString("cep"));
                vldao.setCidade(rs.getString("cidade"));
                vldao.setTelefone(rs.getString("telefone"));
                vldao.setCategoria(rs.getString("categoria")); 
            }
            connection.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "erro ao buscar dados!");
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vldao;
    }
    
}
