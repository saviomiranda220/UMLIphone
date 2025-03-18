import Interfaces.NavegadorWeb;
import Interfaces.ReprodutorMusical;
import Interfaces.AparelhoTelefonico;

import java.util.Scanner;

public class Iphone implements AparelhoTelefonico, NavegadorWeb, ReprodutorMusical {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página\n");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Adicionando Página\n");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página\n");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica\n");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada\n");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecione a musica\n");
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo Ligação\n");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo\n");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz\n");


    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Iphone iphone = new Iphone();
        int opcao;

            System.out.println("""
                    Selecione uma opção:
                    1: Exibir Pagina no navegador
                    2: Adicionar nova página
                    3: Atualizar Página
                    4: Tocar Musica
                    5: Pausar Musica
                    6: Selecionar Musica
                    7: Fazer Ligação
                    8: Atender Ligação
                    9: Correio de voz
                    """);
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    iphone.exibirPagina();
                    break;
                case 2:
                    iphone.adicionarNovaPagina();
                    break;
                case 3:
                    iphone.atualizarPagina();
                    break;
                case 4:
                    iphone.tocar();
                    break;
                case 5:
                    iphone.pausar();
                    break;
                case 6:
                    iphone.selecionarMusica();
                    break;
                case 7:
                    iphone.ligar();
                    break;
                case 8:
                    iphone.atender();
                    break;
                case 9:
                    iphone.iniciarCorreioVoz();
                    break;
                default:
                    System.out.println("Opção inválida");
                    sc.close();
            }
        }



    }






