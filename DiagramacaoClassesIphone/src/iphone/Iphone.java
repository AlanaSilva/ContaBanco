package iphone;

import funcoes.AparelhoTelefonico;
import funcoes.NavegadorNaInternet;
import funcoes.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {
    
    //Aparelho Telefonico
    public void ligar() {
        System.out.println("Chamando...");
    }

    public void atender() {
        System.out.println("Atendeu!");
    }

    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    //Navegador 
    public void exibirPagina(){
        System.out.println("Exibindo pagina");
    }
    
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }

    //Reprodutor musical
    public void tocar(){
        System.out.println("Exibindo pagina");
    }
    
    public void pausar() {
        System.out.println("Nova aba adicionada");
    }

    public void selecionarMusica() {
        System.out.println("Página atualizada");
    }
}
