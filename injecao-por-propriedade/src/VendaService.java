public class VendaService {
    private Produto produto;

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    // uso de inversão de controle sem a abstração a classe Service conhece o comportamento de vender.
    public void vender() {
        this.produto.vender();
    }
}
