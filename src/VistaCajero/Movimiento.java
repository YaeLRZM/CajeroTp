/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VistaCajero;

import Funciones.clsBD_Conexion;
import Vista.Login;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author yael
 */
public class Movimiento extends javax.swing.JPanel {
   private DefaultTableModel modeloTabla; // Modelo de tabla
    
    /**
     * Creates new form Movimiento
     */
    public Movimiento() {
        initComponents();
        label.setText(obtenerFechaActual());
        modeloTabla = new DefaultTableModel(new String[]{"ID Movimiento", "Fecha", "No Tarjeta", "Tipo de Movimiento", "Saldo"}, 0);
        jTableMovimientos.setModel(modeloTabla); // Asociar el modelo a la tabla
    }

    public String obtenerFechaActual() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(new Date());
    }

    private void inicializarTabla(int mes) {
        // Inicializar el modelo de tabla con las columnas requeridas
        modeloTabla = new DefaultTableModel(new String[]{"ID Movimiento", "Fecha", "No Tarjeta", "Tipo de Movimiento", "Saldo"}, 0);
        jTableMovimientos.setModel(modeloTabla); // Asociar el modelo a la tabla
        // Cargar los movimientos por mes
        cargarMovimientosPorMes(mes);
    }

    private void filtrarPorMes(int mes) {
        // Verificar si el modelo de la tabla está inicializado
        if (modeloTabla == null) {
            JOptionPane.showMessageDialog(this, "El modelo de la tabla no está inicializado.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si el modelo no está inicializado
        }
        
        // Limpiar la tabla antes de mostrar los resultados filtrados
        modeloTabla.setRowCount(0);
        
        // Llamar al método para cargar los movimientos filtrados por mes
        cargarMovimientosPorMes(mes);
    }

private void cargarMovimientosPorMes(int mes) {
    // Conectar a la base de datos y obtener los movimientos filtrados
    try (clsBD_Conexion conexion = new clsBD_Conexion()) {  // Usar el nombre correcto de la clase
        conexion.conectarBD();  // Establecer la conexión

        // Obtener el número de tarjeta logueada
        String numeroTarjeta = Login.getNumeroTarjetaLogueada();  // Suponiendo que tienes este método para obtener el número de tarjeta

        // Verificar que el número de tarjeta no sea nulo o vacío
        if (numeroTarjeta == null || numeroTarjeta.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se ha detectado ningún número de tarjeta", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Consulta SQL para obtener los movimientos filtrados por mes
        String query = "SELECT idmovimiento, fecha, numero_tarjeta, tipo_movimiento, saldo " +
                       "FROM movimiento WHERE numero_tarjeta = ? AND MONTH(fecha) = ?";
        try (PreparedStatement pst = conexion.getConexion().prepareStatement(query)) {
            pst.setLong(1, Long.parseLong(numeroTarjeta));  // Seteamos el número de tarjeta
            pst.setInt(2, mes);  // Filtro por mes

            // Ejecutar la consulta y procesar los resultados
            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    Vector<Object> fila = new Vector<>();
                    fila.add(rs.getInt("idmovimiento"));  // ID del movimiento
                    fila.add(rs.getTimestamp("fecha"));  // Fecha del movimiento (usamos getTimestamp para obtener la fecha y hora completa)
                    fila.add(rs.getLong("numero_tarjeta"));  // Número de tarjeta
                    fila.add(rs.getString("tipo_movimiento"));  // Tipo de movimiento
                    fila.add(rs.getDouble("saldo"));  // Saldo
                    modeloTabla.addRow(fila);
                }
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar los movimientos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}

    private int obtenerNumeroMes(String mes) {
        switch (mes) {
            case "Enero": return 1;
            case "Febrero": return 2;
            case "Marzo": return 3;
            case "Abril": return 4;
            case "Mayo": return 5;
            case "Junio": return 6;
            case "Julio": return 7;
            case "Agosto": return 8;
            case "Septiembre": return 9;
            case "Octubre": return 10;
            case "Noviembre": return 11;
            case "Diciembre": return 12;
            default: return 0; // Mes inválido
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMovimientos = new javax.swing.JTable();
        label = new javax.swing.JLabel();
        txtMes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Movimiento");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jTableMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero de operacion", "Fecha", "Monto"
            }
        ));
        jScrollPane1.setViewportView(jTableMovimientos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 550, 220));
        jPanel2.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 170, 30));

        txtMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero ", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto ", "Septiembre ", "Octubre ", "Noviembre ", "Diciembre", " ", " " }));
        txtMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesActionPerformed(evt);
            }
        });
        jPanel2.add(txtMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("*Puedes revisar tus meses anteriores ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

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

    private void txtMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesActionPerformed
 // Obtener el mes seleccionado del JComboBox
        String mesSeleccionado = (String) txtMes.getSelectedItem();
        
        if (mesSeleccionado != null && !mesSeleccionado.trim().isEmpty()) {
            // Obtener el número del mes a partir del nombre del mes
            int numeroMes = obtenerNumeroMes(mesSeleccionado);

            // Si el mes seleccionado es válido, filtrar
            if (numeroMes > 0) {
                // Llamar al método filtrarPorMes con el número del mes
                filtrarPorMes(numeroMes);
            } else {
                // Mostrar mensaje de advertencia si el mes no es válido
                JOptionPane.showMessageDialog(this, "Por favor selecciona un mes válido.", "Mes no válido", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            // Si no se ha seleccionado un mes, mostrar advertencia
            JOptionPane.showMessageDialog(this, "Por favor selecciona un mes.", "Mes no seleccionado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtMesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMovimientos;
    private javax.swing.JLabel label;
    private javax.swing.JComboBox<String> txtMes;
    // End of variables declaration//GEN-END:variables
}
