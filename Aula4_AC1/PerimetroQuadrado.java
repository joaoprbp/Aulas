import java.util.Scanner;
public class PerimetroQuadrado {
    
    public static void main(String[] args){

    // Iniciando as variáveis e o scanner
    double lado = 0;
    double perimetro = 0;
    Scanner scanner = new Scanner(System.in);

    // Armazenando o valor do lado do quadrado que o usuário deseja calcular
        System.out.println("Insira abaixo o valor dos lados do quadrado que você deseja calcular o perímetro: ");
    lado = scanner.nextDouble();

    // Atribuindo o novo da variavel "perimetro"
    perimetro = 4 * lado;

    // Mostrando ao usuário o valor do perimetro
        System.out.println("O valor do perímetro desse quadrado é: " + perimetro );


    scanner.close();


    }





}
