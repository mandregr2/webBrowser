/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webbrowser.model;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import webbrowser.ConectDatabase.ClsSQLHistorico;
import webbrowser.ConectDatabase.FazConsulta;
import webbrowser.ConectDatabase.ListaConsulta;
import webbrowser.gui.plataforma;

/**
 *
 * @author andre
 */
public class TabHistorico extends javax.swing.JPanel {

    private Object displayEditorPane;
    HistoricoTableModel HistoricoTable = new HistoricoTableModel();
    //ClsSQLHistorico cls = new ClsSQLHistorico();

    /**
     * Creates new form TabHistorico
     */
    public TabHistorico() throws SQLException {
        initComponents();
        jTableHistorico.setModel(HistoricoTable);
        carrega();

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
        jButtonLimpaTudo = new javax.swing.JButton();
        jButtonFecharAba = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHistorico = new javax.swing.JTable();
        jButtonExcluiSelecionado = new javax.swing.JButton();

        jButtonLimpaTudo.setText("Limpar tudo");
        jButtonLimpaTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpaTudoActionPerformed(evt);
            }
        });

        jButtonFecharAba.setText("Fechar");
        jButtonFecharAba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharAbaActionPerformed(evt);
            }
        });

        jScrollPane1.setPreferredSize(jPanel1.getPreferredSize());

        jTableHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableHistorico.setMaximumSize(new java.awt.Dimension(800, 680));
        jTableHistorico.setMinimumSize(new java.awt.Dimension(400, 300));
        jTableHistorico.setPreferredSize(jPanel1.getMaximumSize());
        jScrollPane1.setViewportView(jTableHistorico);

        jButtonExcluiSelecionado.setText("Excluir Selecionado");
        jButtonExcluiSelecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluiSelecionadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFecharAba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(jButtonExcluiSelecionado)
                        .addGap(141, 141, 141)
                        .addComponent(jButtonLimpaTudo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLimpaTudo)
                    .addComponent(jButtonFecharAba)
                    .addComponent(jButtonExcluiSelecionado)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimpaTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpaTudoActionPerformed
        try {
            for (int i = 0; i < ListaConsulta.aList.size(); i++) {
                Historico h = new Historico();
                h = ListaConsulta.aList.get(i);
                webbrowser.ConectDatabase.ClsSQLHistorico cls = new ClsSQLHistorico();
                cls.Excluir(h);
                HistoricoTable.DeleteRowInTable(h);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TabHistorico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonLimpaTudoActionPerformed

    private void jButtonExcluiSelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluiSelecionadoActionPerformed

        try {
            Historico h = new Historico();
            h = HistoricoTable.getColunaSelecionada(jTableHistorico.getSelectedRow());
            webbrowser.ConectDatabase.ClsSQLHistorico cls = new ClsSQLHistorico();

            cls.Excluir(h);
            HistoricoTable.DeleteRowInTable(h);
        } catch (SQLException ex) {
            Logger.getLogger(TabHistorico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonExcluiSelecionadoActionPerformed

    private void jButtonFecharAbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharAbaActionPerformed

        plataforma p = new plataforma();
        p.RemoveSelectedTab();

    }//GEN-LAST:event_jButtonFecharAbaActionPerformed
    //carrega dados na tabela

    public void carrega() {
        FazConsulta f = new FazConsulta();
        try {
            f.fazConsultaSQL("select * from historico");
        } catch (SQLException ex) {
            Logger.getLogger(TabHistorico.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (jTableHistorico.getRowCount() > 0) {
            System.out.println("tem linhas");
            do {
                jTableHistorico.removeRowSelectionInterval(0, 0);
            } while (jTableHistorico.getRowCount() > 0);

        }
        for (Historico aList : ListaConsulta.aList) {
            HistoricoTable.addRowInTable(aList);
        }

    }
    
    public void apaga() {

        if (jTableHistorico.getRowCount() > 0) {

            do {
                ((DefaultTableModel) jTableHistorico.getModel()).removeRow(0);
            } while (jTableHistorico.getRowCount() > 0);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluiSelecionado;
    private javax.swing.JButton jButtonFecharAba;
    private javax.swing.JButton jButtonLimpaTudo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHistorico;
    // End of variables declaration//GEN-END:variables
}
