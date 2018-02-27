/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.telas;

import java.util.List;
import javax.swing.JOptionPane;
import registraclinic.consulta.Consulta;
import registraclinic.consulta.ConsultaDAO;
import registraclinic.consulta.ConsultaTableModel;
import registraclinic.funcionario.Funcionario;
import registraclinic.funcionario.FuncionarioDAO;
import registraclinic.funcionario.FuncionarioTableModel;
import registraclinic.paciente.Paciente;
import registraclinic.paciente.PacienteDAO;
import registraclinic.paciente.PacienteTableModel;
import registraclinic.util.Util;

/**
 *
 * @author Adriano Lima
 */
public class CadastroConsulta extends javax.swing.JDialog {

    Consulta consulta = new Consulta();
    ConsultaDAO consultaDAO;
    Funcionario funcionario = new Funcionario();
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    Paciente paciente;
    PacienteDAO pacienteDAO;

    /**
     * Creates new form TelaCadastroUsuario
     * @param usuario
     */
    public CadastroConsulta() {
        initComponents();
        btExcluir.setEnabled(false);
        getRootPane().setDefaultButton(btSalvar);
        consulta = new Consulta();
        consultaDAO = new ConsultaDAO();
        txtFuncionario.setEnabled(false);
        txtPaciente.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPaciente = new javax.swing.JButton();
        jLObrigatorioNome4 = new javax.swing.JLabel();
        txtHoraConsulta = new javax.swing.JFormattedTextField();
        jlNomeUsuario5 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jlNomeUsuario3 = new javax.swing.JLabel();
        txtNomeConsulta = new javax.swing.JTextField();
        jLObrigatorioNome1 = new javax.swing.JLabel();
        jLObrigatorioNome = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        jlNomeUsuario1 = new javax.swing.JLabel();
        txtDataConsulta = new javax.swing.JFormattedTextField();
        jLObrigatorioNome3 = new javax.swing.JLabel();
        jlNomeUsuario4 = new javax.swing.JLabel();
        jlNomeUsuario = new javax.swing.JLabel();
        txtFuncionario = new javax.swing.JTextField();
        jLObrigatorioNome2 = new javax.swing.JLabel();
        btnFuncionario = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(602, 421));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        btnPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/add20-20.png"))); // NOI18N
        btnPaciente.setContentAreaFilled(false);
        btnPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPaciente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPaciente);
        btnPaciente.setBounds(520, 220, 30, 30);

        jLObrigatorioNome4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome4.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome4.setText("*");
        getContentPane().add(jLObrigatorioNome4);
        jLObrigatorioNome4.setBounds(510, 160, 10, 20);

        try {
            txtHoraConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHoraConsulta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtHoraConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(txtHoraConsulta);
        txtHoraConsulta.setBounds(360, 160, 150, 30);

        jlNomeUsuario5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario5.setText("Hora da Consulta:");
        getContentPane().add(jlNomeUsuario5);
        jlNomeUsuario5.setBounds(360, 140, 140, 20);

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
        btVoltar.setBounds(20, 340, 90, 70);

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
        btPesquisar.setBounds(271, 340, 99, 70);

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
        btExcluir.setBounds(380, 340, 80, 70);

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
        btLimpar.setBounds(160, 340, 80, 70);

        jlNomeUsuario3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario3.setText("Nome da Consulta:");
        getContentPane().add(jlNomeUsuario3);
        jlNomeUsuario3.setBounds(60, 70, 150, 20);

        txtNomeConsulta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNomeConsulta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 44, 143), 1, true));
        txtNomeConsulta.setMaximumSize(new java.awt.Dimension(8, 200));
        txtNomeConsulta.setMinimumSize(new java.awt.Dimension(8, 200));
        txtNomeConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeConsulta);
        txtNomeConsulta.setBounds(60, 90, 450, 30);

        jLObrigatorioNome1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome1.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome1.setText("*");
        getContentPane().add(jLObrigatorioNome1);
        jLObrigatorioNome1.setBounds(510, 90, 20, 20);

        jLObrigatorioNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome.setText("*");
        getContentPane().add(jLObrigatorioNome);
        jLObrigatorioNome.setBounds(510, 210, 20, 30);

        txtPaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPaciente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 44, 143), 1, true));
        txtPaciente.setMaximumSize(new java.awt.Dimension(8, 200));
        txtPaciente.setMinimumSize(new java.awt.Dimension(8, 200));
        txtPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtPaciente);
        txtPaciente.setBounds(60, 220, 450, 30);

        jlNomeUsuario1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario1.setText("Paciente:");
        getContentPane().add(jlNomeUsuario1);
        jlNomeUsuario1.setBounds(60, 200, 100, 20);

        try {
            txtDataConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataConsulta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtDataConsulta);
        txtDataConsulta.setBounds(60, 160, 150, 30);

        jLObrigatorioNome3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome3.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome3.setText("*");
        getContentPane().add(jLObrigatorioNome3);
        jLObrigatorioNome3.setBounds(210, 160, 10, 20);

        jlNomeUsuario4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario4.setText("Data da Consulta:");
        getContentPane().add(jlNomeUsuario4);
        jlNomeUsuario4.setBounds(60, 140, 140, 20);

        jlNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario.setText("Funcionário:");
        getContentPane().add(jlNomeUsuario);
        jlNomeUsuario.setBounds(60, 260, 130, 20);

        txtFuncionario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFuncionario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 44, 143), 1, true));
        txtFuncionario.setMaximumSize(new java.awt.Dimension(8, 200));
        txtFuncionario.setMinimumSize(new java.awt.Dimension(8, 200));
        txtFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtFuncionario);
        txtFuncionario.setBounds(60, 280, 450, 30);

        jLObrigatorioNome2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome2.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome2.setText("*");
        getContentPane().add(jLObrigatorioNome2);
        jLObrigatorioNome2.setBounds(510, 270, 10, 30);

        btnFuncionario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/add20-20.png"))); // NOI18N
        btnFuncionario.setContentAreaFilled(false);
        btnFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFuncionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnFuncionario);
        btnFuncionario.setBounds(520, 280, 30, 30);

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
        btSalvar.setBounds(500, 340, 80, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registraclinic/imagens/CadastroConsultas.png"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(2, 0, 600, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        List<Consulta> lista;
        lista = consultaDAO.listar();
        ConsultaTableModel itm = new ConsultaTableModel(lista);
        Object objetoRetorno = PesquisaGenerica.exibeTela(itm, "Consulta");
        if (objetoRetorno != null) {
            consulta = consultaDAO.consultarObjetoId("idConsulta", objetoRetorno);
            txtNomeConsulta.setText(consulta.getNomeConsulta());
            txtDataConsulta.setText(consulta.getDataConsulta());
            txtHoraConsulta.setText(consulta.getHoraConsulta());
            txtFuncionario.setText(consulta.getFuncionarioConsulta().getNomeFuncionario());
            txtPaciente.setText(consulta.getPacienteConsulta().getNomePaciente());
            btExcluir.setEnabled(true);

        }

    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        consultaDAO.excluir(consulta);
        btLimparActionPerformed(null);

    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        Util.limparCamposGenerico(this);
        btExcluir.setEnabled(false);
        consulta = new Consulta();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        if (txtNomeConsulta.getText().equals("") || txtDataConsulta.getText().equals("") 
                || txtHoraConsulta.getText().equals("") || txtFuncionario.getText().equals("")
                || txtPaciente.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Prencha todos os campos !!");
        } else {
            consulta.setNomeConsulta(txtNomeConsulta.getText());
            consulta.setDataConsulta(txtDataConsulta.getText());
            consulta.setHoraConsulta(txtHoraConsulta.getText());
            consulta.setFuncionarioConsulta(funcionario);
            consulta.setPacienteConsulta(paciente);
            consultaDAO.salvar(consulta);
            Util.limparCamposGenerico(this);
            
        }
        consulta = new Consulta();
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();

    }//GEN-LAST:event_btVoltarActionPerformed

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        List<Paciente> lista;
        lista = (pacienteDAO.listar());
        PacienteTableModel itm = new PacienteTableModel(lista);
        Object objetoRetorno = PesquisaGenerica.exibeTela(itm, "Paciente");
        if (objetoRetorno != null) {
            paciente = pacienteDAO.consultarObjetoId("idPaciente", objetoRetorno);
            txtPaciente.setText(paciente.getNomePaciente());
            txtPaciente.setEnabled(false);

        }
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void txtNomeConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeConsultaActionPerformed

    private void txtPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPacienteActionPerformed

    private void txtFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFuncionarioActionPerformed

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed
        List<Funcionario> lista;
        lista = (funcionarioDAO.listar());
        FuncionarioTableModel itm = new FuncionarioTableModel(lista);
        Object objetoRetorno = PesquisaGenerica.exibeTela(itm, "Funcionários");
        if (objetoRetorno != null) {
            funcionario = funcionarioDAO.consultarObjetoId("idFuncionario", objetoRetorno);

            txtFuncionario.setText(funcionario.getNomeFuncionario());
            txtFuncionario.setEnabled(false);

        }
    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void txtHoraConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroConsulta dialog = new CadastroConsulta();
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
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JLabel jLObrigatorioNome;
    private javax.swing.JLabel jLObrigatorioNome1;
    private javax.swing.JLabel jLObrigatorioNome2;
    private javax.swing.JLabel jLObrigatorioNome3;
    private javax.swing.JLabel jLObrigatorioNome4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jlNomeUsuario;
    private javax.swing.JLabel jlNomeUsuario1;
    private javax.swing.JLabel jlNomeUsuario3;
    private javax.swing.JLabel jlNomeUsuario4;
    private javax.swing.JLabel jlNomeUsuario5;
    private javax.swing.JFormattedTextField txtDataConsulta;
    private javax.swing.JTextField txtFuncionario;
    private javax.swing.JFormattedTextField txtHoraConsulta;
    private javax.swing.JTextField txtNomeConsulta;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables
}
