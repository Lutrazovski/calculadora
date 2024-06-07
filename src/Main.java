import calculadora.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        //float soma = calculadora.soma(5, 5);
        //float subtracao = calculadora.subtrai(10, 5);
        //float multiplicacao = calculadora.multiplica(2,40);
        //float divicao = calculadora.divide(6,2);
        float porcentagem = calculadora.porcentagem(100,500);
    }
}