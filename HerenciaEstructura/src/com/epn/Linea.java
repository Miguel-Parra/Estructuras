package com.epn;

public class Linea {
	private Punto p1;
	private Punto p2;

	public Linea(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Linea() {
		p1= new Punto();
		p2= new Punto();
	}
	
	public Punto getP1() {
		return p1;
	}
	
	public void setP1(Punto p1) {
		this.p1 = p1;
	}
	
	public Punto getP2() {
		return p2;
	}
	
	public void setP2(Punto p2) {
		this.p2 = p2;
	}
	
	@Override
	public String toString() {
		return "Linea\np1 " + p1+ "\np2 " + p2;
	}
}
