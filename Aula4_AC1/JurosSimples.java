import java.util.Scanner;
public class JurosSimples {
    
    public static void main(String[] args){

    double juros = 0;
    double tempo = 0;
    double capital = 0;
    double taxa = 0;
    Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do produto que você deseja calcular os juros? ");
        capital = scanner.nextDouble();

        System.out.println("Qual o valor da taxa de juros aplicada? (apenas coloque os números, não utilize %, e se caso necessire usar , utilize um . ");
        taxa = scanner.nextDouble() / 100;

        System.out.println("Irá pagar no decorrer de quanto tempo? (A taxa de juros e o tempo precisam estar na mesma faxetária de tempo)");
        tempo = scanner.nextDouble();

        juros = capital * taxa * tempo;

        System.out.println("O juro recebido após " + tempo + " será de: " + juros);

            scanner.close();

    }
}
