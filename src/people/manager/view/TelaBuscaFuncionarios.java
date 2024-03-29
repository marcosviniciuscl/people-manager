/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people.manager.view;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import people.manager.controller.Controller;
import people.manager.controller.ControllerFuncionario;
import people.manager.exception.VendedorNaoEncontradoException;
import people.manager.model.Cliente;
import people.manager.model.Funcionario;

/**
 *
 * @author marcos
 */
public class TelaBuscaFuncionarios extends javax.swing.JFrame {

    JTable table;

    /**
     * Creates new form TelaBuscaCliente
     *
     * @param title
     */
    public TelaBuscaFuncionarios(String title) {
        super(title);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxTipoBusca = new javax.swing.JComboBox<>();
        jLabelImagem = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jButton2 = new javax.swing.JButton();
        jButtonDesativar = new javax.swing.JButton();
        jButtonAtivar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Campo Busca:");

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo Busca:");

        jComboBoxTipoBusca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF" }));

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonDesativar.setText("Desativar");
        jButtonDesativar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesativarActionPerformed(evt);
            }
        });

        jButtonAtivar.setText("Ativar");
        jButtonAtivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAtivar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDesativar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxTipoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jButton1))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxTipoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jLabelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButtonDesativar)
                    .addComponent(jButtonAtivar))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Thread() {

            @Override
            public void run() {
                ArrayList<Funcionario> vendedores;
                jLabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("ajax-loader-cicle.gif")));
                switch (jComboBoxTipoBusca.getSelectedIndex()) {
                    case 0:
                        try {
                            vendedores = ControllerFuncionario.buscarFuncionario(0, jTextField1.getText().trim());
                            criarTabela(vendedores);
                        } catch (VendedorNaoEncontradoException ex) {
                            JOptionPane.showMessageDialog(null, "Vendedor não encontrado");
                        }
                        break;
                    case 1:
                        try {
                            vendedores = ControllerFuncionario.buscarFuncionario(1, jTextField1.getText().trim());
                            criarTabela(vendedores);
                        } catch (VendedorNaoEncontradoException ex) {
                            JOptionPane.showMessageDialog(null, "Vendedor não encontrado");
                        }
                        break;
                }
                jLabelImagem.setIcon(null);
            }
        }.start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (table != null) {
            ArrayList<Funcionario> f;
            if (table.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um funcionario antes");
            } else {
                try {
                    f = ControllerFuncionario.buscarFuncionario(2, (String) table.getValueAt(table.getSelectedRow(), 0));
                    TelaEditarFuncionario te = new TelaEditarFuncionario("Edição de Funcionario", f.get(0));
                    te.setLocationRelativeTo(null);
                    te.setVisible(true);
                } catch (VendedorNaoEncontradoException ex) {
                    Logger.getLogger(TelaBuscaFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonDesativarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesativarActionPerformed
        if (table != null) {
            ArrayList<Funcionario> f;
            if (table.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um funcionario antes");
            } else {
                try {
                    f = ControllerFuncionario.buscarFuncionario(2, (String) table.getValueAt(table.getSelectedRow(), 0));
                    if (JOptionPane.showConfirmDialog(null, "Tem certeza que pretende desativar o funcionario?") == 0) {

                        if (!f.get(0).isAtivo()) {
                            JOptionPane.showMessageDialog(null, "Funcionário já esta desativado");
                        } else {
                            ControllerFuncionario.desativarFuncionario(f.get(0).getCpf());
                            JOptionPane.showMessageDialog(null, "Funcionário foi desativado");
                        }
                    }
                } catch (VendedorNaoEncontradoException ex) {
                    Logger.getLogger(TelaBuscaFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_jButtonDesativarActionPerformed

    private void jButtonAtivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtivarActionPerformed
         ArrayList<Funcionario> f;
            if (table.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um funcionario antes");
            } else {
                try {
                    f = ControllerFuncionario.buscarFuncionario(2, (String) table.getValueAt(table.getSelectedRow(), 0));
                    if (JOptionPane.showConfirmDialog(null, "Tem certeza que pretende ativar o funcionario?") == 0) {

                        if (f.get(0).isAtivo()) {
                            JOptionPane.showMessageDialog(null, "Funcionário já esta ativo");
                        } else {
                            ControllerFuncionario.ativarFuncionario(f.get(0).getCpf());
                            JOptionPane.showMessageDialog(null, "Funcionário foi ativado");
                        }
                    }
                } catch (VendedorNaoEncontradoException ex) {
                    Logger.getLogger(TelaBuscaFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
    }//GEN-LAST:event_jButtonAtivarActionPerformed

    private void criarTabela(ArrayList<Funcionario> vededores) {
        String[] colunas = {"ID", "NOME", "CELULAR", "EMAIL", "IDADE", "NASCIMENTO", "CPF", "ESTADO"};
        List<String[]> lista = new ArrayList<>();
        vededores.forEach((v) -> {
            String est = "DESATIVO";
            if (v.isAtivo()) {
                est = "ATIVO";
            }
            lista.add(new String[]{v.getId().toString(), v.getNome() + " " + v.getSobrenome(), v.getCelular(), v.getEmail(), v.getIdade().toString(), Controller.calendarParaString(v.getNascimento()), v.getCpf(), est});
        });
        table = new JTable();
        table.setModel(new DefaultTableModel(lista.toArray(new String[lista.size()][]), colunas) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane3.setViewportView(table);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAtivar;
    private javax.swing.JButton jButtonDesativar;
    private javax.swing.JComboBox<String> jComboBoxTipoBusca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
