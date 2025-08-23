import java.util.Scanner;

public class EstCon011Exerc {

    public static void main(String... args){

        // lebrando que estou instanciando obj sc que recebe objetos da classe Scanner
        var sc = new Scanner(System.in);

        // tabuada do n° inserido

        System.out.print("=".repeat(20));
        System.out.println("\nEscolha um n° e saiba sua tabuada");
        var num = sc.nextInt();

        // para i=1, sendo i menor igual a 10, adicione a cada rodada 1 ao i
        // mostre valor do vezes valor num escolhido = calculo do i atual vezes num escolhido
        for (var i = 1; i<=10; i++){
            System.out.printf("%s * %s = %s\n", i, num, (i*num));
        }

        //entrada de altura e peso, calcular imc (peso/altura*altura)
        // por mensagem de acordo com tabela (colocarei direito no exercício)

        System.out.println("altura");
        var h = sc.nextDouble();

        System.out.println("peso");
        var kg = sc.nextDouble();

        var imc = kg/(h*h);

//        switch (imc){
//            case imc<=18.5 -> System.out.printf("Com peso %s e altura %s = você está abaixo do peso", kg, h, imc);
//            case imc<=24.9 -> System.out.printf("Com peso %s e altura %s = você está no peso ideal", kg, h, imc);
//            case imc<=29.9 -> System.out.printf("Com peso %s e altura %s = você está levemente acima do peso", kg, h, imc);
//            case imc<=34.9 -> System.out.printf("Com peso %s e altura %s = você está com obesidade Grau I", kg, h, imc);
//            case imc<=39.9 -> System.out.printf("Com peso %s e altura %s = você está com obesidade Grau II (severa)", kg, h, imc);
//            default -> System.out.printf("Com peso %s e altura %s = você está com obesidade Grau III (mórbida)", kg, h, imc);
//        }
        // aqui não pode usar doble e tem de ser n° já fixo e único, não pode intervalor
        // no input por virgula e não ponto
        // para deixar casas deciais com quantidd específica %.n°

        if (imc<=18.5) System.out.printf("Com peso %s e altura %s seu imc é %.3f = você está abaixo do peso", kg, h, imc);
        else if (imc<=24.9) System.out.printf("Com peso %s e altura %s seu imc é %.3f  você está no peso ideal", kg, h, imc);
        else if (imc<=29.9) System.out.printf("Com peso %s e altura %s seu imc é %.3f você está levemente acima do peso", kg, h, imc);
        else if (imc<=34.9) System.out.printf("Com peso %s e altura %s seu imc é %.3f você está com obesidade Grau I", kg, h, imc);
        else if (imc<=39.9) System.out.printf("Com peso %s e altura %s seu imc é %.3f você está com obesidade Grau II (severa)", kg, h, imc);
        else System.out.printf("Com peso %s e altura %s seu imc é %.3f você está com obesidade Grau III (mórbida)", kg, h, imc);

        //input de um n°, depois de outro n° maior, depois escolher par ou impar
        //mostra todos pares e ímpares no intervalo em ordem decrescente

        System.out.println("\nDigite o intervalo de 2 n° e escolha seus pares ou ímpares");
        System.out.println("Valor inicial:");
        var val1 = sc.nextInt();

        System.out.println("valor final:");
        var val2 = sc.nextInt();

        System.out.println("P para pares, I para ímpares:");
        var escol =sc.next();

        if(escol.equalsIgnoreCase("p")){
            if((val2%2) == 0){
                for (var i = val2; i >= val1; i -= 2) {
                    System.out.println(i);
                }
            } else {
                for (var i = val2-1; i >= val1; i -= 2) {
                    System.out.println(i);
                }
            }
        }else {
            if((val2%2) == 0){
                for (var i = val2-1; i >= val1; i -= 2) {
                    System.out.println(i);
                }
            } else {
                for (var i = val2; i >= val1; i -= 2) {
                    System.out.println(i);
                }
            }
        }

        // input de um n°, depois laço com outros n°s, break será será com o n° informado%1° numero != 0
        // ignorar n° menores que o 1°

        System.out.println("n° inteiro");
        var n1 = sc.nextInt();

        var cond = true;

        while (cond){
            System.out.println("n° inteiro");
            var n2 = sc.nextInt();
            if (n1>n2){
                System.out.printf("O valor %s é menor que %s, digite um n° maior",n2,n1);

            }else {
                var res = n2 % n1;
                if (res == 0){
                    System.out.printf("O resto de %s com %s é %s, fim da verificação",n1,n2,res);
                    break;
                }else {
                System.out.printf("O resto de %s com %s é %s igual a zero, continue até sair resto ",n1,n2,res);}

            }

        }
    }
}


// tive que ver como por parâmetro do while
//              DO PROFESSOR

//while(true){
//    System.out.println("n°");
//    var verify = scanner.nextInt();
//    if ( verify < number){
//        System.out.println("n°");
//        continue;
//        }
//    var result = verify % number;
//    System.out.println("continua");
//    if(result != 0) break;
//        }


