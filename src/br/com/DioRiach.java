package br.com;

import java.util.Scanner;

public class DioRiach {
    /*
                               CRIAR CLASSE OU PACKAGE

        Na pasta desejada - btn direito - new - java class - nomear (lembrar que o nome será de classe então deve
    usar o 1° letra em maiúsculo, caso seja  mais de uma palavra, usar Camel case - sempre a 1° letra em maiúsculo
    e sem espaço) - verificar se class está selecionado - enter - add

        O nome dado ao file será o nome da class, por isso, novamente, deixar com a 1° letra maiúscula

        obs:

        Não é errado usar o método snack (dio_riach), porém, pelo que entendi, não é muito usado no java

     */

    public static void main (String... args) {

        /*
        variável do tipo Scanner com nome sc (abreviação de sc)
        criando objeto não static (instânciado) que irá receber/ "ativar" a classe Scanner, este objeto será recebido pela vvariável sc
        recebe nova instância/objeto da classe Scanner (com se fosse um novo braço da classe) com parâmetro é o objeto in da classe System
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Saluton! Digite seu nome: ");

        // String não é um tipo primitico, é classe
        String nome = sc.nextLine();

        System.out.println("Komicanto, digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Senhor/a " + nome + "\nSua idade é " + idade );

        /*
        ou
        System.out.printf("Senhor/a %s\n sua idade é %s", nome, idade );

        Não tem como mudar o tipo da variável, depois de já definido
         */
    }
}

/*
    Quando declara constantes

    ex:

    public class DioRiach {

        // este é algo que será muito usado, para constante usa snack case
        private final static String WELCOME_MESSAGE = "Saluton! Digite seu nome: "

        public static void main (String... args) {


            Scanner sc = new Scanner(System.in);
            System.out.println(WELCOME_MESSAGE );

            String nome = sc.nextLine();

            System.out.println("Komicanto, digite sua idade: ");
            int idade = sc.nextInt();

            System.out.println("Senhor/a " + nome + "\nSua idade é " + idade );

        }
    }
 */