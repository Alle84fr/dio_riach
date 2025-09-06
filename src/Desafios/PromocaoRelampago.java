package Desafios;

import java.math.BigDecimal;
import java.util.Scanner;

public class PromocaoRelampago {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valorCompra = scanner.nextLine();
        System.out.println(calcularDesconto(valorCompra));
        scanner.close();
    }

    // método para calcular desconto que recebe como parâmetro String e valor de compra do método anterior
    // este  método possui conversão do string para BigDecimal ("tipo" que corrige falhas do float e double)

    public static String calcularDesconto(String valorCompra) {

        /*
        Método que analisa valores de entrada e retorna mensagem do respectivo desconto
         */

        // variável recebe instância que cria uma nova classe BigDecimal, com parâmetro valorCompra
        // esta classe "representa n°s decimais com precisão arbitráia" - não importa quantidade de casas após
        // a vírgula, manterá a precisão
        BigDecimal valor = new BigDecimal(valorCompra);
        BigDecimal descontoPercentual;

        // TODO: Verifique se o valor é menor que 50.00:
                /*
                                            Explicando linha de comando

                        O valor de entrada é uma String, já que se for valor numérico o java irá transformar em
                     Doble, que não possui a mesma precisão que BigDecimal.
                        Para comparar valor desta classe/tipo não se usa operadores de comparação (==, < ..), deve
                      usar o MÉTODO (static) .compareTo(). Este compara dois BigData e retorna um valor int
                      -1 para menor
                      0 para igual
                      1 para maior
                        O motivo de "new BigDecimal" é porque deve instanciar objeto para comparação
                      1° instaciar novo objeto -> new BigDecimal
                      2° converter para bigD -> ("50")
                      3° método .compareTo() - comparar valores BigD -> valor.compareTo(new BigDecimal("50")) == -1
                      Retorno de -1 indica que o valor é menor que 50
                      4° Retorno que será -1,0 ou 1 (conforme necessidade do programa)
                 */
        if(valor.compareTo(new BigDecimal("50")) == -1){
            String msg = "Desconto de 0%, " + valor;
            // Devo utilizar a variável e converter para String porque a assinatura do método é string
            // caso não converta dá Error - missing return statement
            // lembrando que depois que já foi criado uma variável, e quer converter deve 1° chamar-la e depois
            // adicionar o método de conversão
            // já quando vai declarar uma variável 1° fala o tipo e depois o nome que será dado
            return msg;
        }


        // TODO: Verifique se o valor é entre 50.00 e 100.00 (inclusive):

        //observação: no desafio deve entrar apenas mensagem "Desconto de 10%", então tirei cód de cálculo
        else if(valor.compareTo(new BigDecimal("50")) >= 0 && valor.compareTo(new BigDecimal("100"))<=0){
            BigDecimal deconto = new BigDecimal("90");
            descontoPercentual = valor.multiply(deconto);
            String msg = "Desconto de 10%, " + descontoPercentual;
            return msg;
        }


        // TODO: Caso contrário, o valor é maior que 100.00:
        else {
            BigDecimal deconto = new BigDecimal("80");
            descontoPercentual = valor.multiply(deconto);
            String msg = "Desconto de 20%, " + descontoPercentual;
            return msg;
            }


        // TODO: Retorne a string formatada com o desconto aplicado, conforme exigido no desafio:
        }
}

/*
após método do desconto coloquei
 System.out.println(calcularDesconto(valorCompra));
Erro - unreachable statement - Linha que nuca será alcançada - quando já há um return e o programa encerra
                                                             - laço infinito
O motivo do erro é porque o programa é encerrado conforme resultado do próprio laço

 */