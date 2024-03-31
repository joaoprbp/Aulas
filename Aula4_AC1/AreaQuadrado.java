import java.util.Scanner;
public class AreaQuadrado {
    
    public static void main(String[] args){
    
    // Iniciando as variáveis e o scanner
    double lado = 0;
    double area = 0;
    Scanner scanner = new Scanner(System.in);

    // Armazenando o valor do lado do quadrado
        System.out.println("Insira abaixo o valor do lado do quadrado que você deseja calcular a área: ");
           lado = scanner.nextDouble();
    
    // Atribuindo novo valor a varíavel "area"
           area = lado * lado;

    // Mostrando ao usuário o valor da área do quadrado
        System.out.println("A área desse quadrado vale: " + area);

           scanner.close();

    }
}
