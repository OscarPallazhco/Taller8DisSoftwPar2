package emsamablajecomputadoras.creacional;

public class Cliente {

	
public static void main(String[] args) {
		
		//Director 1
		Director directorRoge = new Director(new asusrogeBuilder());
		directorRoge.construirComputador();
		
		//computador creado por el director 1
		Computador pcRoge = directorRoge.getComputador();
		
		//Director 2
		Director directorZenBook = new Director(new asusZenBookBuilder());
		directorZenBook.construirComputador();
		
		//computador creado por el director 2
		Computador pcZenBook = directorZenBook.getComputador();
		
		System.out.println("Computadora #1");
		System.out.println(pcRoge.especificacionesTecnicas());
		System.out.println();
		System.out.println("Computadora #2");
		System.out.println(pcZenBook.especificacionesTecnicas());
	}
}
