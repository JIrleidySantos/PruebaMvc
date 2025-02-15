package ec.edu.espoch.practicamvc.vista;

import ec.edu.espoch.practicamvc.controlador.Controlador;

/**
 *
 * @author USUARIO
 */
public class Completas extends javax.swing.JFrame {

    private Controlador controlador;

    public void mostrarTareasCompletas(String[] datos) {
        String cadena = "";
        for (int i = 0; i < datos.length; i++) {
            cadena = cadena + datos[i];
            i++;
        }

    }

    public void error(String error) {
        txtCompletas.setText(error);
    }

    public Completas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCompletas = new javax.swing.JTextArea();
        lblDatos = new javax.swing.JLabel();
        btnMostrarCompleta = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuInicio = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCompletas.setColumns(20);
        txtCompletas.setRows(5);
        txtCompletas.setCaretColor(new java.awt.Color(0, 102, 0));
        txtCompletas.setDisabledTextColor(new java.awt.Color(0, 153, 153));
        txtCompletas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtCompletasAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(txtCompletas);

        lblDatos.setForeground(new java.awt.Color(0, 153, 153));
        lblDatos.setText("Tareas completadas");
        lblDatos.setBorder(new javax.swing.border.MatteBorder(null));
        lblDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnMostrarCompleta.setText("MOSTRAR TAREAS COMPLETAS");
        btnMostrarCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarCompletaActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        menuInicio.setText("Inicio");
        menuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioActionPerformed(evt);
            }
        });
        jMenu1.add(menuInicio);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(lblDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnMostrarCompleta)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnMostrarCompleta)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void txtCompletasAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtCompletasAncestorAdded
        // TODO add your handling code here:
        controlador.tareasCompletas();
    }//GEN-LAST:event_txtCompletasAncestorAdded

    private void menuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioActionPerformed
        Vista vis = new Vista();
        vis.setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_menuInicioActionPerformed

    private void btnMostrarCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarCompletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMostrarCompletaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarCompleta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDatos;
    private javax.swing.JMenuItem menuInicio;
    private javax.swing.JTextArea txtCompletas;
    // End of variables declaration//GEN-END:variables
}
