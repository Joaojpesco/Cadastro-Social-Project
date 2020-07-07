package com.mycompany.DAO;

import Model.Assistido;
import View.TelaPrincipal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AssistidoDao {
    
    private final Connection connection;

    public AssistidoDao(Connection connection) {
        this.connection = connection;
    }

    public void insert(Assistido assistido) throws SQLException{
        
            String sql = "insert into assistido(nome,rg,cpf,datanascimentoa,endereco,bairro,cep,cidade,telefone,estadocivil,escolaridade,"
                    + "bolsafamilia,cadastrorendacidada,cadunico,doencas,trabalha,aposentado,pensao,obs,sexo,gravida)"
                    + "values ('"+assistido.getNome()+"','"+assistido.getRg()+"','"+assistido.getCpf()+"','"+assistido.getDatanascimentoa()+"',"
                    + "'"+assistido.getEndereco()+"','"+assistido.getBairro()+"','"+assistido.getCep()+"','"+assistido.getCidade()+"',"
                    + "'"+assistido.getTelefone()+"','"+assistido.getEstadocivil()+"','"+assistido.getEscolaridade()+"','"+assistido.getBolsafamilia()+"',"
                    + "'"+assistido.getCadastrorendacidada()+"','"+assistido.getCadunico()+"','"+assistido.getDoencas()+"','"+assistido.getTrabalha()+"',"
                    + "'"+assistido.getAposentado()+"','"+assistido.getPensao()+"','"+assistido.getObs()+"','"+assistido.getSexo()+"','"+assistido.getGravida()+"');";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            connection.close();  
    }
    
    public void update(Assistido a) throws SQLException{
        
            String sql = "update assistido set nome ='"+a.getNome()+"',rg ='"+a.getRg()+"',cpf ='"+a.getCpf()+"',datanascimentoa ='"+a.getDatanascimentoa()+"'"
                    + ",endereco ='"+a.getEndereco()+"',bairro ='"+a.getBairro()+"',cep ='"+a.getCep()+"',cidade ='"+a.getCidade()+"',"
                    + "telefone ='"+a.getTelefone()+"',estadocivil ='"+a.getEstadocivil()+"',escolaridade ='"+a.getEscolaridade()+"',"
                    + "bolsafamilia ='"+a.getBolsafamilia()+"',cadastrorendacidada ='"+a.getCadastrorendacidada()+"',cadunico ='"+a.getCadunico()+"',"
                    + "doencas ='"+a.getDoencas()+"',trabalha ='"+a.getTrabalha()+"',aposentado ='"+a.getAposentado()+"',pensao ='"+a.getPensao()+"',"
                    + "obs ='"+a.getObs()+"',sexo ='"+a.getSexo()+"',gravida ='"+a.getGravida()+"'"
                    + "where idassistido ='"+a.getIdassistido()+"'";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            connection.close();  
    }
    
    public void delete(Assistido a) throws SQLException{
        String sql = "DELETE from assistido where idassistido = '"+a.getIdassistido()+"'";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
         connection.close(); 
    }
    
    public List<Assistido> listaBuscar(String nome){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Assistido> assistidos = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("select idassistido,nome,cpf,datanascimentoa,endereco,bairro,cidade,telefone from assistido\n" 
                    + "where nome like '%"+nome+"%'");
            rs = stmt.executeQuery();
            while(rs.next()){
                Assistido as = new Assistido();
                as.setIdassistido(rs.getInt("idassistido"));
                as.setNome(rs.getString("nome"));
                as.setCpf(rs.getString("cpf"));
                as.setDatanascimentoa(rs.getString("datanascimentoa"));
                as.setEndereco(rs.getString("endereco"));
                as.setCidade(rs.getString("cidade"));
                as.setTelefone(rs.getString("telefone"));
                assistidos.add(as);  
            }
            connection.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao buscar dados!");
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return assistidos;
    }
    
    public List<Assistido> listar(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Assistido> assistidos = new ArrayList<>();
        try {
            stmt = connection.prepareStatement("select idassistido,nome,cpf,datanascimentoa,endereco,bairro,cidade,telefone from assistido order by nome");
            rs = stmt.executeQuery();
            while(rs.next()){
                Assistido as = new Assistido();
                as.setIdassistido(rs.getInt("idassistido"));
                as.setNome(rs.getString("nome"));
                as.setDatanascimentoa(rs.getString("datanascimentoa"));
                as.setEndereco(rs.getString("endereco"));
                as.setCidade(rs.getString("cidade"));
                as.setTelefone(rs.getString("telefone"));
                assistidos.add(as);  
            }
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return assistidos;
    }   
    
    public Assistido BuscarDados(int a){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Assistido as = new Assistido();
        try {
            stmt = connection.prepareStatement("select nome,rg,cpf,datanascimentoa,endereco,bairro,cep,cidade,telefone,estadocivil,escolaridade,"
                    + "bolsafamilia,cadastrorendacidada,cadunico,doencas,trabalha,aposentado,pensao,obs,sexo,gravida from assistido where idassistido ='"+a+"'");
            rs = stmt.executeQuery();
            if(rs.next()){
                as.setNome(rs.getString("nome"));
                as.setRg(rs.getString("rg"));
                as.setCpf(rs.getString("cpf"));
                as.setDatanascimentoa(rs.getString("datanascimentoa"));
                as.setEndereco(rs.getString("endereco"));
                as.setBairro(rs.getString("bairro"));
                as.setCep(rs.getString("cep"));
                as.setCidade(rs.getString("cidade"));
                as.setTelefone(rs.getString("telefone"));
                as.setEstadocivil(rs.getString("estadocivil"));
                as.setEscolaridade(rs.getString("escolaridade"));
                as.setBolsafamilia(rs.getBoolean("bolsafamilia"));
                as.setCadastrorendacidada(rs.getBoolean("cadastrorendacidada"));
                as.setCadunico(rs.getBoolean("cadunico"));
                as.setDoencas(rs.getString("doencas"));
                as.setTrabalha(rs.getString("trabalha"));
                as.setAposentado(rs.getBoolean("aposentado"));
                as.setPensao(rs.getBoolean("pensao"));
                as.setObs(rs.getString("obs"));
                as.setSexo(rs.getString("sexo"));
                as.setGravida(rs.getBoolean("gravida"));
            }
            connection.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "erro ao buscar dados!");
            Logger.getLogger(AssistidoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return as;
    }
    public static int calculaIdade(String dataNasc, String pattern){

        DateFormat sdf = new SimpleDateFormat(pattern);

        Date dataNascInput = null;

        try {

            dataNascInput= (Date) sdf.parse(dataNasc);

        } catch (Exception e) {}

        Calendar dateOfBirth = new GregorianCalendar();

        dateOfBirth.setTime(dataNascInput);

        // Cria um objeto calendar com a data atual

        Calendar today = Calendar.getInstance();

        // Obtém a idade baseado no ano

        int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);

        dateOfBirth.add(Calendar.YEAR, age);
        if (today.before(dateOfBirth)) {
            age--;
        }
        return age;
    }
}

