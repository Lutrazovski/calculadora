import calculadora.Calculadora;

public class Main {
    public static void main(String[] args) {


        for (int contador = 0; contador <= 100;){
            System.out.println(contador);
            contador += 2;
        }
        System.out.println("Todos os numeros pares de 1 a 100");

        int contador = 10;

        while(contador >= 0) {
            System.out.println("Contador = " + contador);
            contador--;
        }

        int numero = 8;

        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Numero invalido");
        }




    }
}