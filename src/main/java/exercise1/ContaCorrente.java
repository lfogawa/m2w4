package exercise1;

public class ContaCorrente extends Conta implements Operavel {
    public ContaCorrente() {
        this.saldo = 0.0;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();

        conta1.depositar(100);
        conta1.sacar(50);

        conta1.obterSaldoAtual();
    }
}