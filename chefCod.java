package principal;

/**
 *
 * @author John
 */
public class chefCod {

    public static String LISTAR = "SELECT * FROM chef ORDER BY tipo";
    
    public static String REGISTRAR = "INSERT INTO chef(numero, nombre, tipo, cantidad) "
            + "VALUES(?,?,?,?)";
    
    public static String ACTUALIZAR = "UPDATE chef SET "
                + "nombre=?, "
                + "tipo=?, "
                + "cantidad=? WHERE numero=?";
    
    public static String ELIMINAR = "DELETE FROM chef WHERE numero = ?";
    
    public static String ELIMINAR_TODO = "DELETE FROM chef";
    
    private String primaryKey;
    private String tipoal;
    private String nombre;
    private String cantidad;

    public chefCod(){
        
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getTipoal() {
        return tipoal;
    }

    public void setTipoal(String tipoal) {
        this.tipoal = tipoal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
