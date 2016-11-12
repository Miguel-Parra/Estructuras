package com.epn;

public class Rectangulo extends FiguraGeometrica {
	
	private Punto v1, v2, v3, v4;
	
	public Rectangulo(Punto v1, Punto v2, Punto v3, Punto v4) {
		
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		this.v4 = v4;
	}	

	public Rectangulo() {
		v1= new Punto(0,0);
		v2= new Punto(0,1);
		v3= new Punto(1,1);
		v4= new Punto(1,0);
		
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
	public Punto getV4() {
		return v4;
	}
	public void setV4(Punto v4) {
		this.v4 = v4;
	}
   
	public boolean verificarParal(){
		boolean resp=false;
		double l1=0;
		double l2=0; 
		double l3=0;
        double l4=0;
        double l5=0;
        double l6=0;
		
		l1=calcularLado(v1, v2);
		l2=calcularLado(v2, v3);
		l3=calcularLado(v1,v3);
		l5=calcularLado(v1, v4);
		l6=calcularLado(v3, v4);
	    l4=Math.sqrt(l1*l1 + l2*l2);
		if (l3==l4&&l1==l6 && l2==l5 && calcularArea()!=0){ 
		return resp=true;
		}
		
		return resp;
	}
		

public String verificarRect(){
	String resp="rectangulo";
	if(calcularLado(v1, v2)==calcularLado(v2, v3)){
		resp="cuadrado";
		}
	return resp;
}
	
 public double calcularLado(Punto punto1, Punto punto2){
	  double c1 = punto1.getX()-punto2.getX();
      double c2 = punto1.getY()-punto2.getY();
      double lado = Math.sqrt(c1*c1 + c2*c2);
	
      return lado;
 }
 

 
	@Override
	public double calcularArea() {
	double areaR= calcularLado(v1, v2)*calcularLado(v2, v3);	
	return areaR;
	}
	
	@Override
	public String toString() {
		return "\nv1:   " + v1 + "\nv2:   " + v2 + "\nv3:   " + v3 + "\nv4:   " + v4;
	}
}
