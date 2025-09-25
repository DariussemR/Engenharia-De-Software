package Itens;

import Entidades.Heroi;

public abstract class Item {
    protected BonusItem bonus;

    public Item(BonusItem _bonus){
        bonus = _bonus;
    }

    int getBonus(){
        return bonus.getValor();
    }

    abstract void aplicarBonusHeroi(Heroi heroi);

    abstract void retirarBonusHeroi(Heroi heroi);

    abstract void imprimirDescricao();

    abstract String getTipo();

    public void juntar(Heroi heroi){
        if (heroi.getMaoEsquerda() == null){
            heroi.setMaoEsquerda(this);
        } else if (heroi.getMaoDireita() == null) {
            heroi.setMaoDireita(this);
        }
    }
}
