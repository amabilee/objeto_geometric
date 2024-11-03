package projeto_objeto_geometrico_mab;

public class Quadrado extends ObjetoGeometrico {
	private double lado;
	Quadrado (double l) {
		lado = l;
	}
	public double getArea ( ) {
		area = lado * lado;
		return area;
	}
	public double getPerimetro ( ) {
		perimetro = 2 * lado;
		return perimetro;
		}
}