/*

                            Map
     Interface que define uma estrutura de dados para armazenar pares de chaves
     Tipo dicionário

                            LinkedHashMap
     Mantém a orde de incersão, tipo fila - primeiro a entrar é o 1° a ser mostrado
 */
package Desafios;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OrganizandoEstoque {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String saida = organizarEstoque(entrada);

        System.out.println(saida);

        scanner.close();
    }

    public static String organizarEstoque(String entrada) {
        // TODO: Crie um mapa (LinkedHashMap) para armazenar o total de cada código mantendo a ordem de aparição

        /*
                Map - Interface que armazena dados em pares de chaves, tipo dic
                chave é tipo String
                valores tipo Integer
                <> generic, para trabalhar com tipo genéricos, não definido de forma fixa
                new é para instânciar novo objeto LinkedHashMap (classe que mantém a ordem em sistema de fila
                Split divide string em array e neste caso usa-se vírgula (delimitador) para mostrar onde será
                fatiada
                String lojas loop for-each que percorre cada item (que está no tipo String) que está armazenado
                no array lojas
                .trim método de remoção de espaços
                .getOrDefault - método para buscar valor da chave, se existe retorna valor, caso contrério cria um
                com valor dado
                .put método que insere ou atualiza par de (chave, valor)
                class StringBuilder -  cria/adiciona várias Strings
                .Entry interfaca aninhada do map que armazena as chaves e valores, usa-se get para acessar
                .entrySet() método da map, retorna conjunto de todos pares de chave e seus valores
                .setLength() método da classe do StringBuilder que redefine comprimento do caractere
                -1 diminui um do final (último caractere é ignorado)
         */
        Map< String, Integer> estoque = new LinkedHashMap<>();

        String[] lojas = entrada.split(",");

        for (String loja : lojas) {
            /*
            1° partes o caracteres em duas parte, usando : com delimitador
            2° índice 0, 1° parte, é a chave, que neste caso recebe tratamento de retira de espaço desnecessário
            3° índice 1, 2° parte, é o valor, convertido em int, que também recebe tratamento de retirada de
            espaços desnecessários
             */
            String[] partes = loja.split(":");
            String codigo = partes[0].trim();
            int quantidade = Integer.parseInt(partes[1].trim());


            // TODO: Atualize a quantidade total no mapa (soma com o quantidade atual, se já existir)
            estoque.put(codigo, estoque.getOrDefault(codigo,0) + quantidade);

        }

        StringBuilder sb = new StringBuilder();

        // TODO: Itere sobre os pares do mapa e monta a string no formato "codigo:quantidade"
        for (Map.Entry<String, Integer> item : estoque.entrySet()){
            sb.append(item.getKey())
                    .append(":")
                    .append(item.getValue())
                    .append(",");
            // append/add chave:valor,
            // ; é para terminador de instrução, equivalente a um ponto final de uma frase
            // , separador de elementos ela separa chave/valor de outra chave/valor

        }

        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
            // quer eliminar a vírgula final
        }

        return sb.toString();
    }
}