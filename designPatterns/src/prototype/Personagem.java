package prototype;

import java.util.ArrayList;
import java.util.List;

public class Personagem implements InterfacePrototype<Personagem> {
	private String tipo;
    private int pontosDeVida;
    private List<String> itensMochila; // Objeto complexo que precisa de cópia profunda

    // Construtor normal (Pesado)
    public Personagem(String tipo, int pontosDeVida) {
        this.tipo = tipo;
        this.pontosDeVida = pontosDeVida;
        this.itensMochila = new ArrayList<>();
    }

    // Este construtor recebe um objeto do mesmo tipo e copia os valores dele
    public Personagem(Personagem prototipo) {
        this.tipo = prototipo.tipo;
        this.pontosDeVida = prototipo.pontosDeVida;
        
        // Cópia Profunda
        // Se fizéssemos "this.itensMochila = prototipo.itensMochila", ambos usariam a mesma lista!
        this.itensMochila = new ArrayList<>(prototipo.itensMochila);
    }

    // Métodos para interagir com o objeto
    public void adicionarItem(String item) { this.itensMochila.add(item); }
    public void setPontosDeVida(int pontosDeVida) { this.pontosDeVida = pontosDeVida; }

    public void exibirInfo() {
        System.out.println(tipo + " [Vida: " + pontosDeVida + " | Itens: " + itensMochila + "]");
    }

    @Override
	public Personagem duplicar() {
		return new Personagem(this);
	}
}
