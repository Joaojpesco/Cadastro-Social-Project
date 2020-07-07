package Controller;

import Dados.Assistido;
import Dados.Integrante;
import Dados.Psc;
import Dados.Voluntarios;
import View.TelaPrincipal;
import com.mycompany.DAO.AssistidoDao;
import Conexao.Conexao;
import com.mycompany.DAO.IntegranteDAO;
import com.mycompany.DAO.PscDAO;
import com.mycompany.DAO.RelatorioDAO;
import com.mycompany.DAO.VoluntarioDAO;
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
import javax.swing.table.DefaultTableModel;


public class TelaPrincipalController {
    
    
    private TelaPrincipal view;
    public TelaPrincipalController(TelaPrincipal view) {
        this.view = view;
    }
    
    public void CadastraAssistido(){
        Assistido assistido = new Assistido();
        Connection conexao;
        if(view.getTxtNomeAssistido().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo nome não pode estar vazio.");
        }else if(view.getTxtRgAssistido().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo RG não pode estar vazio.");
        }else if(view.getTxtCpfAssistido().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo CPF não pode estar vazio.");
        }else if(view.getTxtDataAssistido().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo data de nascimento não pode estar vazio.");
        }else if(view.getTxtEnderecoAssistido().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo endereço não pode estar vazio.");
        }else if(view.getTxtBairroAssistido().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo bairro não pode estar vazio.");
        }else if(view.getTxtCepAssistido().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo CEP não pode estar vazio.");
        }else if(view.getTxtCidadeAssistido().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo cidade não pode estar vazio.");
        }else if(view.getTxtTelefoneAssistido().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo telefone não pode estar vazio.");
        }else if(view.getTxtEscolaridadeAssistido().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo escolaridade não pode estar vazio.");
        }else if(view.getComboTrabalhaAssistido().equals("Escolha")){
            JOptionPane.showMessageDialog(null, "Campo trabalha não pode estar vazio.");
        }else if(view.getComboEstadoAssistido().equals("Escolha")){
            JOptionPane.showMessageDialog(null, "Campo estado civil não pode estar vazio.");
        }else if(view.getComboSexo().equals("Escolha")){
            JOptionPane.showMessageDialog(null, "Campo sexo não pode estar vazio.");
        }else{
            assistido.setNome(view.getTxtNomeAssistido().getText());
            assistido.setRg(view.getTxtRgAssistido().getText());
            assistido.setCpf(view.getTxtCpfAssistido().getText());
            assistido.setDatanascimentoa(view.getTxtDataAssistido().getText());
            assistido.setEndereco(view.getTxtEnderecoAssistido().getText());
            assistido.setBairro(view.getTxtBairroAssistido().getText());
            assistido.setCep(view.getTxtCepAssistido().getText());
            assistido.setCidade(view.getTxtCidadeAssistido().getText());
            assistido.setTelefone(view.getTxtTelefoneAssistido().getText());
            assistido.setEscolaridade(view.getTxtEscolaridadeAssistido().getText());
            assistido.setObs(view.getTxtObsAssistido().getText());
            assistido.setEstadocivil(view.getComboEstadoAssistido().getSelectedItem().toString());
            assistido.setTrabalha(view.getComboTrabalhaAssistido().getSelectedItem().toString());
            assistido.setSexo(view.getComboSexo().getSelectedItem().toString());
            if(view.getComboGravida().getSelectedItem().equals("Sim")){
                assistido.setGravida(true);
            }else{
                assistido.setGravida(false);
            }
            
            if(view.getComboBolsaAssistido().getSelectedItem().equals("Sim")){
                assistido.setBolsafamilia(true);
            }else{
                assistido.setBolsafamilia(false);
            }
            if(view.getComboAposentadoAssistido().getSelectedItem().equals("Sim")){
                assistido.setAposentado(true);
            }else{
                assistido.setAposentado(false);
            }
            if(view.getComboPensaoAssistido().getSelectedItem().equals("Sim")){
                assistido.setPensao(true);
            }else{
                assistido.setPensao(false);
            }
            if(view.getComboRendaAssistido().getSelectedItem().equals("Sim")){
                assistido.setCadastrorendacidada(true);
            }else{
                assistido.setCadastrorendacidada(false);
            }
            if(view.getTxtDoencaAssistido().isEnabled()){
                assistido.setDoencas(view.getTxtDoencaAssistido().getText());
            }else{
                assistido.setDoencas("");
            }
            try {
                conexao = new Conexao().getConnection();
                AssistidoDao assistidoDao = new AssistidoDao(conexao);
                assistidoDao.insert(assistido);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Falha ao cadastrar.");
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void CadastrarPsc(){
        Psc psc = new Psc();
        Connection conexao;
        
        if(view.getTxtNomePsc().getText().equals("") || view.getTxtEnderecoPsc().getText().equals("") || view.getTxtBairroPsc().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo não pode estar vazio.");
        }else if(view.getTxtCepPsc().getText().equals("") || view.getTxtCidadePsc().getText().equals("") || view.getTxtTelefonePsc().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo não pode estar vazio.");
        }else if(view.getTxtInicioPsc().getText().equals("") || view.getTxtFimPsc().getText().equals("") || view.getTxtMedidaSemanaPsc().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo não pode estar vazio.");
        }else if(view.getTxtDiasSemanaPsc().getText().equals("") || view.getTxtHorariosPsc().getText().equals("") || view.getTxtMedidaTotalPsc().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo não pode estar vazio.");
        }else if(view.getComboVaraCriminalPsc().getSelectedItem().equals("Selecione uma das opções")){
            JOptionPane.showMessageDialog(null, "Selecione uma das opções para vara criminal.");
        }else{
            psc.setNome(view.getTxtNomePsc().getText());
            psc.setEndereco(view.getTxtEnderecoPsc().getText());
            psc.setBairro(view.getTxtBairroPsc().getText());
            psc.setCep((view.getTxtCepPsc().getText()));
            psc.setCidade(view.getTxtCidadePsc().getText());
            psc.setTelefone(view.getTxtTelefonePsc().getText());
            psc.setVaracriminal(view.getComboVaraCriminalPsc().getSelectedItem().toString());
            psc.setDatainicio(view.getTxtInicioPsc().getText());
            psc.setDataencerramento(view.getTxtFimPsc().getText());
            psc.setMedidaimposta(view.getTxtMedidaSemanaPsc().getText());
            psc.setDiassemana(view.getTxtDiasSemanaPsc().getText());
            psc.setHorarios(view.getTxtHorariosPsc().getText());
            psc.setMedidaimpostatotal(view.getTxtMedidaTotalPsc().getText());
            LimpaCampoPsc();
            try {
                conexao = new Conexao().getConnection();
                PscDAO pscdao = new PscDAO(conexao);
                pscdao.insert(psc);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Falha ao cadastrar.");
                Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void CadastrarVoluntario(){
        Voluntarios voluntario = new Voluntarios();
        Connection conexao;
        
        if(view.getTxtNomeVoluntario().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo nome não pode estar vazio.");
        }else if(view.getTxtDataVoluntario().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo data de nascimento não pode estar vazio.");
        }else if(view.getTxtEnderecoVoluntario().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo endereço não pode estar vazio.");
        }else if(view.getTxtBairroVoluntario().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo bairro não pode estar vazio.");
        }else if(view.getTxtCepVoluntario().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo cep não pode estar vazio.");
        }else if(view.getTxtCidadeVoluntario().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo cidade não pode estar vazio.");
        }else if(view.getTxtTelefoneVoluntario().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo telefone não pode estar vazio.");
        }else if(view.getComboCategoriaVoluntario().getSelectedItem().equals("Escolha")){
            JOptionPane.showMessageDialog(null, "Campo categoria não pode ser nulo");
        }else{
            try {
                voluntario.setNome(view.getTxtNomeVoluntario().getText());
                voluntario.setDatanascimento(view.getTxtDataVoluntario().getText());
                voluntario.setEndereco(view.getTxtEnderecoVoluntario().getText());
                voluntario.setBairro(view.getTxtBairroVoluntario().getText());
                voluntario.setCep(view.getTxtCepVoluntario().getText());
                voluntario.setCidade(view.getTxtCidadeVoluntario().getText());
                voluntario.setTelefone(view.getTxtTelefoneVoluntario().getText());
                voluntario.setCategoria(view.getComboCategoriaVoluntario().getSelectedItem().toString());
                conexao = new Conexao().getConnection();
                VoluntarioDAO vldao = new VoluntarioDAO(conexao);
                vldao.insert(voluntario);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                LimpaCampoAssistido();
            } catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Falha ao cadastrar.");
                Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void CadastrarIntegrante(){
        Integrante integrante = new Integrante();
        Connection conexao;
        
        if(view.getTxtNomeIntegrante().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo nome não pode estar vazio.");
        }else if(view.getTxtEscolaridadeIntegrante().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo escolaridade não pode estar vazio.");
        }else if(view.getTxtDataIntegrante().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo data de nascimento não pode estar vazio.");
        }else if(view.getComboParentescoIntegrante().getSelectedItem().equals("Escolha")){
            JOptionPane.showMessageDialog(null, "Campo parentesco não pode estar vazio.");
        }else{
            try {
                integrante.setIdassistido((int) view.getTableIntegranteAssistido().getValueAt(view.getTableIntegranteAssistido().getSelectedRow(), 0));
                integrante.setNomea(view.getTxtNomeIntegrante().getText());
                integrante.setEscolaridade(view.getTxtEscolaridadeIntegrante().getText());
                integrante.setDatanascimento(view.getTxtDataIntegrante().getText());
                integrante.setParentesco(view.getComboParentescoIntegrante().getSelectedItem().toString());
                if(view.getComboFrequenciCentroIntegrante().getSelectedItem().equals("Não")){
                    integrante.setFrequenciacentro(false);
                }else{
                    integrante.setFrequenciacentro(true);
                }
                if(view.getComboEstudaIntegrante().getSelectedItem().equals("Não")){
                    integrante.setEstudando(false);
                }else{
                    integrante.setEstudando(true);
                }
                conexao = new Conexao().getConnection();
                IntegranteDAO integrantedao = new IntegranteDAO(conexao);
                integrantedao.insert(integrante);
                JOptionPane.showMessageDialog(null, "Cadastrado realizado com sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar.");
                Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    
    
    
    public void DeletarPsc(){
        
        if(view.getTablePsc().getSelectedRow() != -1){
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Excluir", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {

                Connection conexao;
                try {
                    conexao = new Conexao().getConnection();
                    PscDAO pscdao = new PscDAO (conexao);
                    Psc psc = new Psc();
                    psc.setIdpsc((int) view.getTablePsc().getValueAt(view.getTablePsc().getSelectedRow(), 0));
                    pscdao.delete(psc);
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
                    LimpaCampoPsc();
                } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null, "Erro ao excluir");
                    Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (resposta == JOptionPane.NO_OPTION) {
               //Usuário clicou em não. Executar o código correspondente.
            }
        }
        
    }
    
    public void DeletarVoluntario(){
        if(view.getTableVoluntario().getSelectedRow() != -1){
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Excluir", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {

                Connection conexao;
                try {
                    conexao = new Conexao().getConnection();
                    Voluntarios vl = new Voluntarios();
                    VoluntarioDAO vldao = new VoluntarioDAO(conexao);
                    vl.setIdvoluntario((int) view.getTableVoluntario().getValueAt(view.getTableVoluntario().getSelectedRow(), 0));
                    vldao.delete(vl);
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
                    LimpaCampoVoluntario();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir");
                    Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (resposta == JOptionPane.NO_OPTION) {
               //Usuário clicou em não. Executar o código correspondente.
            }
        }
    }
    
    public void DeletarAssistido() throws SQLException{
        if(view.getTableAssistido().getSelectedRow() != -1){
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Excluir", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {

                    Connection conexao;
                    try {
                        conexao = new Conexao().getConnection();
                        AssistidoDao asdao = new AssistidoDao(conexao);
                        Assistido assistido = new Assistido();
                        assistido.setIdassistido((int) view.getTableAssistido().getValueAt(view.getTableAssistido().getSelectedRow(), 0));
                        asdao.delete(assistido);
                         JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
                         LimpaCampoAssistido();
                    } catch (SQLException ex) {
                         JOptionPane.showMessageDialog(null, "Erro ao excluir");
                        Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                    }

            } else if (resposta == JOptionPane.NO_OPTION) {
               //Usuário clicou em não. Executar o código correspondente.
            }
        }
        
        
        
    }
    
    public void DeletarIntegrante(){
        if(view.getJtableIntegrante().getSelectedRow() != -1){
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Excluir", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                Connection conexao;
                try {
                    conexao = new Conexao().getConnection();
                    IntegranteDAO it = new IntegranteDAO(conexao);
                    Integrante integrante = new Integrante();
                    integrante.setIdintegrante((int) view.getJtableIntegrante().getValueAt(view.getJtableIntegrante().getSelectedRow(), 0));
                    it.delete(integrante);
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
                    LimpaCampoAssistido();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir");
                    Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (resposta == JOptionPane.NO_OPTION) {
               //Usuário clicou em não. Executar o código correspondente.
            }
        }
    }
    
    
    public void AtualizarVoluntario(){
        if(view.getTableVoluntario().getSelectedRow() != -1){
            Voluntarios vl = new Voluntarios();
            Connection conexao;
            if(view.getTxtNomeVoluntario().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo nome não pode estar vazio.");
            }else if(view.getTxtDataVoluntario().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo data de nascimento não pode estar vazio.");
            }else if(view.getTxtEnderecoVoluntario().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo endereço não pode estar vazio.");
            }else if(view.getTxtBairroVoluntario().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo bairro não pode estar vazio.");
            }else if(view.getTxtCepVoluntario().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo cep não pode estar vazio.");
            }else if(view.getTxtCidadeVoluntario().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo cidade não pode estar vazio.");
            }else if(view.getTxtTelefoneVoluntario().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo telefone não pode estar vazio.");
            }else if(view.getComboCategoriaVoluntario().getSelectedItem().equals("Escolha")){
                JOptionPane.showMessageDialog(null, "Campo categoria não pode ser nulo");
            }else{
                vl.setIdvoluntario((int) view.getTableVoluntario().getValueAt(view.getTableVoluntario().getSelectedRow(), 0));
                vl.setNome(view.getTxtNomeVoluntario().getText());
                vl.setDatanascimento(view.getTxtDataVoluntario().getText());
                vl.setTelefone(view.getTxtTelefoneVoluntario().getText());
                vl.setCategoria(view.getComboCategoriaVoluntario().getSelectedItem().toString());
                vl.setCep(view.getTxtCepVoluntario().getText());
                vl.setEndereco(view.getTxtEnderecoVoluntario().getText());
                vl.setCidade(view.getTxtCidadeVoluntario().getText());
                vl.setBairro(view.getTxtBairroVoluntario().getText());
                LimpaCampoVoluntario();
                try {
                    conexao = new Conexao().getConnection();
                    VoluntarioDAO voluntariodao = new VoluntarioDAO(conexao);
                    voluntariodao.update(vl);
                    
                    JOptionPane.showMessageDialog(null, "Atualizar realizado com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Falha ao atualizar");
                    Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void AtualizarIntegrante(){
        if(view.getJtableIntegrante().getSelectedRow() != -1){
            Integrante integrante = new Integrante();
            Connection conexao;
            
        if(view.getTxtNomeIntegrante().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo nome não pode estar vazio.");
            }else if(view.getTxtEscolaridadeIntegrante().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo escolaridade não pode estar vazio.");
            }else if(view.getTxtDataIntegrante().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo data de nascimento não pode estar vazio.");
            }else if(view.getComboParentescoIntegrante().getSelectedItem().equals("Escolha")){
                JOptionPane.showMessageDialog(null, "Campo parentesco não pode estar vazio.");
            }else if(view.getTableIntegranteAssistido().getSelectionModel().isSelectionEmpty()){
                JOptionPane.showMessageDialog(null, "É necessário escolher um assistido.");
            }else{
                try {
                    integrante.setIdassistido((int) view.getTableIntegranteAssistido().getValueAt(view.getTableIntegranteAssistido().getSelectedRow(), 0));
                    integrante.setIdintegrante((int) view.getJtableIntegrante().getValueAt(view.getJtableIntegrante().getSelectedRow(), 0));
                    integrante.setNomea(view.getTxtNomeIntegrante().getText());
                    integrante.setEscolaridade(view.getTxtEscolaridadeIntegrante().getText());
                    integrante.setDatanascimento(view.getTxtDataIntegrante().getText());
                    integrante.setParentesco(view.getComboParentescoIntegrante().getSelectedItem().toString());
                    if(view.getComboFrequenciCentroIntegrante().getSelectedItem().equals("Não")){
                        integrante.setFrequenciacentro(false);
                    }else{
                        integrante.setFrequenciacentro(true);
                    }
                    if(view.getComboEstudaIntegrante().getSelectedItem().equals("Não")){
                        integrante.setEstudando(false);
                    }else{
                        integrante.setEstudando(true);
                    }
                    conexao = new Conexao().getConnection();
                    IntegranteDAO integrantedao = new IntegranteDAO(conexao);
                    integrantedao.update(integrante);
                    JOptionPane.showMessageDialog(null, "Atualizar realizado com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao atualizar.");
                    Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            
        }
    }
    
    public void AtualizarPsc(){
         if(view.getTablePsc().getSelectedRow() != -1){
            Psc psc = new Psc();
            Connection conexao;

            if(view.getTxtNomePsc().getText().equals("") || view.getTxtEnderecoPsc().getText().equals("") || view.getTxtBairroPsc().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo não pode estar vazio.");
            }else if(view.getTxtCepPsc().getText().equals("") || view.getTxtCidadePsc().getText().equals("") || view.getTxtTelefonePsc().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo não pode estar vazio.");
            }else if(view.getTxtInicioPsc().getText().equals("") || view.getTxtFimPsc().getText().equals("") || view.getTxtMedidaSemanaPsc().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo não pode estar vazio.");
            }else if(view.getTxtDiasSemanaPsc().getText().equals("") || view.getTxtHorariosPsc().getText().equals("") || view.getTxtMedidaTotalPsc().getText().equals("")){
                JOptionPane.showMessageDialog(null, "Campo não pode estar vazio.");
            }else if(view.getComboVaraCriminalPsc().getSelectedItem().equals("Selecione uma das opções")){
                JOptionPane.showMessageDialog(null, "Selecione uma das opções para vara criminal.");
            }else{
                psc.setIdpsc((int) view.getTablePsc().getValueAt(view.getTablePsc().getSelectedRow(), 0));
                psc.setNome(view.getTxtNomePsc().getText());
                psc.setEndereco(view.getTxtEnderecoPsc().getText());
                psc.setBairro(view.getTxtBairroPsc().getText());
                psc.setCep((view.getTxtCepPsc().getText()));
                psc.setCidade(view.getTxtCidadePsc().getText());
                psc.setTelefone(view.getTxtTelefonePsc().getText());
                psc.setVaracriminal(view.getComboVaraCriminalPsc().getSelectedItem().toString());
                psc.setDatainicio(view.getTxtInicioPsc().getText());
                psc.setDataencerramento(view.getTxtFimPsc().getText());
                psc.setMedidaimposta(view.getTxtMedidaSemanaPsc().getText());
                psc.setDiassemana(view.getTxtDiasSemanaPsc().getText());
                psc.setHorarios(view.getTxtHorariosPsc().getText());
                psc.setMedidaimpostatotal(view.getTxtMedidaTotalPsc().getText());
                LimpaCampoPsc();

                try {
                    conexao = new Conexao().getConnection();
                    PscDAO pscdao = new PscDAO(conexao);
                    pscdao.update(psc);
                    JOptionPane.showMessageDialog(null, "Atualizar realizado com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Falha ao atualizar");
                    Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }      
        }
    }
    
    public void AtualizarAssistido(){
        if(view.getTableAssistido().getSelectedRow() != -1){
            Connection conexao;
            try {
                if(view.getTxtNomeAssistido().getText().equals("") || view.getTxtRgAssistido().getText().equals("") || view.getTxtCpfAssistido().getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Campo não pode estar vazio.");
                }else if(view.getTxtDataAssistido().getText().equals("") || view.getTxtEnderecoAssistido().getText().equals("") || view.getTxtBairroAssistido().getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Campo não pode estar vazio.");
                }else if(view.getTxtCepAssistido().getText().equals("") || view.getTxtCidadeAssistido().getText().equals("") || view.getTxtTelefoneAssistido().getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Campo não pode estar vazio.");
                }else if(view.getTxtEscolaridadeAssistido().getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Campo não pode estar vazio.");
                }else if(view.getComboTrabalhaAssistido().equals("Escolha") || view.getComboEstadoAssistido().equals("Escolha") || view.getComboSexo().equals("Escolha")){
                    JOptionPane.showMessageDialog(null, "Campo não pode ser nulo."); 
                }else{
                    conexao = new Conexao().getConnection();
                    AssistidoDao asdao= new AssistidoDao(conexao);
                    Assistido assistido = new Assistido();
                    assistido.setIdassistido((int) view.getTableAssistido().getValueAt(view.getTableAssistido().getSelectedRow(), 0));
                    assistido.setNome(view.getTxtNomeAssistido().getText());
                    assistido.setRg(view.getTxtRgAssistido().getText());
                    assistido.setCpf(view.getTxtCpfAssistido().getText());
                    assistido.setDatanascimentoa(view.getTxtDataAssistido().getText());
                    assistido.setEndereco(view.getTxtEnderecoAssistido().getText());
                    assistido.setBairro(view.getTxtBairroAssistido().getText());
                    assistido.setCep(view.getTxtCepAssistido().getText());
                    assistido.setCidade(view.getTxtCidadeAssistido().getText());
                    assistido.setTelefone(view.getTxtTelefoneAssistido().getText());
                    assistido.setEscolaridade(view.getTxtEscolaridadeAssistido().getText());
                    assistido.setObs(view.getTxtObsAssistido().getText());
                    assistido.setEstadocivil(view.getComboEstadoAssistido().getSelectedItem().toString());
                    assistido.setTrabalha(view.getComboTrabalhaAssistido().getSelectedItem().toString());
                    assistido.setSexo(view.getComboSexo().getSelectedItem().toString());
                    if(view.getComboGravida().getSelectedItem().equals("Sim")){
                        assistido.setGravida(true);
                    }else{
                        assistido.setGravida(false);
                    }

                    if(view.getComboBolsaAssistido().getSelectedItem().equals("Sim")){
                        assistido.setBolsafamilia(true);
                    }else{
                        assistido.setBolsafamilia(false);
                    }
                    if(view.getComboAposentadoAssistido().getSelectedItem().equals("Sim")){
                        assistido.setAposentado(true);
                    }else{
                        assistido.setAposentado(false);
                    }
                    if(view.getComboPensaoAssistido().getSelectedItem().equals("Sim")){
                        assistido.setPensao(true);
                    }else{
                        assistido.setPensao(false);
                    }
                    if(view.getComboRendaAssistido().getSelectedItem().equals("Sim")){
                        assistido.setCadastrorendacidada(true);
                    }else{
                        assistido.setCadastrorendacidada(false);
                    }
                    if(view.getTxtDoencaAssistido().isEnabled()){
                        assistido.setDoencas(view.getTxtDoencaAssistido().getText());
                    }else{
                        assistido.setDoencas("");
                    }
                asdao.update(assistido);
                JOptionPane.showMessageDialog(null, "Atualizar realizado com sucesso!");
                LimpaCampoAssistido();
                }
            } catch (SQLException ex) {
                Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Falha ao atualizar");
            }
            
        }
    }
    
    public void RelatorioGravida() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getTableRelatorioGravida().getModel();
        Connection conexao;
        conexao = new Conexao().getConnection();
        modelo.setNumRows(0);
        RelatorioDAO rdo = new RelatorioDAO(conexao);
        for(Assistido a:rdo.RelatorioGravida()){
            modelo.addRow(new Object[]{
                a.getNome(),
                a.getTelefone(),
                a.getEndereco(),
            });
        }
        conexao.close(); 
        conexao = new Conexao().getConnection();
    }
    
    public void RelatorioIdosos() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getTableIdoso().getModel();
        Connection conexao;
        modelo.setNumRows(0);       
        conexao = new Conexao().getConnection();
        RelatorioDAO rd = new RelatorioDAO(conexao);
        
        try {
            for(Assistido a:rd.RelatorioIdosos()){
                modelo.addRow(new Object[]{
                    a.getNome(),
                    a.getTelefone(),
                    a.getEndereco(),
                });
            }
        } catch (ParseException ex) {
            Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexao.close(); 
    }
        
    public void RelatorioCrianca() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getTableCrianca().getModel();
        Connection conexao;
        modelo.setNumRows(0);       
        conexao = new Conexao().getConnection();
        RelatorioDAO rd = new RelatorioDAO(conexao);
        try {
            for(Assistido a:rd.RelatorioCrianca()){
                modelo.addRow(new Object[]{
                    a.getNome(),
                    a.getTelefone(),
                    a.getEndereco(),
                    a.getNomecrianca(),
                });
            }
        } catch (ParseException ex) {
            Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexao.close(); 
    }
    
    public void RelatorioPscVara() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getTablePscPorVara().getModel();
        Connection conexao;
        modelo.setNumRows(0);       
        conexao = new Conexao().getConnection();
        RelatorioDAO rd = new RelatorioDAO(conexao);
        for(Psc p:rd.RelatorioPscVara(view.getComboPscVaraBusca().getSelectedItem().toString())){
            modelo.addRow(new Object[]{
                p.getNome(),
                p.getEndereco(),
                p.getTelefone(),
            });
        }
        conexao.close(); 
    }
    
        public void RelatorioPscVaraNome() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getTablePscPorVara().getModel();
        Connection conexao;
        modelo.setNumRows(0);       
        conexao = new Conexao().getConnection();
        RelatorioDAO rd = new RelatorioDAO(conexao);
        for(Psc p:rd.RelatorioPscVaraNome(view.getComboPscVaraBusca().getSelectedItem().toString(), view.getTxtPscBuscaRelatorio().getText())){
            modelo.addRow(new Object[]{
                p.getNome(),
                p.getEndereco(),
                p.getTelefone(),
            });
        }
        conexao.close(); 
    }
    
    public void RelatorioCriancaNome() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getTableCrianca().getModel();
        Connection conexao;
        modelo.setNumRows(0);       
        conexao = new Conexao().getConnection();
        RelatorioDAO rd = new RelatorioDAO(conexao);
        try {
            for(Assistido a:rd.RelatorioCriancaNome(view.getTxtCriancaNome().getText())){
                modelo.addRow(new Object[]{
                    a.getNome(),
                    a.getEndereco(),
                    a.getTelefone(),
                    a.getNomecrianca(),
                });
            }
        } catch (ParseException ex) {
            Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexao.close(); 
    }
    
    public void PrencherVoluntarios(){
        if(view.getTableVoluntario().getSelectedRow() != -1){
            Connection conexao;
            try {
                conexao = new Conexao().getConnection();
                VoluntarioDAO vldao = new VoluntarioDAO(conexao);
                Voluntarios vo = vldao.BuscarDados((int) view.getTableVoluntario().getValueAt(view.getTableVoluntario().getSelectedRow(), 0));
                view.getTxtNomeVoluntario().setText(vo.getNome());
                view.getTxtDataVoluntario().setText(vo.getDatanascimento());
                view.getTxtTelefoneVoluntario().setText(vo.getTelefone());
                view.getTxtCepVoluntario().setText(vo.getCep());
                view.getTxtEnderecoVoluntario().setText(vo.getEndereco());
                view.getTxtCidadeVoluntario().setText(vo.getCidade());
                view.getTxtBairroVoluntario().setText(vo.getBairro());
                if(vo.getCategoria().equals("Trabalhador")){
                    view.getComboCategoriaVoluntario().setSelectedIndex(1);
                }else if(vo.getCategoria().equals("Doador pecuniário")){
                    view.getComboCategoriaVoluntario().setSelectedIndex(2);
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "erro!");
                Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    public void PrencherDadosPsc(){
        if(view.getTablePsc().getSelectedRow() != -1){
            Connection conexao;
            try {
                conexao = new Conexao().getConnection();
                PscDAO pscdao = new PscDAO(conexao);
                Psc pscb = pscdao.BuscarDados((int) view.getTablePsc().getValueAt(view.getTablePsc().getSelectedRow(), 0));
                view.getTxtNomePsc().setText(pscb.getNome());
                view.getTxtTelefonePsc().setText(pscb.getTelefone());
                view.getTxtCepPsc().setText(pscb.getCep());
                view.getTxtEnderecoPsc().setText(pscb.getEndereco());
                view.getTxtBairroPsc().setText(pscb.getBairro());
                view.getTxtCidadePsc().setText(pscb.getCidade());
                view.getComboVaraCriminalPsc().getSelectedItem().toString();
                view.getTxtDiasSemanaPsc().setText(pscb.getDiassemana());
                view.getTxtHorariosPsc().setText(pscb.getHorarios());
                view.getTxtMedidaTotalPsc().setText(pscb.getMedidaimpostatotal());
                view.getTxtMedidaSemanaPsc().setText(pscb.getMedidaimposta());
                view.getTxtInicioPsc().setText(pscb.getDatainicio());
                view.getTxtFimPsc().setText(pscb.getDataencerramento());
                
                if(pscb.getVaracriminal().equals("1ª Vara Criminal")){
                    view.getComboVaraCriminalPsc().setSelectedIndex(1);
                }else if(pscb.getVaracriminal().equals("4ª Vara Criminal")){
                    view.getComboVaraCriminalPsc().setSelectedIndex(2);
                }else if(pscb.getVaracriminal().equals("Justiça Federal")){
                    view.getComboVaraCriminalPsc().setSelectedIndex(3);
                }else if(pscb.getVaracriminal().equals("Juizado Especial Criminal")){
                    view.getComboVaraCriminalPsc().setSelectedIndex(4);
                }else if(pscb.getVaracriminal().equals("Juizado da Infância de Juventude")){
                    view.getComboVaraCriminalPsc().setSelectedIndex(5);
                }
            } catch (SQLException ex) {
                Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void PrencherDadosAssistido(){
        if(view.getTableAssistido().getSelectedRow() != -1){
            Connection conexao;
            try {
                conexao = new Conexao().getConnection();
                AssistidoDao asdo = new AssistidoDao(conexao);
                Assistido asis = asdo.BuscarDados((int) view.getTableAssistido().getValueAt(view.getTableAssistido().getSelectedRow(), 0));
                view.getTxtNomeAssistido().setText(asis.getNome());
                view.getTxtDataAssistido().setText(asis.getDatanascimentoa());
                view.getTxtRgAssistido().setText(asis.getRg());
                view.getTxtCpfAssistido().setText(asis.getCpf());
                view.getTxtEscolaridadeAssistido().setText(asis.getEscolaridade());
                view.getTxtTelefoneAssistido().setText(asis.getTelefone());
                view.getTxtCepAssistido().setText(asis.getCep());
                view.getTxtBairroAssistido().setText(asis.getBairro());
                view.getTxtEnderecoAssistido().setText(asis.getEndereco());
                view.getTxtCidadeAssistido().setText(asis.getCidade());
                view.getTxtObsAssistido().setText(asis.getObs());
                if(asis.getDoencas().equals("")){
                    view.getComboDoencaAssistido().setSelectedIndex(0);
                    view.getTxtDoencaAssistido().disable();
                }else{
                    view.getComboDoencaAssistido().setSelectedIndex(1);
                    view.getTxtDoencaAssistido().enable();
                    view.getTxtDoencaAssistido().setText(asis.getDoencas());
                }
                
                if(asis.getCadastrorendacidada() == true){
                    view.getComboRendaAssistido().setSelectedIndex(1);
                }else{
                    view.getComboRendaAssistido().setSelectedIndex(0);
                }
                
                if(asis.getEstadocivil().equals("Solteiro(a)")){
                    view.getComboEstadoAssistido().setSelectedIndex(1);
                }else if(asis.getEstadocivil().equals("Casado(a)")){
                    view.getComboEstadoAssistido().setSelectedIndex(2);
                }else if(asis.getEstadocivil().equals("Divorciado(a)")){
                    view.getComboEstadoAssistido().setSelectedIndex(3);
                }else if(asis.getEstadocivil().equals("Viúvo(a)")){
                    view.getComboEstadoAssistido().setSelectedIndex(4);
                }
                if(asis.getBolsafamilia() == true){
                    view.getComboBolsaAssistido().setSelectedIndex(1);
                }else{
                    view.getComboBolsaAssistido().setSelectedIndex(0);
                }
                
                if(asis.getPensao() == true){
                    view.getComboPensaoAssistido().setSelectedIndex(1);
                }else{
                    view.getComboPensaoAssistido().setSelectedIndex(0);
                }
                
                if(asis.getTrabalha().equals("Não")){
                    view.getComboTrabalhaAssistido().setSelectedIndex(1);
                }else if(asis.getTrabalha().equals("CLT")){
                    view.getComboTrabalhaAssistido().setSelectedIndex(2);
                }else if(asis.getTrabalha().equals("Autônomo")){
                    view.getComboTrabalhaAssistido().setSelectedIndex(3);
                }
                
                if(asis.getAposentado() == true){
                    view.getComboAposentadoAssistido().setSelectedIndex(1);
                }else{
                    view.getComboAposentadoAssistido().setSelectedIndex(0);
                }
                
                if(asis.getSexo().equals("Masculino")){
                    view.getComboSexo().setSelectedIndex(1);
                }else if(asis.getSexo().equals("Feminino")){
                    view.getComboSexo().setSelectedIndex(2);
                }
                if(asis.getGravida() == true){
                    view.getComboGravida().enable();
                    view.getComboGravida().setSelectedIndex(1);
                }else{
                    view.getComboGravida().setSelectedIndex(0);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "erro!");
                Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void PreencherDadosIntegrante(){
        if(view.getJtableIntegrante().getSelectedRow() != -1){
            Connection conexao;
            try {
                conexao = new Conexao().getConnection();
                IntegranteDAO itdao = new IntegranteDAO(conexao);
                Integrante it = itdao.BuscarDados((int) view.getJtableIntegrante().getValueAt(view.getJtableIntegrante().getSelectedRow(), 0));
                view.getTxtNomeIntegrante().setText(it.getNomea());
                view.getTxtEscolaridadeIntegrante().setText(it.getEscolaridade());
                view.getTxtDataIntegrante().setText(it.getDatanascimento());
                if(it.getParentesco().equals("Esposa(o)")){
                    view.getComboParentescoIntegrante().setSelectedIndex(1);
                }else if(it.getParentesco().equals("Filho")){
                    view.getComboParentescoIntegrante().setSelectedIndex(2);
                }else if(it.getParentesco().equals("Sobrinho")){
                    view.getComboParentescoIntegrante().setSelectedIndex(3);
                }else if(it.getParentesco().equals("Neto")){
                    view.getComboParentescoIntegrante().setSelectedIndex(4);
                }else if(it.getParentesco().equals("Namorado")){
                    view.getComboParentescoIntegrante().setSelectedIndex(5);
                }else if(it.getParentesco().equals("Pai")){
                    view.getComboParentescoIntegrante().setSelectedIndex(6);
                }else if(it.getParentesco().equals("Mãe")){
                    view.getComboParentescoIntegrante().setSelectedIndex(7);
                }
                
                if(it.getFrequenciacentro() == false){
                    view.getComboFrequenciCentroIntegrante().setSelectedIndex(0);
                }else{
                    view.getComboFrequenciCentroIntegrante().setSelectedIndex(1);
                }
                
                if(it.getEstudando() == false){
                    view.getComboEstudaIntegrante().setSelectedIndex(0);
                }else{
                    view.getComboEstudaIntegrante().setSelectedIndex(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
    }
    

    
    public void listarJtableIdososNome() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getTableIdoso().getModel();
        Connection conexao;
        modelo.setNumRows(0);       
        conexao = new Conexao().getConnection();
        RelatorioDAO rd = new RelatorioDAO(conexao);
        
        try {
            for(Assistido a:rd.RelatorioIdososNome(view.getTxtIdososBusca().getText())){
                modelo.addRow(new Object[]{
                    a.getNome(),
                    a.getEndereco(),
                    a.getTelefone(),
                });
            }
        } catch (ParseException ex) {
            Logger.getLogger(TelaPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexao.close(); 
    }
    
    public void listarJtableNomeGravida() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getTableRelatorioGravida().getModel();
        Connection conexao;
        modelo.setNumRows(0);
        
        conexao = new Conexao().getConnection();
        RelatorioDAO rd = new RelatorioDAO(conexao);
        for(Assistido a:rd.listaBuscarGravida(view.getTxtBuscaGravida().getText())){
            modelo.addRow(new Object[]{
                a.getNome(),
                a.getTelefone(),
                a.getEndereco(),
            });
        }
        conexao.close(); 
    }
    
    public void listarJtableAssistido() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getTableAssistido().getModel();
        Connection conexao;
        modelo.setNumRows(0);
        
        conexao = new Conexao().getConnection();
        AssistidoDao ado = new AssistidoDao(conexao);
        for(Assistido a:ado.listar()){
            modelo.addRow(new Object[]{
                a.getIdassistido(),
                a.getNome(),
                a.getDatanascimentoa(),
                a.getEndereco(),
                a.getCidade(),
                a.getTelefone(),
            });
        }
        conexao.close();      
    }
    
    public void RelatorioAssistido() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getTableAssistidoRelatorio().getModel();
        Connection conexao;
        modelo.setNumRows(0);
        
        conexao = new Conexao().getConnection();
        AssistidoDao ado = new AssistidoDao(conexao);
        for(Assistido a:ado.listar()){
            modelo.addRow(new Object[]{
                a.getIdassistido(),
                a.getNome(),
            });
        }
        conexao.close();      
    }
    
    public void RelatorioAssistidoNome() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getTableAssistidoRelatorio().getModel();
        Connection conexao;
        modelo.setNumRows(0);
        
        conexao = new Conexao().getConnection();
        AssistidoDao ado = new AssistidoDao(conexao);
        for(Assistido a:ado.listaBuscar(view.getTxtBuscaIntegranteRelatorio().getText())){
            modelo.addRow(new Object[]{
                a.getIdassistido(),
                a.getNome(),
            });
        }
        conexao.close();      
    }

    public void RelatorioIntegrante() throws SQLException{
        if(view.getTableAssistidoRelatorio().getSelectedRow() != -1){
            DefaultTableModel modelo = (DefaultTableModel) view.getTableIntegranteRelatorio().getModel();
            Connection conexao;
            modelo.setNumRows(0);

            conexao = new Conexao().getConnection();
            RelatorioDAO rdao = new RelatorioDAO(conexao);
            for(Integrante in:rdao.listarIntegranteRelatorio((int) view.getTableAssistidoRelatorio().getValueAt(view.getTableAssistidoRelatorio().getSelectedRow(), 0))){
                modelo.addRow(new Object[]{
                    in.getNomea(),
                    in.getParentesco(),
                });
            }
            conexao.close();
        }
    } 
    
    public void listRarJtableIntegrante() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getJtableIntegrante().getModel();
        Connection conexao;
        modelo.setNumRows(0);
        conexao = new Conexao().getConnection();
        IntegranteDAO it = new IntegranteDAO(conexao);
        for(Integrante a:it.listar()){
            modelo.addRow(new Object[]{
                a.getIdintegrante(),
                a.getNomea(),
                a.getNomeassistido(),
                a.getParentesco(),
                a.getFrequenciacentro(),
            });
        }
        conexao.close();
    }
    
    public void listarJtablePsc() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getTablePsc().getModel();
        Connection conexao;
        modelo.setNumRows(0);
        
        conexao = new Conexao().getConnection();
        PscDAO pdo = new PscDAO(conexao);
        for(Psc c:pdo.listar()){
            modelo.addRow(new Object[]{
                c.getIdpsc(),
                c.getNome(),
                c.getEndereco(),
                c.getTelefone(),
                c.getVaracriminal(),
            });
        }
        conexao.close();      
    }
    
    public void listarJtableAVoluntario() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getTableVoluntario().getModel();
        Connection conexao;
        modelo.setNumRows(0);
        
        conexao = new Conexao().getConnection();
        VoluntarioDAO vdo = new VoluntarioDAO(conexao);
        for(Voluntarios b:vdo.listar()){
            modelo.addRow(new Object[]{
                b.getIdvoluntario(),
                b.getNome(),
                b.getTelefone(),
                b.getCategoria(),
                b.getEndereco(),
            });
        }
        conexao.close();      
    }
    
    public void listarJtableNomeIntegranteAssistido() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getTableIntegranteAssistido().getModel();
        Connection conexao;
        modelo.setNumRows(0);
        
        conexao = new Conexao().getConnection();
        AssistidoDao ado = new AssistidoDao(conexao);
        for(Assistido a:ado.listar()){
            modelo.addRow(new Object[]{
                a.getIdassistido(),
                a.getNome(),
            });
        }
        conexao.close(); 
    }

    public void listarJtableANomeVoluntario() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getTableVoluntario().getModel();
        Connection conexao;
        modelo.setNumRows(0);
        
        conexao = new Conexao().getConnection();
        VoluntarioDAO vdo = new VoluntarioDAO(conexao);
        for(Voluntarios b:vdo.listarBuscar(view.getTxtBuscaVoluntario().getText())){
            modelo.addRow(new Object[]{
                b.getIdvoluntario(),
                b.getNome(),
                b.getTelefone(),
                b.getCategoria(),
                b.getEndereco(),
            });
        }
        conexao.close();      
    }
    
    public void listarJtablePorNomeIntegrante() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getJtableIntegrante().getModel();
        Connection conexao;
        conexao = new Conexao().getConnection();
        modelo.setNumRows(0);
        IntegranteDAO itdao = new IntegranteDAO(conexao);
        for(Integrante a:itdao.listarBuscar(view.getTxtBuscaIntegrante().getText())){
            modelo.addRow(new Object[]{
                a.getIdintegrante(),
                a.getNomea(),
                a.getNomeassistido(),
                a.getParentesco(),
                a.getFrequenciacentro(),
            });
        }
        conexao.close();
    }
    
    public void listarJatableAssistidoNome() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getTableAssistido().getModel();
        Connection conexao;
        conexao = new Conexao().getConnection();
        modelo.setNumRows(0);
        AssistidoDao asdao = new AssistidoDao(conexao);
        for(Assistido a:asdao.listaBuscar(view.getTxtBuscarAssistido().getText())){
            modelo.addRow(new Object[]{
                a.getIdassistido(),
                a.getNome(),
                a.getCpf(),
                a.getDatanascimentoa(),
                a.getEndereco(),
                a.getCidade(),
                a.getTelefone(),
            });
        }
        conexao.close();
    }
    

    
    public void listarJtableNomePsc() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getTablePsc().getModel();
        Connection conexao;
        modelo.setNumRows(0);
        
        conexao = new Conexao().getConnection();
        PscDAO pdo = new PscDAO(conexao);
        for(Psc c:pdo.listarBuscar(view.getTxtBuscaPsc().getText())){
            modelo.addRow(new Object[]{
                c.getIdpsc(),
                c.getNome(),
                c.getEndereco(),
                c.getTelefone(),
                c.getVaracriminal(),
            });
        }
        conexao.close();      
    }
    
    public void listarJTablePesquisaAssistido() throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) view.getTableIntegranteAssistido().getModel();
        Connection conexao;
        conexao = new Conexao().getConnection();
        modelo.setNumRows(0);
        AssistidoDao asdao = new AssistidoDao(conexao);
        for(Assistido a:asdao.listaBuscar(view.getTxtPesquisarAssistido().getText())){
            modelo.addRow(new Object[]{
                a.getIdassistido(),
                a.getNome(),
            });
        }
        conexao.close();
    }
    
    public void LimpaCampoIntegrante(){
        view.getTxtNomeIntegrante().setText("");
        view.getTxtEscolaridadeIntegrante().setText("");
        view.getTxtDataIntegrante().setText("");
        view.getComboParentescoIntegrante().setSelectedIndex(0);
        view.getComboFrequenciCentroIntegrante().setSelectedIndex(0);
    }


    
    public void LimpaCampoVoluntario(){
        view.getTxtNomeVoluntario().setText("");
        view.getTxtDataVoluntario().setText("");
        view.getTxtTelefoneVoluntario().setText("");
        view.getComboCategoriaVoluntario().setSelectedIndex(0);
        view.getTxtCepVoluntario().setText("");
        view.getTxtEnderecoVoluntario().setText("");
        view.getTxtCidadeVoluntario().setText("");
        view.getTxtBairroVoluntario().setText("");
    }
    
    public void LimpaCampoAssistido(){
        view.getTxtNomeAssistido().setText("");
        view.getTxtRgAssistido().setText("");
        view.getTxtDataAssistido().setText("");
        view.getTxtCpfAssistido().setText("");
        view.getTxtEscolaridadeAssistido().setText("");
        view.getTxtTelefoneAssistido().setText("");
        view.getComboEstadoAssistido().setSelectedIndex(0);
        view.getComboDoencaAssistido().setSelectedIndex(0);
        view.getTxtDoencaAssistido().disable();
        view.getComboRendaAssistido().setSelectedIndex(0);
        view.getComboBolsaAssistido().setSelectedIndex(0);
        view.getComboPensaoAssistido().setSelectedIndex(0);
        view.getComboAposentadoAssistido().setSelectedIndex(0);
        view.getComboTrabalhaAssistido().setSelectedIndex(0);
        view.getComboSexo().setSelectedIndex(0);
        view.getComboGravida().setSelectedIndex(0);
        view.getComboGravida().disable();
        view.getTxtCepAssistido().setText("");
        view.getTxtBairroAssistido().setText("");
        view.getTxtEnderecoAssistido().setText("");
        view.getTxtCidadeAssistido().setText("");
        view.getTxtObsAssistido().setText("");   
    }
    
    public void LimpaCampoPsc(){
        view.getTxtNomePsc().setText("");
        view.getTxtTelefonePsc().setText("");
        view.getTxtCepPsc().setText("");
        view.getTxtEnderecoPsc().setText("");
        view.getTxtBairroPsc().setText("");
        view.getTxtCidadePsc().setText("");
        view.getComboVaraCriminalPsc().setSelectedIndex(0);
        view.getTxtDiasSemanaPsc().setText("");
        view.getTxtHorariosPsc().setText("");
        view.getTxtMedidaTotalPsc().setText("");
        view.getTxtMedidaSemanaPsc().setText("");
        view.getTxtInicioPsc().setText("");
        view.getTxtFimPsc().setText("");
    }
}
