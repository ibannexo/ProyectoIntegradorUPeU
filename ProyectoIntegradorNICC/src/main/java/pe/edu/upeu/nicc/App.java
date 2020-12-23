package pe.edu.upeu.nicc;
import java.io.IOException;
import pe.edu.upeu.nicc.proyectointegrador.Proyecto;
import pe.edu.upeu.nicc.utils.LeerArchivo;
import pe.edu.upeu.nicc.utils.LeerTeclado;
import pe.edu.upeu.nicc.utils.UtilsX;
import pe.edu.upeu.nicc.dao.AppCrud;
import pe.edu.upeu.nicc.modelo.Clientes;
import pe.edu.upeu.nicc.modelo.Productos;
import pe.edu.upeu.nicc.dao.PedidosDao;
import java.io.Console;


public class App{
 static LeerTeclado teclado=new LeerTeclado(); 
 static LeerArchivo leerArc;
 static AppCrud dao=new AppCrud();
 static UtilsX utilx=new UtilsX();
 
   public static Object[][] Clientes(){
	 leerArc=new LeerArchivo("Clientes.txt");
     Clientes ClientesTO=new Clientes();	
     ClientesTO=new Clientes();
	 ClientesTO.setDNI(teclado.leer("", "Ingrese el DNI:"));
	 ClientesTO.setNombreApellidos(teclado.leer("","Ingrese su nombre completo:"));
	 ClientesTO.setDireccionDeSuDomicilio(teclado.leer("","Ingrese la direccion de su domicilo:"));
     ClientesTO.setNumTelf(teclado.leer("","Ingrese el numero de celular:"));
     ClientesTO.setDireccionParaLaEntrega(teclado.leer("","Ingrese la direccion donde quiere la entrega:"));
	 dao=new AppCrud();
	 dao.agregarContenido(leerArc, ClientesTO);

	 return dao.buscarContenido(leerArc, 0, ClientesTO.getDNI());
    }
    

 public static void main(String[] args) throws IOException {
	 System.out.println( "********** Menu de opciones **********" );  
	 Console con = System.console();
        try {
               
            Proyecto obj=new Proyecto();

            char opcion='S'; //S=SI, N=NO
            int NumOpciones=1;
            do{ 
			    
                NumOpciones=teclado.leer(0,
                "Ingrese la opcion que desea hacer: \n"+
				"1= Ver tabla de Menu Y sus Precios\n"+
				"2= Hacer pedido y Ver costo final\n"+
				"3= Ver Datos de los clientes (Solo Personas Autorizadas)\n"+
				"4= Agregar productos (Solo Personas Autorizadas)\n"+
				"5= Reporte pedidos (Solo Personas Autorizadas)\n"+
				"6= Reporte pedidos por dia (Solo Personas Autorizadas)\n"+
				"7= Reporte pedidos entre dos fechas(Solo Personas Autorizadas)\n"+
				"8= Ver productos(Solo Personas Autorizadas)\n"+
				"9= Modificar Productos(Solo Personas Autorizadas)\n"+
				"10= Modificar estado(Solo Personas Autorizadas)");
                int numero;
				PedidosDao pedDao;
					
                switch(NumOpciones){
                    case 1: 
                    int TipoDeMenu=teclado.leer(0,"Que grupo de comidas quisiera observar: \n"+
					"1=(pollo de todo tipo)\n"+
					"2=(parrillas)\n"+
					"3=(Pizzas)");
					obj.Opcion1(TipoDeMenu);
					break;
					case 2:
                    utilx.clearConsole();
                    pedDao=new PedidosDao();
                    pedDao.NuevosPedidos();
					dao=new AppCrud();
					Clientes();
                    break;
					case 3: 
					leerArc=new LeerArchivo("Clientes.txt");
                    dao=new AppCrud();
                    dao.imprimirLista(dao.listarContenido(leerArc));
                    break;
					case 4:
					pedDao=new PedidosDao();
					pedDao.imprimirLista(pedDao.AgregarProducto());
                    break;
					case 5:
                    utilx.clearConsole();
                    pedDao=new PedidosDao();
                    pedDao.listarPedidos();
                    break;
					case 6:
                    utilx.clearConsole();
                    pedDao=new PedidosDao();
                    pedDao.reporteDePedidosDelDia(teclado.leer("", "Ingrese la fecha:(dd-MM-yyyy):"));
                    break;
					case 7:
                    utilx.clearConsole();
                    pedDao=new PedidosDao();
                    pedDao.reporteDePedidosDosFechasSeleccionadas(
					teclado.leer("", "Ingrese la fecha de Inicio:(dd-MM-yyyy):"),
					teclado.leer("", "Ingrese la fecha Final:(dd-MM-yyyy):")
					);
                    break;
					case 8:
					leerArc=new LeerArchivo("Productos.txt");
                    dao=new AppCrud();
                    dao.imprimirLista(dao.listarContenido(leerArc));
                    break;
					case 9:
                    utilx.clearConsole();
                    pedDao=new PedidosDao();
                    pedDao.imprimirLista(pedDao.modificarRegistroDelProducto());
                    break;
					case 10:
                    utilx.clearConsole();
                    pedDao=new PedidosDao();
					pedDao.imprimirLista(pedDao.modificarEstado());
                    break;
                    default: System.out.println("La opcion No existe!!"); 
					break;
                }            
                opcion=teclado.leer(' ', "Desea Seleccionar Otra Opcion? S=SI, N=NO");
            }while(opcion=='S' || opcion=='s');  
        } catch (Exception er) {
            System.out.println(er.getMessage());
          }
		
	} 
}