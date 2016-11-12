package com.epn;

public class Circulo extends FiguraGeometrica {
private Punto centro;
private double radio;

	public Circulo() {
	centro= new Punto();
	radio=1;
}

	public Circulo(Punto centro, double radio) {
	this.centro = centro;
	this.radio = radio;
}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.PI*Math.pow(this.radio,2);
	}

	@Override
	public String toString() {
	return "Circulo\ncentro: " + centro + "\nRadio: " + radio;
	}
}