package execicios;

public class Calculo {

    public static void main(String[] args) {
        /*
        1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
        mostre-a expressa em dias. Considere o ano com 365 dias e o mês com 30.
        (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
         */
        float anos = 3;
        float mes = 2;
        float dias = 15;
        float idade = (anos * 365) + (mes * 30) + dias;
        System.out.println("Voce possui "+idade+" dias de idade.");

        //2. Informar um saldo e imprimir o saldo com reajuste de 1%.
        float saldo = 500;
        double saldoAjustado = saldo * 1.01;
        System.out.println("Saldo atual: "+saldoAjustado);

        /*
        3. Escrever um código que lê:
        - a porcentagem do IPI a ser acrescido no valor das peças
        - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
        - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
        O código deve calcular o valor total a ser pago e apresentar o resultado.
        Fórmula: (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
         */
        float ipi = 20;
        float peca1 = 260;
        float peca2 = 120;
        float paga = (peca1*1 + peca2*3)*(ipi/100 + 1);
        System.out.println("Valor total a se pagar é: "+ paga);

        /*
        4. Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
        calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
        (1SM=R$788,00)
         */
        float salarioMin = 780;
        float salario = 6400;
        float quantidadeDeSalMin = salario/salarioMin;
        System.out.println("O usuário possui, "+quantidadeDeSalMin+" de salários mínimos");

        //5. Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.
        int numero = 5;
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.println("o antecessor de " + numero + " é " + antecessor);
        System.out.println("o sucessor de " + numero + " é " + sucessor);
    }
}
