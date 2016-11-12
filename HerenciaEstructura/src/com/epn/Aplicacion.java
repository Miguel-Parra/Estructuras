package com.epn;

import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		
		String salida="";
		String linea="";
		String[] options = {"Punto"," Linea","Circulo","Paralelogramo Rectangular","Triangulo"};
		int tipoFigura = JOptionPane.showOptionDialog(null, " Que figura desea ingresar ?", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		switch (tipoFigura)
		{
		case 0:
		{
			linea=JOptionPane.showInputDialog("Ingrese punto de coordenadas x y y");
			StringTokenizer tokens = new StringTokenizer(linea,",");
			double x=Double.parseDouble(tokens.nextToken());
			double y=Double.parseDouble(tokens.nextToken());
			Punto punto1= new Punto(x,y);
			salida+="Punto\n"+punto1.toString();	
			JOptionPane.showMessageDialog(null,"Datos:\n"+salida);
            break;
		}
		
		
		case 1:
		{
			linea=JOptionPane.showInputDialog("Ingrese 2 puntos para la linea de coordenadas x,y separados por comas");
			StringTokenizer tokens = new StringTokenizer(linea,",");
			double x=Double.parseDouble(tokens.nextToken());
			double y=Double.parseDouble(tokens.nextToken());
			double x1=Double.parseDouble(tokens.nextToken());
			double x2=Double.parseDouble(tokens.nextToken());
			Punto p1=new Punto(x,y);
			Punto p2= new Punto(x1,x2);
			Linea lin=new Linea(p1,p2);
			salida+=lin.toString();
			JOptionPane.showMessageDialog(null,"Datos:\n"+salida);
			break;
			}
		
		
		case 2:
		{   
		linea=JOptionPane.showInputDialog("Ingrese punto(x,y)y radio separados por comas");
		StringTokenizer tokens = new StringTokenizer(linea,",");
		double x=Double.parseDouble(tokens.nextToken());
		double y=Double.parseDouble(tokens.nextToken());
		double r=Double.parseDouble(tokens.nextToken());
		Punto pc=new Punto(x,y);
		Circulo c= new Circulo(pc,r);
		salida+=c.toString()+"\nSu Area es: "+c.calcularArea();
		JOptionPane.showMessageDialog(null,"Datos:\n"+salida);
		break;
		}
		
		
		case 3:
		{
		linea=JOptionPane.showInputDialog("Ingrese 4 vertices  para su paralelogramo regular separados por comas");
		StringTokenizer tokens = new StringTokenizer(linea,",");
		double x=Double.parseDouble(tokens.nextToken());
		double y=Double.parseDouble(tokens.nextToken());
		double x1=Double.parseDouble(tokens.nextToken());
		double y1=Double.parseDouble(tokens.nextToken());
		double x2=Double.parseDouble(tokens.nextToken());
		double y2=Double.parseDouble(tokens.nextToken());
		double x3=Double.parseDouble(tokens.nextToken());
		double y3=Double.parseDouble(tokens.nextToken());
		
		Punto p1=new Punto(x,y);
		Punto p2= new Punto(x1,y1);
		Punto p3=new Punto(x2,y2);
		Punto p4= new Punto(x3,y3);
		Rectangulo rec=new Rectangulo(p1,p2,p3,p4);
		
		if(rec.verificarParal()==true){
			salida+="Es un paralelogramo rectangular\nLa figura  es un: "+ rec.verificarRect()+"\nSus vertices son"+rec.toString()+"\nSu area es: "+rec.calcularArea();
			}else{salida+="No ingreso puntos que formen un paralelogramo rectangular";
		}
		JOptionPane.showMessageDialog(null,"Datos:\n"+salida);
		break;
		}
		
		case 4:
		{
		linea=JOptionPane.showInputDialog("Ingrese 3 vertices  para su triangulo separados por comas");
		StringTokenizer tokens1 = new StringTokenizer(linea,",");
		double x4=Double.parseDouble(tokens1.nextToken());
		double y4=Double.parseDouble(tokens1.nextToken());
		double x5=Double.parseDouble(tokens1.nextToken());
		double y5=Double.parseDouble(tokens1.nextToken());
		double x6=Double.parseDouble(tokens1.nextToken());
		double y6=Double.parseDouble(tokens1.nextToken());
		
		Punto p5=new Punto(x4,y4);
		Punto p6= new Punto(x5,y5);
		Punto p7=new Punto(x6,y6);
		Triangulo triang=new Triangulo (p5,p6,p7);
		
		if(triang.verificarSiEsTriang()==true){
			salida+="Es un Triagulo\nTipo de triangulo: "+ triang.verificarTipoTriang()+"\nSus vertices son"+triang.toString()+"\nSu area es: "+triang.calcularArea();
			}else{salida+="No ingreso puntos que formen un triangulo";
			}JOptionPane.showMessageDialog(null,"Datos:\n"+salida);
		
		break;
		}
		}
		}
	}

	