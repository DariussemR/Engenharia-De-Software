package Itens;

import Entidades.Heroi;

public class Escudo extends Item{

    Escudo(BonusItem _bonus) {
        super(_bonus);
    }

    @Override
    void aplicarBonusHeroi(Heroi heroi) {
        heroi.setDefesa(getBonus());
    }

    @Override
    void retirarBonusHeroi(Heroi heroi) {
        heroi.setDefesa(-getBonus());
    }

    @Override
    void imprimirDescricao() {
        System.out.println("Sua defesa aumentará em: " + getBonus());
    }

    @Override
    String getTipo() {
        return "+Defesa";
    }
}
