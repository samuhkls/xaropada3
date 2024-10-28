public class Assinante implements Observer {
    private String nome;

    public Assinante(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String vaga) {
        System.out.println("Olá, " + nome + "! Nova vaga disponível: " + vaga);
    }
}
