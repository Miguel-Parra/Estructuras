package com.epn;

public class Triangulo extends FiguraGeometrica {
	private Punto v1, v2, v3;
	
	public Triangulo(Punto v1, Punto v2, Punto v3) {
		super();
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	public Triangulo() {
		v1=new Punto();
		v2=new Punto();
		v3=new Punto();
	}

	public Punto getV1() {
		return v1;
	}
	public void setV1(Punto v1) {
		this.v1 = v1;
	}

	public Punto getV2() {
		return v2;
	}

	public void setV2(Punto v2) {
		this.v2 = v2;
	}
	public Punto getV3() {
		return v3;
	}
	public void setV3(Punto v3) {
		this.v3 = v3;
	}

	public boolean verificarSiEsTriang(){
		boolean resp=false;
		if (calcularArea()!=0){ 
		return resp=true;
		}
		return resp;
		}
	
	public String verificarTipoTriang(){
		String tipo="Isosceles";
		double lad1=calcularLado(v1,v2);
		double lad2=calcularLado(v2,v3);
		double lad3=calcularLado(v1,v3);
		double hip1=Math.sqrt(lad1*lad1 + lad2*lad2);
		double hip2=Math.sqrt(lad2*lad2 + lad3*lad3);
		double hip3=Math.sqrt(lad1*lad1 + lad3*lad3);
		if(lad3==hip1 || lad2==hip3 || lad1== hip2 ){
			tipo="Rectangulo";
			if(lad1!=lad2 && lad2!=lad3){
				tipo+=" y Escaleno";
			}else{ 
				tipo+=" e Isoseles";
				}
		} else{
			if(lad1!=lad2 && lad2!=lad3){
				tipo="Escaleno";
			}else if((lad1==lad2 && lad2==lad3)){
				tipo="Equilatero";
				}
		}
		return tipo;	
	}
	
	
	 public double calcularLado(Punto p1, Punto p2){
		  double d1 = p1.getX()-p2.getX();
	      double d2 = p1.getY()-p2.getY();
	      double lado = Math.sqrt(d1*d1 + d2*d2);
	      return lado;
	 }
	

	@Override
	public String toString() {
		return "\nv1:   " + v1 + "\nv2:   " + v2 + "\nv3:     " + v3;
	}
	
	@Override
	public double calcularArea() {
		double l1=calcularLado(v1,v2);
		double l2=calcularLado(v2,v3);
		double l3=calcularLado(v1,v3);
		 double s=(l1+l2+l3)/2;
		 double areaT=Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));
		return areaT;
	}
}