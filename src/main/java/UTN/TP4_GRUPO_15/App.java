package UTN.TP4_GRUPO_15;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import UTN.TP4_GRUPO_15.controllers.especialidadController;
import UTN.TP4_GRUPO_15.controllers.medicoController;
import UTN.TP4_GRUPO_15.controllers.turnoController;
import UTN.TP4_GRUPO_15.controllers.usuarioController;
import UTN.TP4_GRUPO_15.entidad.Especialidad;
import UTN.TP4_GRUPO_15.entidad.Medico;
import UTN.TP4_GRUPO_15.entidad.Paciente;
import UTN.TP4_GRUPO_15.entidad.Usuario;
import UTN.TP4_GRUPO_15.entidad.Turno;


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

    		//Creación de usuarios
    		Usuario usuario1 = new Usuario("UserGonzalo", "123");
    		Usuario usuario2 = new Usuario("UserGaston", "123");
    		Usuario usuario3 = new Usuario("UserLeonel", "123");
    		Usuario usuario4 = new Usuario("UserGuido", "123");
    		Usuario usuario5 = new Usuario("UserWalter", "123");
    		Usuario usuario6 = new Usuario("UserTamara", "123");
    		Usuario usuario7 = new Usuario("UserPepito", "123");
    		Usuario usuario8 = new Usuario("UserPepita", "123");
    		Usuario usuario9 = new Usuario("UserJuan", "123");
    		Usuario usuario10 = new Usuario("UserLaura", "123");
    		
    		System.out.println(new usuarioController().create(usuario1));
    		System.out.println(new usuarioController().create(usuario2));
    		System.out.println(new usuarioController().create(usuario3));
    		System.out.println(new usuarioController().create(usuario4));
    		System.out.println(new usuarioController().create(usuario5));
    		System.out.println(new usuarioController().create(usuario6));
    		System.out.println(new usuarioController().create(usuario7));
    		System.out.println(new usuarioController().create(usuario8));
    		System.out.println(new usuarioController().create(usuario9));
    		System.out.println(new usuarioController().create(usuario10));
    		
    		//Creación de especialidades
    		
    		Especialidad especialidad1 = new Especialidad("Clinico");
    		Especialidad especialidad2 = new Especialidad("Cardiologo");
    		Especialidad especialidad3 = new Especialidad("Nefrologo");
    		
    		System.out.println(new especialidadController().create(especialidad1));
    		System.out.println(new especialidadController().create(especialidad2));
    		System.out.println(new especialidadController().create(especialidad3));


    		//Creación de medicos
    		Medico medico01 = new Medico("Gonzalo", "Alderete", "Masculino", "12/02/1996", "gonzalo@prueba.com", "falsa 111", "Pacheco", "11-12229", usuario1, especialidad1);
    		Medico medico02 = new Medico("Gaston", "Argañaz", "Masculino", "01/06/1996", "gaston@prueba.com", "falsa 222", "Pacheco", "11-12229", usuario2, especialidad1);
    		Medico medico03 = new Medico("Leonel", "Herrera", "Masculino", "30/12/2000", "leonel@prueba.com", "falsa 333", "Pacheco", "11-12229", usuario3, especialidad1);
    		Medico medico04 = new Medico("Guido", "Romero", "Masculino", "11/02/2001", "guido@prueba.com", "falsa 444", "Pacheco", "11-12229", usuario4, especialidad2);
    		Medico medico05 = new Medico("Walter", "Pizzo", "Masculino", "29/02/1998", "walter@prueba.com", "falsa 555", "Pacheco", "11-12229", usuario5, especialidad3);
    		Medico medico06 = new Medico("Tamara", "Herrera", "Femenina", "14/05/2000", "tamara@prueba.com", "falsa 666", "Pacheco", "11-12229", usuario6, especialidad3);
    		Medico medico07 = new Medico("Pepito", "Perez", "Masculino", "12/02/1996", "pepito@prueba.com", "falsa 777", "Pacheco", "11-12229", usuario7, especialidad2);
    		Medico medico08 = new Medico("Pepita", "Perez", "Femenina", "04/04/1999", "pepita@prueba.com", "falsa 888", "Pacheco", "11-12229", usuario8, especialidad1);
    		Medico medico09 = new Medico("Juan", "Diaz", "Masculino", "12/02/1996", "juan@prueba.com", "falsa 999", "Pacheco", "11-12229", usuario9, especialidad1);
    		Medico medico10 = new Medico("Laura", "Morales", "Femenina", "02/12/2000", "laura@prueba.com", "falsa 321", "Pacheco", "11-12229", usuario10, especialidad3);

    		System.out.println(new medicoController().create(medico01));
    		System.out.println(new medicoController().create(medico02));
    		System.out.println(new medicoController().create(medico03));
    		System.out.println(new medicoController().create(medico04));
    		System.out.println(new medicoController().create(medico05));
    		System.out.println(new medicoController().create(medico06));
    		System.out.println(new medicoController().create(medico07));
    		System.out.println(new medicoController().create(medico08));
    		System.out.println(new medicoController().create(medico09));
    		System.out.println(new medicoController().create(medico10));
    		
    		
    		// Creación de pacientes
    		Paciente paciente1 = new Paciente("María", "González", "123456789", "1234567890", "Calle Falsa 123", "Ciudad", "Provincia", LocalDate.of(1980, 5, 15), "maria@example.com");
    		Paciente paciente2 = new Paciente("Juan", "Martínez", "987654321", "0987654321", "Av. Libertador 456", "Otra Ciudad", "Otra Provincia", LocalDate.of(1975, 10, 8), "juan@example.com");
    		Paciente paciente3 = new Paciente("Luis", "López", "456789123", "0123456789", "Av. Rivadavia 789", "Otra Ciudad", "Otra Provincia", LocalDate.of(1990, 12, 20), "luis@example.com");
    		Paciente paciente4 = new Paciente("Ana", "Rodríguez", "789123456", "6789012345", "Av. Belgrano 101", "Otra Ciudad", "Otra Provincia", LocalDate.of(1985, 7, 3), "ana@example.com");
    		Paciente paciente5 = new Paciente("Carlos", "Sánchez", "321654987", "5432109876", "Calle Principal 555", "Otra Ciudad", "Otra Provincia", LocalDate.of(1970, 3, 28), "carlos@example.com");
    		Paciente paciente6 = new Paciente("Laura", "Díaz", "654987321", "9876543210", "Av. Corrientes 222", "Otra Ciudad", "Otra Provincia", LocalDate.of(1982, 8, 12), "laura@example.com");
    		Paciente paciente7 = new Paciente("José", "Gómez", "159753468", "1597534680", "Av. San Martín 333", "Otra Ciudad", "Otra Provincia", LocalDate.of(1978, 6, 5), "jose@example.com");
    		Paciente paciente8 = new Paciente("Lucía", "Pérez", "753951852", "7539518520", "Av. Santa Fe 777", "Otra Ciudad", "Otra Provincia", LocalDate.of(1995, 9, 17), "lucia@example.com");
    		Paciente paciente9 = new Paciente("Pedro", "Fernández", "258369147", "2583691470", "Calle Mayor 999", "Otra Ciudad", "Otra Provincia", LocalDate.of(1987, 2, 9), "pedro@example.com");
    		Paciente paciente10 = new Paciente("Sofía", "Álvarez", "147258369", "1472583690", "Av. 9 de Julio 666", "Otra Ciudad", "Otra Provincia", LocalDate.of(1993, 11, 30), "sofia@example.com");

    		// Creación de turnos
    		Turno turno1 = new Turno(medico01, paciente1, LocalDate.of(2024, 10, 11), LocalTime.of(14, 0), "observación1", "pendiente");
    		Turno turno2 = new Turno(medico02, paciente2, LocalDate.of(2024, 8, 11), LocalTime.of(14, 0), "observación2", "ausente");
    		Turno turno3 = new Turno(medico03, paciente3, LocalDate.of(2024, 10, 12), LocalTime.of(14, 0), "observación3", "pendiente");
    		Turno turno4 = new Turno(medico04, paciente4, LocalDate.of(2024, 8, 12), LocalTime.of(14, 0), "observación4", "pendiente");
    		Turno turno5 = new Turno(medico05, paciente5, LocalDate.of(2024, 10, 13), LocalTime.of(14, 0), "observación5", "presente");
    		Turno turno6 = new Turno(medico06, paciente6, LocalDate.of(2024, 8, 13), LocalTime.of(14, 0), "observación6", "pendiente");
    		Turno turno7 = new Turno(medico07, paciente7, LocalDate.of(2024, 10, 14), LocalTime.of(14, 0), "observación7", "pendiente");
    		Turno turno8 = new Turno(medico08, paciente8, LocalDate.of(2024, 8, 14), LocalTime.of(14, 0), "observación8", "pendiente");
    		Turno turno9 = new Turno(medico09, paciente9, LocalDate.of(2024, 10, 15), LocalTime.of(14, 0), "observación9", "ausente");
    		Turno turno10 = new Turno(medico10, paciente10, LocalDate.of(2024, 8, 15), LocalTime.of(14, 0), "observación10", "pendiente");

    		System.out.println(new turnoController().create(turno1));
    		System.out.println(new turnoController().create(turno2));
    		System.out.println(new turnoController().create(turno3));
    		System.out.println(new turnoController().create(turno4));
    		System.out.println(new turnoController().create(turno5));
    		System.out.println(new turnoController().create(turno6));
    		System.out.println(new turnoController().create(turno7));
    		System.out.println(new turnoController().create(turno8));
    		System.out.println(new turnoController().create(turno9));
    		System.out.println(new turnoController().create(turno10));
    		
    		break;
    		
    	case 2:
    		Usuario usuario11 = new Usuario("Gonzalo", "123");
    		Especialidad especialidad4 = new Especialidad("Clinico");
    		Medico medicoUpdate = new Medico("Gonzalo", "Alderete", "Masculino", "12/02/1996", "gonzalo@prueba.com", "falsa 111", "Pacheco", "11-12229", usuario11, especialidad4);
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
