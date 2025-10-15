public class ContaPoupanca extends Conta{

    ContaPoupanca(float _saldo){
        super(_saldo);
    }
    @Override
    public boolean depositar(float valor) {
        if (setSaldo(valor)){
            saldo += valor;
            return true;
        }
        return false;
    }

    @Override
    public boolean sacar(float valor) {
        if (setSaldo(saldo - valor)){
            saldo -= valor;
            return true;
        }
        return false;
    }
}
