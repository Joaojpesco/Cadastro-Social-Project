package View;

import Controller.TelaPrincipalController;
import Dados.Assistido;
import com.mycompany.DAO.AssistidoDao;
import Conexao.Conexao;
import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * @param TxtTelefoneVoluntario the TxtTelefoneVoluntario to set
     */
    public void setTxtTelefoneVoluntario(javax.swing.JFormattedTextField TxtTelefoneVoluntario) {
        this.TxtTelefoneVoluntario = TxtTelefoneVoluntario;
    }

    private final TelaPrincipalController controller;
    
    public TelaPrincipal(){
        initComponents();  
        controller = new TelaPrincipalController(this);
        DefaultTableModel modelo = (DefaultTableModel) TableAssistido.getModel();
        try {
            controller.listarJtableAssistido();
            controller.listarJtableAVoluntario();
            controller.listarJtablePsc();
            controller.listarJtableNomeIntegranteAssistido();
            controller.listRarJtableIntegrante();
            controller.RelatorioGravida();
            controller.RelatorioIdosos();
            controller.RelatorioCrianca();
            controller.RelatorioAssistido();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PainelAssistido = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableAssistido = new javax.swing.JTable();
        BtnLimparAssistido = new javax.swing.JButton();
        BtnCadastrarAssistido = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtDoencaAssistido = new javax.swing.JTextArea();
        ComboEstadoAssistido = new javax.swing.JComboBox<>();
        ComboTrabalhaAssistido = new javax.swing.JComboBox<>();
        ComboDoencaAssistido = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TxtDataAssistido = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ComboBolsaAssistido = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        TxtNomeAssistido = new javax.swing.JTextField();
        ComboAposentadoAssistido = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        ComboPensaoAssistido = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        TxtCpfAssistido = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtEscolaridadeAssistido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtRgAssistido = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ComboRendaAssistido = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        ComboSexo = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        ComboGravida = new javax.swing.JComboBox<>();
        TxtTelefoneAssistido = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        TxtCidadeAssistido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtBairroAssistido = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtCepAssistido = new javax.swing.JFormattedTextField();
        TxtEnderecoAssistido = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        TxtObsAssistido = new javax.swing.JTextArea();
        BtnExcluir = new javax.swing.JButton();
        BtnAtualizar = new javax.swing.JButton();
        TxtBuscarAssistido = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        PainelIntegrante = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JtableIntegrante = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        BtnCadastrarIntegrante = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        TxtNomeIntegrante = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        ComboFrequenciCentroIntegrante = new javax.swing.JComboBox<>();
        TxtDataIntegrante = new javax.swing.JFormattedTextField();
        ComboParentescoIntegrante = new javax.swing.JComboBox<>();
        TxtEscolaridadeIntegrante = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        ComboEstudaIntegrante = new javax.swing.JComboBox<>();
        BtnAtualizarIntegrante = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TableIntegranteAssistido = new javax.swing.JTable();
        jLabel52 = new javax.swing.JLabel();
        TxtPesquisarAssistido = new javax.swing.JTextField();
        TxtBuscaIntegrante = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        PainelPsc = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablePsc = new javax.swing.JTable();
        BtnCadastrarPsc = new javax.swing.JButton();
        BtnLimparPsc = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        TxtBairroPsc = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        TxtCidadePsc = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        TxtNomePsc = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        TxtEnderecoPsc = new javax.swing.JTextField();
        TxtCepPsc = new javax.swing.JFormattedTextField();
        TxtTelefonePsc = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        TxtHorariosPsc = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        TxtDiasSemanaPsc = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        TxtMedidaTotalPsc = new javax.swing.JTextField();
        ComboVaraCriminalPsc = new javax.swing.JComboBox<>();
        TxtInicioPsc = new javax.swing.JFormattedTextField();
        TxtFimPsc = new javax.swing.JFormattedTextField();
        jLabel49 = new javax.swing.JLabel();
        TxtMedidaSemanaPsc = new javax.swing.JTextField();
        BtnAtualizarPsc = new javax.swing.JButton();
        BtnExcluirPsc = new javax.swing.JButton();
        TxtBuscaPsc = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        PainelVoluntario = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableVoluntario = new javax.swing.JTable();
        BtnLimparVoluntario = new javax.swing.JButton();
        BtnCadastrarVoluntario = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        TxtBairroVoluntario = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        TxtCidadeVoluntario = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        TxtNomeVoluntario = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        ComboCategoriaVoluntario = new javax.swing.JComboBox<>();
        TxtDataVoluntario = new javax.swing.JFormattedTextField();
        TxtCepVoluntario = new javax.swing.JFormattedTextField();
        jLabel39 = new javax.swing.JLabel();
        TxtEnderecoVoluntario = new javax.swing.JTextField();
        TxtTelefoneVoluntario = new javax.swing.JTextField();
        BtnAtualizarVoluntario = new javax.swing.JButton();
        BtnExcluirVoluntario = new javax.swing.JButton();
        TxtBuscaVoluntario = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        RelatorioGravida = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TableRelatorioGravida = new javax.swing.JTable();
        jLabel53 = new javax.swing.JLabel();
        TxtBuscaGravida = new javax.swing.JTextField();
        RelatorioIntegrantes = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        TableAssistidoRelatorio = new javax.swing.JTable();
        jLabel57 = new javax.swing.JLabel();
        TxtBuscaIntegranteRelatorio = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        TableIntegranteRelatorio = new javax.swing.JTable();
        RelatorioPscVara = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        TablePscPorVara = new javax.swing.JTable();
        jLabel55 = new javax.swing.JLabel();
        TxtPscBuscaRelatorio = new javax.swing.JTextField();
        ComboPscVaraBusca = new javax.swing.JComboBox<>();
        RelatorioCrianca = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TableCrianca = new javax.swing.JTable();
        jLabel54 = new javax.swing.JLabel();
        TxtCriancaNome = new javax.swing.JTextField();
        RelatorioIdosos = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        TableIdoso = new javax.swing.JTable();
        jLabel56 = new javax.swing.JLabel();
        TxtIdososBusca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        PainelAssistido.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Observações:");

        TableAssistido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TableAssistido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Data de nascimento", "Endereço", "Cidade", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableAssistido.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        TableAssistido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableAssistidoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableAssistido);
        if (TableAssistido.getColumnModel().getColumnCount() > 0) {
            TableAssistido.getColumnModel().getColumn(0).setPreferredWidth(5);
            TableAssistido.getColumnModel().getColumn(2).setPreferredWidth(5);
            TableAssistido.getColumnModel().getColumn(3).setPreferredWidth(5);
            TableAssistido.getColumnModel().getColumn(4).setPreferredWidth(5);
            TableAssistido.getColumnModel().getColumn(5).setPreferredWidth(5);
        }

        BtnLimparAssistido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnLimparAssistido.setText("Limpar");
        BtnLimparAssistido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparAssistidoActionPerformed(evt);
            }
        });

        BtnCadastrarAssistido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnCadastrarAssistido.setText("Cadastrar");
        BtnCadastrarAssistido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarAssistidoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        TxtDoencaAssistido.setColumns(20);
        TxtDoencaAssistido.setLineWrap(true);
        TxtDoencaAssistido.setRows(5);
        TxtDoencaAssistido.setEnabled(false);
        jScrollPane1.setViewportView(TxtDoencaAssistido);

        ComboEstadoAssistido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboEstadoAssistido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha", "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)" }));

        ComboTrabalhaAssistido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboTrabalhaAssistido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha", "Não", "CLT", "Autônomo" }));

        ComboDoencaAssistido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboDoencaAssistido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        ComboDoencaAssistido.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboDoencaAssistidoItemStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Estado Civil:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Recebe bolsa família");

        try {
            TxtDataAssistido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Data de nascimento:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Aposentado");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Recebe Pensão");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Possui doenças?");

        ComboBolsaAssistido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboBolsaAssistido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Trabalha");

        ComboAposentadoAssistido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboAposentadoAssistido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        ComboAposentadoAssistido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAposentadoAssistidoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Telefone:");

        ComboPensaoAssistido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboPensaoAssistido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Escolaridade:");

        try {
            TxtCpfAssistido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("RG:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Possui Renda Cidadã");

        ComboRendaAssistido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboRendaAssistido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Sexo");

        ComboSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha", "Masculino", "Feminino" }));
        ComboSexo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboSexoItemStateChanged(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("Grávida");

        ComboGravida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboGravida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        ComboGravida.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtNomeAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ComboEstadoAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(jLabel15))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ComboBolsaAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ComboDoencaAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtTelefoneAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ComboRendaAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel48)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ComboGravida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ComboPensaoAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ComboAposentadoAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ComboTrabalhaAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel46)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtDataAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)
                                .addComponent(TxtCpfAssistido))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtEscolaridadeAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtRgAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtNomeAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtDataAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TxtCpfAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TxtEscolaridadeAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TxtRgAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14)
                    .addComponent(ComboRendaAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTelefoneAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ComboEstadoAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(ComboBolsaAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(ComboPensaoAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(ComboAposentadoAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(ComboTrabalhaAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(ComboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboGravida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel48)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(ComboDoencaAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cidade:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Endereço:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Bairro:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("CEP:");

        try {
            TxtCepAssistido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCepAssistido)
                        .addGap(101, 101, 101))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(8, 8, 8)
                                .addComponent(TxtCidadeAssistido))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtEnderecoAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtBairroAssistido)))
                        .addContainerGap(14, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtCepAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TxtBairroAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtEnderecoAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtCidadeAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TxtObsAssistido.setColumns(20);
        TxtObsAssistido.setLineWrap(true);
        TxtObsAssistido.setRows(5);
        jScrollPane6.setViewportView(TxtObsAssistido);

        BtnExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnExcluir.setText("Excluir");
        BtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirActionPerformed(evt);
            }
        });

        BtnAtualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnAtualizar.setText("Atualizar");
        BtnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtualizarActionPerformed(evt);
            }
        });

        TxtBuscarAssistido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtBuscarAssistido.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TxtBuscarAssistidoInputMethodTextChanged(evt);
            }
        });
        TxtBuscarAssistido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtBuscarAssistidoKeyReleased(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Pesquisar");

        javax.swing.GroupLayout PainelAssistidoLayout = new javax.swing.GroupLayout(PainelAssistido);
        PainelAssistido.setLayout(PainelAssistidoLayout);
        PainelAssistidoLayout.setHorizontalGroup(
            PainelAssistidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAssistidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PainelAssistidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelAssistidoLayout.createSequentialGroup()
                        .addGap(0, 96, Short.MAX_VALUE)
                        .addGroup(PainelAssistidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PainelAssistidoLayout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtBuscarAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelAssistidoLayout.createSequentialGroup()
                                .addComponent(BtnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnAtualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnLimparAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnCadastrarAssistido))))
                    .addGroup(PainelAssistidoLayout.createSequentialGroup()
                        .addGroup(PainelAssistidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane2)
        );
        PainelAssistidoLayout.setVerticalGroup(
            PainelAssistidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAssistidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelAssistidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelAssistidoLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PainelAssistidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtBuscarAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(PainelAssistidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnCadastrarAssistido)
                            .addComponent(BtnLimparAssistido)
                            .addComponent(BtnAtualizar)
                            .addComponent(BtnExcluir)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Assistido", PainelAssistido);

        PainelIntegrante.setBackground(new java.awt.Color(255, 255, 255));

        JtableIntegrante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JtableIntegrante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Nome Assistido", "Parentesco", "Frequencia Centro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JtableIntegrante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtableIntegranteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(JtableIntegrante);
        if (JtableIntegrante.getColumnModel().getColumnCount() > 0) {
            JtableIntegrante.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Limpar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        BtnCadastrarIntegrante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnCadastrarIntegrante.setText("Cadastrar");
        BtnCadastrarIntegrante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarIntegranteActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados pessoais", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Parentesco:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Frequenta o centro?");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Nome:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Escolaridade:");

        ComboFrequenciCentroIntegrante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboFrequenciCentroIntegrante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));

        try {
            TxtDataIntegrante.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        ComboParentescoIntegrante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboParentescoIntegrante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha", "Esposa(o)", "Filho(a)", "Sobrinho(a)", "Neto(a)", "Namorado(a)", "Pai", "Mãe" }));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Data de Nascimento:");

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("Estuda?");

        ComboEstudaIntegrante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboEstudaIntegrante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TxtEscolaridadeIntegrante, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ComboFrequenciCentroIntegrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtNomeIntegrante, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtDataIntegrante, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboParentescoIntegrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboEstudaIntegrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(TxtNomeIntegrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(TxtEscolaridadeIntegrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDataIntegrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(ComboParentescoIntegrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(ComboFrequenciCentroIntegrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(ComboEstudaIntegrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnAtualizarIntegrante.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnAtualizarIntegrante.setText("Atualizar");
        BtnAtualizarIntegrante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtualizarIntegranteActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Excluir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Escolha um Assistido", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        TableIntegranteAssistido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableIntegranteAssistido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableIntegranteAssistidoMouseClicked(evt);
            }
        });
        TableIntegranteAssistido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableIntegranteAssistidoKeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(TableIntegranteAssistido);
        if (TableIntegranteAssistido.getColumnModel().getColumnCount() > 0) {
            TableIntegranteAssistido.getColumnModel().getColumn(0).setPreferredWidth(4);
        }

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("Pesquisar");

        TxtPesquisarAssistido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtPesquisarAssistidoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtPesquisarAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(TxtPesquisarAssistido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        TxtBuscaIntegrante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtBuscaIntegranteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtBuscaIntegranteKeyReleased(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("Pesquisar");

        javax.swing.GroupLayout PainelIntegranteLayout = new javax.swing.GroupLayout(PainelIntegrante);
        PainelIntegrante.setLayout(PainelIntegranteLayout);
        PainelIntegranteLayout.setHorizontalGroup(
            PainelIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(PainelIntegranteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelIntegranteLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelIntegranteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PainelIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelIntegranteLayout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelIntegranteLayout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addGap(19, 19, 19)))
                        .addGroup(PainelIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtBuscaIntegrante, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelIntegranteLayout.createSequentialGroup()
                                .addComponent(BtnAtualizarIntegrante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnCadastrarIntegrante)))))
                .addContainerGap())
        );
        PainelIntegranteLayout.setVerticalGroup(
            PainelIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelIntegranteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PainelIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBuscaIntegrante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelIntegranteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCadastrarIntegrante)
                    .addComponent(jButton3)
                    .addComponent(BtnAtualizarIntegrante)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Integrante", PainelIntegrante);

        PainelPsc.setBackground(new java.awt.Color(255, 255, 255));

        TablePsc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TablePsc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Endereço", "Telefone", "Vara criminal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablePsc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePscMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablePsc);
        if (TablePsc.getColumnModel().getColumnCount() > 0) {
            TablePsc.getColumnModel().getColumn(0).setPreferredWidth(4);
        }

        BtnCadastrarPsc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnCadastrarPsc.setText("Cadastrar");
        BtnCadastrarPsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarPscActionPerformed(evt);
            }
        });

        BtnLimparPsc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnLimparPsc.setText("Limpar");
        BtnLimparPsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparPscActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados pessoais e endereço", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Endereço:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Telefone:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Bairro:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Cidade:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Nome:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("CEP:");

        try {
            TxtCepPsc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtNomePsc, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCepPsc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCidadePsc))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtBairroPsc))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtEnderecoPsc))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtTelefonePsc, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(TxtNomePsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(TxtTelefonePsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(TxtCepPsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(TxtEnderecoPsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(TxtBairroPsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(TxtCidadePsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vara criminal", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Vara Criminal:");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Horários:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Data de início:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Medida imposta(horas total):");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Dias da semana:");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Data de encerramento:");

        TxtMedidaTotalPsc.setToolTipText("");

        ComboVaraCriminalPsc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboVaraCriminalPsc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma das opções", "1ª Vara Criminal", "4ª Vara Criminal", "Justiça Federal", "Juizado Especial Criminal", "Juizado da Infância de Juventude" }));

        try {
            TxtInicioPsc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            TxtFimPsc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("Medida imposta(horas semana):");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtMedidaTotalPsc))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtInicioPsc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtFimPsc, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtHorariosPsc))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtDiasSemanaPsc))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboVaraCriminalPsc, 0, 243, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtMedidaSemanaPsc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(ComboVaraCriminalPsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(TxtDiasSemanaPsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(TxtHorariosPsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(TxtMedidaTotalPsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(TxtMedidaSemanaPsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(TxtInicioPsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(TxtFimPsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        BtnAtualizarPsc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnAtualizarPsc.setText("Atualizar");
        BtnAtualizarPsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtualizarPscActionPerformed(evt);
            }
        });

        BtnExcluirPsc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnExcluirPsc.setText("Excluir");
        BtnExcluirPsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirPscActionPerformed(evt);
            }
        });

        TxtBuscaPsc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtBuscaPsc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtBuscaPscKeyReleased(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("Pesquisar");

        javax.swing.GroupLayout PainelPscLayout = new javax.swing.GroupLayout(PainelPsc);
        PainelPsc.setLayout(PainelPscLayout);
        PainelPscLayout.setHorizontalGroup(
            PainelPscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addGroup(PainelPscLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 218, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPscLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelPscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnExcluirPsc, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelPscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PainelPscLayout.createSequentialGroup()
                        .addComponent(BtnAtualizarPsc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnLimparPsc, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCadastrarPsc))
                    .addComponent(TxtBuscaPsc))
                .addContainerGap())
        );
        PainelPscLayout.setVerticalGroup(
            PainelPscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPscLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelPscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelPscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtBuscaPsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelPscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCadastrarPsc)
                    .addComponent(BtnLimparPsc)
                    .addComponent(BtnAtualizarPsc)
                    .addComponent(BtnExcluirPsc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PSC", PainelPsc);

        PainelVoluntario.setBackground(new java.awt.Color(255, 255, 255));

        TableVoluntario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TableVoluntario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Telefone", "Categoria", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableVoluntario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableVoluntarioMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TableVoluntario);
        if (TableVoluntario.getColumnModel().getColumnCount() > 0) {
            TableVoluntario.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        BtnLimparVoluntario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnLimparVoluntario.setText("Limpar");
        BtnLimparVoluntario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimparVoluntarioActionPerformed(evt);
            }
        });

        BtnCadastrarVoluntario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnCadastrarVoluntario.setText("Cadastrar");
        BtnCadastrarVoluntario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrarVoluntarioActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados pessoais e endereço", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Cidade:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Data de nascimento:");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Telefone:");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Bairro:");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Nome:");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("CEP:");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("Categoria:");

        ComboCategoriaVoluntario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboCategoriaVoluntario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha", "Trabalhador", "Doador pecuniário" }));

        try {
            TxtDataVoluntario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            TxtCepVoluntario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Endereço:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtNomeVoluntario))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtCepVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboCategoriaVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtEnderecoVoluntario))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtBairroVoluntario))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtCidadeVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtTelefoneVoluntario))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtDataVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(TxtNomeVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(TxtDataVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(TxtTelefoneVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(ComboCategoriaVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(TxtCepVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(TxtEnderecoVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(TxtCidadeVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(TxtBairroVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        BtnAtualizarVoluntario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnAtualizarVoluntario.setText("Atualizar");
        BtnAtualizarVoluntario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtualizarVoluntarioActionPerformed(evt);
            }
        });

        BtnExcluirVoluntario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BtnExcluirVoluntario.setText("Excluir");
        BtnExcluirVoluntario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExcluirVoluntarioActionPerformed(evt);
            }
        });

        TxtBuscaVoluntario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtBuscaVoluntario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtBuscaVoluntarioKeyReleased(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("Pesquisar");

        javax.swing.GroupLayout PainelVoluntarioLayout = new javax.swing.GroupLayout(PainelVoluntario);
        PainelVoluntario.setLayout(PainelVoluntarioLayout);
        PainelVoluntarioLayout.setHorizontalGroup(
            PainelVoluntarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
            .addGroup(PainelVoluntarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelVoluntarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnExcluirVoluntario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelVoluntarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PainelVoluntarioLayout.createSequentialGroup()
                        .addComponent(BtnAtualizarVoluntario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnLimparVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCadastrarVoluntario))
                    .addComponent(TxtBuscaVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PainelVoluntarioLayout.setVerticalGroup(
            PainelVoluntarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelVoluntarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelVoluntarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelVoluntarioLayout.createSequentialGroup()
                        .addGroup(PainelVoluntarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtBuscaVoluntario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelVoluntarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnCadastrarVoluntario)
                            .addComponent(BtnLimparVoluntario)
                            .addComponent(BtnAtualizarVoluntario)
                            .addComponent(BtnExcluirVoluntario))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Voluntário", PainelVoluntario);

        jTabbedPane2.addTab("Cadastrar", jTabbedPane1);

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        RelatorioGravida.setBackground(new java.awt.Color(255, 255, 255));

        TableRelatorioGravida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TableRelatorioGravida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableRelatorioGravida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableRelatorioGravidaKeyReleased(evt);
            }
        });
        jScrollPane7.setViewportView(TableRelatorioGravida);

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setText("Pesquisar");

        TxtBuscaGravida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtBuscaGravida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtBuscaGravidaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout RelatorioGravidaLayout = new javax.swing.GroupLayout(RelatorioGravida);
        RelatorioGravida.setLayout(RelatorioGravidaLayout);
        RelatorioGravidaLayout.setHorizontalGroup(
            RelatorioGravidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
            .addGroup(RelatorioGravidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtBuscaGravida, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RelatorioGravidaLayout.setVerticalGroup(
            RelatorioGravidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RelatorioGravidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RelatorioGravidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(TxtBuscaGravida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Grávida", RelatorioGravida);

        RelatorioIntegrantes.setBackground(new java.awt.Color(255, 255, 255));

        TableAssistidoRelatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TableAssistidoRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Assistido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableAssistidoRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TableAssistidoRelatorioMouseReleased(evt);
            }
        });
        jScrollPane12.setViewportView(TableAssistidoRelatorio);
        if (TableAssistidoRelatorio.getColumnModel().getColumnCount() > 0) {
            TableAssistidoRelatorio.getColumnModel().getColumn(0).setPreferredWidth(5);
        }

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setText("Pesquisar");

        TxtBuscaIntegranteRelatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtBuscaIntegranteRelatorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtBuscaIntegranteRelatorioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtBuscaIntegranteRelatorioKeyTyped(evt);
            }
        });

        TableIntegranteRelatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TableIntegranteRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Integrantes", "Parentesco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane13.setViewportView(TableIntegranteRelatorio);

        javax.swing.GroupLayout RelatorioIntegrantesLayout = new javax.swing.GroupLayout(RelatorioIntegrantes);
        RelatorioIntegrantes.setLayout(RelatorioIntegrantesLayout);
        RelatorioIntegrantesLayout.setHorizontalGroup(
            RelatorioIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RelatorioIntegrantesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtBuscaIntegranteRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(RelatorioIntegrantesLayout.createSequentialGroup()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
        );
        RelatorioIntegrantesLayout.setVerticalGroup(
            RelatorioIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RelatorioIntegrantesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RelatorioIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(TxtBuscaIntegranteRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RelatorioIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
                    .addComponent(jScrollPane12)))
        );

        jTabbedPane3.addTab("Integrantes", RelatorioIntegrantes);

        RelatorioPscVara.setBackground(new java.awt.Color(255, 255, 255));

        TablePscPorVara.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TablePscPorVara.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Endereço"
            }
        ));
        jScrollPane10.setViewportView(TablePscPorVara);

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setText("Pesquisar");

        TxtPscBuscaRelatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtPscBuscaRelatorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtPscBuscaRelatorioKeyReleased(evt);
            }
        });

        ComboPscVaraBusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboPscVaraBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha", "1ª Vara Criminal", "4ª Vara Criminal", "Justiça Federal", "Juizado Especial Criminal", "Juizado da Infância de Juventude" }));
        ComboPscVaraBusca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboPscVaraBuscaItemStateChanged(evt);
            }
        });
        ComboPscVaraBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ComboPscVaraBuscaMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout RelatorioPscVaraLayout = new javax.swing.GroupLayout(RelatorioPscVara);
        RelatorioPscVara.setLayout(RelatorioPscVaraLayout);
        RelatorioPscVaraLayout.setHorizontalGroup(
            RelatorioPscVaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RelatorioPscVaraLayout.createSequentialGroup()
                .addGroup(RelatorioPscVaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
                    .addGroup(RelatorioPscVaraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtPscBuscaRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ComboPscVaraBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        RelatorioPscVaraLayout.setVerticalGroup(
            RelatorioPscVaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RelatorioPscVaraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RelatorioPscVaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(TxtPscBuscaRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboPscVaraBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane3.addTab("PSC por vara", RelatorioPscVara);

        RelatorioCrianca.setBackground(new java.awt.Color(255, 255, 255));

        TableCrianca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TableCrianca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Endereço", "Nome Criança"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(TableCrianca);

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("Pesquisar");

        TxtCriancaNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtCriancaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtCriancaNomeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout RelatorioCriancaLayout = new javax.swing.GroupLayout(RelatorioCrianca);
        RelatorioCrianca.setLayout(RelatorioCriancaLayout);
        RelatorioCriancaLayout.setHorizontalGroup(
            RelatorioCriancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
            .addGroup(RelatorioCriancaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCriancaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RelatorioCriancaLayout.setVerticalGroup(
            RelatorioCriancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RelatorioCriancaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RelatorioCriancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(TxtCriancaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("assistidos com crianças até 3 anos", RelatorioCrianca);

        RelatorioIdosos.setBackground(new java.awt.Color(255, 255, 255));

        TableIdoso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TableIdoso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Endereço"
            }
        ));
        jScrollPane11.setViewportView(TableIdoso);

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel56.setText("Pesquisar");

        TxtIdososBusca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TxtIdososBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtIdososBuscaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout RelatorioIdososLayout = new javax.swing.GroupLayout(RelatorioIdosos);
        RelatorioIdosos.setLayout(RelatorioIdososLayout);
        RelatorioIdososLayout.setHorizontalGroup(
            RelatorioIdososLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
            .addGroup(RelatorioIdososLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtIdososBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RelatorioIdososLayout.setVerticalGroup(
            RelatorioIdososLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RelatorioIdososLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RelatorioIdososLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(TxtIdososBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Idosos sem pensão/aposentadoria", RelatorioIdosos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        jTabbedPane2.addTab("Relatórios", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCadastrarAssistidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarAssistidoActionPerformed
        controller.CadastraAssistido();
        try {
            controller.listarJtableAssistido();
            controller.listarJTablePesquisaAssistido();
            controller.RelatorioIdosos();
            controller.RelatorioGravida();
            controller.RelatorioCrianca();
            controller.RelatorioIntegrante();
            controller.RelatorioAssistido();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        controller.LimpaCampoAssistido();
    }//GEN-LAST:event_BtnCadastrarAssistidoActionPerformed

    private void ComboDoencaAssistidoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboDoencaAssistidoItemStateChanged
        if(ComboDoencaAssistido.getSelectedItem().equals("Sim")){
            TxtDoencaAssistido.enable();
            TxtDoencaAssistido.show();
            TxtDoencaAssistido.requestFocus();

        }else{

            TxtDoencaAssistido.hide();
        }
    }//GEN-LAST:event_ComboDoencaAssistidoItemStateChanged

    private void BtnLimparPscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparPscActionPerformed
        controller.LimpaCampoPsc();
    }//GEN-LAST:event_BtnLimparPscActionPerformed

    private void ComboAposentadoAssistidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAposentadoAssistidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboAposentadoAssistidoActionPerformed

    private void BtnCadastrarIntegranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarIntegranteActionPerformed
        if(getTableIntegranteAssistido().getSelectedRow() != -1){
            try {
                controller.CadastrarIntegrante();
                controller.listRarJtableIntegrante();
                controller.RelatorioPscVara();
                controller.RelatorioIntegrante();
                controller.RelatorioCrianca();
            } catch (SQLException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Escolha um assistido.");
        }
    }//GEN-LAST:event_BtnCadastrarIntegranteActionPerformed

    private void BtnCadastrarPscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarPscActionPerformed
        controller.CadastrarPsc();
        try {
            controller.listarJtablePsc();
            controller.RelatorioPscVara();
            controller.RelatorioCrianca();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnCadastrarPscActionPerformed

    private void ComboSexoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboSexoItemStateChanged
       if(ComboSexo.getSelectedItem().equals("Feminino")){
           ComboGravida.enable();
           ComboGravida.show();
           ComboGravida.requestFocus();
           
       }else{
           ComboGravida.disable();
           ComboGravida.setSelectedIndex(0);
       }
    }//GEN-LAST:event_ComboSexoItemStateChanged

    private void BtnCadastrarVoluntarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrarVoluntarioActionPerformed
        controller.CadastrarVoluntario();
        controller.LimpaCampoVoluntario();
        try {
            controller.listarJtableAVoluntario();
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnCadastrarVoluntarioActionPerformed

    private void BtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirActionPerformed
        try {
            controller.DeletarAssistido();
            controller.listarJtableAssistido();
            controller.listarJTablePesquisaAssistido();
            controller.RelatorioIdosos();
            controller.RelatorioGravida();
            controller.RelatorioCrianca();
            controller.RelatorioIntegrante();
            controller.RelatorioAssistido();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnExcluirActionPerformed

    private void TableAssistidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableAssistidoMouseClicked
        controller.PrencherDadosAssistido();
    }//GEN-LAST:event_TableAssistidoMouseClicked

    private void BtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtualizarActionPerformed
        controller.AtualizarAssistido();
        
        try {
            controller.listarJtableAssistido();
            controller.listarJTablePesquisaAssistido();
            controller.RelatorioIdosos();
            controller.RelatorioGravida();
            controller.RelatorioCrianca();
            controller.RelatorioIntegrante();
            controller.RelatorioAssistido();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnAtualizarActionPerformed

    private void BtnLimparAssistidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparAssistidoActionPerformed
        controller.LimpaCampoAssistido();
    }//GEN-LAST:event_BtnLimparAssistidoActionPerformed

    private void TablePscMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePscMouseClicked
        controller.PrencherDadosPsc();
    }//GEN-LAST:event_TablePscMouseClicked

    private void BtnAtualizarPscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtualizarPscActionPerformed
        controller.AtualizarPsc();
        try {
            controller.listarJtablePsc();
            controller.RelatorioPscVara();
            controller.RelatorioPscVara();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnAtualizarPscActionPerformed

    private void BtnExcluirPscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirPscActionPerformed
        controller.DeletarPsc();
        try {
            controller.listarJtablePsc();
            controller.RelatorioPscVara();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnExcluirPscActionPerformed

    private void TableVoluntarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableVoluntarioMouseClicked
        controller.PrencherVoluntarios();
    }//GEN-LAST:event_TableVoluntarioMouseClicked

    private void BtnAtualizarVoluntarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtualizarVoluntarioActionPerformed
        controller.AtualizarVoluntario();
        try {
            controller.listarJtableAVoluntario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnAtualizarVoluntarioActionPerformed

    private void BtnLimparVoluntarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimparVoluntarioActionPerformed
        controller.LimpaCampoVoluntario();
    }//GEN-LAST:event_BtnLimparVoluntarioActionPerformed

    private void BtnExcluirVoluntarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExcluirVoluntarioActionPerformed
        controller.DeletarVoluntario();
        try {
            controller.listarJtableAVoluntario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnExcluirVoluntarioActionPerformed

    private void TxtBuscarAssistidoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TxtBuscarAssistidoInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBuscarAssistidoInputMethodTextChanged

    private void TxtBuscaVoluntarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscaVoluntarioKeyReleased
        try {
            controller.listarJtableANomeVoluntario();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TxtBuscaVoluntarioKeyReleased

    private void TxtBuscarAssistidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscarAssistidoKeyReleased
        try {
            controller.listarJatableAssistidoNome();
        } catch (SQLException ex) {
            
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TxtBuscarAssistidoKeyReleased

    private void TxtBuscaPscKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscaPscKeyReleased
        try {
            controller.listarJtableNomePsc();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TxtBuscaPscKeyReleased

    private void TableIntegranteAssistidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableIntegranteAssistidoKeyReleased
        
    }//GEN-LAST:event_TableIntegranteAssistidoKeyReleased

    private void TxtPesquisarAssistidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPesquisarAssistidoKeyReleased
        try {
            controller.listarJTablePesquisaAssistido();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TxtPesquisarAssistidoKeyReleased

    private void TableIntegranteAssistidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableIntegranteAssistidoMouseClicked
        
    }//GEN-LAST:event_TableIntegranteAssistidoMouseClicked

    private void BtnAtualizarIntegranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtualizarIntegranteActionPerformed
        controller.AtualizarIntegrante();
        try {
            controller.listRarJtableIntegrante();
            controller.LimpaCampoIntegrante();
            controller.RelatorioPscVara();
            controller.RelatorioIntegrante();
            controller.RelatorioCrianca();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnAtualizarIntegranteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        controller.LimpaCampoIntegrante();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        try {
            controller.listarJTablePesquisaAssistido();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void JtableIntegranteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtableIntegranteMouseClicked
        controller.PreencherDadosIntegrante();
    }//GEN-LAST:event_JtableIntegranteMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        controller.DeletarIntegrante();
        controller.LimpaCampoIntegrante();
        try {
            controller.listRarJtableIntegrante();
            controller.RelatorioPscVara();
            controller.RelatorioIntegrante();
            controller.RelatorioCrianca();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TxtBuscaIntegranteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscaIntegranteKeyPressed
        
    }//GEN-LAST:event_TxtBuscaIntegranteKeyPressed

    private void TxtBuscaIntegranteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscaIntegranteKeyReleased
        try {
            controller.listarJtablePorNomeIntegrante();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TxtBuscaIntegranteKeyReleased

    private void TxtBuscaGravidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscaGravidaKeyReleased
        try {
            controller.listarJtableNomeGravida();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TxtBuscaGravidaKeyReleased

    public JTextField getTxtCriancaNome() {
        return TxtCriancaNome;
    }

    public void setTxtCriancaNome(JTextField TxtCriancaNome) {
        this.TxtCriancaNome = TxtCriancaNome;
    }

    private void TableRelatorioGravidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableRelatorioGravidaKeyReleased

    }//GEN-LAST:event_TableRelatorioGravidaKeyReleased

    private void TxtIdososBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtIdososBuscaKeyReleased
        try {
            controller.listarJtableIdososNome();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TxtIdososBuscaKeyReleased

    private void TxtCriancaNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCriancaNomeKeyReleased
        try {
            controller.RelatorioCriancaNome();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TxtCriancaNomeKeyReleased

    private void ComboPscVaraBuscaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboPscVaraBuscaMouseReleased
        
    }//GEN-LAST:event_ComboPscVaraBuscaMouseReleased

    private void ComboPscVaraBuscaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboPscVaraBuscaItemStateChanged
        try {
            controller.RelatorioPscVara();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComboPscVaraBuscaItemStateChanged

    private void TxtPscBuscaRelatorioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPscBuscaRelatorioKeyReleased
        try {
            controller.RelatorioPscVaraNome();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TxtPscBuscaRelatorioKeyReleased

    private void TableAssistidoRelatorioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableAssistidoRelatorioMouseReleased
        try {
            controller.RelatorioIntegrante();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TableAssistidoRelatorioMouseReleased

    private void TxtBuscaIntegranteRelatorioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscaIntegranteRelatorioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBuscaIntegranteRelatorioKeyTyped

    private void TxtBuscaIntegranteRelatorioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtBuscaIntegranteRelatorioKeyReleased
        try {
            controller.RelatorioAssistidoNome();
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TxtBuscaIntegranteRelatorioKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtualizar;
    private javax.swing.JButton BtnAtualizarIntegrante;
    private javax.swing.JButton BtnAtualizarPsc;
    private javax.swing.JButton BtnAtualizarVoluntario;
    private javax.swing.JButton BtnCadastrarAssistido;
    private javax.swing.JButton BtnCadastrarIntegrante;
    private javax.swing.JButton BtnCadastrarPsc;
    private javax.swing.JButton BtnCadastrarVoluntario;
    private javax.swing.JButton BtnExcluir;
    private javax.swing.JButton BtnExcluirPsc;
    private javax.swing.JButton BtnExcluirVoluntario;
    private javax.swing.JButton BtnLimparAssistido;
    private javax.swing.JButton BtnLimparPsc;
    private javax.swing.JButton BtnLimparVoluntario;
    private javax.swing.JComboBox<String> ComboAposentadoAssistido;
    private javax.swing.JComboBox<String> ComboBolsaAssistido;
    private javax.swing.JComboBox<String> ComboCategoriaVoluntario;
    private javax.swing.JComboBox<String> ComboDoencaAssistido;
    private javax.swing.JComboBox<String> ComboEstadoAssistido;
    private javax.swing.JComboBox<String> ComboEstudaIntegrante;
    private javax.swing.JComboBox<String> ComboFrequenciCentroIntegrante;
    private javax.swing.JComboBox<String> ComboGravida;
    private javax.swing.JComboBox<String> ComboParentescoIntegrante;
    private javax.swing.JComboBox<String> ComboPensaoAssistido;
    private javax.swing.JComboBox<String> ComboPscVaraBusca;
    private javax.swing.JComboBox<String> ComboRendaAssistido;
    private javax.swing.JComboBox<String> ComboSexo;
    private javax.swing.JComboBox<String> ComboTrabalhaAssistido;
    private javax.swing.JComboBox<String> ComboVaraCriminalPsc;
    private javax.swing.JTable JtableIntegrante;
    private javax.swing.JPanel PainelAssistido;
    private javax.swing.JPanel PainelIntegrante;
    private javax.swing.JPanel PainelPsc;
    private javax.swing.JPanel PainelVoluntario;
    private javax.swing.JPanel RelatorioCrianca;
    private javax.swing.JPanel RelatorioGravida;
    private javax.swing.JPanel RelatorioIdosos;
    private javax.swing.JPanel RelatorioIntegrantes;
    private javax.swing.JPanel RelatorioPscVara;
    private javax.swing.JTable TableAssistido;
    private javax.swing.JTable TableAssistidoRelatorio;
    private javax.swing.JTable TableCrianca;
    private javax.swing.JTable TableIdoso;
    private javax.swing.JTable TableIntegranteAssistido;
    private javax.swing.JTable TableIntegranteRelatorio;
    private javax.swing.JTable TablePsc;
    private javax.swing.JTable TablePscPorVara;
    private javax.swing.JTable TableRelatorioGravida;
    private javax.swing.JTable TableVoluntario;
    private javax.swing.JTextField TxtBairroAssistido;
    private javax.swing.JTextField TxtBairroPsc;
    private javax.swing.JTextField TxtBairroVoluntario;
    private javax.swing.JTextField TxtBuscaGravida;
    private javax.swing.JTextField TxtBuscaIntegrante;
    private javax.swing.JTextField TxtBuscaIntegranteRelatorio;
    private javax.swing.JTextField TxtBuscaPsc;
    private javax.swing.JTextField TxtBuscaVoluntario;
    private javax.swing.JTextField TxtBuscarAssistido;
    private javax.swing.JFormattedTextField TxtCepAssistido;
    private javax.swing.JFormattedTextField TxtCepPsc;
    private javax.swing.JFormattedTextField TxtCepVoluntario;
    private javax.swing.JTextField TxtCidadeAssistido;
    private javax.swing.JTextField TxtCidadePsc;
    private javax.swing.JTextField TxtCidadeVoluntario;
    private javax.swing.JFormattedTextField TxtCpfAssistido;
    private javax.swing.JTextField TxtCriancaNome;
    private javax.swing.JFormattedTextField TxtDataAssistido;
    private javax.swing.JFormattedTextField TxtDataIntegrante;
    private javax.swing.JFormattedTextField TxtDataVoluntario;
    private javax.swing.JTextField TxtDiasSemanaPsc;
    private javax.swing.JTextArea TxtDoencaAssistido;
    private javax.swing.JTextField TxtEnderecoAssistido;
    private javax.swing.JTextField TxtEnderecoPsc;
    private javax.swing.JTextField TxtEnderecoVoluntario;
    private javax.swing.JTextField TxtEscolaridadeAssistido;
    private javax.swing.JTextField TxtEscolaridadeIntegrante;
    private javax.swing.JFormattedTextField TxtFimPsc;
    private javax.swing.JTextField TxtHorariosPsc;
    private javax.swing.JTextField TxtIdososBusca;
    private javax.swing.JFormattedTextField TxtInicioPsc;
    private javax.swing.JTextField TxtMedidaSemanaPsc;
    private javax.swing.JTextField TxtMedidaTotalPsc;
    private javax.swing.JTextField TxtNomeAssistido;
    private javax.swing.JTextField TxtNomeIntegrante;
    private javax.swing.JTextField TxtNomePsc;
    private javax.swing.JTextField TxtNomeVoluntario;
    private javax.swing.JTextArea TxtObsAssistido;
    private javax.swing.JTextField TxtPesquisarAssistido;
    private javax.swing.JTextField TxtPscBuscaRelatorio;
    private javax.swing.JTextField TxtRgAssistido;
    private javax.swing.JTextField TxtTelefoneAssistido;
    private javax.swing.JTextField TxtTelefonePsc;
    private javax.swing.JTextField TxtTelefoneVoluntario;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBtnCadastrar() {
        return BtnCadastrarAssistido;
    }

    public void setBtnCadastrar(javax.swing.JButton BtnCadastrar) {
        this.BtnCadastrarAssistido = BtnCadastrar;
    }

    public javax.swing.JComboBox<String> getComboAposentadoAssistido() {
        return ComboAposentadoAssistido;
    }

    public void setComboAposentadoAssistido(javax.swing.JComboBox<String> ComboAposentadoAssistido) {
        this.ComboAposentadoAssistido = ComboAposentadoAssistido;
    }

    public javax.swing.JComboBox<String> getComboBolsaAssistido() {
        return ComboBolsaAssistido;
    }

    public void setComboBolsaAssistido(javax.swing.JComboBox<String> ComboBolsaAssistido) {
        this.ComboBolsaAssistido = ComboBolsaAssistido;
    }

    public javax.swing.JComboBox<String> getComboDoencaAssistido() {
        return ComboDoencaAssistido;
    }

    public void setComboDoencaAssistido(javax.swing.JComboBox<String> ComboDoencaAssistido) {
        this.ComboDoencaAssistido = ComboDoencaAssistido;
    }

    public javax.swing.JComboBox<String> getComboEstadoAssistido() {
        return ComboEstadoAssistido;
    }

    public void setComboEstadoAssistido(javax.swing.JComboBox<String> ComboEstadoAssistido) {
        this.ComboEstadoAssistido = ComboEstadoAssistido;
    }

    public javax.swing.JComboBox<String> getComboPensaoAssistido() {
        return ComboPensaoAssistido;
    }

    public void setComboPensaoAssistido(javax.swing.JComboBox<String> ComboPensaoAssistido) {
        this.ComboPensaoAssistido = ComboPensaoAssistido;
    }

    public javax.swing.JComboBox<String> getComboRendaAssistido() {
        return ComboRendaAssistido;
    }

    public void setComboRendaAssistido(javax.swing.JComboBox<String> ComboRendaAssistido) {
        this.ComboRendaAssistido = ComboRendaAssistido;
    }

    public javax.swing.JComboBox<String> getComboTrabalhaAssistido() {
        return ComboTrabalhaAssistido;
    }

    public void setComboTrabalhaAssistido(javax.swing.JComboBox<String> ComboTrabalhaAssistido) {
        this.ComboTrabalhaAssistido = ComboTrabalhaAssistido;
    }

    public javax.swing.JPanel getPainelAssistido() {
        return PainelAssistido;
    }

    public void setPainelAssistido(javax.swing.JPanel PainelAssistido) {
        this.PainelAssistido = PainelAssistido;
    }

    public javax.swing.JPanel getPainelIntegrante() {
        return PainelIntegrante;
    }

    public void setPainelIntegrante(javax.swing.JPanel PainelIntegrante) {
        this.PainelIntegrante = PainelIntegrante;
    }

    public javax.swing.JPanel getPainelPsc() {
        return PainelPsc;
    }

    public void setPainelPsc(javax.swing.JPanel PainelPsc) {
        this.PainelPsc = PainelPsc;
    }

    public javax.swing.JPanel getPainelVoluntario() {
        return PainelVoluntario;
    }

    public void setPainelVoluntario(javax.swing.JPanel PainelVoluntario) {
        this.PainelVoluntario = PainelVoluntario;
    }

    public javax.swing.JTextField getTxtBairroAssistido() {
        return TxtBairroAssistido;
    }

    public void setTxtBairroAssistido(javax.swing.JTextField TxtBairroAssistido) {
        this.TxtBairroAssistido = TxtBairroAssistido;
    }

    public javax.swing.JFormattedTextField getTxtCepAssistido() {
        return TxtCepAssistido;
    }

    public void setTxtCepAssistido(javax.swing.JFormattedTextField TxtCepAssistido) {
        this.TxtCepAssistido = TxtCepAssistido;
    }

    public javax.swing.JTextField getTxtCidadeAssistido() {
        return TxtCidadeAssistido;
    }

    public void setTxtCidadeAssistido(javax.swing.JTextField TxtCidadeAssistido) {
        this.TxtCidadeAssistido = TxtCidadeAssistido;
    }

    public javax.swing.JFormattedTextField getTxtCpfAssistido() {
        return TxtCpfAssistido;
    }

    public void setTxtCpfAssistido(javax.swing.JFormattedTextField TxtCpfAssistido) {
        this.TxtCpfAssistido = TxtCpfAssistido;
    }

    public javax.swing.JFormattedTextField getTxtDataAssistido() {
        return TxtDataAssistido;
    }

    public void setTxtDataAssistido(javax.swing.JFormattedTextField TxtDataAssistido) {
        this.TxtDataAssistido = TxtDataAssistido;
    }

    public javax.swing.JTextArea getTxtDoencaAssistido() {
        return TxtDoencaAssistido;
    }

    public void setTxtDoencaAssistido(javax.swing.JTextArea TxtDoencaAssistido) {
        this.TxtDoencaAssistido = TxtDoencaAssistido;
    }

    public javax.swing.JTextField getTxtEnderecoAssistido() {
        return TxtEnderecoAssistido;
    }

    public void setTxtEnderecoAssistido(javax.swing.JTextField TxtEnderecoAssistido) {
        this.TxtEnderecoAssistido = TxtEnderecoAssistido;
    }

    public javax.swing.JTextField getTxtEscolaridadeAssistido() {
        return TxtEscolaridadeAssistido;
    }

    public void setTxtEscolaridadeAssistido(javax.swing.JTextField TxtEscolaridadeAssistido) {
        this.TxtEscolaridadeAssistido = TxtEscolaridadeAssistido;
    }

    public javax.swing.JTextField getTxtNomeAssistido() {
        return TxtNomeAssistido;
    }

    public void setTxtNomeAssistido(javax.swing.JTextField TxtNomeAssistido) {
        this.TxtNomeAssistido = TxtNomeAssistido;
    }

    public javax.swing.JTextArea getTxtObsAssistido() {
        return TxtObsAssistido;
    }

    public void setTxtObsAssistido(javax.swing.JTextArea TxtObsAssistido) {
        this.TxtObsAssistido = TxtObsAssistido;
    }

    public javax.swing.JTextField getTxtRgAssistido() {
        return TxtRgAssistido;
    }

    public void setTxtRgAssistido(javax.swing.JTextField TxtRgAssistido) {
        this.TxtRgAssistido = TxtRgAssistido;
    }

    public void setTxtTelefoneAssistido(javax.swing.JFormattedTextField TxtTelefoneAssistido) {
        this.TxtTelefoneAssistido = TxtTelefoneAssistido;
    }

    public javax.swing.JButton getjButton1() {
        return BtnLimparAssistido;
    }

    public void setjButton1(javax.swing.JButton jButton1) {
        this.BtnLimparAssistido = jButton1;
    }

    public javax.swing.JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(javax.swing.JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public javax.swing.JButton getjButton4() {
        return BtnCadastrarIntegrante;
    }

    public void setjButton4(javax.swing.JButton jButton4) {
        this.BtnCadastrarIntegrante = jButton4;
    }

    public javax.swing.JButton getjButton5() {
        return BtnCadastrarPsc;
    }

    public void setjButton5(javax.swing.JButton jButton5) {
        this.BtnCadastrarPsc = jButton5;
    }

    public javax.swing.JButton getjButton6() {
        return BtnLimparPsc;
    }

    public void setjButton6(javax.swing.JButton jButton6) {
        this.BtnLimparPsc = jButton6;
    }

    public javax.swing.JButton getjButton7() {
        return BtnLimparVoluntario;
    }

    public void setjButton7(javax.swing.JButton jButton7) {
        this.BtnLimparVoluntario = jButton7;
    }

    public javax.swing.JButton getjButton8() {
        return BtnCadastrarVoluntario;
    }

    public void setjButton8(javax.swing.JButton jButton8) {
        this.BtnCadastrarVoluntario = jButton8;
    }

    public javax.swing.JComboBox<String> getjComboBox7() {
        return ComboVaraCriminalPsc;
    }

    public void setjComboBox7(javax.swing.JComboBox<String> jComboBox7) {
        this.ComboVaraCriminalPsc = jComboBox7;
    }

    public javax.swing.JComboBox<String> getjComboBox8() {
        return ComboCategoriaVoluntario;
    }

    public void setjComboBox8(javax.swing.JComboBox<String> jComboBox8) {
        this.ComboCategoriaVoluntario = jComboBox8;
    }

    public javax.swing.JFormattedTextField getjFormattedTextField5() {
        return TxtCepPsc;
    }

    public void setjFormattedTextField5(javax.swing.JFormattedTextField jFormattedTextField5) {
        this.TxtCepPsc = jFormattedTextField5;
    }

    public javax.swing.JFormattedTextField getjFormattedTextField6() {
        return TxtInicioPsc;
    }

    public void setjFormattedTextField6(javax.swing.JFormattedTextField jFormattedTextField6) {
        this.TxtInicioPsc = jFormattedTextField6;
    }

    public javax.swing.JFormattedTextField getjFormattedTextField7() {
        return TxtFimPsc;
    }

    public void setjFormattedTextField7(javax.swing.JFormattedTextField jFormattedTextField7) {
        this.TxtFimPsc = jFormattedTextField7;
    }

    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public javax.swing.JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(javax.swing.JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public javax.swing.JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(javax.swing.JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public javax.swing.JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(javax.swing.JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public javax.swing.JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(javax.swing.JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public javax.swing.JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(javax.swing.JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public javax.swing.JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(javax.swing.JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public javax.swing.JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(javax.swing.JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    public javax.swing.JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(javax.swing.JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public javax.swing.JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(javax.swing.JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public javax.swing.JLabel getjLabel19() {
        return jLabel19;
    }

    public void setjLabel19(javax.swing.JLabel jLabel19) {
        this.jLabel19 = jLabel19;
    }

    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public javax.swing.JLabel getjLabel20() {
        return jLabel20;
    }

    public void setjLabel20(javax.swing.JLabel jLabel20) {
        this.jLabel20 = jLabel20;
    }

    public javax.swing.JLabel getjLabel21() {
        return jLabel21;
    }

    public void setjLabel21(javax.swing.JLabel jLabel21) {
        this.jLabel21 = jLabel21;
    }

    public javax.swing.JLabel getjLabel22() {
        return jLabel22;
    }

    public void setjLabel22(javax.swing.JLabel jLabel22) {
        this.jLabel22 = jLabel22;
    }

    public javax.swing.JLabel getjLabel23() {
        return jLabel23;
    }

    public void setjLabel23(javax.swing.JLabel jLabel23) {
        this.jLabel23 = jLabel23;
    }

    public javax.swing.JLabel getjLabel25() {
        return jLabel25;
    }

    public void setjLabel25(javax.swing.JLabel jLabel25) {
        this.jLabel25 = jLabel25;
    }

    public javax.swing.JLabel getjLabel26() {
        return jLabel26;
    }

    public void setjLabel26(javax.swing.JLabel jLabel26) {
        this.jLabel26 = jLabel26;
    }

    public javax.swing.JLabel getjLabel27() {
        return jLabel27;
    }

    public void setjLabel27(javax.swing.JLabel jLabel27) {
        this.jLabel27 = jLabel27;
    }

    public javax.swing.JLabel getjLabel28() {
        return jLabel28;
    }

    public void setjLabel28(javax.swing.JLabel jLabel28) {
        this.jLabel28 = jLabel28;
    }

    public javax.swing.JLabel getjLabel29() {
        return jLabel29;
    }

    public void setjLabel29(javax.swing.JLabel jLabel29) {
        this.jLabel29 = jLabel29;
    }

    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public javax.swing.JLabel getjLabel30() {
        return jLabel30;
    }

    public void setjLabel30(javax.swing.JLabel jLabel30) {
        this.jLabel30 = jLabel30;
    }

    public javax.swing.JLabel getjLabel31() {
        return jLabel31;
    }

    public void setjLabel31(javax.swing.JLabel jLabel31) {
        this.jLabel31 = jLabel31;
    }

    public javax.swing.JLabel getjLabel32() {
        return jLabel32;
    }

    public void setjLabel32(javax.swing.JLabel jLabel32) {
        this.jLabel32 = jLabel32;
    }

    public javax.swing.JLabel getjLabel33() {
        return jLabel33;
    }

    public void setjLabel33(javax.swing.JLabel jLabel33) {
        this.jLabel33 = jLabel33;
    }

    public javax.swing.JLabel getjLabel34() {
        return jLabel34;
    }

    public void setjLabel34(javax.swing.JLabel jLabel34) {
        this.jLabel34 = jLabel34;
    }

    public javax.swing.JLabel getjLabel35() {
        return jLabel35;
    }

    public void setjLabel35(javax.swing.JLabel jLabel35) {
        this.jLabel35 = jLabel35;
    }

    public javax.swing.JLabel getjLabel36() {
        return jLabel36;
    }

    public void setjLabel36(javax.swing.JLabel jLabel36) {
        this.jLabel36 = jLabel36;
    }

    public javax.swing.JLabel getjLabel37() {
        return jLabel37;
    }

    public void setjLabel37(javax.swing.JLabel jLabel37) {
        this.jLabel37 = jLabel37;
    }

    public javax.swing.JLabel getjLabel38() {
        return jLabel38;
    }

    public void setjLabel38(javax.swing.JLabel jLabel38) {
        this.jLabel38 = jLabel38;
    }

    public javax.swing.JLabel getjLabel39() {
        return jLabel39;
    }

    public void setjLabel39(javax.swing.JLabel jLabel39) {
        this.jLabel39 = jLabel39;
    }

    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public javax.swing.JLabel getjLabel40() {
        return jLabel40;
    }

    public void setjLabel40(javax.swing.JLabel jLabel40) {
        this.jLabel40 = jLabel40;
    }

    public javax.swing.JLabel getjLabel41() {
        return jLabel41;
    }

    public void setjLabel41(javax.swing.JLabel jLabel41) {
        this.jLabel41 = jLabel41;
    }

    public javax.swing.JLabel getjLabel42() {
        return jLabel42;
    }

    public void setjLabel42(javax.swing.JLabel jLabel42) {
        this.jLabel42 = jLabel42;
    }

    public javax.swing.JLabel getjLabel43() {
        return jLabel43;
    }

    public void setjLabel43(javax.swing.JLabel jLabel43) {
        this.jLabel43 = jLabel43;
    }

    public javax.swing.JLabel getjLabel44() {
        return jLabel44;
    }

    public void setjLabel44(javax.swing.JLabel jLabel44) {
        this.jLabel44 = jLabel44;
    }

    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public javax.swing.JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public javax.swing.JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(javax.swing.JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public javax.swing.JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(javax.swing.JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public javax.swing.JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(javax.swing.JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public javax.swing.JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(javax.swing.JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public javax.swing.JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(javax.swing.JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public javax.swing.JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(javax.swing.JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public javax.swing.JPanel getjPanel6() {
        return jPanel6;
    }

    public void setjPanel6(javax.swing.JPanel jPanel6) {
        this.jPanel6 = jPanel6;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public javax.swing.JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(javax.swing.JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public javax.swing.JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(javax.swing.JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public javax.swing.JScrollPane getjScrollPane4() {
        return jScrollPane4;
    }

    public void setjScrollPane4(javax.swing.JScrollPane jScrollPane4) {
        this.jScrollPane4 = jScrollPane4;
    }

    public javax.swing.JScrollPane getjScrollPane5() {
        return jScrollPane5;
    }

    public void setjScrollPane5(javax.swing.JScrollPane jScrollPane5) {
        this.jScrollPane5 = jScrollPane5;
    }

    public javax.swing.JScrollPane getjScrollPane6() {
        return jScrollPane6;
    }

    public void setjScrollPane6(javax.swing.JScrollPane jScrollPane6) {
        this.jScrollPane6 = jScrollPane6;
    }

    public javax.swing.JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void setjTabbedPane1(javax.swing.JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    public javax.swing.JTabbedPane getjTabbedPane2() {
        return jTabbedPane2;
    }

    public void setjTabbedPane2(javax.swing.JTabbedPane jTabbedPane2) {
        this.jTabbedPane2 = jTabbedPane2;
    }

    public javax.swing.JTable getjTable1() {
        return TableAssistido;
    }

    public void setjTable1(javax.swing.JTable jTable1) {
        this.TableAssistido = jTable1;
    }

    public javax.swing.JTable getjTable2() {
        return JtableIntegrante;
    }

    public void setjTable2(javax.swing.JTable jTable2) {
        this.JtableIntegrante = jTable2;
    }

    public javax.swing.JTable getjTable3() {
        return TablePsc;
    }

    public void setjTable3(javax.swing.JTable jTable3) {
        this.TablePsc = jTable3;
    }

    public javax.swing.JTable getjTable4() {
        return TableVoluntario;
    }

    public void setjTable4(javax.swing.JTable jTable4) {
        this.TableVoluntario = jTable4;
    }

    public javax.swing.JTextField getjTextField13() {
        return TxtNomeIntegrante;
    }

    public void setjTextField13(javax.swing.JTextField jTextField13) {
        this.TxtNomeIntegrante = jTextField13;
    }

    public javax.swing.JTextField getjTextField16() {
        return TxtEscolaridadeIntegrante;
    }

    public void setjTextField16(javax.swing.JTextField jTextField16) {
        this.TxtEscolaridadeIntegrante = jTextField16;
    }

    public javax.swing.JTextField getjTextField17() {
        return TxtNomePsc;
    }

    public void setjTextField17(javax.swing.JTextField jTextField17) {
        this.TxtNomePsc = jTextField17;
    }

    public javax.swing.JTextField getjTextField21() {
        return TxtCidadePsc;
    }

    public void setjTextField21(javax.swing.JTextField jTextField21) {
        this.TxtCidadePsc = jTextField21;
    }

    public javax.swing.JTextField getjTextField22() {
        return TxtBairroPsc;
    }

    public void setjTextField22(javax.swing.JTextField jTextField22) {
        this.TxtBairroPsc = jTextField22;
    }

    public javax.swing.JTextField getjTextField23() {
        return TxtEnderecoPsc;
    }

    public void setjTextField23(javax.swing.JTextField jTextField23) {
        this.TxtEnderecoPsc = jTextField23;
    }

    public javax.swing.JTextField getjTextField26() {
        return TxtMedidaTotalPsc;
    }

    public void setjTextField26(javax.swing.JTextField jTextField26) {
        this.TxtMedidaTotalPsc = jTextField26;
    }

    public javax.swing.JTextField getjTextField27() {
        return TxtDiasSemanaPsc;
    }

    public void setjTextField27(javax.swing.JTextField jTextField27) {
        this.TxtDiasSemanaPsc = jTextField27;
    }

    public javax.swing.JTextField getjTextField28() {
        return TxtHorariosPsc;
    }

    public void setjTextField28(javax.swing.JTextField jTextField28) {
        this.TxtHorariosPsc = jTextField28;
    }

    public javax.swing.JTextField getjTextField29() {
        return TxtNomeVoluntario;
    }

    public void setjTextField29(javax.swing.JTextField jTextField29) {
        this.TxtNomeVoluntario = jTextField29;
    }

    public javax.swing.JTextField getjTextField31() {
        return TxtEnderecoVoluntario;
    }

    public void setjTextField31(javax.swing.JTextField jTextField31) {
        this.TxtEnderecoVoluntario = jTextField31;
    }

    public javax.swing.JTextField getjTextField32() {
        return TxtBairroVoluntario;
    }

    public void setjTextField32(javax.swing.JTextField jTextField32) {
        this.TxtBairroVoluntario = jTextField32;
    }

    public javax.swing.JTextField getjTextField34() {
        return TxtCidadeVoluntario;
    }

    public void setjTextField34(javax.swing.JTextField jTextField34) {
        this.TxtCidadeVoluntario = jTextField34;
    }

    public javax.swing.JTextField getjTextField35() {
        return getTxtTelefoneVoluntario();
    }

    

    public javax.swing.JTable getTableAssistido() {
        return TableAssistido;
    }

    public void setTableAssistido(javax.swing.JTable TableAssistido) {
        this.TableAssistido = TableAssistido;
    }

    public javax.swing.JButton getBtnCadastrarAssistido() {
        return BtnCadastrarAssistido;
    }

    public void setBtnCadastrarAssistido(javax.swing.JButton BtnCadastrarAssistido) {
        this.BtnCadastrarAssistido = BtnCadastrarAssistido;
    }

    public javax.swing.JButton getBtnCadastrarIntegrante() {
        return BtnCadastrarIntegrante;
    }

    public void setBtnCadastrarIntegrante(javax.swing.JButton BtnCadastrarIntegrante) {
        this.BtnCadastrarIntegrante = BtnCadastrarIntegrante;
    }

    public javax.swing.JButton getBtnCadastrarPsc() {
        return BtnCadastrarPsc;
    }

    public void setBtnCadastrarPsc(javax.swing.JButton BtnCadastrarPsc) {
        this.BtnCadastrarPsc = BtnCadastrarPsc;
    }

    public javax.swing.JButton getBtnCadastrarVoluntario() {
        return BtnCadastrarVoluntario;
    }

    public void setBtnCadastrarVoluntario(javax.swing.JButton BtnCadastrarVoluntario) {
        this.BtnCadastrarVoluntario = BtnCadastrarVoluntario;
    }

    public javax.swing.JComboBox<String> getComboCategoriaVoluntario() {
        return ComboCategoriaVoluntario;
    }

    public void setComboCategoriaVoluntario(javax.swing.JComboBox<String> ComboCategoriaVoluntario) {
        this.ComboCategoriaVoluntario = ComboCategoriaVoluntario;
    }

    public javax.swing.JComboBox<String> getComboFrequenciCentroIntegrante() {
        return ComboFrequenciCentroIntegrante;
    }

    public void setComboFrequenciCentroIntegrante(javax.swing.JComboBox<String> ComboFrequenciCentroIntegrante) {
        this.ComboFrequenciCentroIntegrante = ComboFrequenciCentroIntegrante;
    }

    public javax.swing.JComboBox<String> getComboParentescoIntegrante() {
        return ComboParentescoIntegrante;
    }

    public void setComboParentescoIntegrante(javax.swing.JComboBox<String> ComboParentescoIntegrante) {
        this.ComboParentescoIntegrante = ComboParentescoIntegrante;
    }

    public javax.swing.JComboBox<String> getComboVaraCriminalPsc() {
        return ComboVaraCriminalPsc;
    }

    public void setComboVaraCriminalPsc(javax.swing.JComboBox<String> ComboVaraCriminalPsc) {
        this.ComboVaraCriminalPsc = ComboVaraCriminalPsc;
    }

    public javax.swing.JTextField getTxtBairroPsc() {
        return TxtBairroPsc;
    }

    public void setTxtBairroPsc(javax.swing.JTextField TxtBairroPsc) {
        this.TxtBairroPsc = TxtBairroPsc;
    }

    public javax.swing.JTextField getTxtBairroVoluntario() {
        return TxtBairroVoluntario;
    }

    public void setTxtBairroVoluntario(javax.swing.JTextField TxtBairroVoluntario) {
        this.TxtBairroVoluntario = TxtBairroVoluntario;
    }

    public javax.swing.JFormattedTextField getTxtCepPsc() {
        return TxtCepPsc;
    }

    public void setTxtCepPsc(javax.swing.JFormattedTextField TxtCepPsc) {
        this.TxtCepPsc = TxtCepPsc;
    }

    public javax.swing.JFormattedTextField getTxtCepVoluntario() {
        return TxtCepVoluntario;
    }

    public void setTxtCepVoluntario(javax.swing.JFormattedTextField TxtCepVoluntario) {
        this.TxtCepVoluntario = TxtCepVoluntario;
    }

    public javax.swing.JTextField getTxtCidadePsc() {
        return TxtCidadePsc;
    }

    public void setTxtCidadePsc(javax.swing.JTextField TxtCidadePsc) {
        this.TxtCidadePsc = TxtCidadePsc;
    }

    public javax.swing.JTextField getTxtCidadeVoluntario() {
        return TxtCidadeVoluntario;
    }

    public void setTxtCidadeVoluntario(javax.swing.JTextField TxtCidadeVoluntario) {
        this.TxtCidadeVoluntario = TxtCidadeVoluntario;
    }

    public javax.swing.JFormattedTextField getTxtDataIntegrante() {
        return TxtDataIntegrante;
    }

    public void setTxtDataIntegrante(javax.swing.JFormattedTextField TxtDataIntegrante) {
        this.TxtDataIntegrante = TxtDataIntegrante;
    }

    public javax.swing.JFormattedTextField getTxtDataVoluntario() {
        return TxtDataVoluntario;
    }

    public void setTxtDataVoluntario(javax.swing.JFormattedTextField TxtDataVoluntario) {
        this.TxtDataVoluntario = TxtDataVoluntario;
    }

    public javax.swing.JTextField getTxtDiasSemanaPsc() {
        return TxtDiasSemanaPsc;
    }

    public void setTxtDiasSemanaPsc(javax.swing.JTextField TxtDiasSemanaPsc) {
        this.TxtDiasSemanaPsc = TxtDiasSemanaPsc;
    }

    public javax.swing.JTextField getTxtEnderecoPsc() {
        return TxtEnderecoPsc;
    }

    public void setTxtEnderecoPsc(javax.swing.JTextField TxtEnderecoPsc) {
        this.TxtEnderecoPsc = TxtEnderecoPsc;
    }

    public javax.swing.JTextField getTxtEnderecoVoluntario() {
        return TxtEnderecoVoluntario;
    }

    public void setTxtEnderecoVoluntario(javax.swing.JTextField TxtEnderecoVoluntario) {
        this.TxtEnderecoVoluntario = TxtEnderecoVoluntario;
    }

    public javax.swing.JTextField getTxtEscolaridadeIntegrante() {
        return TxtEscolaridadeIntegrante;
    }

    public void setTxtEscolaridadeIntegrante(javax.swing.JTextField TxtEscolaridadeIntegrante) {
        this.TxtEscolaridadeIntegrante = TxtEscolaridadeIntegrante;
    }

    public javax.swing.JFormattedTextField getTxtFimPsc() {
        return TxtFimPsc;
    }

    public void setTxtFimPsc(javax.swing.JFormattedTextField TxtFimPsc) {
        this.TxtFimPsc = TxtFimPsc;
    }

    public javax.swing.JTextField getTxtHorariosPsc() {
        return TxtHorariosPsc;
    }

    public void setTxtHorariosPsc(javax.swing.JTextField TxtHorariosPsc) {
        this.TxtHorariosPsc = TxtHorariosPsc;
    }

    public javax.swing.JFormattedTextField getTxtInicioPsc() {
        return TxtInicioPsc;
    }

    public void setTxtInicioPsc(javax.swing.JFormattedTextField TxtInicioPsc) {
        this.TxtInicioPsc = TxtInicioPsc;
    }

    public javax.swing.JTextField getTxtMedidaSemanaPsc() {
        return TxtMedidaSemanaPsc;
    }

    public void setTxtMedidaSemanaPsc(javax.swing.JTextField TxtMedidaSemanaPsc) {
        this.TxtMedidaSemanaPsc = TxtMedidaSemanaPsc;
    }

    public javax.swing.JTextField getTxtMedidaTotalPsc() {
        return TxtMedidaTotalPsc;
    }

    public void setTxtMedidaTotalPsc(javax.swing.JTextField TxtMedidaTotalPsc) {
        this.TxtMedidaTotalPsc = TxtMedidaTotalPsc;
    }

    public javax.swing.JTextField getTxtNomeIntegrante() {
        return TxtNomeIntegrante;
    }

    public void setTxtNomeIntegrante(javax.swing.JTextField TxtNomeIntegrante) {
        this.TxtNomeIntegrante = TxtNomeIntegrante;
    }

    public javax.swing.JTextField getTxtNomePsc() {
        return TxtNomePsc;
    }

    public void setTxtNomePsc(javax.swing.JTextField TxtNomePsc) {
        this.TxtNomePsc = TxtNomePsc;
    }

    public javax.swing.JTextField getTxtNomeVoluntario() {
        return TxtNomeVoluntario;
    }

    public void setTxtNomeVoluntario(javax.swing.JTextField TxtNomeVoluntario) {
        this.TxtNomeVoluntario = TxtNomeVoluntario;
    }

    public void setTxtTelefonePsc(javax.swing.JFormattedTextField TxtTelefonePsc) {
        this.TxtTelefonePsc = TxtTelefonePsc;
    }

    public javax.swing.JTextField getTxtTelefoneVoluntario() {
        return TxtTelefoneVoluntario;
    }

    

    public javax.swing.JComboBox<String> getjComboBox1() {
        return ComboSexo;
    }

    public void setjComboBox1(javax.swing.JComboBox<String> jComboBox1) {
        this.ComboSexo = jComboBox1;
    }

    public javax.swing.JComboBox<String> getjComboBox4() {
        return ComboGravida;
    }

    public void setjComboBox4(javax.swing.JComboBox<String> jComboBox4) {
        this.ComboGravida = jComboBox4;
    }

    public javax.swing.JLabel getjLabel46() {
        return jLabel46;
    }

    public void setjLabel46(javax.swing.JLabel jLabel46) {
        this.jLabel46 = jLabel46;
    }

    public javax.swing.JLabel getjLabel48() {
        return jLabel48;
    }

    public void setjLabel48(javax.swing.JLabel jLabel48) {
        this.jLabel48 = jLabel48;
    }

    public javax.swing.JLabel getjLabel49() {
        return jLabel49;
    }

    public void setjLabel49(javax.swing.JLabel jLabel49) {
        this.jLabel49 = jLabel49;
    }

    public javax.swing.JPanel getjPanel7() {
        return jPanel7;
    }

    public void setjPanel7(javax.swing.JPanel jPanel7) {
        this.jPanel7 = jPanel7;
    }

    public javax.swing.JComboBox<String> getComboGravida() {
        return ComboGravida;
    }

    public void setComboGravida(javax.swing.JComboBox<String> ComboGravida) {
        this.ComboGravida = ComboGravida;
    }

    public javax.swing.JComboBox<String> getComboSexo() {
        return ComboSexo;
    }

    public void setComboSexo(javax.swing.JComboBox<String> ComboSexo) {
        this.ComboSexo = ComboSexo;
    }

    public javax.swing.JTable getTablePsc() {
        return TablePsc;
    }

    public void setTablePsc(javax.swing.JTable TablePsc) {
        this.TablePsc = TablePsc;
    }

    public javax.swing.JTable getTableVoluntario() {
        return TableVoluntario;
    }

    public void setTableVoluntario(javax.swing.JTable TableVoluntario) {
        this.TableVoluntario = TableVoluntario;
    }

    public javax.swing.JButton getBtnAtualizar() {
        return BtnAtualizar;
    }

    public void setBtnAtualizar(javax.swing.JButton BtnAtualizar) {
        this.BtnAtualizar = BtnAtualizar;
    }

    public javax.swing.JButton getBtnExcluir() {
        return BtnExcluir;
    }

    public void setBtnExcluir(javax.swing.JButton BtnExcluir) {
        this.BtnExcluir = BtnExcluir;
    }

    public javax.swing.JButton getBtnAtualizarPsc() {
        return BtnAtualizarPsc;
    }

    public void setBtnAtualizarPsc(javax.swing.JButton BtnAtualizarPsc) {
        this.BtnAtualizarPsc = BtnAtualizarPsc;
    }

    public javax.swing.JButton getBtnAtualizarVoluntario() {
        return BtnAtualizarVoluntario;
    }

    public void setBtnAtualizarVoluntario(javax.swing.JButton BtnAtualizarVoluntario) {
        this.BtnAtualizarVoluntario = BtnAtualizarVoluntario;
    }

    public javax.swing.JButton getBtnExcluirPsc() {
        return BtnExcluirPsc;
    }

    public void setBtnExcluirPsc(javax.swing.JButton BtnExcluirPsc) {
        this.BtnExcluirPsc = BtnExcluirPsc;
    }

    public javax.swing.JButton getBtnExcluirVoluntario() {
        return BtnExcluirVoluntario;
    }

    public void setBtnExcluirVoluntario(javax.swing.JButton BtnExcluirVoluntario) {
        this.BtnExcluirVoluntario = BtnExcluirVoluntario;
    }

    public javax.swing.JButton getBtnLimparAssistido() {
        return BtnLimparAssistido;
    }

    public void setBtnLimparAssistido(javax.swing.JButton BtnLimparAssistido) {
        this.BtnLimparAssistido = BtnLimparAssistido;
    }

    public javax.swing.JButton getBtnLimparPsc() {
        return BtnLimparPsc;
    }

    public void setBtnLimparPsc(javax.swing.JButton BtnLimparPsc) {
        this.BtnLimparPsc = BtnLimparPsc;
    }

    public javax.swing.JButton getBtnLimparVoluntario() {
        return BtnLimparVoluntario;
    }

    public void setBtnLimparVoluntario(javax.swing.JButton BtnLimparVoluntario) {
        this.BtnLimparVoluntario = BtnLimparVoluntario;
    }

    public javax.swing.JTextField getTxtBuscarAssistido() {
        return TxtBuscarAssistido;
    }

    public void setTxtBuscarAssistido(javax.swing.JTextField TxtBuscarAssistido) {
        this.TxtBuscarAssistido = TxtBuscarAssistido;
    }

    public javax.swing.JTextField getTxtBuscaPsc() {
        return TxtBuscaPsc;
    }

    public void setTxtBuscaPsc(javax.swing.JTextField TxtBuscaPsc) {
        this.TxtBuscaPsc = TxtBuscaPsc;
    }

    public javax.swing.JTextField getTxtBuscaVoluntario() {
        return TxtBuscaVoluntario;
    }

    public void setTxtBuscaVoluntario(javax.swing.JTextField TxtBuscaVoluntario) {
        this.TxtBuscaVoluntario = TxtBuscaVoluntario;
    }

    public javax.swing.JLabel getjLabel24() {
        return jLabel24;
    }

    public void setjLabel24(javax.swing.JLabel jLabel24) {
        this.jLabel24 = jLabel24;
    }

    public javax.swing.JLabel getjLabel45() {
        return jLabel45;
    }

    public void setjLabel45(javax.swing.JLabel jLabel45) {
        this.jLabel45 = jLabel45;
    }

    public javax.swing.JLabel getjLabel47() {
        return jLabel47;
    }

    public void setjLabel47(javax.swing.JLabel jLabel47) {
        this.jLabel47 = jLabel47;
    }

    public javax.swing.JTable getTableIntegranteAssistido() {
        return TableIntegranteAssistido;
    }

    public void setTableIntegranteAssistido(javax.swing.JTable TableIntegranteAssistido) {
        this.TableIntegranteAssistido = TableIntegranteAssistido;
    }

    public javax.swing.JTextField getTxtPesquisarAssistido() {
        return TxtPesquisarAssistido;
    }

    public void setTxtPesquisarAssistido(javax.swing.JTextField TxtPesquisarAssistido) {
        this.TxtPesquisarAssistido = TxtPesquisarAssistido;
    }

    public javax.swing.JLabel getjLabel50() {
        return jLabel50;
    }

    public void setjLabel50(javax.swing.JLabel jLabel50) {
        this.jLabel50 = jLabel50;
    }

    public javax.swing.JLabel getjLabel52() {
        return jLabel52;
    }

    public void setjLabel52(javax.swing.JLabel jLabel52) {
        this.jLabel52 = jLabel52;
    }

    public javax.swing.JPanel getjPanel9() {
        return jPanel9;
    }

    public void setjPanel9(javax.swing.JPanel jPanel9) {
        this.jPanel9 = jPanel9;
    }

    public javax.swing.JScrollPane getjScrollPane9() {
        return jScrollPane9;
    }

    public void setjScrollPane9(javax.swing.JScrollPane jScrollPane9) {
        this.jScrollPane9 = jScrollPane9;
    }

    public javax.swing.JTabbedPane getjTabbedPane3() {
        return jTabbedPane3;
    }

    public void setjTabbedPane3(javax.swing.JTabbedPane jTabbedPane3) {
        this.jTabbedPane3 = jTabbedPane3;
    }

    public javax.swing.JTextField getjTextField1() {
        return TxtBuscaIntegrante;
    }

    public void setjTextField1(javax.swing.JTextField jTextField1) {
        this.TxtBuscaIntegrante = jTextField1;
    }

    public javax.swing.JTable getJtableIntegrante() {
        return JtableIntegrante;
    }

    public void setJtableIntegrante(javax.swing.JTable JtableIntegrante) {
        this.JtableIntegrante = JtableIntegrante;
    }

    public javax.swing.JButton getBtnAtualizarIntegrante() {
        return BtnAtualizarIntegrante;
    }

    public void setBtnAtualizarIntegrante(javax.swing.JButton BtnAtualizarIntegrante) {
        this.BtnAtualizarIntegrante = BtnAtualizarIntegrante;
    }

    public javax.swing.JComboBox<String> getComboEstudaIntegrante() {
        return ComboEstudaIntegrante;
    }

    public void setComboEstudaIntegrante(javax.swing.JComboBox<String> ComboEstudaIntegrante) {
        this.ComboEstudaIntegrante = ComboEstudaIntegrante;
    }

    public javax.swing.JTextField getTxtBuscaIntegrante() {
        return TxtBuscaIntegrante;
    }

    public void setTxtBuscaIntegrante(javax.swing.JTextField TxtBuscaIntegrante) {
        this.TxtBuscaIntegrante = TxtBuscaIntegrante;
    }

    public javax.swing.JTable getTableRelatorioGravida() {
        return TableRelatorioGravida;
    }

    public void setTableRelatorioGravida(javax.swing.JTable TableRelatorioGravida) {
        this.TableRelatorioGravida = TableRelatorioGravida;
    }

    public javax.swing.JTextField getTxtBuscaGravida() {
        return TxtBuscaGravida;
    }

    public void setTxtBuscaGravida(javax.swing.JTextField TxtBuscaGravida) {
        this.TxtBuscaGravida = TxtBuscaGravida;
    }

    public javax.swing.JTable getTableCrianca() {
        return TableCrianca;
    }

    public void setTableCrianca(javax.swing.JTable TableCrianca) {
        this.TableCrianca = TableCrianca;
    }

    public javax.swing.JTable getTableIdoso() {
        return TableIdoso;
    }

    public void setTableIdoso(javax.swing.JTable TableIdoso) {
        this.TableIdoso = TableIdoso;
    }

    public javax.swing.JTextField getTxtIdososBusca() {
        return TxtIdososBusca;
    }

    public void setTxtIdososBusca(javax.swing.JTextField TxtIdososBusca) {
        this.TxtIdososBusca = TxtIdososBusca;
    }

    public javax.swing.JComboBox<String> getComboPscVaraBusca() {
        return ComboPscVaraBusca;
    }

    public void setComboPscVaraBusca(javax.swing.JComboBox<String> ComboPscVaraBusca) {
        this.ComboPscVaraBusca = ComboPscVaraBusca;
    }

    public javax.swing.JTable getTablePscPorVara() {
        return TablePscPorVara;
    }

    public void setTablePscPorVara(javax.swing.JTable TablePscPorVara) {
        this.TablePscPorVara = TablePscPorVara;
    }

    public javax.swing.JTextField getTxtPscBuscaRelatorio() {
        return TxtPscBuscaRelatorio;
    }

    public void setTxtPscBuscaRelatorio(javax.swing.JTextField TxtPscBuscaRelatorio) {
        this.TxtPscBuscaRelatorio = TxtPscBuscaRelatorio;
    }

    public javax.swing.JPanel getTableIdosos() {
        return RelatorioIdosos;
    }

    public void setTableIdosos(javax.swing.JPanel TableIdosos) {
        this.RelatorioIdosos = TableIdosos;
    }

    public javax.swing.JTextField getTxtTelefoneAssistido() {
        return TxtTelefoneAssistido;
    }

    public void setTxtTelefoneAssistido(javax.swing.JTextField TxtTelefoneAssistido) {
        this.TxtTelefoneAssistido = TxtTelefoneAssistido;
    }

    public javax.swing.JTextField getTxtTelefonePsc() {
        return TxtTelefonePsc;
    }

    public void setTxtTelefonePsc(javax.swing.JTextField TxtTelefonePsc) {
        this.TxtTelefonePsc = TxtTelefonePsc;
    }

    public javax.swing.JTable getTableAssistidoRelatorio() {
        return TableAssistidoRelatorio;
    }

    public void setTableAssistidoRelatorio(javax.swing.JTable TableAssistidoRelatorio) {
        this.TableAssistidoRelatorio = TableAssistidoRelatorio;
    }

    public javax.swing.JTable getTableIntegranteRelatorio() {
        return TableIntegranteRelatorio;
    }

    public void setTableIntegranteRelatorio(javax.swing.JTable TableIntegranteRelatorio) {
        this.TableIntegranteRelatorio = TableIntegranteRelatorio;
    }

    public javax.swing.JPanel getRelatorioCrianca() {
        return RelatorioCrianca;
    }

    public void setRelatorioCrianca(javax.swing.JPanel RelatorioCrianca) {
        this.RelatorioCrianca = RelatorioCrianca;
    }

    public javax.swing.JPanel getRelatorioGravida() {
        return RelatorioGravida;
    }

    public void setRelatorioGravida(javax.swing.JPanel RelatorioGravida) {
        this.RelatorioGravida = RelatorioGravida;
    }

    public javax.swing.JPanel getRelatorioIdosos() {
        return RelatorioIdosos;
    }

    public void setRelatorioIdosos(javax.swing.JPanel RelatorioIdosos) {
        this.RelatorioIdosos = RelatorioIdosos;
    }

    public javax.swing.JPanel getRelatorioIntegrantes() {
        return RelatorioIntegrantes;
    }

    public void setRelatorioIntegrantes(javax.swing.JPanel RelatorioIntegrantes) {
        this.RelatorioIntegrantes = RelatorioIntegrantes;
    }

    public javax.swing.JPanel getRelatorioPscVara() {
        return RelatorioPscVara;
    }

    public void setRelatorioPscVara(javax.swing.JPanel RelatorioPscVara) {
        this.RelatorioPscVara = RelatorioPscVara;
    }

    public javax.swing.JTextField getTxtBuscaIntegranteRelatorio() {
        return TxtBuscaIntegranteRelatorio;
    }

    public void setTxtBuscaIntegranteRelatorio(javax.swing.JTextField TxtBuscaIntegranteRelatorio) {
        this.TxtBuscaIntegranteRelatorio = TxtBuscaIntegranteRelatorio;
    }

}
