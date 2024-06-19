public class Main {
    public static void main(String[] args) {
        VendaService servico = new VendaService(new Produto());
        servico.vender();
    }
}