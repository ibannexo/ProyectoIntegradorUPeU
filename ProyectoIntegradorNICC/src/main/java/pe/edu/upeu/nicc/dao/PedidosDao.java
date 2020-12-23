package pe.edu.upeu.nicc.dao;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.lang.reflect.Field;
import pe.edu.upeu.nicc.utils.LeerArchivo;
import pe.edu.upeu.nicc.utils.LeerTeclado;
import pe.edu.upeu.nicc.modelo.Pedidos;
import pe.edu.upeu.nicc.modelo.Productos;
import pe.edu.upeu.nicc.utils.UtilsX;

public class PedidosDao extends AppCrud{
	
	LeerArchivo leerArc;
	UtilsX util=new UtilsX();
	LeerTeclado teclado=new LeerTeclado();
	Pedidos pedTO;
	SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	SimpleDateFormat formateador2 = new SimpleDateFormat("dd-MM-yyyy");
	
	public String generadorId(LeerArchivo leerArcX, int numColumna, String prefijo){
		int idX=1;
		Object[][]data=listarContenido(leerArcX);
		if(data!=null){
			idX=Integer.parseInt(data[data.length-1][numColumna].toString().substring(1))+1;
			
		}
		return prefijo + "" + idX;
	}

	 public Object[][] AgregarProducto(){
	  leerArc=new LeerArchivo("Productos.txt");
      Productos ProTO=new Productos();	
      ProTO=new Productos();
      ProTO.setNumProducto(teclado.leer("", "Ingrese el Numero del Producto en Codigo:"));
      ProTO.setProducto(teclado.leer("", "Ingrese el producto que se pide:"));
      ProTO.setprecioUnidad(teclado.leer(0.0, "Ingrese el Precio Unitario:"));
	  ProTO.setCantDelProductoSeleccionado(teclado.leer("", "Ingrese la cantidad que se pidio del producto seleccionado:"));
	  ProTO.setCostoDelivey(teclado.leer(0.0, "Ingrese el costo de delivery:"));
	  return agregarContenido(leerArc, ProTO);
    }
	    public void imprimirRegistro(Object modelo){
        util.clearConsole();
        System.out.println("*************Registro Reciente***********");
        try {
            Field[] fields = (modelo).getClass().getDeclaredFields();
            for (Field field : fields) {
                System.out.println(field.getName()+"="+field.get(modelo));                
            }          
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
	
    public void NuevosPedidos(){
      System.out.println("**************** HACER UN NUEVO PEDIDO ****************");
	  leerArc=new LeerArchivo ("Productos.txt");
	  System.out.println("");
	  System.out.println("Cualquier pedido el costo es 3.00 la cual se le sumara al precio final");
	  System.out.println("");
	  System.out.println("");
	  Object[][] listaProductos=listarContenido(leerArc);
	 if(listaProductos!=null){
		  
	      for(int i=0;i<listaProductos.length;i++){
		  System.out.println(listaProductos[i][0] + " = " +listaProductos[i][1]+" ("+ listaProductos[i][2] + ") , ");	
	       }
	  System.out.println("");
	  System.out.println("");
	  pedTO=new Pedidos();
	  leerArc=new LeerArchivo("NuevosPedidos.txt");
	  pedTO.setPedidoId(generadorId(leerArc, 0, "p"));
	  
	  pedTO.setProductosId(teclado.leer("","Ingrese el codido del producto seleccionado:"));
	  pedTO.setDescripPedido(teclado.leer("","Ingrese descripcion del producto:"));
	  pedTO.setCantidad(teclado.leer(0.0,"cuantos productos de ese id desea:"));
	  pedTO.setHoraDeEntrega(teclado.leer("","Ingrese la hora de entrega que desea mayor a 20min:"));
	  pedTO.setEstado("NO");
	  leerArc=new LeerArchivo("Productos.txt");
	  listaProductos=buscarContenido(leerArc, 0, pedTO.getProductosId());
	  pedTO.setPrecioUnit(Double.parseDouble(listaProductos[0][2].toString()));
	  
	  pedTO.setFechaDelPedido(formateador.format(new Date()));
	  
	  pedTO.setPrecioTotal(pedTO.getCantidad()*pedTO.getPrecioUnit()+3);
	  leerArc=new LeerArchivo("NuevosPedidos.txt");
	  imprimirRegistro(pedTO);
	  String confirmar=teclado.leer("","Desea confirmar el pedido,S=SI,N=NO");
        if(confirmar.toUpperCase().charAt(0)=='S'){
            agregarContenido(leerArc, pedTO);
            util.clearConsole();
            System.out.println("El Pedido se registro correctamente!!");
        }else{
            confirmar=teclado.leer("S", "Desea nuevamente realizar el Pedio? S=Si, N=NO");
            if(confirmar.toUpperCase().charAt(0)=='S'){
                util.clearConsole();                
                NuevosPedidos();
            }
        }
        }else{ 
            AgregarProducto(); 
            util.clearConsole();
            NuevosPedidos();
        }       
	
    }
public void listarPedidos(){
	leerArc=new LeerArchivo("NuevosPedidos.txt");
	System.out.println("***************Reporte General de Pedidos*********");
	imprimirLista(listarContenido(leerArc));
}
public void reporteDePedidosDelDia(String fecha){
	leerArc=new LeerArchivo("NuevosPedidos.txt");
	System.out.println("*************Reporte Pedidos Diarios**************");
	Object [][] data=listarContenido(leerArc);
	int cantidadFilasFI=0;
	for (int fila=0;fila<data.length;fila++){
		String[] vectorFecha=data[fila][1].toString().split(" ");
		if(vectorFecha[0].equals(fecha)){
			cantidadFilasFI++;
		}
	}
	Object [][] dataDia=new Object[cantidadFilasFI][data[0].length];
	int filaX=0, columnaX=0;
	for (int fila=0;fila<data.length;fila++){
		String[] vectorFecha=data[fila][1].toString().split(" ");
		if(vectorFecha[0].equals(fecha)){
		for(int columna=0;columna<data[0].length;columna++){
			dataDia[filaX][columnaX]=data[fila][columna];	
			columnaX++;
		 }
		}
	filaX++; 
	columnaX=0;
	}  
	imprimirLista(dataDia);
}
public void reporteDePedidosDosFechasSeleccionadas(String fechaInicio, String fechaFin){
	leerArc=new LeerArchivo("NuevosPedidos.txt");
	System.out.println("*************Reporte Pedidos Diarios**************");
	Object [][] data=listarContenido(leerArc);
	int cantidadFilasFI=0;
	double cantidadPedidos=0, cantidadPlatos=0, montoRecaudado=0, montoContabilizado=0;
	try{
	for (int fila=0;fila<data.length;fila++){
		String[] vectorFecha=data[fila][1].toString().split(" ");
		Date fechaTemp=formateador2.parse(vectorFecha[0].toString());
		if((fechaTemp.after(formateador2.parse(fechaInicio)) && 
		fechaTemp.before(formateador2.parse(fechaFin))) || 
		vectorFecha[0].equals(fechaInicio) || 
		vectorFecha[0].equals(fechaFin) ){
			
			cantidadFilasFI++;
		}
	}
	Object [][] dataDia=new Object[cantidadFilasFI][data[0].length];
	int filaX=0, columnaX=0;
	for (int fila=0;fila<data.length;fila++){
		String[] vectorFecha=data[fila][1].toString().split(" ");
		Date fechaTemp=formateador2.parse(vectorFecha[0].toString());
		if((fechaTemp.after(formateador2.parse(fechaInicio)) && 
		fechaTemp.before(formateador2.parse(fechaFin))) || 
		vectorFecha[0].equals(fechaInicio) || 
		vectorFecha[0].equals(fechaFin) ){
			
		for(int columna=0;columna<data[0].length;columna++){
			dataDia[filaX][columnaX]=data[fila][columna];
			if(columna==4){cantidadPlatos+=Double.parseDouble(data[fila][columna].toString());}
			if(columna==6){montoRecaudado+=Double.parseDouble(data[fila][columna].toString());}
			if(columna==6 && data[fila][8].toString().equals("Si")){
				montoContabilizado+=Double.parseDouble(data[fila][columna].toString());
			}
			columnaX++;
		 }
		 filaX++; 
	     columnaX=0;
		 cantidadPedidos++;
		}
	} 	
	imprimirLista(dataDia);
	System.out.println("---------------------Resumen de opoeraciones -------------");
	System.out.println("cantidad de Pedidos:" + cantidadPedidos + "Cantidad de platos:"+ cantidadPlatos+ "Cantidad de monto recaudado:"+montoRecaudado + "monto total realizado:"+ montoContabilizado);
	System.out.println("----------------------------------------------------------");
} catch (Exception e) {
            System.out.println("Error:"+e.getMessage());;
        }
}
public Object[][] modificarRegistroDelProducto(){
	leerArc=new LeerArchivo("Productos.txt");
	imprimirLista(listarContenido(leerArc));
	System.out.println("--------------------------Modificar Producto------------------");
	String dato=teclado.leer("", "Ingrese el id del producto");
	Productos modelo=new Productos();
	modelo.setProducto(teclado.leer("", "Ingrese nuevo nombre del producto:"));
	modelo.setprecioUnidad(teclado.leer(0.0, "Ingrese nuevo costo del producto:"));
	Object[][] data=editarRegistro(leerArc, 0, dato, modelo);
	util.clearConsole();
	return data;
}
public Object[][] modificarEstado(){
	leerArc=new LeerArchivo("NuevosPedidos.txt");
	System.out.println("--------------------------Modificar el estado de Pedido------------------");
	String dato=teclado.leer("", "Ingrese el numero del Pedido");
	Pedidos modelo = new Pedidos();
	modelo.setEstado(teclado.leer("","Ingrese el estado del pedido"));
	System.out.println("SI: entregado   .     NO; Pendiente");
	Object[][] data=editarRegistro(leerArc, 0, dato, modelo);
	System.out.println("El estado se cambio correctamente");
	return data;
	}
}