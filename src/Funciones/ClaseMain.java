package Funciones;

import java.sql.Connection;
import java.sql.SQLException;

public class ClaseMain {

    private static ClaseMain instance;
    private Connection connection;

    public static ClaseMain getInstance() {
        if (instance == null) {
            instance = new ClaseMain();
        }
        return instance;
    }

    private ClaseMain() {

    }

    public void connectToDatabase() throws SQLException {
        String server = "localhost";
        String port = "3306";
        String database = "cajero";
        String userName = "root";
        String password = "Y43l4gu5t1n";
        connection = java.sql.DriverManager.getConnection("jdbc:mysql://" + server + ":" + port + "/" + database, userName, password);
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public static void main(String[] args) {
        clsBD_Conexion objConectar = new clsBD_Conexion();
        try {
            objConectar.conectarBD();
            boolean status = objConectar.getEstado();
            String message = "Esto viene de la clase clsBD_Conexion, Estado: ";
            if (status) {
                System.out.println(message + "Activo");
            } else {
                System.out.println(message + "Inactivo!!");
            }
            if (objConectar.getEstado()) {
                System.out.println(status);
                System.out.println("Conectado");
            } else {
                System.out.println(status);
                System.out.println("Desconectado");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Error");
        }
    }
}
