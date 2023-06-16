class Cliente extends Pessoa {
    private String endereco;

    public Cliente(String nome, String endereco) {
        super(nome);
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return super.toString() + " (Cliente)";
    }
}