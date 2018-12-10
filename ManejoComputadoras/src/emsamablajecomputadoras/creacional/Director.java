package emsamablajecomputadoras.creacional;

public class Director {
	private ComputadorBuilder builder;
	
	public Director(ComputadorBuilder builder) {
		
		this.builder = builder;
		
	}
	
	
	public void construirComputador() {
		
		builder.DefinirComputador();
		builder.ConstruirMainboard();
		builder.ConstruirSO();
		builder.DefinirAlmacenamiento();		
		builder.DefinirCoolerExterno();
		
	}
	
	public Computador getComputador() {
		
		return this.builder.getComputador();
	}

}
