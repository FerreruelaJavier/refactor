package figures;

public class Circumferencia {
	private static final double PI = 3.1416;

	public double getRad() {
		return radio;
	}

	public void setRad(double rad) {
		this.radio = rad;
	}

	private double radio;

	public Circumferencia(double radio) {
		this.radio = radio;
	}

	public void imprimir(String color) {
		System.out.println("Diámetro: " + (2 * radio));
		System.out.println("Color: " + color);
		double area1 = 2 * PI * radio * radio;
		System.out.println(area1);
	}

	public boolean esIgual(boolean Decimales, Circumferencia otro) {
		double radio1 = this.radio;
		double radio2 = otro.getRad();
		if (Decimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
