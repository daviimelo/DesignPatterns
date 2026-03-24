package facade;

import facadeService.EstoqueService;
import facadeService.LogisticaService;
import facadeService.NotificacaoService;
import facadeService.PagamentoService;

public class App {
    public static void main(String[] args) {
        String produto = "Notebook";
        String cartao = "1234-5678";

        EstoqueService estoque = new EstoqueService();
        PagamentoService pagamento = new PagamentoService();
        LogisticaService logistica = new LogisticaService();
        NotificacaoService notificacao = new NotificacaoService();

        if (estoque.verificar(produto)) {
            if (pagamento.cobrar(cartao)) {
                logistica.despachar(produto);
                notificacao.enviarEmail();
                System.out.println("Compra finalizada com sucesso!");
            }
        }
    }
}