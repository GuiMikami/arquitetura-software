package contexto;

import estados.Estados;
import estados.Pendente;

public class Tarefas {

    private String nome;
    private String descricao;
    private Estados estado;

    public Tarefas(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.estado = new Pendente(this);
    }

    //sera usada pela classe Main
    protected void requisitarPendente(){
        estado.pendente();
    }
    protected void requisitarConcluida(){
        estado.concluida();
    }
    protected void requisitarAtrasada(){
        estado.atrasada();
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
        System.out.println(this.estado);
    }

    @Override
    public String toString() {
        return "Tarefas{" + "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
