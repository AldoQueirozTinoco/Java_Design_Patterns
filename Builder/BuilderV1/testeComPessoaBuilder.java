package Main.Builder.BuilderV1;

public class testeComPessoaBuilder {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa.pessoaBuilder().nome("Aldo")
                .sobrenome("da Silva")
                .documento("112334332-02")
                .email("aldo@gmail.com")
                .apelido("DNA")
                .dataNascimento("12/12/2234")
                .build();
        System.out.println(pessoa);
    }

}
