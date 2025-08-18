public class Fun02Keyword {
    /*
        Palavras reservadas pelo sistema

        ex:
        int - para números inteiros
        new - pode ser para instaciar algo, por exemoplo

        Tipos primitivos - não são classes, são valores básicos

        - byte      - 8bits
        - short     - 16bits
        - int       - 32 bits
        - long      - 64 bits
        - boolean   - 1 bits      obs: true e false não são keywords, mas não devem ser usadas
        - char      - 16 bits
        - float     - 32 bits
        - double    - 64bits

     */

    /*
     Método do tipo do modificador - public, acessado por qualquer classe
     Método de interpretação - static é pertencente à classe, já existe, para ser chamado
     Método de retorno - void significa que não tem return
     Nome do método - main, princial que vpn irá procurar para executar, pode ser outros em outro contexto
     Parâmetro - String[] tipo que será a array do me´todo que tem seu titulo args
     */
    public static void main (String[] args) {

        byte n_int_ate_1 = 127;
        short n_int_ate_2 = 32767;
        int n_int_ate_3 = 2_147_483_647;
        // log deve ter L no final
        long n_int_ate_4 = 9_223_372_036_854_770_000L;
        var n_l =9_223_372_036_854_770_000L;
        // float n_dec_ate_1 = 3.402822347E + 38
        float n = 12.56f;
        var n_f = 12.56f;
        // double n_dec_ate_2 = 1.79769313486131570E + 308
        double n_d = 12.256987453;
        var n_do = 12.256987453d;
        // char deu erro ao por " ", deve ser simples
        // aspas duplas transforma em string
        char unico = 'c';
        var caractere = 'c';
        boolean verda = true;
        boolean falso= false;
    }
}
