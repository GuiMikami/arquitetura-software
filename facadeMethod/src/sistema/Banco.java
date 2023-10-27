package sistema;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Gerente> listaGerentes = new ArrayList<>();
    private List<Projeto> listaProjetos = new ArrayList<>();

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Gerente> getListaGerentes() {
        return listaGerentes;
    }

    public List<Projeto> getListaProjetos() {
        return listaProjetos;
    }

    public void carregarDados(){
        listaClientes.add(new Cliente("Mel", 123));
        listaClientes.add(new Cliente("Gaia", 123));

        listaGerentes.add(new Gerente("Tonica", 1));
        listaGerentes.add(new Gerente("Mustafa", 3));
        listaGerentes.add(new Gerente("Ronda", 6));

        listaProjetos.add(new Projeto("Loja mel", 23, "23/06/2023","12/07/2024"));
    }
}
