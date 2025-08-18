import java.time.OffsetDateTime;
import java.util.Scanner;

public class Fun06Exer {

    public static void main (String... args) {

        var sc = new Scanner(System.in);

        //01 - Escreva um código que receba o nome e o ano de nascimmentos e imprima na tala "Olá fulano, vc tem x anos

        //1° print na tela,segundo receber valor, 3° conta e por fim print

        System.out.println("Nome: ");
        var nome = sc.nextLine();

        System.out.println("Ano de nascimento: ");
        var ano = sc.nextInt();

        //fiz assim mas farei com classe do prof
        //var idade = 2025 - ano;

        var idade = OffsetDateTime.now().getYear() - ano;
        System.out.printf("Olá %s, vc têm %s anos.\n", nome, idade );

        //2° Receber o lado do quadrado e tirar área -> a = l*l

        System.out.println("\nTamanho do lado do quadrado: ");
        var lado = sc.nextDouble();

        var area = lado*lado;

        //atalho - digitar sout, arrumar tirando ln e pondo f no final
        System.out.printf("A área de um quadrado com lados de %s é de %s \n", lado, area);

        //3° receber a base e altura de um retânguo e calcular a área

        System.out.println("Tamanho da altura do retângulo: ");
        var l = sc.nextDouble();

        System.out.println("Tamanho da base do retângulo: ");
        var h = sc.nextDouble();

        var a = h*l;

        //atalho - digitar sout, arrumar tirando ln e pondo f no final
        System.out.printf("A área de um retângulo com altura de %s e base de %s é de %s \n", h, l, a);

        //4° cód que receba duas idades e mostre a diferênça delas

        System.out.println("digite uma idade: ");
        var outrid = sc.nextInt();

        var dif = idade - outrid;

        System.out.printf("A diferença da idade %s e da idade %s é de %s\n", idade, outrid, dif);

    }
}
