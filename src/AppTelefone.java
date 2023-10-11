public class AppTelefone implements AparelhoTelefonico {

    @Override
    public void ligar() {
        System.out.println("Ligando para o número");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo nmero");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
    
}
