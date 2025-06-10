import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nome;
    BigDecimal saldo;

public static void main(String[] args) {

    ContaTerminal  contaTerminal = new ContaTerminal();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Por favor, digite o número da Agência !");
    contaTerminal.numero = scanner.nextInt();
    System.out.println("Por favor, digite o codigo da Agência !");
    contaTerminal.nome  = scanner.next();
    System.out.println("Por favor, digite o nome do cliente !");
    contaTerminal.nome = scanner.next();
    System.out.println("Por favor, informe o saldo !");
    contaTerminal.saldo = scanner.nextBigDecimal();

    System.out.println("Olá " + contaTerminal.nome  + " obrigado por criar uma conta em nosso banco, sua agência é: "
            + contaTerminal.nome  + " conta: " + contaTerminal.numero + "e seu saldo: " + contaTerminal.saldo + "R$ já está disponível para saque");

}
}