import java.util.Scanner;

public class RaizCubica {

    public static void main(String[] args){

    // Iniciando o scanner e a varíavel    
    Scanner scanner = new Scanner(System.in);
    double raiz = 0;
        
    // Atribuindo o valor da raiz cúbica do número inserido pelo usúario a varíavel "raiz"
        System.out.println("Insira abaixo o número que você deseja descobrir a raiz cúbica: ");
        raiz = Math.cbrt(scanner.nextDouble());

    // Exibindo o resultado ao usuário
        System.out.println("A raiz cúbica do número que você inseriu é: " + raiz);


        scanner.close();



        
    }






}