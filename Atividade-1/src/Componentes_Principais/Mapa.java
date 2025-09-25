package Componentes_Principais;

import Entidades.*;
import Itens.*;

import java.io.*;

public class Mapa {
    private char matriz[][];
    private int numLinhas;
    private int numColunas;

    private Heroi heroi;

    Mapa(String nomeArquivo, int linhas, int colunas){

        numLinhas = linhas;
        numColunas = colunas;
        this.heroi = new Heroi(1,2,3);
        this.matriz = new char[linhas][colunas];

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))){
            int c;
            int i = 0, j = 0;

            while((c = br.read()) != -1 && i < linhas){
                if(c == '\n' || c == '\r'){
                    continue;
                }
                this.matriz[i][j] = (char) c; //Cast
                j++;
                if (j == colunas){
                    j = 0;
                    i++;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void alocaMatriz(){
        this.matriz = new char[this.numLinhas][this.numColunas];
    }

    public void imprimeMapa(int x, int y){
        for (int i = 0; i < this.numLinhas; i++){
            for (int j = 0; j < this.numColunas; j++){
                System.out.println(this.matriz[i][j]);
            }
        }
    }

    public boolean encontraSaida(int x, int y){
        if (this.heroi.getVida() <= 0) {
            return false;
        }

        if (this.matriz[x][y] == '=') {
            return true;
        }

        switch(this.matriz[x][y]){

            case '=':
                return true;

            // Entidades

            case '?':
                Bicho_Papao bichoPapao = new Bicho_Papao(2, 2, 5);
                break;
            case '*':
                Curupira curupira = new Curupira(3, 1, 3);
                break;
            case '^':
                Duende duende = new Duende();
                break;
            case '&':
                Anao anao = new Anao();
                break;

            // Equipamentos

            case 'e':
                Espada espada = new Espada(BonusItem.Bonus_Espada);
            case 'd':
                Escudo escudo = new Escudo(BonusItem.Bonus_Escudo);
            case 'c':
                Cura cura = new Cura(BonusItem.Bonus_Cura);
        }

        // Atualiza posição atual do jogador;
        this.matriz[x][y] = 8;

        // Imprime o mapa
        this.imprimeMapa(x, y);

        // Fazer com que a tela atualize em intervalos
        try{
            Thread.sleep(200);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }

        // Backtracking
        // Política de Visitas:
            //1. Vou para a direita
            //2. Vou para baixo
            //3. Vou para esquerda
            //4. Vou para cima

        // 1
        if (this.matriz[x+1][y] != '#' && this.matriz[x+1][y] != '8'){
            if(encontraSaida(x+1, y) == true)
                return true;
        }

        if (this.matriz[x][y+1] != '#' && this.matriz[x][y+1] != '8'){
            if(encontraSaida(x, y+1) == true){
                return true;
            }
        }

        if (this.matriz[x-1][y] != '#' && this.matriz[x-1][y] != '8'){
            if(encontraSaida(x-1, y) == true){
                return true;
            }
        }

        if (this.matriz[x][y-1] != '#' && this.matriz[x][y-1] != '8'){
            if(encontraSaida(x, y+1) == true){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Mapa mapa = new Mapa("D:\\Development\\Code\\Java" +
                "\\Engenharia-de-Software\\Atividade-1\\src\\mapa2.txt", 17, 21);
    }
}
