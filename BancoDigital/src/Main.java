import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente jota = new Cliente();
        jota.setNome("Jota");

        Conta conta = new ContaCorrente(jota);
        Conta poupanca = new ContaPoupanca(jota);

        conta.depositar(100);
        conta.transferir(50, poupanca);

        conta.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}