package Entidades;

import Componentes_Principais.Mapa;
import Itens.Item;

public class Heroi extends Entidade{
    Item maoEsquerda;
    Item maoDireita;

    public Heroi(int _ataque, int _defesa, int _vida) {
        super(_ataque, _defesa, _vida);
    }

    public void setMaoEsquerda(Item item){
        item.juntar(this);
    }

    public void setMaoDireita(Item item){
        item.juntar(this);
    }

    public Item getMaoEsquerda(){
        return maoEsquerda;
    }

    public Item getMaoDireita(){
        return maoDireita;
    }
}
