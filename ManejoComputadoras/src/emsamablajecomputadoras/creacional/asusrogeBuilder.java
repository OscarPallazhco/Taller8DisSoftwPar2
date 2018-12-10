package emsamablajecomputadoras.creacional;

public class asusrogeBuilder extends ComputadorBuilder{

	@Override
	public void DefinirComputador() {
		// TODO Auto-generated method stub
		SistemaOperativo os = null;
		Mainboard mainb = null;
		computador = new Computador(34, os, 1000, mainb, "Asus", "ROG");
	}

	@Override
	public void DefinirAlmacenamiento() {
		// TODO Auto-generated method stub
		computador.setAlmacenamiento(1000);
		
	}

	@Override
	public void DefinirCoolerExterno() {
		// TODO Auto-generated method stub
		computador.setCoolerExterno(false);
		
	}

	@Override
	public void ConstruirSO() {
		// TODO Auto-generated method stub		
		computador.setOs(new SistemaOperativo("Windows 10", 64, "Pro"));
		
		
	}

	@Override
	public void ConstruirMainboard() {
		// TODO Auto-generated method stub		
		computador.setPlaca(new Mainboard("Strix", "x99"));
		
	}
	

}
