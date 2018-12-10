package emsamablajecomputadoras.creacional;

public abstract class ComputadorBuilder {
	
protected Computador computador;
	
	public Computador getComputador() {
		return computador;
	}
	
	
	public abstract void DefinirComputador();
	
	public abstract void DefinirAlmacenamiento();
	
	public abstract void DefinirCoolerExterno();
	
	public abstract void ConstruirSO();
	
	public abstract void ConstruirMainboard( );

}
