public class Fun05OpeBitwise {
    /*
        0 - false
        1 - true
        
        |
        o n° 6 é representado por 110 no bit
        o n° 5 é o 101 no bit

        haverá u or em cada bit
        então
        110     v v f
        101     v f v

        linha da direita f || v = v = 1
        linha do meio v || f = v = 1
        linha da esquerda v || v = 1
        resultado 111 - representado pelo n° 7

        n° 1 = 01 f v
        n° 2 = 10 v f
        n° 3 = 11 v v
        esgotou a troca então add um 0
        n° 4 = 100
        100 v f f = 4
        001 f f v = 1
        101 v f v = 5
        
        &
        segue tabela do e só é verdade se ambos verdade
        
        ^ shor
        pega e compara cada bit
        se n° == retorna 0
        se n° != retorna 1

        complement ~ (ele nega/ inverte)

        shift operat left - deslocamento de bit para esquerda
        9 << 2
        empurra duas casas para esquerda, adiciona 0 nas casas que ficaram vazias
        
        shift operator right - ele verifica o n
        se o último n° à esquerda for 1, o n° é negativo  - ->1111111111111111111111111111111 completa com 1
        se o último n° à esquerda for 0, o n° é positivo  - ->0000000000000000000000000000111 completa com 0


     lembrar que zero a esquerda não são postos

     */
    
    public static void main (String[] args) {

        var valor1 = 7;
        var bin1 = Integer.toBinaryString(valor1);
        System.out.printf("Primeiro n° da operação %s (representação binária %s) \n", valor1, bin1 );

        var valor2 = 8;
        var bin2 = Integer.toBinaryString(valor2);
        System.out.printf("Segundo n° da operação %s (representação binária %s) \n", valor2, bin2);

        var result = valor1 | valor2;
        var binReslt = Integer.toBinaryString(result);

        System.out.printf("%s | %s = %s (Representação binária %s) \n ", valor2, valor1, result, binReslt);

        var resul = valor1 & valor2;
        var binResl = Integer.toBinaryString(resul);

        System.out.printf("%s & %s = %s (Representação binária %s) \n ", valor2, valor1, resul, binResl);

        var resul_s = valor1 ^ valor2;
        var binResl_s = Integer.toBinaryString(resul_s);

        System.out.printf("%s ^ %s = %s (Representação binária %s) \n ", valor2, valor1, resul_s, binResl_s);

        var resul_c = ~valor1;
        var binResl_c = Integer.toBinaryString(resul_c);

        System.out.printf("~%s = %s (Representação binária %s) \n ", valor1, resul_c, binResl_c);

        var va = -12;
        var va1 = 2;

        var resul_op = va << va1;
        var binResl_op = Integer.toBinaryString(resul_op);

        System.out.printf("%s << %s = %s (Representação binária %s) \n ", va, va1, resul_op, binResl_op);

        var vas = 10;
        var va1s = 2;

        var resul_opr = va >> va1;
        var binResl_opr = Integer.toBinaryString(resul_opr);

        System.out.printf("%s >> %s = %s (Representação binária %s) \n ", va, va1, resul_op, binResl_opr);

        var resul_oprs = vas >> va1s;
        var binResl_oprs = Integer.toBinaryString(resul_oprs);

        System.out.printf("%s >> %s = %s (Representação binária %s) \n ", vas, va1s, resul_op, binResl_oprs);

        var resul_oprt = vas >>> va1s;
        var binResl_oprt = Integer.toBinaryString(resul_oprt);

        System.out.printf("%s >>> %s = %s (Representação binária %s) \n ", vas, va1s, resul_op, binResl_oprt);



    }
}
