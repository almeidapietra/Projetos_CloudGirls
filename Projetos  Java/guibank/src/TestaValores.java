public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(06, 80080);
        System.out.println(conta.getAgencia());
        conta.setAgencia(121212);

        Conta conta2 = new Conta(45, 878787);
        Conta conta3 = new Conta(12, 454545);

        System.out.println(Conta.getTotal());

    }
}
