import java.util.*;
import java.io.*;
public class Practica1 {
	public static void Rombo(){
		for(int i=0;i<5;++i){
			for(int j=0;j<4-i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++){
				System.out.print("*");
			}
				System.out.println();
		}
		for(int l=3;l>=0;--l){
			for(int m=0;m<4-l;m++){
				System.out.print(" ");
			}
			for(int n=0;n<2*l+1;n++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static int Notas(int a, int b,int c,int d,int e,int f){
		int g;
		g=(a+b+c+d+e+f)/6;
		return g;
	}
	public static double AreaC(double r){
		double a;
		a=(3.141592654)*(r*r);
		return a;
	}
	public static double PerimetroC(double r){
		double p;
		p=2*(3.141592654)*r;
		return p;
	}
	public static double AreaU(double r){
		double a;
		a=r*r;
		return a;
	}
	public static double PerimetroU(double r){
		double p;
		p=4*r;
		return p;
	}
	public static double AreaT(double r){
		double a;
		a=(0.5)*(r)*((1.7321*r)/2);
		return a;
	}
	public static double PerimetroT(double r){
		double p;
		p=3*r;
		return p;
	}
	public static int sum(int a, int b){
		int r;
		r=a+b;
		return r;
	}
	public static int res(int a, int b){
		int r;
		r=a-b;
		return r;
	}
	public static int mul(int a, int b){
		int r;
		r=a*b;
		return r;
	}
	public static int div(int a, int b){
		int r;
		r=a/b;
		return r;
	}
	public static void TablaM(int a){
		int i, n;
		for(i=0;i<11;i++){
		n=10-i;
		System.out.println(a+" X "+n+"="+(a*n));
		}
	}
	public static String Decena(int a){
		switch (a){
		case 1:
			return "diez";
		case 2: 
			return "Veinti";
		case 3:
			return "Treinta";
		case 4:
			return "Cuarenta";
		case 5:
			return "Cincuenta";
		case 6:
			return "Sesenta";
		case 7:
			return "Setenta";
		case 8:
			return "Ochenta";
		case 9:
			return "Noventa";
		default:
			return "";
		}
	}
	public static String Unidad(int b){
		switch (b){
		case 1:
			return "Uno";
		case 2:
			return "Dos";
		case 3:
			return "Tres";
		case 4:
			return "Cuatro";
		case 5:
			return "Cinco";
		case 6:
			return "Seis";
		case 7:
			return "Siete";
		case 8:
			return "Ocho";
		case 9:
			return "Nueve";
		default:
			return "";
		}
	}
	public static String Diferentes(int c){
		switch (c){
		case 1:
			return "Once";
		case 2:
			return "Doce";
		case 3:
			return "Trece";
		case 4:
			return "Catorce";
		case 5:
			return "Quince";
		case 6:
			return "Dieciseis";
		case 7:
			return "Diecisiete";
		case 8:
			return "Dieciocho";
		case 9:
			return "Diecinueve";
		default:
			return "";
		}
	}
	public static String unit(int a){
		switch (a){
		case 1:
			return "I";
		case 2:
			return "II";
		case 3:
			return "III";
		case 4:
			return "IV";
		case 5:
			return "V";
		case 6:
			return "VI";
		case 7:
			return "VII";
		case 8:
			return "VIII";
		case 9:
			return "IX";
		default:
			return "";
		}
	}
	public static String decen(int b){
		switch (b){
		case 1:
			return "X";
		case 2:
			return "XX";
		case 3:
			return "XXX";
		case 4:
			return "XL";
		case 5:
			return "L";
		case 6:
			return "LX";
		case 7:
			return "LXX";
		case 8:
			return "LXXX";
		case 9:
			return "XC";
		default:
			return "";
		}
	}
	public static String cente(int c){
		switch (c){
		case 1:
			return "C";
		case 2:
			return "CC";
		case 3:
			return "CCC";
		case 4:
			return "CD";
		case 5:
			return "D";
		case 6:
			return "DC";
		case 7:
			return "DCC";
		case 8:
			return "DCCC";
		case 9:
			return "CM";
		default:
			return "";
		}
	}
	public static void invert(int a){
		for(int l=a;l>0;--l){
			for(int m=0;m<a-l+1;m++){
				System.out.print(" ");
			}
			for(int n=0;n<l;n++){
				System.out.print(a-l+1+" ");
			}
			System.out.println();
		}
	}
	public static void cuadrados(int a){
		for(int i=2;i<=a;i++){
			for(int j=1;j<=a;j++){
				if(j==1 || j==a || i==2 || i==a){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
	public static void main(String[] args) {
	int opcion=0;
	do{
		Scanner op =new Scanner(System.in);
		System.out.println("Problemas Nivel 1");
		System.out.println("1. App Rombo");
		System.out.println("2. App Notas");
		System.out.println("3. App Hora");
		System.out.println("4. App Calculos");
		System.out.println("5. App Días");
		System.out.println("Problemas Nivel 2");
		System.out.println("6. App Calculadora");
		System.out.println("7. App Tablas");
		System.out.println("8. App Limites");
		System.out.println("9. App No. Romanos");
		System.out.println("10. App Piramide");
		System.out.println("11. App Letras y Romanos");
		System.out.println("12. App Asteriscos");
		System.out.println("13. App Abecedario");
		System.out.println("14. App Cuadrado");
		System.out.println("15. App Primos");
		System.out.println("16. SALIR");
		System.out.println("Ingrese el numero de la opción escogida");
		opcion=op.nextInt();
	switch(opcion){
		case 1:
		Rombo();
		break;
		case 2:
		int a,b,c,d,e,f,media,salir=1;
		do{
		Scanner nota=new Scanner(System.in);
			System.out.println("Ingrese 6 notas del curso IPC1");
			a=nota.nextInt();
			b=nota.nextInt();
			c=nota.nextInt();
		    d=nota.nextInt();
		    e=nota.nextInt();
		    f=nota.nextInt();
		    if(a>100||b>100||c>100||d>100||e>100||f>100){
		    	System.out.println("ERROR: Debe ingresar valores menores que 100, intente nuevamente");
		    	a=0;b=0;c=0;d=0;e=0;f=0;
		    }
		    	else{
		    	media=Notas(a,b,c,d,e,f);
			    System.out.println("La media es: "+media);
			    if(media<101 && media>89){
			    	System.out.println("Su puntuación es A");
			    }
			    else if(media<90 && media>79){
			    	System.out.println("Su puntuación es B");
			    }
			    else if(media<80 && media>69){
			    	System.out.println("Su puntuación es C");
			    }
			    else if(media<70 && media>59){
			    	System.out.println("Su puntuación es D");
			    }
			    else if(media<60){
			    	System.out.println("Su puntuación es E");
			    }
			    System.out.println("si desea salir escriba 0 si no escriba cualquier numero");
			    salir=nota.nextInt();
		    	}}while(salir!=0);
			break;
			case 3:
			int hora, minutos;String primero;
			do{
			Scanner dato=new Scanner(System.in);
			System.out.println("Escriba la hora en formato 24h, no olvide colocar : despues de haber ingresado la hora");
			primero=dato.nextLine();
			hora=Integer.parseInt(primero.substring(0, primero.indexOf(":"))); 
			minutos=Integer.parseInt(primero.substring(primero.indexOf(":")+1,primero.length()));
			if(hora>24||minutos>60){
			System.out.println("ERROR: El formato no es correcto intente nuevamente");	
			}else{
				if(hora==0){
					System.out.println("La hora en su nuevo formato es: "+(hora+12)+":"+minutos+" AM");
				}else if(hora==12){
					System.out.println("La hora en su nuevo formato es: "+hora+":"+minutos+" PM");
				}else if(hora>12){
					System.out.println("La hora en su nuevo formato es: "+(hora-12)+":"+minutos+" PM");
				}else{
					System.out.println("La hora en su nuevo formato es: "+hora+":"+minutos+" AM");
				}
			}}while(hora>24||minutos>60);
			break;
			case 4:
				String dato="c",dat="u",da="t", val;double Ac,Pc,Au,Pu,At,Pt,R;int sal=1;
				do{
				Scanner radio=new Scanner(System.in);
				Scanner letra=new Scanner(System.in);
				Scanner validacion=new Scanner(System.in);
				System.out.println("Escriba un Valor X");
				R=radio.nextDouble();
				Ac=AreaC(R);
				Pc=PerimetroC(R);
				Au=AreaU(R);
				Pu=PerimetroU(R);
				At=AreaT(R);
				Pt=PerimetroT(R);
				System.out.println("Desea realizar el calculo de un:");
				System.out.println("c: Circulo");
				System.out.println("u: Cuadrado");
				System.out.println("t: Triangulo");
				System.out.println("Ingrese la letra que identifica la opción escogida");
				val=letra.nextLine();
				if(dato.equals(val)){
					System.out.println("Este es el radio del circulo: "+R);
					System.out.println("Este es el perimetro del circulo: "+Pc);
					System.out.println("Esta es el area del circulo: "+Ac);
				}else if(dat.equals(val)){
					System.out.println("Este es un lado del cuadrado: "+R);
					System.out.println("Este es el perimetro del cuadrado: "+Pu);
					System.out.println("Esta es el area del cuadrado: "+Au);
				}else if(da.equals(val)){
					System.out.println("Este es un lado del triangulo: "+R);
					System.out.println("Este es el perimetro del triangulo: "+Pt);
					System.out.println("Esta es el area del triangulo: "+At);
				}else{
					System.out.println("Si desea salir presione 0 si no presione cualquier numero");
					sal=validacion.nextInt();
				}}while(sal!=0);
				break;
			case 5:
				int dia1, mes1, dia2, mes2, diaf, mesf, resultado; String fecha1, fecha2;
				Scanner info1=new Scanner(System.in);
				Scanner info2=new Scanner(System.in);
				System.out.println("Ingrese la fecha de inicio, no olvide colocarle en este formato dia/mes el año es 2015");
				fecha1=info1.nextLine();
				System.out.println("Ingrese la fecha de corte, no olvide colocarle en este formato dia/mes el año es 2015");
				fecha2=info2.nextLine();
				dia1=Integer.parseInt(fecha1.substring(0, fecha1.indexOf("/"))); 
				mes1=Integer.parseInt(fecha1.substring(fecha1.indexOf("/")+1,fecha1.length()));
				dia2=Integer.parseInt(fecha2.substring(0, fecha2.indexOf("/"))); 
				mes2=Integer.parseInt(fecha2.substring(fecha2.indexOf("/")+1,fecha2.length()));
				diaf=dia2-dia1;
				mesf=mes2-mes1;
				resultado= (mesf*30)+diaf;
				System.out.println("El numero de días que hay de diferencia entre las dos fechas es: "+resultado);
				break;
			case 6:
				int su,re,mu,di,m,n,out=1; String suma="s", resta="r", multiplicacion="m", division="d", option;
				Scanner ing=new Scanner(System.in);
				Scanner valor=new Scanner(System.in);
				Scanner salida=new Scanner(System.in);
				do{
				System.out.println("Ingrese su primer numero");
				m=valor.nextInt();
				System.out.println("Eliga la operación que desea realizar");
				System.out.println("(s): +");
				System.out.println("(r): -");
				System.out.println("(m): x");
				System.out.println("(d): /");
				option=ing.nextLine();
				System.out.println("Ingrese su segundo numero");
				n=valor.nextInt();
				if(suma.equals(option)){
				su=sum(m,n);
				System.out.println("La suma de ambos numeros es: "+su);
				}else if(resta.equals(option)){
				re=res(m,n);
				System.out.println("La resta de ambos numeros es: "+re);
				}else if(multiplicacion.equals(option)){
					mu=mul(m,n);
					System.out.println("La multiplicación de ambos numeros es: "+mu);
				}else if(division.equals(option)){
					di=div(m,n);
					System.out.println("El cociente de la division entre ambos numeros es: "+di);
				}else{
					System.out.println("No eligio ninguna opcion desea salir? si lo desea oprima 0 sino oprima cualquier numero");
					out=salida.nextInt();
				}}while(out!=0);
				break;
			case 7:
				int tabla;
				Scanner digito=new Scanner(System.in);
				Scanner salte=new Scanner(System.in);
				do{
				System.out.println("Escriba un numero entre 0 y 10");
				tabla=digito.nextInt();
				if(tabla<0 || tabla>10){
					System.out.println("ERROR: Debe de escribir un numero en el rango [0,10], intente nuevamente");	
				}else{
					TablaM(tabla);
					break;
				}}while(tabla>=0 || tabla<11);
				break;
			case 8:
				int vi, vf, rando, deci, unida;
				Scanner lim= new Scanner(System.in);
				System.out.println("Ingrese un rango de [0,100], el primer valor es el inicio y el siguiente es el final");
				vi=lim.nextInt();
				vf=lim.nextInt();
				rando=(int)(Math.random()*(vf-vi)+vi);
				System.out.println("Este es su valor generado de manera aleatoria: "+rando);
				if(rando>10 && rando<20){
					deci=rando/10;
					unida=(rando-(deci*10));
					System.out.println("Su resultado es: "+Diferentes(unida));
				}else if(rando<10){
					deci=rando/10;
					unida=(rando-(deci*10));
					System.out.println("Su resultado es: "+Unidad(unida));
				}else{
				deci=rando/10;
				unida=(rando-(deci*10));
				System.out.println("Su resultado es: "+Decena(deci)+" Y "+Unidad(unida));
				}
				break;
			case 9:
				int num, cente, dece, uni;
				Scanner arab=new Scanner(System.in);
				System.out.println("Ingrese un valor");
				num=arab.nextInt();
				cente=num/100;
				dece=(num-(cente*100))/10;
				uni=((num-(cente*100))-(dece*10));
				if(num>0 && num<10){
					System.out.println("El numero ingresado en formato romano es: "+unit(uni));
				}else if(num>9 && num<100){
					System.out.println("El numero ingresado en formato romano es: "+decen(dece)+unit(uni));
				}else{
					System.out.println("El numero ingresado en formato romano es: "+cente(cente)+decen(dece)+unit(uni));
				}
				break;
			case 10:
				int pir;
				Scanner invertida=new Scanner(System.in);
				System.out.println("Escriba un valor");
				pir=invertida.nextInt();
				invert(pir);
				break;
			case 11:
				break;
			case 12:
				String tex;
				Scanner caracter=new Scanner(System.in);
				System.out.println("Escriba una oración");
				tex=caracter.nextLine();
				char[] arraychar=tex.toCharArray();
				for(int i=0;i<arraychar.length;i++){
					System.out.print("*");
				}
				System.out.println(" ");
				break;
			case 13:
				break;
			case 14: 
				int lado;
				Scanner numero=new Scanner(System.in);
				System.out.println("Escribra la magnitud del lado del cuadrado");
				lado=numero.nextInt();
				cuadrados(lado);
				break;
			case 15:
				int g, h, ini, fin, vat;
				boolean primo;
				Scanner termin=new Scanner(System.in);
				System.out.println("Escibra el inicio del dominio");
				ini=termin.nextInt();
				System.out.println("Escibra el final del dominio");
				fin=termin.nextInt();
				for(g=ini;g<=fin;g++){
					primo=true;
					for(h=2;h<g;h++){
						if(g%h==0){
							primo=false;
						}
					}
					if(primo){
						System.out.println(g+" ");
						System.out.println("Es un numero primo");
					}
				}
		    }}while(opcion!=16);
	}
}

	