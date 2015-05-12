package paqueton;
import java.util.Stack;
class ColaConPilas {
	/**
	 * push
	 * pop
	 * peek
	 * empty
	 * @param args
	 */
	public static void main(String[] args) {
		Stack pila=new Stack();
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);
		while(pila.empty()==false){
			Stack pila2=new Stack();
			pila2.push(pila.pop());
			pila2.push(pila.pop());
			pila2.push(pila.pop());
			pila2.push(pila.pop());
			pila2.push(pila.pop());
			while(pila2.empty()==false){
				System.out.println(pila2.pop());	
			}
		}

	}

}
