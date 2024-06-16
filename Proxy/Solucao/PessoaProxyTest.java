package Main.Proxy.Solucao;

import Main.Builder.BuilderV1.Pessoa;
import Main.Proxy.PessoaRepository;
import Main.Proxy.PessoaService;

public class PessoaProxyTest {
    public static void main(String[] args) {
        PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();
        PessoaService pessoaService =  new PessoaService(pessoaRepositoryProxy);

        Pessoa pessoa = new Pessoa.pessoaBuilder()
                .sobrenome("Piotto")
                .dataNascimento("12/02/1999")
                .nome("Anderson")
                .apelido("Careca")
                .documento("112333223-09")
                .email("grandeAnderson@gmail.com")
                .build();

        pessoaService.save(pessoa);
        Pessoa pessoaRetornada = pessoaService.findById(1L);
        Pessoa pessoaRetornadaCache = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);
    }
}
