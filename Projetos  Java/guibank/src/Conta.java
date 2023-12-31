public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    //static faz com que o total seja da class, ou seja o resultado de todos os objetos conta criados, sem o static iria ser o total de cada objeto.
    private static int total = 0;

    //construtor (os parametros são dados necessarios para criar uma nova conta:
    public Conta(int agencia, int numero) {
        total++; //que é o mesmo que Conta.total
        System.out.println("o total de contas é " + total);
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = 100;
        System.out.println("estou criando uma conta " + this.numero);
    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
            /* else é opcional, pois o return para a execução do metodo*/
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Não é permitido valor negativo");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Não é permitido valor negativo");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}