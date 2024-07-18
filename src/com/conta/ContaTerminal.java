package com.conta;
import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    int numeroConta;
    String agencia;
    String nomeCliente;
    double saldo;
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public void main(String[] args) {
        System.out.println("Bem vindo(a) ao nosso banco.\nQual o seu nome?");
        nomeCliente = scanner.next();
        agencia = scanner.next();
        System.out.println("Digite o número da sua conta: ");
        numeroConta = scanner.nextInt();
        System.out.println("Digite a sua agência: ");
        agencia = scanner.next();
        System.out.println("Digite o saldo: ");
        saldo = scanner.nextDouble();
        System.out.println("Olá " + nomeCliente + ",obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta 
        + " e seu saldo de R$" + saldo +" já está disponível para saque!");
    }
}
