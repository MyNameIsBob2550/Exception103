/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception103;

/**
 *
 * @author cis31
 */
class MyException extends Exception {
	MyException(String s) { super(s);}
}
public class MyExceptionTest2 {
	static void sayHello(String s) throws MyException {
		if (s.equals("John"))
			throw new MyException("BAD BOY");
		System.out.println("Hello! " + s);
	}
	public static void main(String args[]) {
		try {
			sayHello("Jame");
		} 
		catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

}
