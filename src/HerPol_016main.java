public class HerPol_016main {

    public static void main(String ...args){

        // aqui o tipo da variável é o tipo da classe que irá criar o obj
        // neste caso coloquei o nome da variavel de geral por ser dados gerais, ficar mais fácil de entender
        // LEMBRAR DE POR EXTEND NAS CLASSES FILHAS

        HerPol_016Intro geral = new HerPol_016Intro();

        HerPol_016Menager gerente = new HerPol_016Menager();

        HerPol_016Vended vended = new HerPol_016Vended();

        // dados gerais, todos têm
        // apenas pegando
        gerente.getNome();
        gerente.getIdade();
        gerente.getEndereco();

        vended.getNome();
        vended.getIdade();
        vended.getEndereco();

        // os específicos
        gerente.getLogin();
        gerente.getComissao();

        vended.getPorcen_vend();

        //enviando os dados
        gerente.setNome("Antônio");
        gerente.setIdade(56);
        gerente.setEndereco("Rua Lá Se Foi, n°01");

        vended.setNome("Abigail");
        vended.setIdade(35);
        vended.setEndereco("Rua Perdeu As Botas, n° 404");

        // os específicos
        gerente.setLogin("Ger.Antônio.014");
        gerente.setComissao(10.5);

        vended.setPorcen_vend(5.0);

        System.out.println("Dados do gerente:\nNome: " + gerente.getNome() + "\nIdade: " + gerente.getIdade() + "\nEndereço: " + gerente.getEndereco() + "\nLogin: " + gerente.getLogin() + "\nComissão de: " + gerente.getComissao());
        System.out.printf("\nDados do vendedor: \nNome: %s\nIdade: %s\nEndereço: %s\nPorcentagem de vendas: %s\n", vended.getNome(), vended.getIdade(), vended.getEndereco(), vended.getPorcen_vend());
    }



}
