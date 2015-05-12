package Empresa_de_Limpieza;
import java.util.*;
public class Sueldo_Empleados {
	public static void empleados(){
		String a,b,c;int i=0;
		Scanner emp=new Scanner(System.in);
		Scanner nu=new Scanner(System.in);
		a=emp.nextLine();
		b=emp.nextLine();
		c=emp.nextLine();
		String nombre[]={a,b,c};
		System.out.println("Ingrese el numero del empleado que desee");
		i=nu.nextInt();
		System.out.println("Ahora escriba los datos que se le piden de: "+nombre[i]);
		//Se le solicitan datos como DPI, nombre, dirección, número de teléfono,
		//fecha de contratación, sueldo base, etc. estos son almacenados en otros vectores y cada uno en el orden 
		//perteneciente al codigo del empleado. 
	}
	public static void TipoEmpleado(int a){
		double sueldo, tot, horas;
		Scanner suet=new Scanner(System.in);
		Scanner ext=new Scanner(System.in);
		switch(a){
		case 0:
		System.out.println("El empleado es limpiador");
		System.out.println("Escriba el sueldo base del empleado");
		sueldo=suet.nextInt();
		System.out.println("Escriba el numero de horas extra que trabajo");
		horas=ext.nextInt();
		tot=sueldo+(horas*(sueldo*0.05));
		System.out.println("El sueldo del empleado con codigo: "+a+"Es de: "+tot);
		//Segun sea el tipo de empleado se realizara el calculo requerido indicado posiblemente solo una variable mas 
		//como lo es, el numero de contratos conseguidos, el numero de comerciales a cargo. 
		}
		
	}
	public static void main(String[] args) {
	String opc,con="a", sue="b";int va=0;
	Scanner op=new Scanner(System.in);
	Scanner co=new Scanner(System.in);
	System.out.println("(a) Contratación y despidos");
	System.out.println("(b) Sueldos"); 
	opc=op.nextLine();
	if(opc.equals(con)){
		empleados();
	}else if(opc.equals(sue)){
		System.out.println("Escriba el codigo del puesto que posee el empleado a pagar: "+"\n"+"(0) Limpiadores"+"\n"+"(1) Comerciales"+"\n"+"(2) Administrativos"+"\n"+"(3) Encargados");
		va=co.nextInt();
		TipoEmpleado(va);
	}else{
		System.out.println("La opcion escogida es incorrecta, inicie nuevamente");
	}
	}

}
