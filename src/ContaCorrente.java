// Classe que representa uma Conta Corrente
// Ela herda da classe ContaBancaria
public class ContaCorrente extends ContaBancaria{

    // Atributo exclusivo da Conta Corrente
    private double limite;

    // Construtor da Conta Corrente
    // Chama o construtor da classe pai e inicializa o limite
    public ContaCorrente(int numeroConta, String titular, double saldo, double limite){
        super(numeroConta, titular, saldo);
        this.limite = limite;
    }

    // Define o limite da conta
    public void setLimite(double limite){
        this.limite = limite;
    }

    // Retorna o limite da conta
    public double getLimite(){
        return limite;
    }

    // Implementação do método sacar usando saldo + limite
    @Override
    public void sacar(double valor) {
        // Verifica se o valor ultrapassa o somatório do saldo com o limite
        if (valor > (saldo + limite)) {
            System.out.println("Não é possível sacar!! SALDO + LIMITE INSUFICIENTE");
        }
        else {
            // Se o saldo for suficiente, desconta apenas do saldo
            if (valor <= saldo) {
                saldo -= valor;
            }
            // Caso o saldo não seja suficiente, usa parte do limite
            else {
                double resto = valor - saldo;
                saldo = 0;
                limite -= resto;
            }
            System.out.println("Saque realizado com sucesso!");
        }
    }

    // Implementação do método depositar
    @Override
    public void depositar(double valor){
        // Valida para não permitir valores negativos
        if(valor < 0){
            System.out.println("Você não pode depositar um valor negativo!!!");
        }
        else{
            saldo += valor;
        }
    }

    // Exibe todos os dados da Conta Corrente
    @Override
    public void exibirDadosConta(){
        System.out.println("\n------------------------------------------");
        System.out.println("Conta Corrente: ");
        System.out.println("Nome do Titular da Conta: " +getTitular());
        System.out.println("Número da Conta: " + getNumeroConta());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Limite: " + getLimite());
        System.out.println("------------------------------------------");
    }
    
}
