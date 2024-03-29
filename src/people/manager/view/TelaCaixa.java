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
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import people.manager.controller.Controller;
import people.manager.controller.ControllerCliente;
import people.manager.controller.ControllerVenda;
import people.manager.exception.ClienteNaoEncontradoException;
import people.manager.model.Cliente;
import people.manager.model.Produto;
import people.manager.model.Venda;
import people.manager.tools.ClienteTableCellRenderer;
import people.manager.tools.VendaTableCellRenderer;

/**
 *
 * @author marcos
 */
public class TelaCaixa extends javax.swing.JFrame {

    private JTable table;

    /**
     * Creates new form TelaCaixa
     *
     * @param title
     */
    public TelaCaixa(String title) {
        super(title);
        initComponents();
        criarTabela(ControllerVenda.todasVendas());
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDateChooserDataInicial = new com.toedter.calendar.JDateChooser();
        jDateChooserDataFinal = new com.toedter.calendar.JDateChooser();
        jButtonFiltro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButtonContinuarVenda = new javax.swing.JButton();
        jButtonCancelarVenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/people/manager/view/6943_32x32.png"))); // NOI18N
        jButton1.setToolTipText("Faça uma nova compra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/people/manager/view/8428_32x32.png"))); // NOI18N
        jButton2.setToolTipText("Busque compras já feitas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jDateChooserDataInicial.setEnabled(false);

        jDateChooserDataFinal.setEnabled(false);

        jButtonFiltro.setText("Filtrar");
        jButtonFiltro.setEnabled(false);
        jButtonFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltroActionPerformed(evt);
            }
        });

        jTextPane1.setEditable(false);
        jScrollPane2.setViewportView(jTextPane1);

        jButtonContinuarVenda.setText("Continuar Venda");
        jButtonContinuarVenda.setEnabled(false);
        jButtonContinuarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarVendaActionPerformed(evt);
            }
        });

        jButtonCancelarVenda.setText("Cancelar Venda");
        jButtonCancelarVenda.setEnabled(false);
        jButtonCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooserDataInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooserDataFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonContinuarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCancelarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDateChooserDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jDateChooserDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jButtonFiltro))
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonContinuarVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelarVenda)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaVenda tv = new TelaVenda("Nova Venda", null, this);
        Main.guardarJanela(tv);
        tv.setLocationRelativeTo(null);
        tv.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jDateChooserDataInicial.isEnabled()) {
            jDateChooserDataInicial.setEnabled(false);
            jDateChooserDataFinal.setEnabled(false);
            jButtonFiltro.setEnabled(false);
            criarTabela(ControllerVenda.todasVendas());
        } else {
            jDateChooserDataInicial.setEnabled(true);
            jDateChooserDataFinal.setEnabled(true);
            jButtonFiltro.setEnabled(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltroActionPerformed
        if (jDateChooserDataInicial.getCalendar() != null && jDateChooserDataFinal.getCalendar() != null) {
            criarTabela(ControllerVenda.todasVendas(jDateChooserDataInicial.getCalendar(), jDateChooserDataFinal.getCalendar()));
        } else {
            JOptionPane.showMessageDialog(null, "Preenchar os campos corretamente.");
        }
    }//GEN-LAST:event_jButtonFiltroActionPerformed

    private void jButtonContinuarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarVendaActionPerformed
        TelaVenda tv = new TelaVenda("Nova Venda", ControllerVenda.buscaId(Integer.parseInt((String) table.getValueAt(table.getSelectedRow(), 0))), this);
        Main.guardarJanela(tv);
        tv.setLocationRelativeTo(null);
        tv.setVisible(true);
    }//GEN-LAST:event_jButtonContinuarVendaActionPerformed

    private void jButtonCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarVendaActionPerformed
        if (Controller.getUser().getLevel() == 0) {
            JOptionPane.showMessageDialog(null, "Voce não tem permissão para cancelar compras. Apenas administrador.");
        } else if (JOptionPane.showConfirmDialog(null, "Cancelar Venda?") == 0) {
            ControllerVenda.cancelarVenda(Integer.parseInt((String) table.getValueAt(table.getSelectedRow(), 0)));
            JOptionPane.showMessageDialog(null, "Compra cancelada.");
            atualizar();
        } else{}
    }//GEN-LAST:event_jButtonCancelarVendaActionPerformed

    private void criarTabela(ArrayList<Venda> venda) {
        String[] colunas = {"ID", "DATA VENDA", "PRODUTOS", "CLIENTE", "VALOR DA VENDA", "ESTADO"};
        List<String[]> lista = new ArrayList<>();
        for (Venda v : venda) {
            try {
                ArrayList<Cliente> c = ControllerCliente.buscarCliente(3, v.getIdCliente() + "");
                lista.add(new String[]{v.getId().toString(), v.getDataString(), v.getNomesProdutos(), c.get(0).getNome(), String.format("%.2f", v.getValorVenda()), v.getEstado()});
            } catch (ClienteNaoEncontradoException ex) {
                Logger.getLogger(TelaCaixa.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        table = new JTable();

        table.setModel(new DefaultTableModel(lista.toArray(new String[lista.size()][]), colunas) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        table.getColumnModel().getColumn(0).setPreferredWidth(10);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        table.getColumnModel().getColumn(2).setPreferredWidth(120);
        table.getColumnModel().getColumn(3).setPreferredWidth(100);
        table.getColumnModel().getColumn(4).setPreferredWidth(50);
        table.getColumnModel().getColumn(5).setPreferredWidth(60);
        TableCellRenderer renderer = new VendaTableCellRenderer();
        for (int c = 0; c < table.getColumnCount(); c++) {
            table.setDefaultRenderer(table.getColumnClass(c), renderer);
        }

        table.getSelectionModel().addListSelectionListener((ListSelectionEvent evt) -> { //Evento na tabela
            if (evt.getValueIsAdjusting()) {
                return;
            }
            tableFocusEvent();
        });

        jScrollPane1.setViewportView(table);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCancelarVenda;
    private javax.swing.JButton jButtonContinuarVenda;
    private javax.swing.JButton jButtonFiltro;
    private com.toedter.calendar.JDateChooser jDateChooserDataFinal;
    private com.toedter.calendar.JDateChooser jDateChooserDataInicial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    private void tableFocusEvent() {
        String ID = (String) table.getValueAt(table.getSelectedRow(), 0);
        String DATA_VENDA = (String) table.getValueAt(table.getSelectedRow(), 1);
        String PRODUTOS = (String) table.getValueAt(table.getSelectedRow(), 2);
        String CLIENTE = (String) table.getValueAt(table.getSelectedRow(), 3);
        String VALOR_DA_VENDA = (String) table.getValueAt(table.getSelectedRow(), 4);
        String ESTADO = (String) table.getValueAt(table.getSelectedRow(), 5);

        jTextPane1.setText("Venda realizada em: " + DATA_VENDA.substring(0, 10) + " às " + DATA_VENDA.substring(11) + "\nProdutos: " + PRODUTOS + "\n"
                + "Cliente: " + CLIENTE + "\t\t\tValor: R$ " + VALOR_DA_VENDA + "\nEstado: " + ESTADO);
        if (ESTADO.equals("PENDENTE")) {
            jButtonContinuarVenda.setEnabled(true);
            jButtonCancelarVenda.setEnabled(true);
        } else {
            jButtonContinuarVenda.setEnabled(false);
            jButtonCancelarVenda.setEnabled(false);
        }
    }

    /**
     * Atualiza a tabela visualizada.
     */
    public void atualizar() {
        criarTabela(ControllerVenda.todasVendas());
    }
}
