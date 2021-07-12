package dao;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Tarefa;

@ManagedBean
@SessionScoped
public class TarefaBean {

    private Tarefa tar = new Tarefa();
    private List<Tarefa> tarefas;

    public List<Tarefa> getTarefas() {

        if (this.tarefas == null) {
            EntityManager em = JPAUtil.getEntityManager();
            Query q = em.createQuery("select a from Tarefa a",
            		Tarefa.class);
            this.tarefas = q.getResultList();
            em.close();
        }
        return tarefas;
    }

    public String cadastrarNova(String complemento) {
        tar = new Tarefa();
        return complemento + "CadastrarTarefa";
    }
}