package exercise2;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Gerente gerente1 = new Gerente();

        System.out.println(funcionario1.obterCargo());
        System.out.println(gerente1.obterCargo());
    }
}