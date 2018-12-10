package emsamablajecomputadoras.creacional;

public class asusZenBookBuilder extends ComputadorBuilder{

	@Override
	public void DefinirComputador() {
		// TODO Auto-generated method stub
		SistemaOperativo os = null;
		Mainboard mainb = null;
		computador = new Computador(16, os, 500, mainb, "Asus", "ZenBook");
	}

	@Override
	public void DefinirAlmacenamiento() {
		// TODO Auto-generated method stub
		computador.setAlmacenamiento(500);
		
	}

	@Override
	public void DefinirCoolerExterno() {
		// TODO Auto-generated method stub
		computador.setCoolerExterno(false);
		
	}

	@Override
	public void ConstruirSO() {
		// TODO Auto-generated method stub
		computador.setOs(new SistemaOperativo("Windows 10", 64, "Home"));
		
		
	}

	@Override
	public void ConstruirMainboard() {
		// TODO Auto-generated method stub
		computador.setPlaca(new Mainboard("Prime", "z370"));
		
	}

}
