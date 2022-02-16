package com.practice.stack;

import java.util.Stack;

public class InfixToPostfix {

	static int Prec(char c) {

		switch (c) {
		case '+':
		case '-':
			return 1;

		case '*':
		case '/':
			return 2;

		case '^':
			return 3;

		default:
			return -1;
		}
	}
	
	
	public static String infixToPrefix(String exp) {
		
		String result = new String();
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < exp.length(); i++) {
			
			char c = exp.charAt(i);
			if(Character.isLetterOrDigit(c)) {
				result += c;
			} else if(c == '(') {
				stack.push(c);
			} else if(c == ')') {
				while(!stack.isEmpty() && stack.peek() != '(')
					result += stack.pop();
				
				stack.pop();
				
			}
		}
		
		return "";
	}
	
}
