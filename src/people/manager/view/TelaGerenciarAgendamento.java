/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people.manager.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import people.manager.controller.Controller;
import people.manager.controller.ControllerAtendimento;
import people.manager.controller.ControllerCliente;
import people.manager.controller.ControllerFuncionario;
import people.manager.exception.AtendimentoNaoEncontradoException;
import people.manager.exception.ClienteNaoEncontradoException;
import people.manager.exception.ImpossivelRemoverException;
import people.manager.exception.VendedorNaoEncontradoException;
import people.manager.model.Atendimento;
import people.manager.model.Cliente;
import people.manager.model.Funcionario;
import people.manager.model.Venda;

/**
 *
 * @author marcos
 */
public class TelaGerenciarAgendamento extends javax.swing.JFrame {

    /**
     * Creates new form Calendario
     *
     * @param title
     */
    public TelaGerenciarAgendamento(String title) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCheckBoxFiltroBusca = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jDateChooserDataInicial = new com.toedter.calendar.JDateChooser();
        jDateChooserDataFinal = new com.toedter.calendar.JDateChooser();
        jButtonFiltro = new javax.swing.JButton();
        jLabelIDCliente = new javax.swing.JLabel();
        jTextFieldIDCliente = new javax.swing.JTextField();
        jTextFieldClienteNome = new javax.swing.JTextField();
        jButtonBuscaCliente = new javax.swing.JButton();
        jLabelIDAtend = new javax.swing.JLabel();
        jTextFieldIDAtend = new javax.swing.JTextField();
        jTextFieldAtendNome = new javax.swing.JTextField();
        jButtonBuscaFuncionario = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jCheckBoxExibirConcl = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Horário", "Cliente", "Funcionario", "Comentário", "Estado", "ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jCalendar1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCalendar1PropertyChange(evt);
            }
        });

        jButton1.setText("Novo Agendamento");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Remover Agendamento");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBoxFiltroBusca.setText("Filtro");
        jCheckBoxFiltroBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFiltroBuscaActionPerformed(evt);
            }
        });

        jLabel1.setText("Até");

        jDateChooserDataInicial.setEnabled(false);

        jDateChooserDataFinal.setEnabled(false);

        jButtonFiltro.setText("OK");
        jButtonFiltro.setEnabled(false);
        jButtonFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltroActionPerformed(evt);
            }
        });

        jLabelIDCliente.setText("ID. Cliente:");
        jLabelIDCliente.setEnabled(false);

        jTextFieldIDCliente.setEnabled(false);
        jTextFieldIDCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDClienteActionPerformed(evt);
            }
        });

        jTextFieldClienteNome.setEditable(false);

        jButtonBuscaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/people/manager/view/search(1).png"))); // NOI18N
        jButtonBuscaCliente.setEnabled(false);
        jButtonBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaClienteActionPerformed(evt);
            }
        });

        jLabelIDAtend.setText("ID. Atend:");
        jLabelIDAtend.setEnabled(false);

        jTextFieldIDAtend.setEnabled(false);
        jTextFieldIDAtend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDAtendActionPerformed(evt);
            }
        });

        jTextFieldAtendNome.setEditable(false);

        jButtonBuscaFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/people/manager/view/search(1).png"))); // NOI18N
        jButtonBuscaFuncionario.setEnabled(false);
        jButtonBuscaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscaFuncionarioActionPerformed(evt);
            }
        });

        jButton3.setText("Editar Agendamento");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cliente Atendido");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jCheckBoxExibirConcl.setSelected(true);
        jCheckBoxExibirConcl.setText("Exibir Concluídos");
        jCheckBoxExibirConcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxExibirConclActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBoxFiltroBusca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelIDAtend)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldIDAtend, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelIDCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jTextFieldAtendNome, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBuscaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBoxExibirConcl)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxExibirConcl)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooserDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxFiltroBusca)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel1))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jDateChooserDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIDCliente)
                            .addComponent(jTextFieldIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelIDAtend)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldAtendNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonBuscaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldIDAtend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addContainerGap(28, Short.MAX_VALUE))
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

    private void jCalendar1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCalendar1PropertyChange
        try {
            array = ControllerAtendimento.buscar(jCalendar1.getCalendar());
            criarTabela();
        } catch (AtendimentoNaoEncontradoException ex) {
            Logger.getLogger(TelaGerenciarAgendamento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jCalendar1PropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaNovoAgendamento tna = new TelaNovoAgendamento("Novo Agendamento");
        Main.guardarJanela(tna);
        tna.setLocationRelativeTo(null);
        tna.setVisible(true);
        jCalendar1PropertyChange(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTable1 != null) {
            ArrayList c;
            if (jTable1.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um evento antes");
            } else {
                if (JOptionPane.showConfirmDialog(null, "Você tem certeza que quer excluir esse agendamento?") == 0) {
                    String id = jTable1.getValueAt(jTable1.getSelectedRow(), 5) + "";
                    try {
                        ControllerAtendimento.remover(id);
                        JOptionPane.showMessageDialog(null, "Removido");
                        Controller.novoLog("removeu um agendamento do cliente "+ jTable1.getValueAt(jTable1.getSelectedRow(), 1)+" agendado para " +jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                        jCalendar1PropertyChange(null);
                    } catch (ImpossivelRemoverException ex) {
                        JOptionPane.showMessageDialog(null, "Esse atendimento já foi marcado como concluido.\nNão será possivel apaga-lo.");
                    } catch (AtendimentoNaoEncontradoException ex) {
                        Logger.getLogger(TelaGerenciarAgendamento.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBoxFiltroBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFiltroBuscaActionPerformed
        if (jCheckBoxFiltroBusca.isSelected()) {
            jCalendar1.setEnabled(false);
            jDateChooserDataInicial.setEnabled(true);
            jDateChooserDataFinal.setEnabled(true);
            jTextFieldIDAtend.setEnabled(true);
            jTextFieldIDCliente.setEnabled(true);
            jButtonFiltro.setEnabled(true);
            jButtonBuscaCliente.setEnabled(true);
            jButtonBuscaFuncionario.setEnabled(true);
            jLabelIDCliente.setEnabled(true);
            jLabelIDAtend.setEnabled(true);

        } else {
            jCalendar1.setEnabled(true);
            jDateChooserDataInicial.setEnabled(false);
            jDateChooserDataFinal.setEnabled(false);
            jTextFieldIDAtend.setEnabled(false);
            jTextFieldIDCliente.setEnabled(false);
            jButtonFiltro.setEnabled(false);
            jButtonBuscaCliente.setEnabled(false);
            jButtonBuscaFuncionario.setEnabled(false);
            jLabelIDCliente.setEnabled(false);
            jLabelIDAtend.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBoxFiltroBuscaActionPerformed

    private void jButtonFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltroActionPerformed
        Calendar dataInicial = jDateChooserDataInicial.getCalendar();
        Calendar dataFinal = jDateChooserDataFinal.getCalendar();
        if (dataInicial != null) {
            if (cliente == null && funcionario == null) {
                array = (ArrayList) ControllerAtendimento.buscar(dataInicial, dataFinal);
                criarTabela();
            } else {
                try {
                    array = ControllerAtendimento.buscaFiltro(dataInicial, dataFinal, cliente, funcionario);
                    criarTabela();
                } catch (AtendimentoNaoEncontradoException ex) {
                    JOptionPane.showMessageDialog(null, "Não há atendimento cadastrado com essas informações.");
                }

            }
        } else {
            jCheckBoxFiltroBusca.setSelected(false);
            jCheckBoxFiltroBuscaActionPerformed(evt);
        }
    }//GEN-LAST:event_jButtonFiltroActionPerformed

    private void jButtonBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaClienteActionPerformed
        cliente = ControllerCliente.buscarClienteInterface();
        if (cliente != null) {
            jTextFieldIDCliente.setText(cliente.getId() + "");
            jTextFieldClienteNome.setText(cliente.getNome() + " " + cliente.getSobrenome());
        }
    }//GEN-LAST:event_jButtonBuscaClienteActionPerformed

    private void jButtonBuscaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscaFuncionarioActionPerformed
        funcionario = ControllerFuncionario.buscarFuncionarioInterface();
        if (funcionario != null) {
            jTextFieldIDAtend.setText(funcionario.getId() + "");
            jTextFieldAtendNome.setText(funcionario.getNome() + " " + funcionario.getSobrenome());
        }
    }//GEN-LAST:event_jButtonBuscaFuncionarioActionPerformed

    private void jTextFieldIDClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDClienteActionPerformed
        try {
            cliente = (Cliente) ControllerCliente.buscarCliente(3, jTextFieldIDCliente.getText().trim()).get(0);
            if (cliente != null) {
                jTextFieldIDCliente.setText(cliente.getId() + "");
                jTextFieldClienteNome.setText(cliente.getNome() + " " + cliente.getSobrenome());
            }
        } catch (ClienteNaoEncontradoException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
        }

    }//GEN-LAST:event_jTextFieldIDClienteActionPerformed

    private void jTextFieldIDAtendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDAtendActionPerformed
        try {
            funcionario = (Funcionario) ControllerFuncionario.buscarFuncionario(2, jTextFieldIDCliente.getText().trim()).get(0);
            if (funcionario != null) {
                jTextFieldIDAtend.setText(funcionario.getId() + "");
                jTextFieldAtendNome.setText(funcionario.getNome() + " " + funcionario.getSobrenome());
            }
        } catch (VendedorNaoEncontradoException ex) {
            JOptionPane.showMessageDialog(null, "Funcionario não encontrado.");
        }
    }//GEN-LAST:event_jTextFieldIDAtendActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jTable1 != null) {
            ArrayList c;
            if (jTable1.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um evento antes");
            } else {
                String id = jTable1.getValueAt(jTable1.getSelectedRow(), 5) + "";
                try {
                    Atendimento at = ControllerAtendimento.buscarAtendimentoID(Integer.parseInt(id));
                    if (!at.isAtendido()) {
                        TelaEditarAgendamento tea = new TelaEditarAgendamento("Tela Edição", at);
                        tea.setLocationRelativeTo(null);
                        tea.setVisible(true);
                        jCalendar1PropertyChange(null);
                    } else {
                        JOptionPane.showMessageDialog(null, "Esse atendimento já foi marcado como concluido.\nNão será possivel edita-lo.");
                    }
                } catch (AtendimentoNaoEncontradoException ex) {
                    Logger.getLogger(TelaGerenciarAgendamento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jTable1 != null) {
            ArrayList c;
            if (jTable1.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "Selecione um evento antes");
            } else {
                if (JOptionPane.showConfirmDialog(null, "Marcar como atendido?") == 0) {
                    Atendimento at;
                    try {
                        at = ControllerAtendimento.buscarAtendimentoID((int) jTable1.getValueAt(jTable1.getSelectedRow(), 5));
                        
                        //Tela para venda
                        ArrayList produto = new ArrayList();
                        produto.add(at);
                        Venda venda = new Venda(0, null, "", at.getIdCliente(), at.getIdAtendente(), produto, at.getPreco(), "", 0.0, 0.0, "PENDENTE");
                        TelaFinalizarVenda tfv = new TelaFinalizarVenda("Pagamento do Atendimento", venda, null);
                        tfv.setLocationRelativeTo(null);
                        tfv.setVisible(true);
                        
                        at.setAtendido(true);
                        ControllerAtendimento.editar(at);
                        jCalendar1PropertyChange(null);
                    } catch (AtendimentoNaoEncontradoException ex) {
                        Logger.getLogger(TelaGerenciarAgendamento.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCheckBoxExibirConclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxExibirConclActionPerformed
        criarTabela();
    }//GEN-LAST:event_jCheckBoxExibirConclActionPerformed

    public void criarTabela() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        if (!array.isEmpty()) {
            array.forEach((obj) -> {
                try {

                    ArrayList<Cliente> c = ControllerCliente.buscarCliente(3, obj.getIdCliente() + "");
                    ArrayList<Funcionario> f = ControllerFuncionario.buscarFuncionario(2, obj.getIdAtendente() + "");
                    String estado = "PENDENTE";
                    if (obj.isAtendido()) {
                        estado = "CONCLUIDO";
                    }
                    if (jCheckBoxExibirConcl.isSelected()) {
                        Object[] linha = {Controller.calendarParaString(obj.getDataAtendimento()).substring(0, 16), c.get(0).getNome(), f.get(0).getNome(), obj.getComentario(), estado, obj.getId()};
                        model.insertRow(0, linha);
                    } else {
                        if (!obj.isAtendido()) {
                            Object[] linha = {Controller.calendarParaString(obj.getDataAtendimento()).substring(0, 16), c.get(0).getNome(), f.get(0).getNome(), obj.getComentario(), estado, obj.getId()};
                            model.insertRow(0, linha);
                        }
                    }
                } catch (ClienteNaoEncontradoException | VendedorNaoEncontradoException ex) {
                }
            });

        }
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(1);

    }
    private Cliente cliente;
    private Funcionario funcionario;
    private ArrayList<Atendimento> array;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonBuscaCliente;
    private javax.swing.JButton jButtonBuscaFuncionario;
    private javax.swing.JButton jButtonFiltro;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JCheckBox jCheckBoxExibirConcl;
    private javax.swing.JCheckBox jCheckBoxFiltroBusca;
    private com.toedter.calendar.JDateChooser jDateChooserDataFinal;
    private com.toedter.calendar.JDateChooser jDateChooserDataInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelIDAtend;
    private javax.swing.JLabel jLabelIDCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAtendNome;
    private javax.swing.JTextField jTextFieldClienteNome;
    private javax.swing.JTextField jTextFieldIDAtend;
    private javax.swing.JTextField jTextFieldIDCliente;
    // End of variables declaration//GEN-END:variables
}
