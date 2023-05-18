package classes;

public class PessoaProprietario extends Pessoa {
    private String numeroCnh;
    private String categoriaCnh;

    public PessoaProprietario() {
        super();
    }

    // construtor com parametro da classe pessoa
    public PessoaProprietario(String nome, String cpf, String email, String telefone, String numeroCnh,
            String categoriaCnh, String dataDeNascimento) {
        this.numeroCnh = numeroCnh;
        this.categoriaCnh = categoriaCnh;
    }

    // getters e setters
    public String getNumeroCnh() {
        return numeroCnh;
    }

    public void setNumeroCnh(String numeroCnh) {
        this.numeroCnh = numeroCnh;
    }

    public String getCategoriaCnh() {
        return categoriaCnh;
    }

    public void setCategoriaCnh(String categoriaCnh) {
        this.categoriaCnh = categoriaCnh;
    }

    // metodos da classe pessoa
    @Override
    public void realizarCadastro() {
        super.realizarCadastro();

    }

    @Override
    public void alterarDados() {
        super.alterarDados();

    }

    @Override
    public void realizarLogin() {
        super.realizarLogin();

    }

    @Override
    public void verificarDados() {
        super.verificarDados();

    }

    // metodos da classe proprietario
    public void cadastrarVeiculo() {

    }

    public void alterarVeiculoCadastrado() {

    }

    public void obterListagemDeVeiculos() {

    }

    public void emitirRelatorioDeGastos() {

    }

    public void registrarGastos() {

    }

    public void calcularGastos() {

    }

    public void emitirFotoDacnh() {

    }

}
