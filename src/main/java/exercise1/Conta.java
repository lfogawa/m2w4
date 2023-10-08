package exercise1;

public abstract class Conta {
    protected Double saldo;

    protected void obterSaldoAtual() {
        System.out.printf("O seu saldo atual é de %.2f.%n", this.saldo);
    }
}