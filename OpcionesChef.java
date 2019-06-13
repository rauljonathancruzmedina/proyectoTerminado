package principal;

import alimentos.AlimentosCod;
import alimentos.OpcionesAl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import principal.conectar;

/**
 *
 * @author John
 */
public class OpcionesChef {

    static conectar cc = new conectar();
    static Connection cn = cc.conexion();
    static PreparedStatement ps;
    //------------------------------------------------------------------------------
    //------------------------------------------------------------------------------   

    public static int registrar(chefCod uc) {
        int rsu = 0;
        String sql = chefCod.REGISTRAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getPrimaryKey());
            ps.setString(2, uc.getTipoal());
            ps.setString(3, uc.getNombre());
            ps.setString(4, uc.getCantidad());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }
    //------------------------------------------------------------------------------
    //------------------------------------------------------------------------------   

    public static int actualizar(chefCod uc) {
        int rsu = 0;
        String sql = chefCod.ACTUALIZAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getTipoal());
            ps.setString(2, uc.getNombre());
            ps.setString(3, uc.getCantidad());
            ps.setString(4, uc.getPrimaryKey());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }
    //------------------------------------------------------------------------------
    //------------------------------------------------------------------------------   

    public static int eliminar(String id) {
        int rsu = 0;
        String sql = chefCod.ELIMINAR;

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, id);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }
    //------------------------------------------------------------------------------
    //------------------------------------------------------------------------------   

    public static int eliminaTodos() {
        int rsu = 0;
        String sql = chefCod.ELIMINAR_TODO;
        try {
            ps = cn.prepareStatement(sql);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }

    //------------------------------------------------------------------------------
    //------------------------------------------------------------------------------   
    
    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) principal.chef.tablaChef.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = AlimentosCod.LISTAR;
        } else {
            sql = "SELECT * FROM chef WHERE (numero like'" + busca + "%' or nombre like'" + busca + "%') "
                    + " ORDER BY nombre";
        }
        String datos[] = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("numero");
                datos[1] = rs.getString("tipo");
                datos[2] = rs.getString("nombre");
                datos[3] = rs.getString("cantidad");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OpcionesChef.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //------------------------------------------------------------------------------
    //------------------------------------------------------------------------------   
    public static void listar1(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) principal.chef.tablaChef.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = AlimentosCod.LISTAR;
        } else {
            sql = "SELECT * FROM chef WHERE (numero like'" + busca + "%' or nombre like'" + busca + "%') "
                    + "or tipo ='" + busca + "' ORDER BY nombre";
        }
        String datos[] = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("numero");
                datos[1] = rs.getString("tipo");
                datos[2] = rs.getString("nombre");
                datos[3] = rs.getString("cantidad");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void listar2(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) principal.chef.tablaChef.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = AlimentosCod.LISTAR;
        } else {
            sql = "SELECT * FROM chef WHERE (chef like'" + busca + "%' or nombre like'" + busca + "%') "
                    + "or tipo='" + busca + "' ORDER BY nombre";
        }
        String datos[] = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("numero");
                datos[1] = rs.getString("tipo");
                datos[2] = rs.getString("nombre");
                datos[3] = rs.getString("cantidad");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static boolean isNumber(String n) {
        try {
            if (Integer.parseInt(n) > 0) {
                return true;
            } else {
                return false;
            }
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
}
