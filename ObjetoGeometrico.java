package projeto_objeto_geometrico_mab;

abstract public class ObjetoGeometrico {
	public double area;
	public double perimetro;
	protected String cor;
	public String getCor ( ) {
		return cor;
	}
	public void setCor (String c) {
		cor = c;
	}
}