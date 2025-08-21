import java.util.Scanner;

public class EstCon08Switcase {
    /*

     */

    public static void main (String... args){

        var sc = new Scanner(System.in);

        System.out.println("infore n° de 1 a 7");
        var opcao = sc.nextInt();
        switch (opcao) {
            case 1:
            case 7:
                System.out.println("Final de senama não trabalha \\o/");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            default:
                System.out.println("Opção fora da margem");
                break;
        }

        //outra forma
        System.out.println("Escolha entre A, a, B, b C ou c e veja o equivalente na ASCII");
        var opc = sc.next();
        switch (opc) {
            case "A" -> System.out.println("A corresponde ao n° decimal, Unicode, 65");
            case "B" -> System.out.println("B corresponde ao n° decimal, Unicode, 66");
            case "C" -> System.out.println("C corresponde ao n° decimal, Unicode, 67");
            case "a" -> System.out.println("a corresponde ao n° decimal, Unicode, 97");
            case "b","c"  -> System.out.println("b corresponde ao n° decimal, Unicode, 98 e o c 99");
            default -> System.out.printf("Acessar lista para descobrir o valor do %s", opc);
        }
    }
}
/*
                OUTRAS FORMAS DE USAR

                com variável

      var msg = switch (opc) {
            case "A" -> "A corresponde ao n° decimal, Unicode, 65";
            case "B" -> "B corresponde ao n° decimal, Unicode, 66";
            case "C" -> "C corresponde ao n° decimal, Unicode, 67";
            case "a" -> "a corresponde ao n° decimal, Unicode, 97";
            case "b","c" -> {
            "b corresponde ao n° decimal, Unicode, 98
            "e corresponde ao n° deciamal, Unicode,99";
            default -> "Acessar lista para descobrir;
        };
        System.out.println(msg);

        outro exemplo

        case 1, 7 -> {
               var day = opt == 1 ? "Domingo" : "Sábado";
               yoeld String.format("Hoje é %s, fim de semana", day);
         }

         -> = operador que indica qual cód executar
         ? = operador ternário , atalho pra if
         : = seria para o else
         %s = PLACEHOLDER, será substituido pelo valor correspondente pós virgula

         resumindo
         opção ==1 se for verdade(if) valor 1: valor2 se for falso
         independente retorne a frase x, mas com valor selecionado

 */