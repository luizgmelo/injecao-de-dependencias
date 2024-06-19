// Injeção de depêndencia atráves de contrutor
// A responsabilidade da criação do produto vem de quem instância venda.
// portanto é utiliza inversão de controle.
public class VendaService {
    // perceba que a responsabilidade dos metódos vem de uma abstração
    // facilitando apenas criar uma classe que implementa a abstração
    // e substituindo na injeção da dependência facilitando a substituição.
    private ProdutoInterface produto;

    public VendaService(ProdutoInterface produto) {
        this.produto = produto;
    }

    public void vender() {
        // vendaService não sabe o que vem em vender.
        this.produto.vender();
    }
}
