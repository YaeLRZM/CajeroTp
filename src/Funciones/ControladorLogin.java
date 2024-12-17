package Funciones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorLogin {

    private clsBD_Conexion conexionBD;

    public ControladorLogin(clsBD_Conexion conexionBD) {
        this.conexionBD = conexionBD;
    }

    public boolean validarLogin(String numeroTarjeta, String claveTarjeta) {
        String query = "SELECT * FROM cajero.tarjeta WHERE numero_tarjeta = ? AND clave_tarjeta = ?";

        try {
            Connection conexion = conexionBD.getConexion();
            PreparedStatement stmt = conexion.prepareStatement(query);
            stmt.setString(1, numeroTarjeta);
            stmt.setString(2, claveTarjeta);

            ResultSet rs = stmt.executeQuery();
            return rs.next();  // Si existe el registro, el login es válido
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public String obtenerTipoUsuario(String numeroTarjeta) {
        String queryCliente = "SELECT 1 FROM cajero.cliente c JOIN cajero.tarjeta t ON c.tarjeta_id = t.idtarjeta WHERE t.numero_tarjeta = ?";
        String queryAdmin = "SELECT 1 FROM cajero.administrador a JOIN cajero.tarjeta t ON a.tarjeta_id = t.idtarjeta WHERE t.numero_tarjeta = ?";

        try {
            Connection conexion = conexionBD.getConexion();
            PreparedStatement stmtCliente = conexion.prepareStatement(queryCliente);
            PreparedStatement stmtAdmin = conexion.prepareStatement(queryAdmin);
            
            stmtCliente.setString(1, numeroTarjeta);
            stmtAdmin.setString(1, numeroTarjeta);

            // Si el número de tarjeta corresponde a un cliente
            if (stmtCliente.executeQuery().next()) {
                return "CLIENTE";
            }

            // Si el número de tarjeta corresponde a un administrador
            if (stmtAdmin.executeQuery().next()) {
                return "ADMINISTRADOR";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;  // Si no se encuentra el tipo de usuario
    }

public String[] obtenerDatosUsuario(String numeroTarjeta) {
    // Primero, intentamos obtener los datos del cliente
    String queryCliente = "SELECT c.nombre, c.apellido, c.saldo " +
                          "FROM cajero.cliente c " +
                          "JOIN cajero.tarjeta t ON c.tarjeta_id = t.idtarjeta " +
                          "WHERE t.numero_tarjeta = ?";

    String queryAdmin = "SELECT a.nombre, a.apellido " +
                        "FROM cajero.administrador a " +
                        "JOIN cajero.tarjeta t ON a.tarjeta_id = t.idtarjeta " +
                        "WHERE t.numero_tarjeta = ?";

    try {
        Connection conexion = conexionBD.getConexion();
        
        // Comprobamos si es un cliente
        PreparedStatement stmtCliente = conexion.prepareStatement(queryCliente);
        stmtCliente.setString(1, numeroTarjeta);
        ResultSet rsCliente = stmtCliente.executeQuery();
        if (rsCliente.next()) {
            String nombre = rsCliente.getString("nombre") + " " + rsCliente.getString("apellido");
            String saldo = rsCliente.getString("saldo");
            return new String[]{nombre, saldo, "CLIENTE"};  // Retornamos tipo de usuario
        }
        
        // Si no es un cliente, comprobamos si es un administrador
        PreparedStatement stmtAdmin = conexion.prepareStatement(queryAdmin);
        stmtAdmin.setString(1, numeroTarjeta);
        ResultSet rsAdmin = stmtAdmin.executeQuery();
        if (rsAdmin.next()) {
            String nombre = rsAdmin.getString("nombre") + " " + rsAdmin.getString("apellido");
            return new String[]{nombre, "ADMINISTRADOR"};  // No tiene saldo, solo nombre
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;  // Si no se encuentra el usuario
}

}
