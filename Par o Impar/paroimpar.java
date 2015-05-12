import java.util.Scanner;
public class paroimpar {
	public static boolean pares(int num){
		for(int i=2;i<num;i++)
		if(num%i==0)
			return true;
		else
		return false;
		return false;
	}
	public static void main(String[] args) {
		int num=0;
		Scanner S = new Scanner(System.in);
		System.out.println("Escribir un numero");
		num = S.nextInt();
			if(pares(num))
				System.out.println(num +  "  Es un numero par");
			else
				System.out.println(num +  "  Es un numero impar");
		}
	}
