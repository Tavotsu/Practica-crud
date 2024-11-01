public class Producto {

    //Atributos id, nombre y precio
    private int idProducto;
    private String nombreProducto;
    private double precioProducto;

    //Constructor 
    public Producto(int id, String nombre, double precio){
        this.idProducto = id;
        this.nombreProducto = nombre;
        this.precioProducto = precio;
    }

    //Get (Obtener) Accesadores
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    //Set (Cambiar actualizar) Mutador

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
    //TS
    @Override
    public String toString() {
        
        return "Id producto: " + idProducto + "\n Nombre producto: " +nombreProducto + "\n Precio producto: " +precioProducto;
    }    
}