import java.util.List;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void addVaga(String vaga);
    void notificar();
}
