package Main.Proxy;

import Main.Builder.BuilderV1.Pessoa;
import Main.Proxy.Solucao.PessoaRepositoryProxy;

public class PessoaService {

    private PessoaRepositoryProxy pessoaRepositoryProxy;

    public PessoaService(PessoaRepositoryProxy pessoaRepositoryProxy) {
        this.pessoaRepositoryProxy = pessoaRepositoryProxy;
    }

    public void save(Pessoa pessoa){
        pessoaRepositoryProxy.save(pessoa);
    }

    public Pessoa findById(Long id){
        return pessoaRepositoryProxy.findById(id);
    }
}
