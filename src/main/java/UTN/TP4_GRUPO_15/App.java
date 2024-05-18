package UTN.TP4_GRUPO_15;

import java.util.List;
import java.util.Scanner;

import UTN.TP4_GRUPO_15.controllers.medicoController;
import UTN.TP4_GRUPO_15.entidad.Medico;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println( "ABM Medicos" );
    	System.out.println( "Opcion 1 - Altas" );
    	System.out.println( "Opcion 2 - Modificacion" );
    	System.out.println( "Opcion 3 - Borrado" );
    	System.out.println( "Opcion 4 - Listar" );    	
    	System.out.println( "Seleccionar Opcion: " );
    	
    	int opcion = sc.nextInt();
    	sc.nextLine(); //Agregado para evitar saltar el nombre
    	
    	System.out.println( "El dato ingresado es: " +  opcion);
    	
    	switch(opcion){
    	
    	case 1:

    		String medico01 = new medicoController().create("Gonzalo", "Alderete", "Masculino", "12/02/1996", "gonzalo@prueba.com", "falsa 111", "Pacheco", "11-12229");	
    		String medico02 = new medicoController().create("Gaston", "Argañaz", "Masculino", "01/06/1996", "gaston@prueba.com", "falsa 222", "Pacheco", "11-12229");
    		String medico03 = new medicoController().create("Leonel", "Herrera", "Masculino", "30/12/2000", "leonel@prueba.com", "falsa 333", "Pacheco", "11-12229");
    		String medico04 = new medicoController().create("Guido", "Romero", "Masculino", "11/02/2001", "guido@prueba.com", "falsa 444", "Pacheco", "11-12229");
    		String medico05 = new medicoController().create("Walter", "Pizzo", "Masculino", "29/02/1998", "walter@prueba.com", "falsa 555", "Pacheco", "11-12229");
    		String medico06 = new medicoController().create("Tamara", "Herrera", "Femenina", "14/05/2000", "tamara@prueba.com", "falsa 666", "Pacheco", "11-12229");
    		String medico07 = new medicoController().create("Pepito", "Perez", "Masculino", "12/02/1996", "pepito@prueba.com", "falsa 777", "Pacheco", "11-12229");
    		String medico08 = new medicoController().create("Pepita", "Perez", "Femenina", "04/04/1999", "pepita@prueba.com", "falsa 888", "Pacheco", "11-12229");
    		String medico09 = new medicoController().create("Juan", "Diaz", "Masculino", "12/02/1996", "juan@prueba.com", "falsa 999", "Pacheco", "11-12229");
    		String medico10 = new medicoController().create("Laura", "Morales", "Femenino", "02/12/2000", "laura@prueba.com", "falsa 321", "Pacheco", "11-12229");
    		
    		break;
    		
    	case 2:
    		Medico medicoUpdate = new Medico("Gonzalo", "Alderete", "Masculino", "12/02/1996", "gonzalo@prueba.com", "falsa 111", "Pacheco", "11-12229");
    		medicoUpdate.setLegajo(1);
    		String updateMedcio = new medicoController().update(medicoUpdate);
    		
    		System.out.println(updateMedcio);
    		break;
    		
    		
    		
    	case 3:
    		medicoController medicoDelete = new medicoController();
    		medicoDelete.delete(10);
    		
    		break;
    		
    		
    		
    	case 4:
    		System.out.println( "Listado de médicos: " );

    		List<Medico> listMedicos = new medicoController().listMedicos();
    		
    		for (Medico medico : listMedicos) {
    		    System.out.println(medico);
    		}
    		break;
    	}
    }
}
