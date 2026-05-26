package facade;

public class ServicoFacade {
	public void operacao(String produto, String cartao) {
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
