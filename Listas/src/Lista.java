class Nodo {
	int valor;
	Nodo next;
	public Nodo(int valor){
		this.valor=valor;
	}
}
public class Lista{
	Nodo origen = null;
	void sum(int valor){
		if(origen==null){
			origen=new Nodo(valor);
		}
		else{
			Nodo mom=origen;
			origen=new Nodo(valor);
			origen.next=mom;
		}
	}
void show(){
	Nodo mom=origen;
	if(mom==null)
		System.out.println("Lista vacia");
	else{
		System.out.print("[ ");
		while (mom!=null){
			System.out.print(mom.valor+" ");
			mom=mom.next;
		}
		System.out.println("]");
	}
}
	public static void main(String[] args) {
		Lista lista=new Lista();
		lista.sum(1);
		lista.show();
		lista.sum(2);
		lista.show();
	}
}

