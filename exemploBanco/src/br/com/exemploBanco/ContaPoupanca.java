package br.com.exemploBanco;

public class ContaPoupanca extends Conta{
    private double redimento;

    public ContaPoupanca(int numero, double saldo, double redimento) {
        super(numero, saldo);
        this.redimento = redimento;
    }

    public double getRedimento() {
        return redimento;
    }

    public void setRedimento(double redimento) {
        this.redimento = redimento;
    }
    public void atualizaRendimento(){

        double atual= getSaldo() + (getSaldo() * (redimento/100));
        setSaldo(atual) ;
    }
}
