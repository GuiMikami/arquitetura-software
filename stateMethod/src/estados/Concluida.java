package estados;

import contexto.Tarefas;

public class Concluida implements Estados{

    private String nome = "Tarefa Concluida";
    private Tarefas tarefa;

    public Concluida(Tarefas tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasada() {
        System.out.println("Tarefa já está concluida!");
    }

    @Override
    public void concluida() {
        System.out.println("Já está concluida!");
    }

    @Override
    public void pendente() {
        tarefa.setEstado(new Pendente(tarefa));
    }

    @Override
    public String toString() {
        return "Concluida{" +
                "nome='" + nome + '\'' +
                ", tarefa=" + tarefa +
                '}';
    }
}
