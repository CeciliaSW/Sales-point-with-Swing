package Negocio;
import Modelos.Producto;
import java.util.List;
import java.util.ArrayList;
public class NegocioProducto {
    
    public static List<Producto> lstProductos = new ArrayList<>(); //Va a ser la misma siempre, no se volverá a instanciar.
    
    public NegocioProducto(){}
    
    //Altas, bajas, reglas básicas de negocio.
    public boolean altaProducto(Producto p){
      if(p.getNombreProducto().isEmpty())
      {
        return false;
      }
      else
      {
        lstProductos.add(p);
        return true;
      }
    }
    
    public boolean bajaProducto(Producto p) {
      try{
      lstProductos.remove(p.getIdProducto() -1);
      return true;
      } catch (Exception e){
          return false;
      }
    }
}
