package Itens;

public enum BonusItem {
    Bonus_Espada(10),
    Bonus_Escudo(8),
    Bonus_Cura(15);

    private int valor;

    BonusItem(int _valor){
        this.valor = _valor;
    }

    public int getValor(){
        return valor;
    }
}
