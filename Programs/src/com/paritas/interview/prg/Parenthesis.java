package com.paritas.interview.prg;

import java.util.Stack;

public class Parenthesis {

	public static boolean isParenthesisMatch(String str) {
	    Stack<Character> stack = new Stack<Character>();

	    char c;
	    for(int i=0; i < str.length(); i++) {
	        c = str.charAt(i);
System.out.println(c);
	        if(c == '(')
	            stack.push(c);
	        else if(c == '{')
	            stack.push(c);
	        else if(c == '[')
	            stack.push(c);
	        else if(c == ')')
	            if(stack.empty())
	                return false;
	            else if(stack.peek() == '(')
	                stack.pop();
	            else
	                return false;
	        else if(c == '}')
	            if(stack.empty())
	                return false;
	            else if(stack.peek() == '{')
	                stack.pop();
	            else
	                return false;
	        else if(c == ']')
	            if(stack.empty())
	                return false;
	            else if(stack.peek() == '[')
	                stack.pop();
	            else
	                return false;
	    }
	    return stack.empty();
	}

	public static void main(String[] args) {        
	    String str = "{}[]()";
	    System.out.println(isParenthesisMatch(str)); 
	}

}
