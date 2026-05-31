package singleton;

public class App {
	public static void main(String[] args) {
		ConfigSingleton configOne = ConfigSingleton.getInstance();
		ConfigSingleton configTwo = ConfigSingleton.getInstance();
		
		if (configOne == configTwo) {
			System.out.println("Os dois possuem a mesma instância!");
		} else {
			System.out.println("Algo deu errado!");
		}
	}
}
