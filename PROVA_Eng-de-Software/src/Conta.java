public abstract class Conta {
    protected float saldo;

    public float getSaldo(){ return saldo; }

    public boolean setSaldo(float _saldo){
        return _saldo >= 0;
    }

    Conta(float _saldo){
        if (setSaldo(_saldo)){
            saldo = _saldo;
        }
    }

    public abstract boolean depositar(float valor);

    public abstract boolean sacar(float valor);
}
