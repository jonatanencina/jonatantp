package tpjonatanencina;

public class Circulos {

	public Circulos(double radio){
		this.radio=radio;
	}
	public Circulos(){
		this.radio=5.0;
	}
	public double getRadio(){
		return this.radio;
	}
	public double carcularArea(){
		
		area=Math.PI*(Math.pow(this.radio, 2));
	return area;
	}
	public double calcularPerimetro(){
        perimetro=Math.PI*2*this.radio;
	
        return perimetro;
	
	}
	private double perimetro;
	private double area;
	private double radio;
}
