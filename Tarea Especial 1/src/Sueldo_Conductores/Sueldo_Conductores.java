import java.util.*;
public class Sueldo_Conductores {
	public static int personas(int a, int b){
		//Este metodo debe de verificar si el numero de personas es mayor que 9, se multiplicara
		//el numero de horas trabajadas por 1 y devolvera ese valor + Q700 + 5(horas trabajadas), si el numero no es mayor que 9
		//este multiplicara el numero de horas trabajadas por 0.5 y devolvera ese valor + Q700 +5*(a).
		}
	public static int mercancias(int a, int b){
		//Este metodo debe de multiplicar el numero de toneladas transportadas por Q2 y eso +Q700 + 5*(a).
	}
	public static int peligro(int a,int b, int c){
		//Este metodo debe de multiplicar el numero de toneladas transportadas por Q2 + Q0.5*(c)  y eso +Q700 + 5*(a).
	}
	public static void main(String[] args) {
	String conductor,opcion, personas="a",mercancias="b",peligro="c"; int horas=0, varios=0, transportes=0;
	Scanner con=new Scanner(System.in);
	Scanner hor=new Scanner(System.in);
	Scanner op=new Scanner(System.in);
	Scanner no=new Scanner(System.in);
	Scanner tran=new Scanner(System.in);
    System.out.println("Escriba el No. de DPI del conductor");
    conductor=con.nextLine();
    System.out.println("Escriba el numero de horas trabajadas");
    horas=hor.nextInt();
    System.out.println("Indique el tipo de transporte realizado");
    System.out.println("(a) Transporte de personas");
    System.out.println("(b) Transporte de Mercancias");
    System.out.println("(c) Transporte de Mercancias peligrosas");
    opcion=op.nextLine();
    if(opcion.equals(personas)){
    	 System.out.println("Indique el numero de personas transportadas");
    	 varios=no.nextInt();
    	 System.out.println("El Monto a cancelar al conductor con No. de DPI: "+conductor+" es: "+personas(horas,varios));
    }else if(opcion.equals(mercancias)){
    	 System.out.println("Indique el numero de toneladas transportadas");
    	 varios=no.nextInt();
    	 System.out.println("El Monto a cancelar al conductor con No. de DPI: "+conductor+" es: "+mercancias(horas,varios));
    }else if(opcion.equals(peligro)){
    	System.out.println("Indique el numero de toneladas transportadas");
   	    varios=no.nextInt();
   	    System.out.println("Indique el numero de transportes realizados");
   	    transportes=tran.nextInt();
   	    System.out.println("El Monto a cancelar al conductor con No. de DPI: "+conductor+" es: "+peligro(horas,varios,transportes));
    }else{
    	System.out.println("Opción incorrecta inicie nuevamente la App");
    }
	
	}

}
