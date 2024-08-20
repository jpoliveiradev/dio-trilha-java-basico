import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        Double saldo;
        String agencia, nomeCliente;

        Scanner leitura = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número: ");
        numero = leitura.nextInt();
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = leitura.next();
        System.out.print("Por favor, digite o nome do Cliente: ");
        nomeCliente = leitura.next();
        System.out.print("Por favor, digite o valor do Saldo: ");
        saldo = leitura.nextDouble();

        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d, e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo
        );

        System.out.println(mensagem);
    }
}