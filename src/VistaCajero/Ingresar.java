/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VistaCajero;

import Funciones.clsBD_Conexion;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yael
 */
public class Ingresar extends javax.swing.JPanel {

    /**
     * Creates new form Ingresar
     */
    public Ingresar() {
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

        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txtTarjeta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNip = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txtCorreo1 = new javax.swing.JTextField();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Nuevos usuarios");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jButton4.setBackground(new java.awt.Color(204, 204, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        txtTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTarjetaActionPerformed(evt);
            }
        });
        jPanel4.add(txtTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 190, -1));

        jLabel5.setText("Nombre");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jLabel6.setText("Numero de tarjeta");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel4.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 190, -1));

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel4.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 190, -1));

        jLabel7.setText("Apellido");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jLabel8.setText("Tipo de identificacion");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, 190, 20));

        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("*Nota: Las tarjetas solo pueden tener 16 digitos y el nip 4 solamente");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        txtSaldo.setText("1");
        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });
        jPanel4.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 190, -1));

        jLabel10.setText("Correo");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jLabel12.setText("Saldo(Opcional)");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });
        jPanel4.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 190, -1));

        jLabel14.setText("Nip");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 190, 20));

        txtNip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNipActionPerformed(evt);
            }
        });
        jPanel4.add(txtNip, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 190, -1));

        jButton5.setBackground(new java.awt.Color(0, 153, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setText("Crear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        jButton6.setBackground(new java.awt.Color(204, 0, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        txtCorreo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreo1ActionPerformed(evt);
            }
        });
        jPanel4.add(txtCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTarjetaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoActionPerformed

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionActionPerformed

    private void txtNipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNipActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
// Validar que todos los campos estén llenos
    if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtCorreo1.getText().isEmpty() ||
        txtIdentificacion.getText().isEmpty() || txtTarjeta.getText().isEmpty() || txtNip.getText().isEmpty() || txtSaldo.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos deben ser llenados", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Validar que txtTarjeta contenga un número de 16 dígitos
    if (!txtTarjeta.getText().matches("\\d{16}")) {
        JOptionPane.showMessageDialog(this, "El número de tarjeta debe contener exactamente 16 dígitos", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que txtSaldo contenga un número válido
    try {
        double saldo = Double.parseDouble(txtSaldo.getText());
        if (saldo <= 0) {
            JOptionPane.showMessageDialog(this, "El saldo no puede ser negativo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El saldo debe ser un número válido", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Confirmación de cancelación de la operación
    int confirmation = JOptionPane.showConfirmDialog(this, "¿Está seguro de cancelar la operación?", "Confirmación", JOptionPane.YES_NO_OPTION);

    if (confirmation == JOptionPane.YES_OPTION) {
        // Conectar a la base de datos
        clsBD_Conexion conexion = new clsBD_Conexion();
        try {
            conexion.conectarBD();

            // Eliminar el cliente de la tabla 'cliente'
            String deleteClienteQuery = "DELETE FROM cliente WHERE correo = ?"; // Se usa correo para identificar al cliente
            PreparedStatement pstDeleteCliente = conexion.getConexion().prepareStatement(deleteClienteQuery);
            pstDeleteCliente.setString(1, txtCorreo1.getText());
            int filasCliente = pstDeleteCliente.executeUpdate();

            if (filasCliente > 0) {
                // Eliminar la tarjeta asociada de la tabla 'tarjeta'
                String deleteTarjetaQuery = "DELETE FROM tarjeta WHERE numero_tarjeta = ?";
                PreparedStatement pstDeleteTarjeta = conexion.getConexion().prepareStatement(deleteTarjetaQuery);
                pstDeleteTarjeta.setLong(1, Long.parseLong(txtTarjeta.getText()));
                pstDeleteTarjeta.executeUpdate();

                JOptionPane.showMessageDialog(this, "Datos eliminados exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el cliente para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al intentar eliminar los datos de la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtCorreo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreo1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
                                                  
    // Validar que todos los campos estén llenos
    if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtCorreo1.getText().isEmpty() ||
        txtIdentificacion.getText().isEmpty() || txtTarjeta.getText().isEmpty() || txtNip.getText().isEmpty() || txtSaldo.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos deben ser llenados", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Validar que txtTarjeta contenga un número de 16 dígitos
    if (!txtTarjeta.getText().matches("\\d{16}")) {
        JOptionPane.showMessageDialog(this, "El número de tarjeta debe contener exactamente 16 dígitos", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que txtSaldo contenga un número válido
    try {
        double saldo = Double.parseDouble(txtSaldo.getText());
        if (saldo <= 0) {
            JOptionPane.showMessageDialog(this, "El saldo no puede ser negativo", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El saldo debe ser un número válido", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Conectar a la base de datos
    clsBD_Conexion conexion = new clsBD_Conexion();
        try {
            conexion.conectarBD();
        } catch (SQLException ex) {
            Logger.getLogger(Ingresar.class.getName()).log(Level.SEVERE, null, ex);
        }

    try {
        // Insertar una nueva tarjeta
        String insertTarjetaQuery = "INSERT INTO tarjeta (numero_tarjeta, clave_tarjeta) VALUES (?, ?)";
        PreparedStatement pstInsertTarjeta = conexion.getConexion().prepareStatement(insertTarjetaQuery);
        long numeroTarjeta = Long.parseLong(txtTarjeta.getText());
        int nip = Integer.parseInt(txtNip.getText());  // Suponiendo que el NIP es un número entero
        pstInsertTarjeta.setLong(1, numeroTarjeta);
        pstInsertTarjeta.setInt(2, nip);
        int filasTarjeta = pstInsertTarjeta.executeUpdate();

        if (filasTarjeta > 0) {
            // Obtener el ID de la tarjeta insertada
            String getTarjetaIdQuery = "SELECT idtarjeta FROM tarjeta WHERE numero_tarjeta = ?";
            PreparedStatement pstGetTarjetaId = conexion.getConexion().prepareStatement(getTarjetaIdQuery);
            pstGetTarjetaId.setLong(1, numeroTarjeta);
            ResultSet rsTarjetaId = pstGetTarjetaId.executeQuery();

            if (rsTarjetaId.next()) {
                int tarjetaId = rsTarjetaId.getInt("idtarjeta");

                // Insertar el cliente con los datos proporcionados
                String insertClienteQuery = "INSERT INTO cliente (nombre, apellido, correo, tipo_identificacion, saldo, tarjeta_id) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement pstInsertCliente = conexion.getConexion().prepareStatement(insertClienteQuery);
                pstInsertCliente.setString(1, txtNombre.getText());
                pstInsertCliente.setString(2, txtApellido.getText());
                pstInsertCliente.setString(3, txtCorreo1.getText());
                pstInsertCliente.setString(4, txtIdentificacion.getText());
                pstInsertCliente.setDouble(5, Double.parseDouble(txtSaldo.getText()));
                pstInsertCliente.setInt(6, tarjetaId);

                int filasCliente = pstInsertCliente.executeUpdate();
                if (filasCliente > 0) {
                    JOptionPane.showMessageDialog(this, "Cliente agregado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo agregar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo insertar la tarjeta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error de conexión con la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
txtNombre.setText("");
        txtApellido.setText("");
        txtCorreo1.setText("");
        txtIdentificacion.setText("");
        txtTarjeta.setText("");
        txtNip.setText("");
        txtSaldo.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo1;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNip;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtTarjeta;
    // End of variables declaration//GEN-END:variables
}