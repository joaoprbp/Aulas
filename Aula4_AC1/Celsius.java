import java.util.Scanner;
public class Celsius {

    public static void main(String[] args){

    // Inciando as variáveis e o scanner
    double celsius = 0;
    double fahrenheit = 0;
    Scanner scanner = new Scanner(System.in);

    // Armazenando o valor em Celsius
        System.out.println("Insira o valor em Celsius para converter em Fahrenheit: ");
        celsius = 1.8 * scanner.nextDouble();

    // Atribuindo novo valor a variável "fahrenheit" ( a fórmula para conversão é basicamente F = C x 1.8 + 32 )
        fahrenheit = celsius + 32;

    // Mostrando ao usuário o valor convertido para Fahrenheit
        System.out.println("O valor convertido para Fahrenheit é: " + fahrenheit);

    scanner.close();

    }


    
}
