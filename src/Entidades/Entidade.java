package Entidades;

public abstract class Entidade {
    protected int ataque;
    protected int defesa;
    protected int vida;

    Entidade(int _ataque, int _defesa, int _vida) {
        ataque = _ataque;
        defesa = _defesa;
        vida = _vida;
    }

    public int getAtaque(){
        return ataque;
    }

    public void setAtaque(int novoAtaque){
        ataque += novoAtaque;
    }

    public int getDefesa(){
        return defesa;
    }

    public void setDefesa(int novaDefesa){
        defesa += novaDefesa;
    }

    public int getVida(){
        return vida;
    }

    public void setVida(int novaVida){
        vida += novaVida;
    }
}
