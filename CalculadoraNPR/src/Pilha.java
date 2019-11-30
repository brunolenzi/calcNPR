public class Pilha { 
		
	private No top;
	public Pilha() {
	
		top = null; 
	}
		
	public boolean empty() { 
		
		return (top == null);
	}
		
	public int top() { 
		
		return top.item; 
	}
		
	public void pop() { 
		
		if (!empty()) {
			top = top.ant;	
		}
	}
		
	public void push(int valor) {
			
		No novo = new No(); 
		novo.item = valor;
		novo.ant = top;
		top = novo; 
	}
}