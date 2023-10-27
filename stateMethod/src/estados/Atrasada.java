package estados;

import contexto.Tarefas;

public class Atrasada implements Estados{

    private String nome = "Tarefa Atrasada";
    private Tarefas tarefa;

    public Atrasada(Tarefas tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasada() {
        System.out.println("Já está atrasada!");
    }

    @Override
    public void concluida() {
        tarefa.setEstado(new Concluida(tarefa));
    }

    @Override
    public void pendente() {
        System.out.println("Tarefa atrasada!");
    }

    @Override
    public String toString() {
        return "Atrasada{" +
                "nome='" + nome + '\'' +
                ", tarefa=" + tarefa +
                '}';
    }
}
