package modelo;

import javax.swing.JOptionPane;

public class Ingreso_puntos extends javax.swing.JFrame {

    public Ingreso_puntos() {
        initComponents();
    }

    String puntos = "";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jToolBar1 = new javax.swing.JToolBar();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        text1 = new javax.swing.JLabel();
        opcion = new javax.swing.JComboBox<>();
        salir = new javax.swing.JButton();
        continuar = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        text1.setText("Cantidad de puntos a ingresar:");

        opcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "3", "4" }));

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        continuar.setText("Continuar");
        continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuarMouseClicked(evt);
            }
        });
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(opcion, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(continuar)
                        .addGap(18, 18, 18)
                        .addComponent(salir)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opcion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(158, 158, 158)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir)
                    .addComponent(continuar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
         if(opcion.getSelectedIndex()== 3){
            pedir_3P p3p = new pedir_3P();
            p3p.setVisible(true);
            p3p.setTitle("Ingrese Triangulo");
        }else if(opcion.getSelectedIndex() == 4){
            pedir_4P p4p = new pedir_4P();
            p4p.setVisible(true);
            p4p.setTitle("Ingrese Cuadrilatero");
        }
    }//GEN-LAST:event_continuarActionPerformed

    private void continuarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuarMouseClicked
       
    }//GEN-LAST:event_continuarMouseClicked

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continuar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox<String> opcion;
    private javax.swing.JButton salir;
    private javax.swing.JLabel text1;
    // End of variables declaration//GEN-END:variables
}
