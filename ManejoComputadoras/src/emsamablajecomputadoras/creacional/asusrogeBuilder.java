package emsamablajecomputadoras.creacional;

public class asusrogeBuilder extends ComputadorBuilder{

	@Override
	void DefinirComputador() {
		// TODO Auto-generated method stub
		SistemaOperativo os = new SistemaOperativo("Windows 10", 64, "Pro");
		Mainboard mainb = new Mainboard("Strix", "x99");
		Computador c = new Computador(34, os, 1000, mainb, "Asus", "ROG");
	}

	@Override
	void DefinirAlmacenamiento() {
		// TODO Auto-generated method stub
		computador.setAlmacenamiento(1000);
		
	}

	@Override
	void DefinirCoolerExterno() {
		// TODO Auto-generated method stub
		computador.setCoolerExterno(false);
		
	}

	@Override
	void ConstruirSO() {
		// TODO Auto-generated method stub
		SistemaOperativo os = new SistemaOperativo("Windows 10", 64, "Pro");
		computador.setOs(os);
		
		
	}

	@Override
	void ConstruirMainboard() {
		// TODO Auto-generated method stub
		Mainboard mainb = new Mainboard("Strix x99", "99");
		computador.setPlaca(mainb);
		
	}
	

}
