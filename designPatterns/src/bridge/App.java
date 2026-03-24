package bridge;

import bridgeControle.ControleBasicoLG;
import bridgeControle.ControleRemoto;

public class App {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleBasicoLG();
        controle.ligarTV();
    }
}
