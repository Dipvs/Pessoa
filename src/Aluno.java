public class Aluno extends Pessoa {
    private double nota1;
    private double nota2;

    public Aluno(String nome, int idade, double nota1, double nota2) {
        super(nome, idade);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " Média: " + calcularMedia();
    }

    @Override
    public void quemSouEu() {
        System.out.println("Sou Aluno");
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Estudo");
    }
}