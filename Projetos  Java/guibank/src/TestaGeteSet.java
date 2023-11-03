public class TestaGeteSet {
    public static void main(String[] args) {
        Conta conta = new Conta(01, 6678);
        //conta.numero=1337
        conta.setNumero(1337);
        //não pode dar um sout em conta.numero por ser privado, tem que chamar o metodo get pra isso:
        System.out.println(conta.getNumero());

        Cliente otelo = new Cliente();
        otelo.setNome("Otelo");
        //conta.titular = otelo
        conta.setTitular(otelo);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("gato");
    }
}
