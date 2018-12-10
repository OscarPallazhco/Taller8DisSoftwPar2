package emsamablajecomputadoras.creacional;

public class Director {
	private ComputadorBuilder builder;
	
	public Director(ComputadorBuilder builder) {
		
		this.builder = builder;
		
	}
	
	
	public void construirComputador() {
		
		
		builder.ConstruirMainboard();
		builder.ConstruirSO();
		builder.DefinirAlmacenamiento();
		builder.DefinirComputador();
		builder.DefinirCoolerExterno();
		
	}
	
	public Computador getComputador() {
		
		return this.builder.getComputador();
	}

}
