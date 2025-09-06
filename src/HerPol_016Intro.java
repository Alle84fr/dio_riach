/*
sealed - classe com regras para permitir sub classes
permite que Manager e vendedor herdem seus atributos ou métodos
ir para subclasse e por sealed ou non selead
 */
public sealed class HerPol_016Intro permits HerPol_016Menager, HerPol_016Vended{

    private String codigo;

    private String nome;

    private String endereco;

    private Integer idade;

    private Double salar;

    // atalho para criar Getter e setter automaticamente - btn dir, Generate, Getter and SEtter  - ou alt + insert
    // seleciona tudo que for para criar e por fim ok

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getSalar() {
        return salar;
    }

    public void setSalar(Double salar) {
        this.salar = salar;
    }
}

/*
para definir um tipo de colaborador, tipo um gerente - cria uma nova class chamada Meneger ou gerente


 */