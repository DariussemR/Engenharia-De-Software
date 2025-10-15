public class ContaCorrente extends Conta{
    private float taxaOperacao;

    ContaCorrente(float _saldo, float _taxaOperacao) {
        super(_saldo);
        if (setTaxaOperacao(_taxaOperacao)){
            taxaOperacao = _taxaOperacao;
        }
    }

    public boolean setTaxaOperacao(float _taxaOperacao){
        return _taxaOperacao >= 0 && _taxaOperacao <= 1;
    }

    public float getTaxaOperacao(){
        return (saldo * taxaOperacao);
    }

    @Override
    public boolean depositar(float valor) {
        if (setSaldo(valor)){
            saldo += valor;
            saldo -= getTaxaOperacao();
            return true;
        }
        return false;
    }

    @Override
    public boolean sacar(float valor) {
        if (setSaldo(saldo - valor)){
            saldo -= valor;
            saldo -= getTaxaOperacao();
            return true;
        }
        return false;
    }
}
