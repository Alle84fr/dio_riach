import java.util.Scanner;

public class Fun03OpeLog {
    /*

                OPERADORES LÓGICOS

    atribuição -> =
    igualdade -> ==
    diferente > !=
    negação/inversão -> !

    maior que -> >
    maior igual que -> >=
    menor que -> <
    menor igual que -> <=

    && -> e/ and - apenas verdade de todos forem verdades
    || -> ou/ or - se ao menos um for verdade, resultado será verdade - acha no 1° verdade ,para e segue
    |  -> ou/ or "burro" - aqui ele irá analisar os outros cenários, mesmo o 1° sendo true - o resultado é o mesmo

     */

    public static <val> void main (String... args) {

        var sc = new Scanner(System.in);

        //classe.objeto.método
        System.out.println("Qual valor do resultado de 2 + 2? ");
        var resposta = sc.nextInt();
        var resultado = resposta == 4;
        System.out.println("O resultado é 4, você deu a resposta " + resposta + ": " + resultado);
        // aqui inverte o resultado com !
        System.out.println("Você errou? " + !resultado);
        System.out.println(" ");

        System.out.println("Digite sua idade: ");
        var idade = sc.nextInt();
        var resul = idade <18;
        System.out.println("Você tirar habilitação para dirigir " + !resul);
        // aqui inverte o resultado com !
        System.out.println("Você é uam crinça? " + resul);
        System.out.println(" ");

        System.out.println("Digite sua idade: ");
        var ida = sc.nextInt();
        System.out.println("É emancipado: ");
        var emanc = sc.nextBoolean();

        //primeiro vê da esquerda para direita, então é bom deixar condições que se ligam juntas
        // tem de ser uma coisa e outra, então, com () primeiro lê dentro do () e depois vai para fora
        var resu = ida >= 18 || (emanc && ida > 15);
        System.out.println("Você pode morar sozinho, se casar, ser dono de empresa: " +resu);
        System.out.println(" ");

    }
}
