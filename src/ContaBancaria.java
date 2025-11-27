// Classe abstrata que representa uma conta bancária genérica
// Ela serve como "modelo" para os outros tipos de conta
public abstract class ContaBancaria {

    // Atributos protegidos para permitir acesso pelas classes filhas
    protected int numeroConta;
    protected String titular;
    protected double saldo;

    // Construtor da classe ContaBancaria
    // Ele inicializa os atributos básicos da conta
    public ContaBancaria(int numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Retorna o número da conta
    public int getNumeroConta(){
        return numeroConta;
    }

    // Define/atualiza o nome do titular
    public void setTitular(String titular){
        this.titular = titular;
    }

    // Retorna o nome do titular
    public String getTitular(){
        return titular;
    }

    // Retorna o saldo atual da conta
    public double getSaldo(){
        return saldo;
    }

    // Método abstrato: obriga todas as subclasses a implementarem o saque
    public abstract void sacar(double valor);

    // Método abstrato: obriga todas as subclasses a implementarem o depósito
    public abstract  void depositar(double valor);

    // Método concreto: pode ser sobrescrito nas subclasses
    public void exibirDadosConta(){
        System.out.println("Exibindo Dados Bancários...");
    }
}
