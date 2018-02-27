/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.telas;


import java.text.SimpleDateFormat;
import java.util.Date;
import registraclinic.util.Util;
import java.util.List;
import javax.swing.JOptionPane;
import registraclinic.paciente.Paciente;
import registraclinic.paciente.PacienteDAO;
import registraclinic.paciente.PacienteTableModel;

/**
 *
 * @author Adriano Lima
 */
public class CadastroPaciente extends javax.swing.JDialog {

    Paciente paciente = new Paciente();
    PacienteDAO pacienteDAO = new PacienteDAO();
    SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Creates new form TelaCadastroUsuario
     */
    public CadastroPaciente(java.awt.Frame parent, boolean modal) {
        initComponents();
        getRootPane().setDefaultButton(btSalvar);

        btLimparActionPerformed(null);
        setModal(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlLogin2 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        jLObrigatorioNome3 = new javax.swing.JLabel();
        jlNomeUsuario4 = new javax.swing.JLabel();
        jLObrigatorioSenha1 = new javax.swing.JLabel();
        jlLogin = new javax.swing.JLabel();
        jlTipoUsuario = new javax.swing.JLabel();
        jlSenha = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        jcSexo = new javax.swing.JComboBox<>();
        jlSenha3 = new javax.swing.JLabel();
        txtTelefoneResponsavel = new javax.swing.JFormattedTextField();
        txtNomeResponsavel = new javax.swing.JTextField();
        jlNomeUsuario1 = new javax.swing.JLabel();
        jLObrigatorioNome2 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        jLObrigatorioLogin4 = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        jLObrigatorioNome1 = new javax.swing.JLabel();
        jlLogin1 = new javax.swing.JLabel();
        jLObrigatorioLogin1 = new javax.swing.JLabel();
        jlNomeUsuario = new javax.swing.JLabel();
        txtNomePaciente = new javax.swing.JTextField();
        txtTelefonePaciente = new javax.swing.JFormattedTextField();
        jlSenha2 = new javax.swing.JLabel();
        jLObrigatorioLogin3 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        txtNumProntuario1 = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLObrigatorioNome = new javax.swing.JLabel();
        jlSenha1 = new javax.swing.JLabel();
        jLObrigatorioLogin2 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        jLObrigatorioLogin = new javax.swing.JLabel();
        jLObrigatorioSenha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jlLogin2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlLogin2.setText("Endereço:");
        getContentPane().add(jlLogin2);
        jlLogin2.setBounds(280, 220, 90, 19);

        txtEndereco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEndereco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 44, 143), 1, true));
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(280, 240, 390, 30);

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascimento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtDataNascimento);
        txtDataNascimento.setBounds(130, 240, 130, 30);

        jLObrigatorioNome3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome3.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome3.setText("*");
        getContentPane().add(jLObrigatorioNome3);
        jLObrigatorioNome3.setBounds(260, 240, 10, 20);

        jlNomeUsuario4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario4.setText("Data de Nasc.:");
        getContentPane().add(jlNomeUsuario4);
        jlNomeUsuario4.setBounds(130, 220, 130, 20);

        jLObrigatorioSenha1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioSenha1.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioSenha1.setText("*");
        getContentPane().add(jLObrigatorioSenha1);
        jLObrigatorioSenha1.setBounds(670, 240, 10, 10);

        jlLogin.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlLogin.setText("CPF:");
        getContentPane().add(jlLogin);
        jlLogin.setBounds(40, 160, 70, 19);

        jlTipoUsuario.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlTipoUsuario.setText("Sexo:");
        getContentPane().add(jlTipoUsuario);
        jlTipoUsuario.setBounds(490, 160, 70, 19);

        jlSenha.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlSenha.setText("RG:");
        getContentPane().add(jlSenha);
        jlSenha.setBounds(240, 160, 60, 19);

        txtCpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 44, 143)));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtCpf);
        txtCpf.setBounds(40, 180, 180, 30);

        jcSexo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------", "Masculino", "Feminino", "Não Informado" }));
        jcSexo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 44, 143), 1, true));
        jcSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jcSexo);
        jcSexo.setBounds(490, 180, 180, 30);

        jlSenha3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlSenha3.setText("Telefone Responsável:");
        getContentPane().add(jlSenha3);
        jlSenha3.setBounds(40, 340, 180, 19);

        txtTelefoneResponsavel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 44, 143)));
        try {
            txtTelefoneResponsavel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneResponsavel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtTelefoneResponsavel);
        txtTelefoneResponsavel.setBounds(40, 360, 180, 30);

        txtNomeResponsavel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNomeResponsavel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 44, 143), 1, true));
        txtNomeResponsavel.setMaximumSize(new java.awt.Dimension(8, 200));
        txtNomeResponsavel.setMinimumSize(new java.awt.Dimension(8, 200));
        txtNomeResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeResponsavelActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeResponsavel);
        txtNomeResponsavel.setBounds(240, 300, 430, 30);

        jlNomeUsuario1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario1.setText("Nome do Responsável:");
        getContentPane().add(jlNomeUsuario1);
        jlNomeUsuario1.setBounds(240, 280, 180, 20);

        jLObrigatorioNome2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome2.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome2.setText("*");
        getContentPane().add(jLObrigatorioNome2);
        jLObrigatorioNome2.setBounds(670, 300, 10, 10);

        txtIdade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtIdade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 44, 143), 1, true));
        getContentPane().add(txtIdade);
        txtIdade.setBounds(40, 240, 70, 30);

        jLObrigatorioLogin4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioLogin4.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioLogin4.setText("*");
        getContentPane().add(jLObrigatorioLogin4);
        jLObrigatorioLogin4.setBounds(220, 360, 10, 10);

        txtRg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 44, 143), 1, true));
        getContentPane().add(txtRg);
        txtRg.setBounds(240, 180, 230, 30);

        jLObrigatorioNome1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome1.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome1.setText("*");
        getContentPane().add(jLObrigatorioNome1);
        jLObrigatorioNome1.setBounds(670, 120, 10, 10);

        jlLogin1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlLogin1.setText("Nº Prontuário");
        getContentPane().add(jlLogin1);
        jlLogin1.setBounds(490, 100, 120, 19);

        jLObrigatorioLogin1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioLogin1.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioLogin1.setText("*");
        getContentPane().add(jLObrigatorioLogin1);
        jLObrigatorioLogin1.setBounds(670, 180, 10, 10);

        jlNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario.setText("Nome do Usuário:");
        getContentPane().add(jlNomeUsuario);
        jlNomeUsuario.setBounds(40, 100, 150, 20);

        txtNomePaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNomePaciente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 44, 143), 1, true));
        txtNomePaciente.setMaximumSize(new java.awt.Dimension(8, 200));
        txtNomePaciente.setMinimumSize(new java.awt.Dimension(8, 200));
        txtNomePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomePacienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomePaciente);
        txtNomePaciente.setBounds(40, 120, 430, 30);

        txtTelefonePaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 44, 143)));
        try {
            txtTelefonePaciente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefonePaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTelefonePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonePacienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefonePaciente);
        txtTelefonePaciente.setBounds(40, 300, 180, 30);

        jlSenha2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlSenha2.setText("Telefone Paciente:");
        getContentPane().add(jlSenha2);
        jlSenha2.setBounds(40, 280, 160, 19);

        jLObrigatorioLogin3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioLogin3.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioLogin3.setText("*");
        getContentPane().add(jLObrigatorioLogin3);
        jLObrigatorioLogin3.setBounds(220, 300, 10, 10);

        btVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/voltar.png"))); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.setContentAreaFilled(false);
        btVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar);
        btVoltar.setBounds(20, 410, 90, 70);

        txtNumProntuario1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNumProntuario1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 44, 143), 1, true));
        getContentPane().add(txtNumProntuario1);
        txtNumProntuario1.setBounds(490, 120, 180, 30);

        btPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/pesquisar.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setContentAreaFilled(false);
        btPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar);
        btPesquisar.setBounds(320, 410, 100, 70);

        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/excluir.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setContentAreaFilled(false);
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(430, 410, 80, 70);

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/limpar.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setContentAreaFilled(false);
        btLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(220, 410, 80, 70);

        jLObrigatorioNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome.setText("*");
        getContentPane().add(jLObrigatorioNome);
        jLObrigatorioNome.setBounds(470, 120, 10, 10);

        jlSenha1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlSenha1.setText("Idade:");
        getContentPane().add(jlSenha1);
        jlSenha1.setBounds(40, 220, 60, 19);

        jLObrigatorioLogin2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioLogin2.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioLogin2.setText("*");
        getContentPane().add(jLObrigatorioLogin2);
        jLObrigatorioLogin2.setBounds(110, 240, 10, 10);

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/Salvar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setContentAreaFilled(false);
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar);
        btSalvar.setBounds(600, 410, 80, 70);

        jLObrigatorioLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioLogin.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioLogin.setText("*");
        getContentPane().add(jLObrigatorioLogin);
        jLObrigatorioLogin.setBounds(470, 180, 10, 10);

        jLObrigatorioSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioSenha.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioSenha.setText("*");
        getContentPane().add(jLObrigatorioSenha);
        jLObrigatorioSenha.setBounds(220, 180, 10, 10);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/CadastroPacientes.png"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 700, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        List<Paciente> lista;
        lista = (pacienteDAO.listar());
        PacienteTableModel itm = new PacienteTableModel(lista);
        Object objetoRetorno = PesquisaGenerica.exibeTela(itm, "Paciente");
        if (objetoRetorno != null) {
            paciente = pacienteDAO.consultarObjetoId("idPaciente", objetoRetorno);
            txtNomePaciente.setText(paciente.getNomePaciente());
            txtNumProntuario1.setText(String.valueOf(paciente.getNumeroProntuarioPaciente()));
            txtCpf.setText(paciente.getCpfPaciente());
            txtDataNascimento.setText(paciente.getDataNascimentoPaciente());
            txtEndereco.setText(paciente.getEnderecoPaciente());
            txtIdade.setText(String.valueOf(paciente.getIdadePaciente()));
            txtRg.setText(paciente.getRgPaciente());
            txtNomeResponsavel.setText(paciente.getNomeResponsavelPaciente());
            txtTelefonePaciente.setText(paciente.getTelefonePaciente());
            txtTelefoneResponsavel.setText(paciente.getTelefoneResponsavelPaciente());
            jcSexo.setSelectedItem(paciente.getSexoPaciente());
            
            btExcluir.setEnabled(true);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        pacienteDAO.excluir(paciente);
        btLimparActionPerformed(null);
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        Util.limparCamposGenerico(this);
        btExcluir.setEnabled(false);
        jcSexo.setSelectedIndex(0);
        paciente = new Paciente();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if (txtNomeResponsavel.getText().equals("") || txtCpf.getText().equals("") || 
                txtDataNascimento.getText().equals("") || txtEndereco.getText().equals("") || 
                txtIdade.getText().equals("") || txtNomeResponsavel.getText().equals("") || 
                txtNumProntuario1.getText().equals("") || jcSexo.getSelectedItem().equals("-------") ||
                txtRg.getText().equals("") || txtTelefonePaciente.getText().equals("") ||
                txtTelefoneResponsavel.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Prencha todos os campos !!");
        } else {
            paciente.setNomePaciente(txtNomePaciente.getText().toUpperCase());
            paciente.setNumeroProntuarioPaciente(Integer.parseInt(txtNumProntuario1.getText()));
            paciente.setCpfPaciente(txtCpf.getText());
            paciente.setDataCadastroPaciente(new Date());
            paciente.setDataNascimentoPaciente(txtDataNascimento.getText());
            paciente.setEnderecoPaciente(txtEndereco.getText());
            paciente.setIdadePaciente(Integer.parseInt(txtIdade.getText()));
            paciente.setRgPaciente(txtRg.getText());
            paciente.setNomeResponsavelPaciente(txtNomeResponsavel.getText());
            paciente.setTelefonePaciente(txtTelefonePaciente.getText());
            paciente.setTelefoneResponsavelPaciente(txtTelefoneResponsavel.getText());
            paciente.setSexoPaciente(jcSexo.getSelectedItem().toString());
                    
            pacienteDAO.salvar(paciente);
            btLimparActionPerformed(null);

        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void txtNomePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomePacienteActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed

        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void txtNomeResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeResponsavelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeResponsavelActionPerformed

    private void txtTelefonePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonePacienteActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroPaciente dialog = new CadastroPaciente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLObrigatorioLogin;
    private javax.swing.JLabel jLObrigatorioLogin1;
    private javax.swing.JLabel jLObrigatorioLogin2;
    private javax.swing.JLabel jLObrigatorioLogin3;
    private javax.swing.JLabel jLObrigatorioLogin4;
    private javax.swing.JLabel jLObrigatorioNome;
    private javax.swing.JLabel jLObrigatorioNome1;
    private javax.swing.JLabel jLObrigatorioNome2;
    private javax.swing.JLabel jLObrigatorioNome3;
    private javax.swing.JLabel jLObrigatorioSenha;
    private javax.swing.JLabel jLObrigatorioSenha1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> jcSexo;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlLogin1;
    private javax.swing.JLabel jlLogin2;
    private javax.swing.JLabel jlNomeUsuario;
    private javax.swing.JLabel jlNomeUsuario1;
    private javax.swing.JLabel jlNomeUsuario4;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlSenha1;
    private javax.swing.JLabel jlSenha2;
    private javax.swing.JLabel jlSenha3;
    private javax.swing.JLabel jlTipoUsuario;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNomePaciente;
    private javax.swing.JTextField txtNomeResponsavel;
    private javax.swing.JTextField txtNumProntuario1;
    private javax.swing.JTextField txtRg;
    private javax.swing.JFormattedTextField txtTelefonePaciente;
    private javax.swing.JFormattedTextField txtTelefoneResponsavel;
    // End of variables declaration//GEN-END:variables
}