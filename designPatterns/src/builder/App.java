package builder;

import builder.Computador.ComputadorBuilder;

public class App {
	public static void main(String[] args) {
		Computador compB = new Computador.ComputadorBuilder("Intel Core I9", "32GB", "Gigabyte")
				.builder();
		
		Computador pcCompleto = new Computador.ComputadorBuilder("Intel Core I9", "128GB", "Gigabyte Topo de Linha")
				.comBluetooth(true)
				.comPlacaDeVideo("RTX 5090")
				.builder();
		
		System.out.println(pcCompleto);
	}
}
