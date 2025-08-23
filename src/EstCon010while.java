import java.util.Scanner;

public class EstCon010while {
    /*
    enquanto condição for true, roda

    while - 1° verifica condição depois entra no laço

    do while, entra na condição 1°, depois inicia o laço
     */

    public static void main(String... args){

        var sc = new Scanner(System.in);
        var nam = "";
        while (!nam.equals("sair")){
            System.out.println("nomes");
            nam = sc.next();
            System.out.println(nam);
        }

        var frutas = "";

        while (true){
            System.out.println("frutas");
            frutas = sc.next();
            System.out.println(frutas);

            if (frutas.equalsIgnoreCase("fim")) break;
            if (frutas.equals("banana")){
                System.out.println("nanica de Piiraaacicabaaa");
            }
        }

        var cor = "transparente";
        do{
            System.out.println("cor:");
            cor = sc.next();
            System.out.println("Isso é uma cor: " + cor);
        }while (!cor.equalsIgnoreCase("transparente"));
        System.out.printf("%s não é cor, adeus", cor);

        //aqui irá mostrar a frase do, e depois a frase da condição
        // no while apenas sairia

        var i = 0;
        while (args.length >i){
            System.out.println(args[i] + " " +"[" + i +"]");
            i ++;
        }
    }
}

// estava rodando o whil e em seguida o for(aula anterior)
// para rodar apenas while
//btn direito no nome do file - Run "nome do arquivo .java"

// for bom para estrutura com índices
// quando não sabe quando a condição será true ou false while