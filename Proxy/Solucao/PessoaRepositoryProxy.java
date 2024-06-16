package Main.Proxy.Solucao;

import Main.Builder.BuilderV1.Pessoa;
import Main.Proxy.PessoaRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class PessoaRepositoryProxy extends PessoaRepository {

    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    private Map<Long, Pessoa> cache  = new HashMap<>();

    @Override
    public void save(Pessoa pessoa) {
        log.info("Iniciando save..");
        super.save(pessoa);
        log.info("Finalizando save..");
    }

    @Override
    public Pessoa findById(Long id) {
        log.info("Iniciando findById..");
        if(cache.get(id) != null) {
            log.info("Está  pegando do cache ");
            return cache.get(id);
        }else{
            log.info("Pegando do pessoaRepository");
            Pessoa pessoa = super.findById(id);
            cache.put(id, pessoa);
            log.info("Finalizando findById..");
            return pessoa;
        }

    }

}
