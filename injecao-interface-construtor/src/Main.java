public class Main {
    public static void main(String[] args) {
        // Isso aqui seria um spring da vida;
        VendaService servicoProd1 = new VendaService(new Produto());
        servicoProd1.vender();
        // olha a facilidade da inversão de controle se eu precisar substituir/modificar a dependência
        // não mudei nada no código serviço apenas na implementação da dependência.
        VendaService servicoProd2 = new VendaService(new Produto2());
        servicoProd2.vender();
    }
}
