import java.time.LocalDate;


class Vendedor {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private LocalDate dataContratacao;
    private double salarioBase;
    private double percentualComissao;

    public Vendedor(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase, double percentualComissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.percentualComissao = percentualComissao;
    }

    
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}


class Gerente {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private LocalDate dataContratacao;
    private double salarioBase;
    private String departamento;

    public Gerente(String nome, String cpf, LocalDate dataNascimento, LocalDate dataContratacao, double salarioBase, String departamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataContratacao = dataContratacao;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}


class Cliente {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String email;
    private String numeroCartaoFidelidade;
    private String telefone;

    public Cliente(String nome, String cpf, LocalDate dataNascimento, String email, String numeroCartaoFidelidade, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
        this.telefone = telefone;
    }

    
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCartaoFidelidade() {
        return numeroCartaoFidelidade;
    }

    public void setNumeroCartaoFidelidade(String numeroCartaoFidelidade) {
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}


public class Main {
    public static void main(String[] args) {
        
        Vendedor vendedor = new Vendedor("Pedro Ferrari", "123.456.789-00", LocalDate.of(1985, 5, 20), LocalDate.of(2020, 2, 15), 3000.00, 5.0);
        
        
        Gerente gerente = new Gerente("Maria Luiza", "987.654.321-11", LocalDate.of(1978, 8, 15), LocalDate.of(2018, 10, 5), 5000.00, "Vendas");
        
        
        Cliente cliente = new Cliente("Carlos Henrique", "111.222.333-44", LocalDate.of(1990, 3, 30), "carlos@email.com", "123456789", "99999-8888");
        
        
        System.out.println("Dados do Vendedor:");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("CPF: " + vendedor.getCpf());
        System.out.println("Data de Nascimento: " + vendedor.getDataNascimento());
        System.out.println("Data de Contratação: " + vendedor.getDataContratacao());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Percentual de Comissão: " + vendedor.getPercentualComissao());
        
        System.out.println("\nDados do Gerente:");
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("CPF: " + gerente.getCpf());
        System.out.println("Data de Nascimento: " + gerente.getDataNascimento());
        System.out.println("Data de Contratação: " + gerente.getDataContratacao());
        System.out.println("Salário Base: " + gerente.getSalarioBase());
        System.out.println("Departamento: " + gerente.getDepartamento());

        System.out.println("\nDados do Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
        System.out.println("Email: " + cliente.getEmail());
        System.out.println("Número Cartão de Fidelidade: " + cliente.getNumeroCartaoFidelidade());
        System.out.println("Telefone: " + cliente.getTelefone());
    }
}
