/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package VistaCajero;

import Funciones.clsBD_Conexion;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author yael
 */
public class Clientes extends javax.swing.JPanel {
private DefaultTableModel modeloTabla;
    /**
     * Creates new form Clientes
     */
    public Clientes() {
        initComponents();
          modeloTabla = new DefaultTableModel(new String[]{
            "ID Cliente", "Nombre", "Apellido", "Correo", "Tipo Identificación", "Saldo", "ID Tarjeta"}, 0);
        tblCliente.setModel(modeloTabla); // Asociar el modelo a la tabla
        cargarClientes(); // Cargar los datos desde la base de datos
    }
 private void cargarClientes() {
        // Limpiar el modelo antes de cargar nuevos datos
        modeloTabla.setRowCount(0);

        // Conexión a la base de datos
        clsBD_Conexion conexion = new clsBD_Conexion();
        try {
            conexion.conectarBD(); // Establecer conexión

            // Consulta SQL para obtener los datos de la tabla cliente
            String query = "SELECT idcliente, nombre, apellido, correo, tipo_identificacion, saldo, tarjeta_id FROM cliente";
            PreparedStatement pst = conexion.getConexion().prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            // Recorrer los resultados y agregarlos a la tabla
            while (rs.next()) {
                int idCliente = rs.getInt("idcliente");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String correo = rs.getString("correo");
                String tipoIdentificacion = rs.getString("tipo_identificacion");
                double saldo = rs.getDouble("saldo");
                int idTarjeta = rs.getInt("tarjeta_id");

                // Agregar fila al modelo
                modeloTabla.addRow(new Object[]{
                    idCliente, nombre, apellido, correo, tipoIdentificacion, saldo, idTarjeta
                });
            }

            // Cerrar recursos
            rs.close();
            pst.close();
            conexion.desconectarBD();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar clientes: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
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
        tblCliente = new javax.swing.JTable();
        label = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Clientes registrados ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id_cliente", "Nombre", "Apellido", "Correo", "NoIdentificacion", "TipoDeIdentificacion"
            }
        ));
        jScrollPane1.setViewportView(tblCliente);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 550, 220));
        jPanel2.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 170, 30));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private javax.swing.JTable tblCliente;
    // End of variables declaration//GEN-END:variables
}