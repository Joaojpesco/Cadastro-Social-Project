package com.mycompany.DAO;

import Model.Psc;
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
public class PscDAO {
        private final Connection connection;

    public PscDAO(Connection connection) {
        this.connection = connection;
    }
        
    
    public void insert(Psc psc) throws SQLException{
        String sql = "insert into psc(nome,endereco,bairro,cep,cidade,telefone,varacriminal,datainicio,dataencerramento,"
                + "medidaimposta,diassemana,horarios,medidaimpostatotal)\n" +
                "values ('"+psc.getNome()+"','"+psc.getEndereco()+"','"+psc.getBairro()+"','"+psc.getCep()+"','"+psc.getCidade()+"',"
                + "'"+psc.getTelefone()+"','"+psc.getVaracriminal()+"','"+psc.getDatainicio()+"','"+psc.getDataencerramento()+"',"
                + "'"+psc.getMedidaimposta()+"','"+psc.getDiassemana()+"','"+psc.getHorarios()+"','"+psc.getMedidaimpostatotal()+"')";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();
    }
    
    public void update(Psc psc) throws SQLException{
        String sql = "update psc set nome ='"+psc.getNome()+"',endereco ='"+psc.getEndereco()+"',bairro ='"+psc.getBairro()+"',"
                + "cep ='"+psc.getCep()+"',cidade ='"+psc.getCidade()+"',telefone ='"+psc.getTelefone()+"',"
                + "varacriminal ='"+psc.getVaracriminal()+"',datainicio ='"+psc.getDatainicio()+"',dataencerramento ='"+psc.getDataencerramento()+"',"
                + "medidaimposta ='"+psc.getMedidaimposta()+"',diassemana ='"+psc.getDiassemana()+"',horarios ='"+psc.getHorarios()+"',"
                + "medidaimpostatotal ='"+psc.getMedidaimpostatotal()+"' where idpsc ='"+psc.getIdpsc()+"'";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
        connection.close();  
    }
    
    public void delete(Psc a) throws SQLException{
        String sql = "DELETE from psc where idpsc = '"+a.getIdpsc()+"'";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
         connection.close(); 
    }
    
    public List<Psc> listar(){
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Psc> psc = new ArrayList<>();
        
        try {
            stmt = connection.prepareStatement("select idpsc, nome, endereco, telefone, varacriminal from psc order by nome");
            rs = stmt.executeQuery();
            while(rs.next()){
                Psc ps = new Psc();
                ps.setIdpsc(rs.getInt("idpsc"));
                ps.setNome(rs.getString("nome"));
                ps.setEndereco(rs.getString("endereco"));
                ps.setTelefone(rs.getString("telefone"));
                ps.setVaracriminal(rs.getString("varacriminal"));
                psc.add(ps);  
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return psc;
    }
     public List<Psc> listarBuscar(String nome){
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Psc> psc = new ArrayList<>();
        
        try {
            stmt = connection.prepareStatement("select idpsc, nome, endereco, telefone, varacriminal from psc where nome like '%"+nome+"%'");
            rs = stmt.executeQuery();
            while(rs.next()){
                Psc ps = new Psc();
                ps.setIdpsc(rs.getInt("idpsc"));
                ps.setNome(rs.getString("nome"));
                ps.setEndereco(rs.getString("endereco"));
                ps.setTelefone(rs.getString("telefone"));
                ps.setVaracriminal(rs.getString("varacriminal"));
                psc.add(ps);  
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return psc;
    }
    
    
    
    
    public Psc BuscarDados(int a){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Psc psc = new Psc();
        try {
            stmt = connection.prepareStatement("select nome,endereco,bairro,cep,cidade,telefone,varacriminal,datainicio,dataencerramento,"
                    + "medidaimposta,diassemana,horarios,medidaimpostatotal from psc where idpsc = '"+a+"'");
            rs = stmt.executeQuery();
            if(rs.next()){
                psc.setNome(rs.getString("nome"));
                psc.setEndereco(rs.getString("endereco"));
                psc.setBairro(rs.getString("bairro"));
                psc.setCep(rs.getString("cep"));
                psc.setCidade(rs.getString("cidade"));
                psc.setTelefone(rs.getString("telefone"));
                psc.setVaracriminal(rs.getString("varacriminal"));
                psc.setDatainicio(rs.getString("datainicio"));
                psc.setDataencerramento(rs.getString("dataencerramento"));
                psc.setMedidaimposta(rs.getString("medidaimposta"));
                psc.setDiassemana(rs.getString("diassemana"));
                psc.setHorarios(rs.getString("horarios"));
                psc.setMedidaimpostatotal(rs.getString("medidaimpostatotal"));
            }
            connection.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "erro ao buscar dados!");
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return psc;
    }
}
