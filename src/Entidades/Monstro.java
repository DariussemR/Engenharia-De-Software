package Entidades;

public interface Monstro {
    default void batalha(Heroi heroi){
    }

    void aplicarHabilidade();

    String getDescricao();
}
