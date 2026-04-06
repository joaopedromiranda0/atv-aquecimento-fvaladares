public class Main {
    public static void main(String[] args) {

        Navegador nav = new Navegador();

        nav.acessar("google.com");
        nav.acessar("youtube.com");
        nav.acessar("facebook.com");

        nav.voltar();
        nav.voltar();

        nav.avancar();

        nav.acessar("instagram.com"); // limpa o avançar
    }
}