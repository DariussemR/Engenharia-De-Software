package Itens;

import Entidades.Heroi;

public class Cura extends Item{

    Cura(BonusItem _bonus) {
        super(_bonus);
    }

    @Override
    void aplicarBonusHeroi(Heroi heroi) {
        heroi.setVida(getBonus());
    }

    @Override
    void retirarBonusHeroi(Heroi heroi) {
        heroi.setVida(-getBonus());
    }

    @Override
    void imprimirDescricao() {
        System.out.println("Cura sua vida em: " + getBonus());
    }

    @Override
    String getTipo() {
        return "Cura";
    }
}
