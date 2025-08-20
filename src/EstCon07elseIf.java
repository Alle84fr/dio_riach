/*
Como se usa muito printf, criei um atalho
file - Setting - Editor - Live Temp,ates - Java deve estar selecionado - + - Template Group - nomear (printf()) -
ok - + - Live Template
Abbreviation: soutf
Description: System.out.printf()
Template text: System.out.printf("$END$");
aplay
ok
 */


import java.util.Scanner;

public class EstCon07elseIf {
    /*
    if = se verdade
    else = se falso
     */

    public static void main (String[] args){

        var sc = new Scanner(System.in);

        System.out.println("Seu nome: ");
        var name = sc.nextLine();

        System.out.println("idade: ");
        var age = sc.nextInt();

        System.out.println("emancipado Sim ou Não");
        var emanc = sc.next().equalsIgnoreCase("s");

        // Condicional simples - ou vai para true (if) e seu bloco ou pula e segue o cód
        // se tiver uma linhas de cód, é opcional terr {}
        // se tiver mais de uma linha, é obrigatório ter chaves {}
        if(emanc) System.out.printf("%s, com %s anos já pode ser jovem aprendiz\n", name, age);
        System.out.println("Fora do bloco if");


        // Condicional composta - ou vai para true (if) ou para false ()else . Depois segue o cód
        if (age >= 18){
            System.out.printf("%s, com %s já pode tirar carteira de motorista\n", name, age);
            System.out.println("Não beba antes de dirigir");
        } else {
            System.out.printf("%s, com %s, você não poder tirar carteira de motorista nem comprar bebidas \n", name, age);
        }
        System.out.println("Fora do bloco");


        System.out.println("Já tem carteira de motorista sim ou não");
        var carteira = sc.next();
        var dirigir = age >= 18 || (age>= 16 &&  emanc);
        var menagem = dirigir ?
                name + " Agora pode dirigir\n":
                name + " Não pode dirigir\n";

        System.out.println(menagem);


        // Condiconal Multipla/ encadeado - else if são outras condições verdadeiras
        if (age >= 18 && age <= 60) {
            System.out.printf("Com %s, vc é um adulto\n", age);
            System.out.println("Viva a vida");
        } else if (age > 60){
            System.out.printf("Com %s, você é da melhor idade \n",age);
            System.out.println("Aproveite cada vez mais");
        } else if (age>=11 && age<16) System.out.printf("Com %s você já é adolecente\n", age);
        else System.out.println("Crianças e bebês não entram no jogo da vida, ainda");
        System.out.println("Continuação do bloco");

    }

}

/*
Erro

Estava
 System.out.printf("%s, com %s, você não poder tirar carteira de motorista nem comprar bebidas ");

Retorno
    Exception in thread "main" java.util.MissingFormatArgumentException: Format specifier '%s'
    Exceção em linha de execução ..... Falta formatar Argumento

Correção
    colocar , valor, valor2
  System.out.printf("%s, com %s, você não poder tirar carteira de motorista nem comprar bebidas \n", name, age);
 */
