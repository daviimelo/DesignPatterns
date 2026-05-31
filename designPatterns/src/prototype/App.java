package prototype;

public class App {
    public static void main(String[] args) {
        
        // Criamos o protótipo inicial com uma Poção na mochila
        Personagem orcPrototipo = new Personagem("Orc", 100);
        orcPrototipo.adicionarItem("Poção de Vida");
        
        System.out.print("Protótipo original: ");
        orcPrototipo.exibirInfo();

        // Clonamos usando o nosso método do zero
        Personagem orcClonado1 = orcPrototipo.duplicar();
        Personagem orcClonado2 = orcPrototipo.duplicar();
        
        // Modificamos os clones de forma independente
        orcClonado1.setPontosDeVida(75);
        orcClonado1.adicionarItem("Espada de Ferro"); // Item adicionado SÓ no clone 1
        
        orcClonado2.setPontosDeVida(50);
        orcClonado2.adicionarItem("Escudo de Madeira"); // Item adicionado SÓ no clone 2

        System.out.println("\nApós as modificações nos clones");
        System.out.print("Protótipo original: ");
        orcPrototipo.exibirInfo(); // Continua intacto!
        
        System.out.print("Orc Clonado 1:      ");
        orcClonado1.exibirInfo();
        
        System.out.print("Orc Clonado 2:      ");
        orcClonado2.exibirInfo();
    }
	
}
