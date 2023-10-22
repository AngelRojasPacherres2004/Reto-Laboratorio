/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas;

import entidades.Licuadora;
import entidades.Waflera;
import entidades.Plancha;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import entidades.Aparatos;

/**
 *
 * @author USER
 */
public class RegistrarElectrodomesticos extends javax.swing.JFrame {

    private List<Plancha> planchas = new ArrayList<>();
    private List<Licuadora> licuadoras = new ArrayList<>();
    private List<Waflera> wafleras = new ArrayList<>();
    private List<Aparatos> aparatoss = new ArrayList<>();
    DefaultListModel modeloLista = new DefaultListModel();

    /**
     * Creates new form ListaDeRopa
     */
    public RegistrarElectrodomesticos() {
        initComponents();
        lstElectro.setModel(modeloLista);
    }

    //Métodos
   

    public void actualizarLista() {
        modeloLista.removeAllElements();
        for (Aparatos nav : aparatoss) {
            modeloLista.addElement(nav.getNombre());
        }
    }

    public void setWaflera(Waflera waflera) {
        wafleras.add(waflera);
        aparatoss.add(waflera);
        actualizarLista();
    }

    public void setLicuadora(Licuadora licuadora) {
        licuadoras.add(licuadora);
        aparatoss.add(licuadora);
        actualizarLista();
    }

    public void setPlancha(Plancha plancha) {
        planchas.add(plancha);
        aparatoss.add(plancha);
        actualizarLista();
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
        btnPlancha = new javax.swing.JButton();
        btnWaflera = new javax.swing.JButton();
        btnLicuadora = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstElectro = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        btnPlancha.setBackground(new java.awt.Color(204, 204, 204));
        btnPlancha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPlancha.setText("Agregar Plancha");
        btnPlancha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlancha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanchaActionPerformed(evt);
            }
        });

        btnWaflera.setBackground(new java.awt.Color(204, 204, 204));
        btnWaflera.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnWaflera.setText("Agregar Waflera");
        btnWaflera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWaflera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWafleraActionPerformed(evt);
            }
        });

        btnLicuadora.setBackground(new java.awt.Color(204, 204, 204));
        btnLicuadora.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLicuadora.setText("Agregar Licuadora");
        btnLicuadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLicuadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLicuadoraActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstElectro);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Registrar Electrodomesticos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPlancha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnWaflera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLicuadora))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPlancha)
                        .addGap(40, 40, 40)
                        .addComponent(btnLicuadora)
                        .addGap(46, 46, 46)
                        .addComponent(btnWaflera)
                        .addGap(93, 93, 93))))
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

    private void btnWafleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWafleraActionPerformed
        EditarWaflera agregarWaflera = new EditarWaflera(this);
        agregarWaflera.setLocationRelativeTo(null);
        agregarWaflera.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnWafleraActionPerformed

    private void btnLicuadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLicuadoraActionPerformed
        EditarLicuadora agregarLicuadora = new EditarLicuadora(this);
        agregarLicuadora.setLocationRelativeTo(null);
        agregarLicuadora.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLicuadoraActionPerformed

    private void btnPlanchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanchaActionPerformed
        EditarPlancha agregarPlancha = new EditarPlancha(this);
        agregarPlancha.setLocationRelativeTo(null);
        agregarPlancha.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPlanchaActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarElectrodomesticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarElectrodomesticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarElectrodomesticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarElectrodomesticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarElectrodomesticos().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLicuadora;
    private javax.swing.JButton btnPlancha;
    private javax.swing.JButton btnWaflera;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstElectro;
    // End of variables declaration//GEN-END:variables
}
