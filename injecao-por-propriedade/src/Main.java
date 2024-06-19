public class Main {
    public static void main(String[] args) {
        VendaService servico = new VendaService();
        servico.setProduto(new Produto());
        servico.vender();
    }
}