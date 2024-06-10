package execicios;

public class Pseudocodigo {

    //Questão 3
    public float solicita(float a) {
        float salario = 5000;
        float maxPrestacao = (float) (salario * 0.2);
        if (a <= maxPrestacao && a > 0) {
            System.out.println("Empréstimo de " + a + " autorizado");
            return a;
        } else if (a > maxPrestacao) {
            System.out.println("Empréstimo de " + a + " não autorizado. Maior que " + maxPrestacao);
            return 0;
        } else {
            System.out.println("Número invalido");
            return 0;
        }
    }
    //Questão 5
    public float parOuImpar(float a) {
        if (a % 2 == 0) {
            System.out.println("Este número é par");
            return 0;
        } else {
            System.out.println("Este número é impar");
            return 0;
        }
    }



    public static void main(String[] args) {
        Pseudocodigo pseudo = new Pseudocodigo();
        /*
        01) Fazer um programa que imprima a média aritmética dos números
        8,9 e 7, a média dos números 4, 5 e 6, A soma das duas médias e A
        média das médias.
         */
        double media1 = (8.9 + 7) /2;
        float media2 = (float) (4 + 5 + 6) /3;
        double total = (media1 + media2);
        double mediaTotal = total / 2;
        System.out.println("Primeira media é: "+ media1);
        System.out.println("Segunda media é: "+ media2);
        System.out.println("A soma das duas medias é: "+ total);
        System.out.println("A media das duas medias é: "+ mediaTotal);

        /*
        02) Ler um ano de nascimento e ano atual. Imprimir a idade da
        pessoa. Se a idade for maior ou igual a 18 leia o nome da pessoa e
        imprima o nome digitado e uma mensagem informando que sua
        entrada é permitida. (Ex: Fulano, sua entrada foi permitida.)
         */
        String nome = "Gustavo";
        float anoNascimento = 2002;
        float anoAtual = 2024;
        float idade = anoAtual - anoNascimento;
        System.out.println(idade);
        if (idade >= 18) {
            System.out.println(nome + ", sua entrada foi permitida");
        } else {
            System.out.println(nome + ", sua entrada não foi permitida");
        }

        /*
        03) Solicitar salario, prestação. Se prestação for maior que 20% do
        sálario, imprimir: O empréstimo não pode ser concedido. Senão
        imprimir Empréstimo pode ser concedido.
         */
        float resultado = pseudo.solicita(-5);

        //04) Informar um saldo e imprimir o saldo com reajuste de 1%.
        float saldo = 2000;
        double saldoAjustado = saldo * 1.01;
        System.out.println("Saldo atual: "+saldoAjustado);

        //05) Informar um número e imprimir se é par ou ímpar.
        pseudo.parOuImpar(9);
    }
}
