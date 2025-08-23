/*

PBL - Aprendizagem baseada em problemas - Problem basic learning(ver se está certo)

aprender com problemas reais para aprender algo

A dio dará desafios de códigos

Lógica de programação e pensamento computacional

lógica de programação = transformar problemas em soluções claras e ordenadas atravéz de passos lógicos e algoritmos
(conjunto de passos pré-definidos para resolver problemas)

pensamento computacional = encontrar caminhos para resolver desafios, projetar sistemas e compreender comportamentos
                        = pensar o contexto do problema para depois resolver o problema

1° assim tem aprendizagem ativa - fazer para aprender
2° transformação digital - dominar a competência digital, de pensar e resolver algo
3° comunidade protagonista - aprender juntos
 */


import java.util.Scanner;

public class Desafio012salTrans {
    /*
    receber valor bruto do salário
    calcular benefíco - salário bruto + percentual de imposto mediante salario) + benefíco

    -----------tabela alíquota-----------
    |    R$     |      R$        |   %  |
    | 0,00      | 1100.00        |5.00  |
    | 1100.01   | 2500.00        |10.00 |
    | 2500.01   | ...            |15.00 |
    _____________________________________

    Entrada - salário bruto e benefício
    Saída - linha com n° da diferência salário bruto e percentual
     */

    public static void main(String ... args){

        // escrevi a linha do cód, cliquei na lâpampa e mandei importar
        var sc = new Scanner(System.in);

        System.out.println("Valor so salário bruto");
        var sal_bru = sc.nextDouble();

        // como usarei variável fora devo declarar fora
        double sal_liq;

        //ou faço valor*1.05 faço valor*(1 - 0.05) ou valor * 95 (que é 100 - 05) ou valor-(valor*0.05)
        if(sal_bru<=1100.00){
            // como já foi declarado, agora é só chamar pelo nome
            sal_liq = sal_bru-(sal_bru*0.05);
            System.out.println(sal_liq);
        } else if (sal_bru<=2500.00) {
            sal_liq = sal_bru-(sal_bru*0.1);
            System.out.println(sal_liq);
        }else {
            sal_liq = sal_bru-(sal_bru*0.15);
            System.out.println(sal_liq);
        }

        System.out.println("Valor do benefício");
        var benef = sc.nextDouble();

        var adic = sal_liq + benef;
        System.out.printf("com salário de R$%s e benefíco de R$%s, seu salário seráR$%s", sal_bru, benef, adic);
    }

    // feito pelo professor/tela

//    Scanner leitorDeEntrada = new Scanner(System.in);
//    float valorSalario = leitorDeEntrada.nextFloat();
//    float valorBenefico = leitorDeEntrada.nextFloat();
//
//    float imposto = 0;
//
//    if(valorSalario >= 0 && valorSalario <= 1100){
//        valor imposto = 0.05f * valorSalario;
//    }
//
//    float saida = valorSalario - imposto + valorBenefico;
//    System.out.println(String.forat("%.2f", saida));
}

/*
                ERROS E CONCERTOS
      Exception in thread "main" java.util.InputMismatchException
      ....
      at Desafio012salTrans.main(Desafio012salTrans.java:47)

       não por ponto, por virgula ao digitar
 */