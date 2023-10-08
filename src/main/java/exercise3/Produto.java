package exercise3;

public class Produto implements Tributavel{
    private Double valor;
    private Double valorImposto;

    @Override
    public Double calcularValorComImposto(){
        this.valor += valorImposto;
        return this.valor;
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.valor = 10.0;
        produto1.valorImposto = 15.0;
        System.out.println(produto1.calcularValorComImposto());
    }
}
