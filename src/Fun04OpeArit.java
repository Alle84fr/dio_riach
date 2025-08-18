import java.util.Scanner;

public class Fun04OpeArit {

    /*
        OPERADORERS ARRITÉTICOS

        adição -> +
        vaiável =  valor + valor2   ou variável += valor
        ++variável -> some sempre 1 quando está a esquerda, tribui na hora
        variável++ -> incrementa 1, porém só na próxima linha

        subtração -> -
        vaiável =  valor - valor2   ou variável -= valor
        --variável -> diminui sempre 1
        variável-- -> decrementa 1, porém só na próxima linha

        multiplicação -> *
        vaiável =  valor * valor2   ou variável *= valor

        divisão -> /
        vaiável =  valor / valor2   ou variável /= valor
        se for com n° inteiro, o resultado da divisão será interio
        se quiser decimal, usar valores doble ou float ex 3.0

        resto -> %
        vaiável =  valor % valor2   ou variável %= valor

        exponenciação -> Math.pow(valor, valor) ou (int) Math.pow(valor, valor)
        retorna duble

        raiz quadrada -> Math.sqrt(valor)
        resultados sempre doble


        primeiro multuplicação e divisão

     */

    public static void main (String ... args) {

        var sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        var num1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        var num2 = sc.nextInt();
        System.out.println("Digite um novo número: ");
        var num3 = sc.nextInt();
        System.out.println("Digite o último número: ");
        var num4 = sc.nextInt();

        System.out.println("A soma dos números " + num1 + ", " + num2 + ", "+ num3 + ", "+ num4 + " é: " + (num1+num2+num3+num4));
        System.out.println("A subtração dos números " + num1 + ", " + num3 + " é: " + (num1-num3));
        System.out.println("A multiplicação dos números " + num1 + ", " + num2 + " é: " + (num1*num2));
        System.out.println("A divisão dos números " + num3 + ", "+ num4 + " é: " + (num3/num4));
        System.out.println("O resto da divisão dos números " + num2 + ", " + num4 + " é: " + (num2%num4));
        System.out.println("A exponenciação dos números " + num1 + ", " + num4 + " é: " + (Math.pow(num1, num4)));
        System.out.println("A raiz quadrada dos números " + num4 + " é: " + (Math.sqrt(num4)));
        System.out.println("Cremento esquerda " + num4 + " é: " + (++num4));
        System.out.println("Cremento direito linha 1 " + num2 + " é: " + (num2++));
        System.out.println("Cremento direito linha 2 é: " + (num2));
    }
}
