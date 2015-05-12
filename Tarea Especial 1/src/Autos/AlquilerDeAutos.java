package Autos;
import java.util.*;
public class AlquilerDeAutos {
	public static void clientes(int a){
		//En este metodo(clase) se almacenara el numero de DPI, Nombre, dirección y telefono del cliente
	}
	public static void Reservas(int a){
		//En esta clase se debe determinar el numero de reservas de un cliente en particular utilizando 
		//su numero de DPI como registro al igual que indicar el numero de vehiculos alquilados
	}
	public static void registro(int a){
		//En esta clase se debe almacenar la fecha de inicio y final de la reserva, el precio del
		//alquiler de cada uno de los automóviles, los galones de gasolina en el
		//depósito en el momento de realizar la reserva, el precio total de la reserva
		//y un indicador de si el automóvil o los automóviles han sido entregados.
	}
	public static void Autos(int a){
		//En esta clase se debe ingresar el codigo del automovil para que esta despliegue los datos sobre este,
		//como un determinado garaje para guardarl, la matricula, el modelo, el color y la marca.
	}
	public static void agencia(int a){
		//En esta clase se ingresa el numero de registro de la reserva y este debuelve las agencias que cuentan
		//con ese numero de registro. 
	}
	public static void main(String[] args) {
		int DPI=0;
		Scanner info=new Scanner(System.in);
		System.out.println("Ingrese el No. de DPI del cliente");
		DPI=info.nextInt();
		System.out.println("Los datos del cliente son: ");
		clientes(DPI);
		System.out.println("Las reservas hechas por el cliente son: ");
		Reservas(DPI);
		System.out.println("Los detalles de las reservas realizadas por el cliente son: ");
		registro(DPI);
		System.out.println("Los Autos reservados por el cliente son: ");
		Autos(DPI);
		System.out.println("Las agencias donde se realizaron las resevas fueron: ");
		agencia(DPI);
	}

}
