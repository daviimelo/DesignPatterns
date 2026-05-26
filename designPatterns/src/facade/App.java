package facade;

public class App {
    public static void main(String[] args) {
        String produto = "Notebook";
        String cartao = "1234-5678";

        ServicoFacade servico = new ServicoFacade();
        servico.operacao(produto, cartao);
    }
}