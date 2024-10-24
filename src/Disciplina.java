public class Disciplina {
    private String nome;
    private Aluno a;
    private Professor p;

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void cadastrarAluno(Aluno a) {
        this.a = a;
    }

    public void ministrarDisciplina(Professor p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "Disciplina: " + nome;
    }
}