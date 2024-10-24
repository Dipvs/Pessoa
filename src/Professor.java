public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario; // Aqui você pode adicionar lógica de cálculo se necessário
    }

    @Override
    public String toString() {
        return super.toString() + " Salário: R$ " + calcularSalario();


    }

    @Override
    public void minhaAtividade() {
        System.out.println("Ensinar");



    }

    @Override
    public void quemSouEu() {
        System.out.println("Sou o Professor");
    }
}