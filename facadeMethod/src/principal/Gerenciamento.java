package principal;

import facade.Facade;

public class Gerenciamento {

    public static void main(String[] args) {
        Facade facade = Facade.getInstance();
        facade.gerarRelatorio();
    }

}
