package uso;

import iphone.Iphone;

public class Uso {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Aparelho Telefônico: ");
        System.out.println(" ");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorrerioVoz();

        System.out.println(" ");
        System.out.println("Navegador: ");
        System.out.println(" ");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println(" ");
        System.out.println("Reprodutor musical: ");
        System.out.println(" ");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        
    }
    
}
