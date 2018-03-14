import java.util.*;

/**
 *
 * @author Jefferson Villa, Gustavo Ojeda
 */
public class Taller8 {
    
    //Punto 1
    public static Stack<Integer> inversa (Stack<Integer> stack){
        Stack<Integer> reversed = new Stack<Integer>();
	while(!stack.empty())
	    reversed.push(stack.pop());
	return reversed;
    }//O(n)
    
    
    //Punto 2
    public static void cola (Queue<String> queue){
	while(queue.peek() != null)
	    System.out.println("Atiendo a " + queue.poll());
    }//O(n) a ojimetro
    
    
    //notacion polaca
    public static int polaca(String string){
	String[] sub = string.split(" "); 
	Stack<Integer> stack = new Stack<Integer>(); 
	for(int i = 0; i < sub.length; i++){
	    String s = sub[i]; 
	    //System.out.println(s);
	    if(!s.equals("+") && !s.equals("-") 
	       && !s.equals("*") && !s.equals("/")){
		stack.push(Integer.parseInt(s));
	    }else{
		switch(s){
		case "+":
		    stack.push(stack.pop() + stack.pop());
		    break;
		case "-":
		    stack.push(stack.pop() - stack.pop());
		    break;
		case "*":
		    stack.push(stack.pop() * stack.pop());
		    break;
		case "/":
		    stack.push(stack.pop() / stack.pop());
		    break;
		}
	    }       
	}
	return stack.pop();
    }//O(n) a ojimetro
}