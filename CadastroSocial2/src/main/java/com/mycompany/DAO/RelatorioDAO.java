package com.mycompany.DAO;

import Model.Assistido;
import Model.Integrante;
import Model.Psc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RelatorioDAO {
    private final Connection connection;

    public RelatorioDAO(Connection connection) {
        this.connection = connection;
    }
    
    public List<Assistido> RelatorioGravida(){
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        List<Assistido> asg = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("select nome,telefone,endereco from assistido where gravida = true order by nome");
            rs = stmt.executeQuery();
            while(rs.next()){
                Assistido as = new Assistido();
                as.setNome(rs.getString("nome"));
                as.setTelefone(rs.getString("telefone"));
                as.setEndereco(rs.getString("endereco"));
                asg.add(as);  
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asg;  
    }
    
    public List<Assistido> RelatorioIdosos() throws ParseException{
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        List<Assistido> asi = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("select nome,telefone,endereco,datanascimentoa,pensao,aposentado "
                    + "from assistido where pensao or aposentado = false order by nome");
            rs = stmt.executeQuery();
            while(rs.next()){
                Assistido as = new Assistido();
                as.setIdade(as.Idade(rs.getString("datanascimentoa")));
                as.setPensao(rs.getBoolean("pensao"));
                as.setAposentado(rs.getBoolean("aposentado"));
                as.setNome(rs.getString("nome"));
                as.setTelefone(rs.getString("telefone"));
                as.setEndereco(rs.getString("endereco"));
                if(as.getIdade()> 60 && (as.getAposentado() == false || as.getPensao() == false)){
                    asi.add(as); 
                }   
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asi;  
    }
    
    public List<Assistido> RelatorioCrianca() throws ParseException{
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        List<Assistido> asi = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("select nome,telefone,endereco,integrante.datanascimento,integrante.nomea from assistido \n" +
                    "inner join integrante\n" +
                    "on assistido.idassistido = integrante.idassistido order by nome\n");
            rs = stmt.executeQuery();
            while(rs.next()){
                Assistido as = new Assistido();
                as.setNomecrianca(rs.getString("nomea"));
                as.setIdade(as.Idade(rs.getString("datanascimento")));
                as.setNome(rs.getString("nome"));
                as.setTelefone(rs.getString("telefone"));
                as.setEndereco(rs.getString("endereco"));
                if(as.getIdade() < 3 ){
                    asi.add(as); 
                }   
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asi;  
    }
    
    public List<Psc> RelatorioPscVara(String vara){
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        List<Psc> psi = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("select nome,endereco,telefone from psc where varacriminal ='"+vara+"'");
            rs = stmt.executeQuery();
            while(rs.next()){
                Psc psc = new Psc();
                psc.setNome(rs.getString("nome"));
                psc.setEndereco(rs.getString("endereco"));
                psc.setTelefone(rs.getString("telefone"));
                psi.add(psc);
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return psi;  
    }
    
        public List<Psc> RelatorioPscVaraNome(String vara,String nome){
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        List<Psc> psi = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("select nome,endereco,telefone from psc where varacriminal ='"+vara+"' and nome like '%"+nome+"%'");
            rs = stmt.executeQuery();
            while(rs.next()){
                Psc psc = new Psc();
                psc.setNome(rs.getString("nome"));
                psc.setEndereco(rs.getString("endereco"));
                psc.setTelefone(rs.getString("telefone"));
                psi.add(psc);
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return psi;  
    }
    
    public List<Assistido> RelatorioCriancaNome(String nome) throws ParseException{
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        List<Assistido> asi = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("select nome,telefone,endereco,integrante.datanascimento,integrante.nomea from assistido \n" +
                    "inner join integrante\n" +
                    "on assistido.idassistido = integrante.idassistido\n"
                    +"where nome like '%"+nome+"%'");
            rs = stmt.executeQuery();
            while(rs.next()){
                Assistido as = new Assistido();
                as.setNomecrianca(rs.getString("nomea"));
                as.setIdade(as.Idade(rs.getString("datanascimento")));
                as.setNome(rs.getString("nome"));
                as.setTelefone(rs.getString("telefone"));
                as.setEndereco(rs.getString("endereco"));
                if(as.getIdade() < 3 ){
                    asi.add(as); 
                }   
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asi;  
    }
    
    public List<Assistido> listaBuscarGravida(String nome){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Assistido> assistidos = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("select nome,telefone,endereco from assistido where gravida = true and nome like '%"+nome+"%'");
            rs = stmt.executeQuery();
            while(rs.next()){
                Assistido as = new Assistido();
                as.setNome(rs.getString("nome"));
                as.setTelefone(rs.getString("telefone"));
                as.setEndereco(rs.getString("endereco"));
                assistidos.add(as);  
            }
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao buscar dados!");
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return assistidos;
    }
    

    
   public List<Assistido> RelatorioIdososNome(String nome) throws ParseException{
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        List<Assistido> asi = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("select nome,telefone,endereco,datanascimentoa,pensao,aposentado "
                    + "from assistido where (pensao or aposentado = false) and nome like '%"+nome+"%'");
            rs = stmt.executeQuery();
            while(rs.next()){
                Assistido as = new Assistido();
                as.setIdade(as.Idade(rs.getString("datanascimentoa")));
                as.setPensao(rs.getBoolean("pensao"));
                as.setAposentado(rs.getBoolean("aposentado"));
                as.setNome(rs.getString("nome"));
                as.setTelefone(rs.getString("telefone"));
                as.setEndereco(rs.getString("endereco"));
                if(as.getIdade()> 60 && (as.getAposentado() == false || as.getPensao() == false)){
                    asi.add(as); 
                }   
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asi;  
    } 
    
    public List<Integrante> listarIntegranteRelatorio(int a){
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Integrante> integrantes = new ArrayList<>();
        
        try {
            stmt = connection.prepareStatement("select nomea, parentesco from integrante where idassistido = '"+a+"'"
                    + "order by nomea");
            rs = stmt.executeQuery();
            while(rs.next()){
                Integrante it = new Integrante();
                it.setNomea(rs.getString("nomea"));
                it.setParentesco(rs.getString("parentesco"));
                integrantes.add(it);    
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return integrantes;
    }
    
    public List<Assistido> RelatorioIntegranteNome(String nome) throws ParseException{
        PreparedStatement stmt = null;
        ResultSet rs = null; 
        List<Assistido> asi = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("select nome,idassistido"
                    + "from assistido where nome like '%"+nome+"%'");
            rs = stmt.executeQuery();
            while(rs.next()){
                Assistido as = new Assistido();
                as.setIdassistido(rs.getInt("idassistido"));
                as.setNome(rs.getString("nome"));
                if(as.getIdade()> 60 && (as.getAposentado() == false || as.getPensao() == false)){
                    asi.add(as); 
                }   
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asi;  
    } 
}
