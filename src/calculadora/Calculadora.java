package calculadora;

public class Calculadora {
    public float soma(float a, float b) {
        float resultado = a + b;
        System.out.println("Resultado da sua soma é: " + resultado);
        return resultado;
    }
    public float subtrai(float a, float b) {
        float resultado = a - b;
        System.out.println("Resultado da sua subtracao é: " + resultado);
        return resultado;
    }
    public float multiplica(float a, float b) {
        float resultado = a * b;
        System.out.println("Resultado da sua multiplicacao é: " + resultado);
        return resultado;
    }
    public float divide(float a, float b) {
        float resultado = a / b;
        System.out.println("Resultado da sua divisao é: " + resultado);
        return resultado;
    }
    public float porcentagem(float a, float b) {
        float c = (float) a / b;
        float resultado = c * 100;
        System.out.println(a+" é "+resultado+"% de "+b);
        return resultado;

    }
}
