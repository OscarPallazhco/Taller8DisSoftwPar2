package emsamablajecomputadoras.creacional;

public class Cliente {

	
public static void main(String[] args) {
		
		Director director = new Director(new asusrogeBuilder());
		
		director.construirComputador();
		Computador pc = director.getComputador();
		
		System.out.println(pc.getModelo());
		System.out.println(pc.getOs());
		System.out.println(pc.getPlaca());
	}
}
