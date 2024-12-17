/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VistaCajero;

import Funciones.clsBD_Conexion;
import Vista.Login;
import java.awt.Desktop;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
import javax.mail.PasswordAuthentication;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.util.ByteArrayDataSource;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 *
 * @author yael
 */
public class Retirar extends javax.swing.JPanel {

    /**
     * Creates new form Retirar
     */
    public Retirar() {
        initComponents();
        label.setText(obtenerFechaActual());
    }
    public String obtenerFechaActual() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    return sdf.format(new Date());
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Retirar");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Enter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 204, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel2.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 190, -1));

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 190, -1));

        jLabel6.setText("Cantidad ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        jLabel7.setText("Descripcion");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("*Nota: Solo se puede retirar acuentas BBVA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jButton4.setBackground(new java.awt.Color(0, 102, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Comprobante");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 190, -1));

        jLabel8.setText("Correo");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));
        jPanel2.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 190, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 // Validar que los campos necesarios estén llenos
    if (txtCantidad.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe especificar la cantidad", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        // Convertir y validar la cantidad
        double cantidad = Double.parseDouble(txtCantidad.getText());
        String numeroTarjeta = Login.getNumeroTarjetaLogueada();

        // Validar que el número de tarjeta no esté vacío
        if (numeroTarjeta == null || numeroTarjeta.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se ha detectado ningún número de tarjeta", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validar que la cantidad sea mayor a cero
        if (cantidad <= 0) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Conexión a la base de datos
        clsBD_Conexion conexion = new clsBD_Conexion();
        conexion.conectarBD();

        // Obtener el ID del último movimiento de tipo 'RETIRO' con la cantidad especificada
        String checkMovQuery = "SELECT idmovimiento FROM movimiento WHERE numero_tarjeta = ? AND tipo_movimiento = 'RETIRO' AND saldo = ? ORDER BY fecha DESC LIMIT 1";
        PreparedStatement pstCheckMov = conexion.getConexion().prepareStatement(checkMovQuery);
        pstCheckMov.setLong(1, Long.parseLong(numeroTarjeta));
        pstCheckMov.setDouble(2, cantidad);
        ResultSet rsMov = pstCheckMov.executeQuery();

        // Verificar si se encontró un movimiento
        if (rsMov.next()) {
            int idMovimiento = rsMov.getInt("idmovimiento");

            // Revertir el saldo en la tabla cliente (sumar la cantidad retirada)
            String updateSaldoQuery = "UPDATE cliente SET saldo = saldo + ? WHERE tarjeta_id = (SELECT idtarjeta FROM tarjeta WHERE numero_tarjeta = ?)";
            PreparedStatement pstUpdateSaldo = conexion.getConexion().prepareStatement(updateSaldoQuery);
            pstUpdateSaldo.setDouble(1, cantidad);
            pstUpdateSaldo.setLong(2, Long.parseLong(numeroTarjeta));
            pstUpdateSaldo.executeUpdate();

            // Eliminar el movimiento de la tabla de movimiento
            String deleteMovQuery = "DELETE FROM movimiento WHERE idmovimiento = ?";
            PreparedStatement pstDeleteMov = conexion.getConexion().prepareStatement(deleteMovQuery);
            pstDeleteMov.setInt(1, idMovimiento);
            pstDeleteMov.executeUpdate();

            // Confirmación al usuario
            JOptionPane.showMessageDialog(this, "Retiro cancelado ", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Mensaje si no se encuentra un movimiento correspondiente
            JOptionPane.showMessageDialog(this, "No se encontró un retiro correspondiente para cancelar", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException e) {
        // Validación de la cantidad como número
        JOptionPane.showMessageDialog(this, "La cantidad debe ser un número válido", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        // Manejo de excepciones de la base de datos
        JOptionPane.showMessageDialog(this, "Error en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    txtCantidad.setText("");
    txtDescripcion.setText("");
    txtCorreo.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        generarPDF();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 // Validar los campos
    if (txtCantidad.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debe especificar la cantidad a retirar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        return;
    }

    try {
        // Validar que la cantidad sea un número válido con una expresión regular
        if (!txtCantidad.getText().matches("\\d+(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtener la cantidad ingresada
        double cantidad = Double.parseDouble(txtCantidad.getText());
        String numeroTarjeta = Login.getNumeroTarjetaLogueada(); // Obtener el número de tarjeta de la sesión actual

        // Validar número de tarjeta
        if (numeroTarjeta == null || numeroTarjeta.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se pudo recuperar el número de tarjeta.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (cantidad <= 0) {
            JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        clsBD_Conexion conexion = new clsBD_Conexion();
        conexion.conectarBD();

        // Verificar si la tarjeta tiene suficiente saldo
        String checkSaldoQuery = "SELECT saldo FROM cliente WHERE tarjeta_id = (SELECT idtarjeta FROM tarjeta WHERE numero_tarjeta = ?)";
        PreparedStatement pstCheckSaldo = conexion.getConexion().prepareStatement(checkSaldoQuery);
        pstCheckSaldo.setLong(1, Long.parseLong(numeroTarjeta));
        ResultSet rsSaldo = pstCheckSaldo.executeQuery();

        if (rsSaldo.next()) {
            double saldoActual = rsSaldo.getDouble("saldo");

            if (saldoActual < cantidad) {
                JOptionPane.showMessageDialog(this, "Saldo insuficiente para realizar el retiro", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró la tarjeta especificada", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Generar nuevo ID para movimientos (se utiliza AUTO_INCREMENT, no es necesario hacerlo manualmente)
        // Se omite la generación manual del ID y se deja que la base de datos lo maneje automáticamente

        // Registrar el movimiento de retiro
        String insertMovimientoQuery = "INSERT INTO movimiento (fecha, numero_tarjeta, tipo_movimiento, saldo) VALUES (NOW(), ?, 'RETIRO', ?)";
        PreparedStatement pstInsertMov = conexion.getConexion().prepareStatement(insertMovimientoQuery);
        pstInsertMov.setLong(1, Long.parseLong(numeroTarjeta));
        pstInsertMov.setDouble(2, cantidad);
        int filasMovimientos = pstInsertMov.executeUpdate();

        if (filasMovimientos > 0) {
            // Actualizar el saldo de la tarjeta restando la cantidad
            String updateSaldoQuery = "UPDATE cliente SET saldo = saldo - ? WHERE tarjeta_id = (SELECT idtarjeta FROM tarjeta WHERE numero_tarjeta = ?)";
            PreparedStatement pstUpdateSaldo = conexion.getConexion().prepareStatement(updateSaldoQuery);
            pstUpdateSaldo.setDouble(1, cantidad);
            pstUpdateSaldo.setLong(2, Long.parseLong(numeroTarjeta));
            int filasSaldo = pstUpdateSaldo.executeUpdate();

            if (filasSaldo > 0) {
                JOptionPane.showMessageDialog(this, "Retiro realizado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo actualizar el saldo de la tarjeta.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo registrar el movimiento en la base de datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "La cantidad debe ser un número válido", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton2ActionPerformed
private void generarPDF() {
    // Validar que los campos no estén vacíos
    if (txtCantidad.getText().trim().isEmpty() || txtDescripcion.getText().trim().isEmpty() || txtCorreo.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(this),
                "Por favor, complete todos los campos antes de generar el comprobante.");
        return;
    }

    // Crear un documento con tamaño de ticket (80mm x 200mm aprox.)
    Document documento = new Document(new Rectangle(226, 567)); // Dimensiones en puntos (1 pulgada = 72 puntos)
    String ruta = "ticket_retiro.pdf";

    try {
        // Configurar el escritor para el PDF
        PdfWriter.getInstance(documento, new FileOutputStream(ruta));

        // Abrir el documento
        documento.open();

        // Agregar una imagen al inicio
        try {
            // Obtener la imagen desde el paquete usando una ruta relativa
            Image imagen = Image.getInstance(getClass().getResource("/Imagenes/Logo.png"));
            imagen.setAlignment(Image.ALIGN_CENTER);
            imagen.scaleToFit(100, 100); // Escalar imagen al tamaño deseado
            documento.add(imagen);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(this),
                    "Error al cargar la imagen: " + e.getMessage());
        }

        // Agregar contenido al PDF con formato de ticket
        Font fontTitulo = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
        Font fontNormal = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL);
        Font fontDetalle = new Font(Font.FontFamily.COURIER, 8, Font.NORMAL);

        Paragraph titulo = new Paragraph("\n--- COMPROBANTE DE RETIRO ---\n", fontTitulo);
        titulo.setAlignment(Element.ALIGN_CENTER);
        documento.add(titulo);

        documento.add(new Paragraph("\n-------------------------------------", fontDetalle));
        documento.add(new Paragraph("Cantidad: \n$ " + txtCantidad.getText(), fontNormal));
        documento.add(new Paragraph("Descripción: \n" + txtDescripcion.getText(), fontNormal));
        documento.add(new Paragraph("Correo: \n" + txtCorreo.getText(), fontNormal));
        documento.add(new Paragraph("-------------------------------------\n", fontDetalle));

        Paragraph mensaje = new Paragraph("Gracias por su confianza.\n", fontNormal);
        mensaje.setAlignment(Element.ALIGN_CENTER);
        documento.add(mensaje);

        documento.add(new Paragraph("\nFecha: " + java.time.LocalDateTime.now(), fontDetalle));

        // Mostrar mensaje de confirmación
        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(this),
                "PDF generado con éxito en: " + ruta);

        // Abrir el archivo PDF automáticamente
        try {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(new File(ruta));
            } else {
                JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(this),
                        "No se pudo abrir el archivo automáticamente. Revise: " + ruta);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(this),
                    "Error al abrir el archivo: " + e.getMessage());
        }

    } catch (DocumentException | IOException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(this),
                "Error al generar el PDF: " + ex.getMessage());
    } finally {
        // Cerrar el documento correctamente
        if (documento.isOpen()) {
            documento.close();
        }
    }
}




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}