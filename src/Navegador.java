import java.util.Stack;

public class Navegador {

    Stack<String> voltar = new Stack<>();
    Stack<String> avancar = new Stack<>();
    String paginaAtual = null;

    // Método Acessar
    void acessar(String url) {
        if (url == null || url.isEmpty()) {
            System.out.println("URL inválida");
            return;
        }

        if (paginaAtual != null) {
            voltar.push(paginaAtual);
        }

        paginaAtual = url;
        avancar.clear();

        System.out.println("Acessando: " + paginaAtual);
        mostrarEstado();
    }

    // Mostrar estado do navegador
    void mostrarEstado() {
        System.out.println("\n-- ESTADO DO NAVEGADOR --");
        System.out.println("Página atual: " + paginaAtual);
        System.out.println("Voltar: " + voltar);
        System.out.println("Avançar: " + avancar);
        System.out.println("-----\n");
    }

    // Método Voltar
    void voltar() {
        if (!voltar.isEmpty()) {
            avancar.push(paginaAtual);
            paginaAtual = voltar.pop();

            System.out.println("Voltou para: " + paginaAtual);
        } else {
            System.out.println("Não é possível voltar");
        }
        mostrarEstado();
    }

    // Método Avançar
    void avancar() {
        if (!avancar.isEmpty()) {
            voltar.push(paginaAtual);
            paginaAtual = avancar.pop();

            System.out.println("Avançou para: " + paginaAtual);
        } else {
            System.out.println("Não é possível avançar");
        }
        mostrarEstado();
    }
}