package pe.edu.upeu.nicc.modelo;

public class Productos {
  public String NumProducto; 
  public String Producto;
  public double precioUnidad;
  public String CantDelProductoSeleccionado;
  public double CostoDelivey;
  
  public String getNumProducto() {
      return NumProducto;
  }
  public void setNumProducto(String NumProducto) {
      this.NumProducto = NumProducto;
  }
  public String getProducto() {
      return Producto;
  }
  public void setProducto(String Producto) {
      this.Producto = Producto;
  }
  public double getprecioUnidad() {
      return precioUnidad;
  }
  public void setprecioUnidad(double precioUnidad) {
      this.precioUnidad = precioUnidad;
  } 
    public String getCantDelProductoSeleccionado() {
      return CantDelProductoSeleccionado;
  }
  public void setCantDelProductoSeleccionado(String CantDelProductoSeleccionado) {
      this.CantDelProductoSeleccionado = CantDelProductoSeleccionado;
  }
  public double getCostoDelivey() {
      return CostoDelivey;
  }
  public void setCostoDelivey(double CostoDelivey) {
      this.CostoDelivey = CostoDelivey;
  } 
  
}