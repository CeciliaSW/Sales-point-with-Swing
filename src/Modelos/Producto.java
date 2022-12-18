package Modelos;
public class Producto {
    int idProducto;
    String códigoProducto;
    String nombreProducto;
    String descripciónProducto;
    int cantidadProducto;
    double precioUnitario;
    double precioMayoreo;
    String imagen;
    
    public Producto(){}
    
    public Producto(int idProducto, String códigoProducto, String nombreProducto, String descripciónProducto,int cantidadProducto, double precioUnitario, double precioMayoreo, String imagen) {
        this.idProducto = idProducto;
        this.códigoProducto = códigoProducto;
        this.nombreProducto = nombreProducto;
        this.descripciónProducto = descripciónProducto;
        this.cantidadProducto = cantidadProducto;
        this.precioUnitario = precioUnitario;
        this.precioMayoreo = precioMayoreo;
        this.imagen = imagen;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCódigoProducto() {
        return códigoProducto;
    }

    public void setCódigoProducto(String códigoProducto) {
        this.códigoProducto = códigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripciónProducto() {
        return descripciónProducto;
    }

    public void setDescripciónProducto(String descripciónProducto) {
        this.descripciónProducto = descripciónProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioMayoreo() {
        return precioMayoreo;
    }

    public void setPrecioMayoreo(double precioMayoreo) {
        this.precioMayoreo = precioMayoreo;
    }
    
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
