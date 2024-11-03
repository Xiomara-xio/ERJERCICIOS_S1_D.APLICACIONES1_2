/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Boleta;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.mycompany.trabajo_1apli.Descuento;

/**
 *
 * @author DELL
 */
public class Pagos extends javax.swing.JFrame {

    Descuento Descuento = new Descuento();

    public Pagos() {
        initComponents();
    }

    private void formulario() {
        setTitle("Boleta de Pago");
        setLayout(null); // Layout absoluto para manejar las posiciones manualmente

        // Creación de etiquetas
        JLabel labelSueldoBasico = new JLabel("Sueldo Básico:");
        JLabel labelTotalVendido = new JLabel("Total Vendido:");
        JLabel labelDescuento = new JLabel("Descuento (%):");

        // Campo de texto donde se mostrará el resultado
        JLabel resultado = new JLabel();

        // Crear los campos de texto con los nombres solicitados
        JTextField txtN1 = new JTextField();
        JTextField txtN3 = new JTextField();

        // Botón con el nombre "neto" para calcular el sueldo neto
        JButton neto = new JButton("Calcular Sueldo Neto");

        // Posicionar componentes con setBounds
        labelSueldoBasico.setBounds(50, 30, 100, 30);
        txtN1.setBounds(160, 30, 150, 30);

        labelTotalVendido.setBounds(50, 70, 100, 30);
        txtN3.setBounds(160, 70, 150, 30);

        labelDescuento.setBounds(50, 110, 100, 30);

        neto.setBounds(100, 160, 180, 30); // Posicionando el botón

        resultado.setBounds(50, 200, 300, 60);

        // Añadir los componentes al JFrame
        add(labelSueldoBasico);
        add(txtN1);
        add(labelTotalVendido);
        add(txtN3);
        add(labelDescuento);
        add(neto);
        add(resultado);

        // Configurar el tamaño del JFrame
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        neto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        txtN1 = new javax.swing.JTextField();
        sueldo = new javax.swing.JLabel();
        txtN3 = new javax.swing.JTextField();
        VENTAS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        neto.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        neto.setForeground(new java.awt.Color(255, 102, 255));
        neto.setText("CALCULAR SUELDO NETO");
        neto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 255));
        jLabel1.setText("          BOLETA DE PAGO");

        txtN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtN1ActionPerformed(evt);
            }
        });

        sueldo.setBackground(new java.awt.Color(255, 153, 255));
        sueldo.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        sueldo.setForeground(new java.awt.Color(102, 0, 102));
        sueldo.setText("SUELDO MIN");

        txtN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtN3ActionPerformed(evt);
            }
        });

        VENTAS.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        VENTAS.setForeground(new java.awt.Color(102, 0, 102));
        VENTAS.setText("VENTAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(VENTAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtN3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 159, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(neto, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VENTAS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(neto)
                .addGap(29, 29, 29)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void netoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netoActionPerformed
      // Evento del botón "neto"
    neto.addActionListener(e -> {
        try {
            // Obtener el valor del sueldo básico
            double sueldoBasico = Double.parseDouble(txtN1.getText());

            // Obtener el valor del importe total vendido en el mes
            double totalVendido = Double.parseDouble(txtN3.getText());

            // Calcular la comisión (5% del total vendido)
            double comision = totalVendido * 0.05;

            // Calcular sueldo bruto
            double sueldoBruto = sueldoBasico + comision;

            // Calcular el descuento (15% del sueldo bruto)
            double descuento = sueldoBruto * 0.15;

            // Calcular sueldo neto
            double sueldoNeto = sueldoBruto - descuento;

            // Crear el formato de la boleta
            String boleta = "-----------------------------\n" +
            "    Boleta de Pago del Vendedor\n" +
            "-----------------------------\n" +
            "Sueldo Básico: S/. " + sueldoBasico + "\n" +
            "Comisión (5%): S/. " + comision + "\n" +
            "Sueldo Bruto:  S/. " + sueldoBruto + "\n" +
            "Descuento (15%): S/. " + descuento + "\n" +
            "Sueldo Neto:   S/. " + sueldoNeto + "\n" +
            "-----------------------------\n";

            // Mostrar la boleta en el JTextArea
            resultado.setText(boleta);

            // Mostrar una ventana emergente con la boleta
            JOptionPane.showMessageDialog(null, boleta, "Boleta de Pago", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            // Mostrar un mensaje de error si la entrada es inválida
            resultado.setText("Por favor, ingresa valores válidos.");
        }
    });
    }//GEN-LAST:event_netoActionPerformed

    private void txtN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtN1ActionPerformed
    }//GEN-LAST:event_txtN1ActionPerformed

    private void txtN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtN3ActionPerformed
    }//GEN-LAST:event_txtN3ActionPerformed

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
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VENTAS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton neto;
    private javax.swing.JLabel resultado;
    private javax.swing.JLabel sueldo;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN3;
    // End of variables declaration//GEN-END:variables
}
