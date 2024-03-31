import java.util.Scanner;
public class PerimetroRetangulo {
    
    public static void main(String[] args){
    // Iniciando as variáveis
     double base = 0;
     double altura = 0;
     double perimetro = 0;
    
    Scanner scanner = new Scanner(System.in);

    // Fazendo com que o valor digitado no terminal seja atríbuido a varíavel "base"
        System.out.println("Insira abaixo o valor da base do retângulo que deseja calcular o perímetro: ");
            base = scanner.nextDouble();

    // Fazendo com que o valor digitado no terminal seja atríbuido a varíavel "altura"
        System.out.println("Insira abaixo o valor da altura do retângulo que deseja calcular o perímetro: ");
            altura = scanner.nextDouble();

    // Atribuindo o novo valor da varíavel "perímetro"
            perimetro = 2 * (altura + base);

    // Exibindo o resultado ao usuário
        System.out.println("O perímetro desse retângulo é: " + perimetro);

        scanner.close();


     


    }
}
