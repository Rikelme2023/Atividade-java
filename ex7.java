
import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        //declaração de variaveis
        Scanner entrada = new Scanner(System.in);
        double pesoAtual, aumento15, aumento20;

        //entrada de dados
        System.out.println("Digite seu peso atual: ");
        pesoAtual = entrada.nextDouble();

        //processamento de dados
        aumento15 = pesoAtual + (pesoAtual*15/100);
        aumento20 = pesoAtual * 0.8;
        //pesoAtual = peso - (peso *  28/100);

        //saida de dados
        System.out.println("Se a pessoa engordar 15%, o aumento será de: "+ aumento15+ " kg.");
        System.out.println("Se a pessoa emagrecer 20%, será: "+ aumento20 + " kg.");
        
        entrada.close();

    }
}
