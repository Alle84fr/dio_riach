import java.util.Scanner;

public class JavaArte_013main {

    public static void main (String... args) {

        var sc = new Scanner(System.in);

        /*
            A classe JavaArte_013primClass, é do tipo não static, instanciada, o que significa que só irá "existir"
        se for chamada, instanciada.
            var é uma variável "rodada", mutável
            masculino/ feminino nome dado à variável que receberá o objeto da classe em questão
            new é para informar que está criando um novo objeto
            nome da classe para apontar qual classe será "copiada"
            Para cada pessoa, deve instanciar novo objeto
         */

        /*
            Como o rg é um construtor imutável e obrigatório, para não dar erro, mesmo que eu não queira este valor
        no objeto, eu devo passa, caso contrário dá erro
        java: constructor JavaArte_013primClass in class JavaArte_013primClass cannot be applied to given types; required: java.lang.Double

             var masculino = new JavaArte_013primClass(4569.8);
             masculino.setName("Tulio");
             masculino.setAge(74);
            Aqui queria apenas nome e idade, porém tive de passar o rg
         */

        var masculino = new JavaArte_013primClass(4569.8);
        /*
        para chamar a classe deve por nome da variável que instanciou o objeto, . (mostra de onde será tirado os
        dados) e após, sem espeço nome da variável da classe mãe, recebe (=) valor, ; (mostra que aqui acaba este comando)
         */
        masculino.setName("Tulio");
        masculino.setAge(74);

        /*
        forma de acesso público
        var feminino = new JavaArte_013primClass();
        feminino.name = "Alle";
        feminino.age = 41;

        acesso com set
        var feminino = new JavaArte_013primClass();
        feminino.setName("Alle");
        feminino.setAge(41);

         */

        var feminino = new JavaArte_013primClass(7789.56);
        feminino.setName("Alle");
        feminino.setAge(41);

        var feminino_1 = new JavaArte_013primClass(9998.84);
        feminino_1.setName("Rodolfa");
        feminino_1.setAge(12);

        /*
        esta forma acessa variáveis pública
        System.out.printf("nome: %s, idade: %s\n", masculino.name, masculino.age );

        privadas com get deve por nome getNomeVaruável()
        System.out.printf("nome: %s, idade: %s\n", masculino.getName(), masculino.getAge() );

        Static o objeto já existe, só precisa chamr-lo
        Não static usa uma classe já existente e seus atributos e métodos para criar um objeto, deve instânciar, pois ele não
        existe

        */

        System.out.printf("nome: %s, idade: %s\n", masculino.getName(), masculino.getAge());
        System.out.printf("nome: %s, idade: %s\n", feminino.getName(), feminino.getAge());
        System.out.printf("nome: %s, idade: %s\n", feminino_1.getName(), feminino_1.getAge());

        /*
        Acessando static
         */

        var assexual = new JavaArte_013primClass(6549.32);
        JavaArte_013primClass.setSexo("assexual");

        System.out.printf("Orientação sexual: %s.\n", JavaArte_013primClass.getSexo());

        // vendo imutável



        var masculino_2 = new JavaArte_013primClass(1236.54, 8986563);
        masculino_2.setName("Bumerang");
        masculino_2.setAge(89);
        JavaArte_013primClass.setSexo("Hétero");

        System.out.printf("nome: %s \nidade: %s\norinetação sexual: %s\nRg: %s\ncpf: %s", masculino_2.getName(), masculino_2.getAge(), JavaArte_013primClass.getSexo(), masculino_2.getRg(), masculino_2.getCpf());





    }




}
