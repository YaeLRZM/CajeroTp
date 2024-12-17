package Funciones;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class clsBD_Conexion implements AutoCloseable {  // Implementar AutoCloseable
    private Connection connection;

    // Método para obtener el estado de la conexión
    public boolean getEstado() {
        try {
            return connection != null && !connection.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e);
            return false;
        }
    }

    public Connection getConexion() {
        return connection;
    }

    public void conectarBD() throws SQLException {
        // Aquí pones la URL, usuario y contraseña según tu base de datos
        String url = "jdbc:mysql://localhost:3306/cajero";
        String usuario = "root";
        String contrasena = "Y43l4gu5t1n";
        connection = DriverManager.getConnection(url, usuario, contrasena);
    }

    public void desconectarBD() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws SQLException {
        // Este método se llama automáticamente al final del try-with-resources
        desconectarBD();
    }
}

