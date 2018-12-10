package emsamablajecomputadoras.creacional;

public class asusZenBookBuilder extends ComputadorBuilder{

	@Override
	void DefinirComputador() {
		// TODO Auto-generated method stub
		SistemaOperativo os = new SistemaOperativo("Windows 10", 64, "Home");
		Mainboard mainb = new Mainboard("Prime", "z370");
		Computador c = new Computador(16, os, 500, mainb, "Asus", "ZenBook");
	}

	@Override
	void DefinirAlmacenamiento() {
		// TODO Auto-generated method stub
		computador.setAlmacenamiento(500);
		
	}

	@Override
	void DefinirCoolerExterno() {
		// TODO Auto-generated method stub
		computador.setCoolerExterno(false);
		
	}

	@Override
	void ConstruirSO() {
		// TODO Auto-generated method stub
		SistemaOperativo os = new SistemaOperativo("Windows 10", 64, "Home");
		computador.setOs(os);
		
		
	}

	@Override
	void ConstruirMainboard() {
		// TODO Auto-generated method stub
		Mainboard mainb = new Mainboard("Prime", "z370");
		computador.setPlaca(mainb);
		
	}

}
