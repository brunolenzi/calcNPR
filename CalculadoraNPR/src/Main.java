import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
		
	public static void main(String[] args) throws IOException {
		
			Pilha p = new Pilha();
		
		int v1, v2;
		char c;
		
		System.out.println("Exemplo de como inserir a expressão:\n 5 1 + 4 * 2 4 * - ");
		System.out.print("Informe sua expressão:\n ");
		
		String s = lerString(); 
		
		for (int i = 0; i < s.length(); i++) {
			
			c = s.charAt(i);
			
		    if (Character.isDigit(c))  {
		
		    	p.push(Character.digit(c,10));
		   
		    } else if(c == '+') { 
			
		    	v1 = p.top(); p.pop(); 
		    	v2 = p.top(); p.pop(); 
		    	p.push(v2 + v1); 
		    
		    } else if(c == '*') { 
			
		    	v1 = p.top(); p.pop(); 
			    v2 = p.top(); p.pop(); 
			    p.push(v2 * v1);
	    
		    } else if(c == '-') {
		 
		    	v1 = p.top(); p.pop();
		        v2 = p.top(); p.pop();
		        p.push(v2 - v1); 
		   
		    } else if(c == '/') {
		 
		    	v1 = p.top(); p.pop(); 
		        v2 = p.top(); p.pop(); 
		        p.push(v2 / v1); 
		   
		    } else if(c == '^') { 
		 
		    	v1 = p.top(); p.pop();
          		v2 = p.top(); p.pop(); 
		        p.push((int) Math.pow(v2,v1)); 
		        
		    }
	    }
		
		System.out.println("Resultado da expressão: " + p.top());
		p.pop(); 
	} 
		
	public static String lerString() throws IOException {
			
		InputStreamReader isr = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(isr); 
		
		return br.readLine(); 
	} 
}
