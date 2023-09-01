package classroom;

public class main {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
	    Persona persona2 = new Persona("Jaime");
	    Persona persona3 = new Persona(1234);
	    Persona persona4 = new Persona("Oswaldo", 2345);
	    Persona persona5 = new Persona(3456, "David");

	   
	   // if (persona1.getCedula() == 0 && 
	    //    persona2.getCedula() == 1 && persona2.getNombre().equals("Jaime") &&
	    //    persona3.getCedula() == 1234 && persona3.getNombre().equals("") &&
	     //   persona4.getCedula() == 2345 && persona4.getNombre().equals("Oswaldo") &&
	     //   persona5.getCedula() == 3456 && persona5.getNombre().equals("David"))
	    
	    System.out.println(persona1.getCedula());
	    System.out.println(persona2.getCedula());
	    System.out.println(persona2.getNombre());
	    System.out.println(persona3.getCedula());
	    System.out.println(persona3.getNombre());
	    System.out.println(persona4.getCedula());
	    System.out.println(persona4.getNombre());
	    System.out.println(persona5.getCedula());
	    System.out.println(persona5.getNombre());
	    
	    Asignatura asignatura1 = new Asignatura();
	    Asignatura asignatura2 = new Asignatura("POO", Tipo.DISCIPLINAR);
	    Asignatura asignatura3 = new Asignatura(1029, Tipo.FUNDAMENTACION);
	    Asignatura asignatura4 = new Asignatura("Vision por computador", 3984, 4983, Tipo.ELECTIVA);
	    
	    
	//    asignatura1.nombre.equals("Sin nombre") && asignatura1.tipo == Tipo.FUNDAMENTACION && asignatura1.codigoExterno == 0 &&
	  //      asignatura2.nombre.equals("POO") && asignatura2.tipo == Tipo.DISCIPLINAR && asignatura2.codigoExterno == 0 &&
	   //     asignatura3.nombre.equals("Sin nombre") && asignatura3.tipo == Tipo.FUNDAMENTACION && asignatura3.codigoExterno == 1029 &&
	   //     asignatura4.nombre.equals("Vision por computador") && asignatura4.tipo == Tipo.ELECTIVA && asignatura4.codigoExterno == 4983
	      
	    System.out.println(asignatura1.nombre);
	    System.out.println(asignatura1.tipo);
	    System.out.println(asignatura1.codigoExterno);
	    System.out.println(asignatura2.nombre);
	    System.out.println(asignatura2.tipo);
	    System.out.println(asignatura2.codigoExterno);
	    System.out.println(asignatura3.nombre);
	    System.out.println(asignatura3.tipo);
	    System.out.println(asignatura3.codigoExterno);
	    System.out.println(asignatura4.nombre);
	    System.out.println(asignatura4.tipo);
	    System.out.println(asignatura4.codigoExterno);
	
	    
	    Persona[] personas = new Persona[5];
	    personas[0] = new Persona();
	    personas[1] = new Persona("Jaime");
	    personas[2] = new Persona(1234);
	    personas[3] = new Persona("Oswaldo", 2345);
	    personas[4] = new Persona(3456, "David");
	    
	    Persona profesor1 = new Persona("Guzman", 8769);
	    Persona profesor2 = new Persona("Andres", 8769);
	    Asignatura asignatura5 = new Asignatura("POO", Tipo.DISCIPLINAR);
	    Asignatura asignatura6 = new Asignatura("Vision por computador", 3984, 4983, Tipo.ELECTIVA);
	    
	    Grupo grupo1 = new Grupo(personas, profesor1, asignatura5, 5456, "L V 4-6");
	    Grupo grupo2 = new Grupo(3, profesor2, asignatura6, 6784, "W V 8-10");
	    
	    
	//   grupo1.codigo == 5456 && grupo1.estudiantes[3].getNombre().equals("Oswaldo") &&
	  //      grupo2.codigo == 6784 && grupo2.profesor.getNombre().equals("Andres"))
	    
	    System.out.println(grupo1.codigo);
	    System.out.println(grupo1.estudiantes[3].getNombre());
	    System.out.println(grupo2.codigo);
	    System.out.println(grupo2.profesor.getNombre());
	    
	}
}


