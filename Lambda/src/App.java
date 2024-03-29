interface Executable{
	int execute(int a);
};
// Interface with single method is called functional interface. For exp: Comparable and Runnable interface.
class Runner{
	public void run(Executable e) {
		System.out.println("Executing code block ...");
		int value = e.execute(10);
		System.out.println("Return value is *:"+value);
	}
}

/*
 
   ()->{
			System.out.println("This is code passed in a lambda expression");
			System.out.println("Hello, there");
			return 8;
		}
 
 

   ()->{
			System.out.println("This is code passed in a lambda expression");
			System.out.println("Hello, there");
		}
 
  
 */

public class App {
	
	public static void main(String[] args) {
		Runner runner = new Runner();
		//Without Lambda
		runner.run(new Executable() {
			public int execute(int a) {
				System.out.println("Hello, there.");
				return 7 + a;
			}
		});
		
		System.out.println("===========LAMBDA===================");
		// You don't really need to specify type of parameter if there is no method overloading (ambiguous method name)
		// For one parameter, we don't really need parenthesis.
		runner.run(a->9+a);
		
		runner.run((int a)->{
			System.out.println("This is code passed in a lambda expression");
			System.out.println("Hello, there");
			return 8+a;
		});
	}

}
