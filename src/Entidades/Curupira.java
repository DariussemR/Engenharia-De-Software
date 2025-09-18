package Entidades;

public class Curupira extends Entidade implements Monstro{

    Curupira(int _ataque, int _defesa, int _vida) {
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
