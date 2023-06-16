class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, String cargo, String departamento) {
        super(nome, cargo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + departamento + " (Gerente)";
    }
}