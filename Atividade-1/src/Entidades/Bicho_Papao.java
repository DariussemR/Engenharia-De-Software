package Entidades;

public class Bicho_Papao extends Entidade implements Monstro{

    public Bicho_Papao(int _ataque, int _defesa, int _vida) {
        super(_ataque, _defesa, _vida);
    }

    @Override
    public void aplicarHabilidade() {

    }

    @Override
    public String getDescricao() {
        return "";
    }
}
