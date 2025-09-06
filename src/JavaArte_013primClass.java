/*
Programação Orientada a Objeto
trazer objetos da vida real para o projeto

classe / class seria a forma, modelo para construir um objeto, definindo suas características e seus comportamentos
(métodos)
observação:  as características são transformadas em objetos quando instanciadas para a criação de novo objeto que
receberá estas características.
no java praticamente tudo deve ter ua classe

ex

cria uma pessoa
public class Person {

    // aqui é uma característica da classe (atributo ou variável de instância), pois ela "guarda" características da
    pessoa
    // foi inicializada com valor null (para string) e  (para integer)
    // outro método, objetos, classes irão herdar esta classe e irão receber seus próprios valores (polimorfismo)

    public String name;

    // característica púlica (public), pode ser vista, ou chamada de qualquer outro lugar
    // depois que mostrou tipo de acesso, coloca-se tipo do dado, que aqui é em forma de n° inteiro (int)
    // nome da variável que irá receber o dado, no caso age (idade)
    public int name;
}

nome de class sempre com letra maiúscula
todas pessoas terão este formato
 */
public class JavaArte_013primClass {

    /*
    aqui o acesso é público, acesso direto
    public String name;
    public Integer age;
    */

    // pondo acesso privado
    private String name;
    private Integer age;

    /*
     depois de ter acesso deve proteger os dados sensíveis
     para isso usa método get
     método público (públic) do tipo String que receberá um dado e o nome é name
     como é get ele não recebe parâmetro, mas tem retorno
     */

    public String getName() {
        return name;
    }

    public Integer getAge(){
        return age;
    }

    /*
    set é para pegar um infirmação, não tem retorno, mas têm parâmetro
    palavra chave this. (esta) quando há mais de uma variável com mesmo nome, então, coloca this.nomeVariável que mostra
    qual variável está acessando
    Neste caso o programa acha que a variável está auto atribuindo, para dizer que variável name recebe valor do
    parâmetro name, usa this. "esta variável name, que está linkada com name de fora recebe valor do parâmetro name
    */
    public void setName(String name){
        this.name = name;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    private static String sexo;

    /*
    no static não se usa this, e não estão acessível pelo this em um método public
    neste caso deve mudar nome do parametro
     */
    public static void setSexo (String sexo_par){
        sexo = sexo_par;
    }

    public static String getSexo(){
        return sexo;
    }

    /*

        1° este public (este construturo sem parãmetos permite que dê para usar, no main, obj sem parâmetro
        Neste caso quero obrigar a ter parâmetro

        Final = imutável

        OBRIGATÓRIO QUE TODAS, SEJA QUANTAS DECLARAÇÕES DE FINAL FOREM, DECLARAÇÕES ESTEJAM JUNTAS E SÓ DEPOIS
      QUE INICIALIZE OS TRIBUTOS, MÉTODOS

        EX:

      public class Pessoa {

        // farei estes obrigatórios
        private final Double rg;
        private final Integer ano_nas;

        // estes opcional
        private final Integer cpf;
        private final String nome_mae;

      //obrigatório - principal - chama todos
      public Pessoa(Double rg, Integer ano_nas, Integer cpf, String nome_mae) {
        this.rg = rg;
        this.ano_nas = ano_nas;
        this.cpf = cpf;
        this.nome_mae = nome_mae;
    }

    // construtor opcional
    // chama só o obrigatório e coloca null nos outros
    public Pessoa(Double rg, Integer ano_nas) {
        this(rg, ano_nas, null, null)
    }

    public Double getRg() { return rg; }
    public Integer getano_nas() { return ano_nas; }
    public Integer getCpf() { return cpf; }
    public Integer getnome_mae() { return nome_mae; }
     */



    //  rg = imutável - obrigatório (observar o main)
    // cpf = imutável - opcional

    private final Double rg;
    private final Integer cpf;

    public JavaArte_013primClass(Double rg, Integer cpf){
        this.rg = rg;
        this.cpf = cpf;
    }

    // ou tem os dois  ou tem só um

    public JavaArte_013primClass(Double rg){
        // aqui mostra que cpf é opcional
        this(rg, null);
    }

    public Double getRg(){ return rg;}
    public Integer getCpf(){return cpf;}

    /*

    tive que comentar, por terei de mudar este cod e não quero perder como faz com um private apenas
    private final Double rg;


    //este é o construtor que passa o rg
    public JavaArte_013primClass(Double rg){
        this.rg = rg;
    }

    //este é o médo get, para pegar valor do rg
    public Double getRg(){
        return rg;
    }
    */

    //este método (1), no main, é obrigado passa o valor do rg e todas as instânvias, ou dará erro
    //java: constructor JavaArte_013primClass in class JavaArte_013primClass cannot be applied to given types; required: java.lang.Double


    // imutável, não obrigatório - feito por fora




    /*
    Exemplo, quer altarar idade apenas uma vez ao ano

    criando regra de negócio

    private int age;

    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    // a partir daqui começa
    public void incAge(){
        if(this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;
        //se a data e hora é igual para aqui
       // se não for

        this.age += 1;
        this.lastYearAgeInc = OffsetDateTime.now().getYear()

        ..... main

        var male = new Person("jo";
        male.incAge();
        System.out.println("male age: " + male.getage());



     */
    }




