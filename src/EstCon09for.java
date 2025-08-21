import java.util.Scanner;

public class EstCon09for {
    /*
    for
     */

    public static void main(String... args) {

        var sc = new Scanner(System.in);

        for(;;){

            System.out.println("Nome");
            var name = sc.next();

            // condição para sair do loop
            if(name.equalsIgnoreCase("SAIR")) break;

            System.out.println(name);
        }

        for (var i = 1; i<100; i++){
            System.out.println(i);
        }

        for (var i = 1; i<=100; i*=2 ){
            if(i == 100) break;{
                            }
            if(i%3 == 0){
                continue;
            }
            System.out.println(i);
        }

        for (var j = 0; j < args.length; j++){
            System.out.println(j + " - " + args[j]);
            // run, edit cofiguration,  application , +, nomeia (main), nome da classe (EstCon09for),
            // argumentos ( j m l h o p), run
            // System.out.println((j + 2) + " - " + args[j]); para iniciar em um índice específico
        }

        for(var argum: args){
            System.out.println(argum);
            // o método recebe argumento tipo String, então args são string, se fossem outro tipo, os args
            // acompanhariam o tipo
            // nesta não tem controle de índices
        }
    }
}
