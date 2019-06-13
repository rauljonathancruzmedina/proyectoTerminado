package principal;

import java.sql.*;
import javax.swing.*;



public class conectar {

     Connection conect = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost/enramada", "root", ""); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión" + e);
        }
        return conect;
    }
}
/*
----------------------------ORACLE------------------------------
Connection conect = null;

    public Connection conexion() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conect = DriverManager.getConnection("jdbc:oracle:thin:@192.168.43.86:1521:XE", "SYSTEM", "javi"); 
        JOptionPane.showMessageDialog(null, "conectado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión" + e);
        }
        return conect;
    }  
*/