/*
        HERANÇA
        Preciso pegar atibutos gerais e trazer para este objeto, usando da forma que for necessária

        por palavra reservada extends - vai se extender a outra classe que é a intro

        POLIMORFISMO
        usa os mesmos dados de fora diferentes - maior exemplo é abelha e borbolatas são amimais, voam, um pica outro não, um faz um barulho outro faz um outro

        aqui coloquei final para restringir a classe, então, por emxeplo, class cliente não consegue extender as para esta classe

        observe que deixei o vend sem final, para poder faxer exercício
 */
public final class HerPol_016Menager extends HerPol_016Intro{

    private String login;

    private String senha;

    private Double comissao;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }
}
