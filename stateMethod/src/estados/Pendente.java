package estados;

import contexto.Tarefas;

public class Pendente implements Estados{

    private String nome = "Tarefa Pendente";
    private Tarefas tarefa;

    public Pendente(Tarefas tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasada() {
        tarefa.setEstado(new Atrasada(tarefa));
    }

    @Override
    public void concluida() {
        tarefa.setEstado(new Concluida(tarefa));
    }

    @Override
    public void pendente() {
        System.out.println("Já está pendente!");

    }

    @Override
    public String toString() {
        return "Pendente{" +
                "nome='" + nome + '\'' +
                ", tarefa=" + tarefa +
                '}';
    }
}
