public class Main {
    public static void main(String[] args) {
        AgenciaEmpregos agencia = new AgenciaEmpregos();

        Observer assinante1 = new Assinante("Carlos");
        Observer assinante2 = new Assinante("Maria");
        Observer assinante3 = new Assinante("João");

        agencia.addObserver(assinante1);
        agencia.addObserver(assinante2);
        agencia.addObserver(assinante3);

        // Adicionando vagas e notificando assinantes
        agencia.addVaga("Desenvolvedor Java");
        agencia.addVaga("Analista de Dados");
        agencia.addVaga("Engenheiro de Software");
    }
}
