package facade;

import sistema.Banco;
import sistema.Cliente;
import sistema.Gerente;
import sistema.Projeto;

public class Facade {

    //implementando singleton para usar a mesma instancia em outras classes ao inves
    //de criar varias instancias.
    private static Facade facade = new Facade();
    private Facade(){}

    public static Facade getInstance() {
        return facade;
    }
    public void gerarRelatorio() {
        Cliente cliente = new Cliente();
        System.out.println("Cliente: " + cliente.pesquisarClienteId(123));

        Projeto projeto = new Projeto();
        System.out.println("Projeto: " + projeto.pesquisarProjetoId(23));

        Gerente gerente = new Gerente();
        System.out.println("Gerente: " + gerente.pesquisarGerenteId(3));
    }
}

