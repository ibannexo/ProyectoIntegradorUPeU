package pe.edu.upeu.nicc.proyectointegrador;
import pe.edu.upeu.nicc.utils.LeerTeclado;

public class Proyecto {

	
	//*****************************  Opcion   1  ***********************************
	
	public void Opcion1(int TipoDeMenu){
		
		if(TipoDeMenu == 1){
        System.out.println("");
		System.out.println("POLLOS A LA BRASA\n"+
		"Espero sea de su Agrado");
		System.out.println("");
		System.out.println("");
		System.out.println("TENGA EN CUENTA QUE EL CODIGO DE POLLOS PARA HACER EL PEDIDO NO CUENTA CON NINGUN CERO ");
		System.out.println("");
		System.out.println("");
		System.out.println("**************************************************************");
		System.out.println("");
		System.out.println("1/8 De Pollo:              .....s/.06.50        COD:POO8\n"+
		"1/4 De Pollo Universitario:.....s/.11.00        COD:PO4U\n"+    
		"1/4 De Pollo Normal:       .....s/.13.50        COD:PO4N\n"+
		"1/4 De Pollo Granja:       .....s/.15.50        COD:PO4G\n"+
		"1/2 De Pollo Universitario:.....s/.22.00        COD:PO2U\n"+
		"1/2 De Pollo Normal:       .....s/.27.00        COD:PO2N\n"+
		"1/2 De Pollo Granja:       .....s/.31.00        COD:PO2G\n"+
		"1 Pollo Universitario:     .....s/.42.00        COD:PO1U\n"+
		"1 Pollo Normal:            .....s/.50.00        COD:PO1N\n"+
		"1 Granja:                  .....s/.60.00        COD:PO1G");
		System.out.println("");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("");
		System.out.println("");
		System.out.println("POLLO BROASTER\n"+
		"Espero sea de su Agrado");
		System.out.println("");
		System.out.println("**************************************************************");
		System.out.println("");
		System.out.println("1 Broaster Universitario:  .....s/.06.50        COD:PB1U\n"+
		"1/4 De Broaster:           .....s/.11.00        COD:PB4N\n"+
		"1/2 De Broaster:           .....s/.13.50        COD:PB2N\n"+
		"1 Broaster Entero:         .....s/.15.50        COD:PB1N\n");
		System.out.println("");
				
		}else if(TipoDeMenu == 2){
		System.out.println("");
		System.out.println("PARRILLADAS\n"+
		"Todas las opciones incluyen Vino de Cortesia");
		System.out.println("");
		System.out.println("Espero sea de su Agrado");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("TENGA EN CUENTA QUE EL CODIGO DE PARRILLAS PARA HACER EL PEDIDO NO CUENTA CON NINGUN CERO ");
		System.out.println("");
		System.out.println("");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("");
		System.out.println("");
		System.out.println("Parrillada Personal:       .....s/.31.00        COD:PAP\n"+"Incluye 1 Chuleta de Res, 1 Chuleta de cerdo\n"+", porcion de papas\n"+", Chorizo, Hot Dog Y Ensalada");
        System.out.println("*****************************************************************");
		System.out.println("");
		System.out.println("");
		System.out.println("Parrillada Mediana:        .....s/.42.00        COD:PAM\n"+"Incluye 2 Chuleta de Res, 1 Chuleta de cerdo\n"+", porcion de papas\n"+", Chorizo, Hot Dog, Panzita, Corazón Y Ensalada");
        System.out.println("*****************************************************************");
		System.out.println("");
		System.out.println("");
		System.out.println("Parrillada Granja:         .....s/.55.00        COD:PAG\n"+"Incluye 2 Chuleta de Res, 1 Chuleta de cerdo\n"+",1/4 de Pollo a la Brasa, porcion de papas\n"+", Chorizo, Hot Dog, Panzita, Corazón Y Ensalada");
		System.out.println("*****************************************************************");	
		System.out.println("");
		System.out.println("Chuleta de Cerdo:          .....s/.16.50        COD:PCC");
		System.out.println("");
		System.out.println("Chuleta de Res:            .....s/.15.50        COD:PCR");
		System.out.println("");
		System.out.println("Pollo a la Parrilla:       .....s/.15.50        COD:PPO");
		System.out.println("");
		}else if(TipoDeMenu == 3){
		System.out.println("");
		System.out.println("SECCION DE PIZZAS");
		System.out.println("");
		System.out.println("TENGA EN CUENTA QUE EL CODIGO DE PIZZAS PARA HACER EL PEDIDO CUENTA CON CEROS");
		System.out.println("");
		System.out.println("");
		System.out.println("");	
		System.out.println("PIZZAS......................      PERSONAL    FAMILIAR    GRANJA    COD:(PER)(FAM)(GRA) ");
		System.out.println("");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("");
		System.out.println("LA GRANJA ................    S/.   20.00      35.00      52.00        PI01(P)(F)(G)\n"+
		"pollo,tocino,chorizo,jamón,pimento.");
		System.out.println("");
		System.out.println("VEGETARIANA ..............    S/.   17.00      27.00      47.00       PI02(P)(F)(G)\n"+
		"tomate,cebolla,aceitunas negras,pimento.");
		System.out.println("");
		System.out.println("HAWAIANA .................    S/.   14.00      27.00      45.00       PI03(P)(F)(G)\n"+
		"piña,jamón,chorizo.");
		System.out.println("");
		System.out.println("DULCE TENTACION ..........    S/.   14.00      27.00      45.00       PI04(P)(F)(G)\n"+
		"plátano,durazno,leche condensada.");
		System.out.println("");
		System.out.println("NAPOLITANA ...............    S/.   13.00      25.00      42.00       PI05(P)(F)(G)\n"+
		"tomate y cebolla.");
		System.out.println("");
		System.out.println("TRES CERDITOS ............    S/.   14.00      27.00      47.00       PI06(P)(F)(G)\n"+
		"jamón,tocino,chorizo.");
		System.out.println("");
		System.out.println("TOCINO O CHORIZO .........    S/.   13.00      25.00      45.00       PI07(P)(F)(G)\n"+
		"tocino,chorizo.");
		System.out.println("");
		System.out.println("HUAYNA ROQUE .............    S/.   15.00      29.00      47.00       PI08(P)(F)(G)\n"+
		"cabanossi y aceitunas.");
		System.out.println("");
		System.out.println("CARIBEÑA .................    S/.   15.00      29.00      47.00       PI09(P)(F)(G)\n"+
		"jamón,pollo y durazno.");
		System.out.println("");
		System.out.println("ESPECIAL DE POLLO ........    S/.   14.00      27.00      45.00       PI10(P)(F)(G)\n"+
		"pollo y jamón.");
		System.out.println("");
		System.out.println("MARGARITA ................    S/.   13.00      25.00      42.00       PI11(P)(F)(G)\n"+
		"tomate.");
		System.out.println("");
		System.out.println("PICANTE ..................    S/.   15.00      29.00      47.00       PI12(P)(F)(G)\n"+
		"cabanossi,peperoni y cebolla.");
		System.out.println("");
		System.out.println("AMERICANA ................    S/.   15.00      29.00      47.00       PI13(P)(F)(G)\n"+
		"jamón.");
		System.out.println("");
		
		}else{

		System.out.println("Eror no existe la opcion que elegiste");
	}
        
}

}