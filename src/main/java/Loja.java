import java.util.ArrayList;
import java.util.List;

/*
 ** created by: jorge.lessa
 */
public class Loja {

    private List<ITarefa> tarefaList = new ArrayList<>();

    public String executarTarefa(ITarefa tarefa) {
        this.tarefaList.add(tarefa);
        return tarefa.executar();
    }

    public String cancelarTarefa(ITarefa tarefa) {
        this.tarefaList.remove(tarefa);
        return tarefa.cancelar();
    }
}
