public abstract class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String toString() {
        return "Nome: " + nome + "Idade: " + idade + " anos.";
    }

    public abstract void quemSouEu();
    public abstract void minhaAtividade();



}