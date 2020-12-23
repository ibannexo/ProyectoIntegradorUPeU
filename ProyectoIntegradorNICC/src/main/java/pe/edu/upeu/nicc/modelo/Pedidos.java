package pe.edu.upeu.nicc.modelo;

public class Pedidos {
	
	public String pedidoId;
	public String fechaDelPedido;
    public String ProductosId;
    public String DescripPedido;
    public double Cantidad;
    public double PrecioUnit;
    public double PrecioTotal;
	public String horaDeEntrega;
	public String estado;
	
    public String getPedidosId() {
        return pedidoId;
    }
    public void setPedidoId(String pedidoId) {
        this.pedidoId = pedidoId;
    }
	
	    public String getFechaDelPedido() {
        return fechaDelPedido;
    }
    public void setFechaDelPedido(String fechaDelPedido) {
        this.fechaDelPedido = fechaDelPedido;
    }
		
    public String getProductosId() {
        return ProductosId;
    }
    public void setProductosId(String ProductosId) {
        this.ProductosId = ProductosId;
    }

    public String getDescripPedido() {
        return DescripPedido;
    }
    public void setDescripPedido(String DescripPedido) {
        this.DescripPedido = DescripPedido;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecioUnit() {
        return PrecioUnit;
    }

    public void setPrecioUnit(double PrecioUnit) {
        this.PrecioUnit = PrecioUnit;
    }

    public double getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(double PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }
	    public String getHoraDeEntrega() {
        return horaDeEntrega;
    }
    public void setHoraDeEntrega(String horaDeEntrega) {
        this.horaDeEntrega = horaDeEntrega;
    }
	public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}