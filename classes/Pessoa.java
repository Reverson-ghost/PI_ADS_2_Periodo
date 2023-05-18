package classes;

public class Pessoa {
    // atributos
    protected String nome;
    protected String cpf;
    protected String email;
    protected String telefone;
    protected String dataDeNascimento;

    public Pessoa() {
        super();
    }

    public Pessoa(String nome, String cpf, String email, String telefone, String dataDeNascimento) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
    }

    // getters e setters
    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;

    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;

    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;

    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    // metodos
    public void realizarCadastro() {

    }

    public void realizarLogin() {

    }

    public void alterarDados() {

    }

    public void verificarDados() {

    }

    @Override
    public String toString() {
        return ("nome: " + nome + "cpf: " + cpf + "email: " + email + "telefone:" + telefone
                + "data de nascimento:esse ta diferent " + dataDeNascimento + "\n");
    }

}
