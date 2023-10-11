public class Iphone {
    public static void main(String[] args) throws Exception {
        
        AppInternet safari = new AppInternet();
        safari.adicionarNovaAba();
        safari.exibirPagina();
        safari.atualizarPagina();

        AppMusica  applemusic = new AppMusica();
        applemusic.selecionarMusica();
        applemusic.tocar();
        applemusic.pausar();

        AppTelefone phone = new AppTelefone();
        phone.ligar();
        phone.atender();
        phone.iniciarCorreioVoz();


    }
}
