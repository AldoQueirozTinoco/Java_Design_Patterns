package Main.Builder.BuilderV1;

public class Pessoa{
    private String nome;
    private String sobrenome;
    private String documento;
    private String email;
    private String apelido;
    private String dataNascimento;

    private Pessoa(String nome, String sobrenome, String documento, String email, String apelido, String dataNascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.documento = documento;
        this.email = email;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;

    }

    @Override
    public String toString(){
        return "Pessoa{" +
                "nome='" + nome + '\''+
                ", sobrenome='" + sobrenome + '\''+
                ", documento='"+ documento+ '\''+
                ", email='" + email + '\''+
                ", apelido='" + apelido + '\''+
                ", dataNascimento='"+dataNascimento+'\''+
                '}';
    }

    public static class pessoaBuilder {
        private String nome;
        private String sobrenome;
        private String documento;
        private String email;
        private String apelido;
        private String dataNascimento;

        public pessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public pessoaBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;

        }

        public pessoaBuilder documento(String documento) {
            this.documento = documento;
            return this;

        }

        public pessoaBuilder email(String email) {
            this.email = email;
            return this;

        }

        public pessoaBuilder apelido(String apelido) {
            this.apelido = apelido;
            return this;

        }

        public pessoaBuilder dataNascimento(String dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;

        }

        public Pessoa build(){
            return new Pessoa(nome,sobrenome,documento,email,apelido,dataNascimento);
        }

}}