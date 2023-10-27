package contexto;


public class UsaGerenciador {

    public static void main(String[] args) {

        Tarefas tarefa = new Tarefas("XPTO", "Documento de requisitos funcionais");
        tarefa.requisitarConcluida();
        tarefa.requisitarPendente();
        tarefa.requisitarAtrasada();
    }
}
