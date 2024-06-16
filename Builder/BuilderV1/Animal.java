package Main.Builder.BuilderV1;


public class Animal {

    private String nome;
    private int idade;
    private String raca;

    private Animal(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Animal {" +
                "nome='" + nome + '\'' +
                ", idade='" + idade +'\''+
                ", raca='" + raca +'\''+
                '}';
    }

    public static class animalBuilder{
        private String nome;
        private int idade;
        private String raca;

        public animalBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public animalBuilder idade(int idade) {
            this.idade = idade;
            return this;
        }

        public animalBuilder raca(String raca) {
            this.raca = raca;
            return this;
        }

        public Animal build(){
            return new Animal(nome, idade, raca);
        }

    }
}
