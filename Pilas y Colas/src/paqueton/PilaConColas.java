package paqueton;
import java.util.LinkedList;
public class PilaConColas {
	/**
	 * offer, poll
	 */
	public static void main(String[] args) {
		LinkedList cola = new LinkedList();
		cola.offer(1);
		cola.offer(2);
		cola.offer(3);
		cola.offer(4);
		cola.offer(5);
		while(cola.peek()!=null){
			LinkedList cola2=new LinkedList();
			cola2.push(cola.poll());
			cola2.push(cola.poll());
			cola2.push(cola.poll());
			cola2.push(cola.poll());
			cola2.push(cola.poll());
			while(cola2.peek()!=null){
				System.out.println(cola2.poll());
			}
		}
	}

}
