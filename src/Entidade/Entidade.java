package Entidade;

public abstract class Entidade {
    protected int ataque;
    protected int defesa;
    protected int vida;

    Entidade(int _ataque, int _defesa, int _vida) {
        ataque = _ataque;
        defesa = _defesa;
        vida = _vida;
    }

    int getAtaque(){
        return ataque;
    }

    void setAtaque(int novoAtaque){
        ataque = novoAtaque;
    }

    int getDefesa(){
        return defesa;
    }

    void setDefesa(int novaDefesa){
        defesa = novaDefesa;
    }

    int getVida(){
        return vida;
    }

    void setVida(int novaVida){
        vida = novaVida;
    }
}
