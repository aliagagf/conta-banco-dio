import java.util.Scanner;

public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public ContaTerminal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Qual é o seu nome?");
        nomeCliente = scanner.nextLine();
        System.out.println("Qual será a sua agência?");
        agencia = scanner.nextLine();
        System.out.println("Qual o número da conta?");
        numero = scanner.nextInt();
        System.out.println("Qual será o saldo inicial?");
        saldo = scanner.nextDouble();
        scanner.close();
    }

    public void mensagem(){
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
    public static void main(String[] args) throws Exception {
        ContaTerminal conta1 = new ContaTerminal();

        conta1.mensagem();
    }
}
