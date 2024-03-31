import java.util.Scanner;

public class CalculoAc1{

    public static void main(String[] args){

        // Declarando variáveis e iniciando scanner
        double ac1 = 0;
        double ac2 = 0;
        double ag = 0;
        double af = 0;
        double mediaFinal = 0;
        String materia = null;
        Scanner scanner = new Scanner(System.in);

        // Armazenando o nome da matéria que o usuário deseja calcular
            System.out.println("De qual matéria gostaria de calcular sua média final? (não utilizar caractéres especiais)");
        materia = scanner.nextLine();
    
        // Armazenando a nota da AC1 e aplicando o peso dela para a média final
            System.out.println("Insira a nota da sua AC1 abaixo: ");
        ac1 = scanner.nextDouble() * 0.15;

        // Armazenando a nota da AC2 e aplicando o peso dela para a média final
            System.out.println("Insira a nota da sua AC2 abaixo: ");
        ac2 = scanner.nextDouble() * 0.30;

        // Armazenando a nota da AG e aplicando o peso dela para a média final
            System.out.println("Insira a nota da sua AG abaixo: ");
        ag = scanner.nextDouble() * 0.10;

        // Armazenando a nota da AF e aplicando a o peso dela para a média final
            System.out.println("Insira a nota da sua AF abaixo: ");
        af = scanner.nextDouble() * 0.45;

        // Definindo a Média final e mostrando o resultado dela na interface
        mediaFinal = (ac1 + ac2 + ag + af);
            System.out.println("Sua média final da matéria de " + materia + " é: " + mediaFinal);

        scanner.close();


        
    }
     
}