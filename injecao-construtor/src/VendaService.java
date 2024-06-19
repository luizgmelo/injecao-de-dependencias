public class VendaService {
    private Produto produto;

    // construtor de um objeto concreto e não interface, dificil mudar esse objeto para outro.
    public VendaService(Produto produto) {
        this.produto = produto;
    }
    // sem abstração a classe conhece a implementação da dependência.
    public void vender() {
        this.produto.vender();
    }
}
