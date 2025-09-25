package Itens;

import Entidades.Heroi;

public class Espada extends Item{

    public Espada(BonusItem _bonus) {
        super(_bonus);
    }

    @Override
    void aplicarBonusHeroi(Heroi heroi) {
        heroi.setAtaque(getBonus());
    }

    @Override
    void retirarBonusHeroi(Heroi heroi) {
        heroi.setAtaque(-getBonus());
    }

    @Override
    void imprimirDescricao() {
        System.out.println("Seu ataque aumentará em: " + getBonus());
    }

    @Override
    String getTipo() {
        return "+Ataque";
    }
}
