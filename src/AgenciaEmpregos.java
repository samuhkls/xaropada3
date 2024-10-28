import java.util.ArrayList;
import java.util.List;

public class AgenciaEmpregos implements Subject {
    private List<Observer> assinantes = new ArrayList<>();
    private List<String> vagas = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        assinantes.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        assinantes.remove(observer);
    }

    @Override
    public void addVaga(String vaga) {
        vagas.add(vaga);
        notificar();
    }

    @Override
    public void notificar() {
        for (Observer assinante : assinantes) {
            assinante.update(vagas.get(vagas.size() - 1));
        }
    }
}
