package aplicacao;

import crud.mesa.MesaCrud;
import geradorObjetos.CriarObjetos;
import restaurantManagement.model.entities.Restaurante;

import java.util.Scanner;

public class Programa {

    public static void limparTela(){
        for (int i = 0; i< 50; i++){
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        CriarObjetos.gerarMesas();
        System.out.println(Restaurante.getListamesa());

        CriarObjetos.gerarItems();
        System.out.println(Restaurante.getListaItems());

        while (true) {
            // menu
            limparTela();
            System.out.println("""
                    ---------- restaurante jota ------------
                    > 1 - Mesas
                    > 2 - Item cardapio
                    > 3 - Pedidos
                    > 4 - fechar sistema""");

            System.out.print("\n> informe a opção: ");
            int opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    limparTela();
                    menuMesa(in);
                    break;
                case 2:
                    // TODO -> opcoes de items
                    break;
                case 3:
                    // TODO -> opcoes de pedidos
                    break;
                case 4:
                    System.out.println("saindo...");
                    return;
            }
        }
    }

    public static void menuMesa(Scanner in){
        while (true) {
            limparTela();
            System.out.println("""
                    ---------- menu mesas---------
                    > 1 - Adiconar mesa
                    > 2 - listar mesa
                    > 3 - Atualizar status
                    > 4 - Remover
                    > 5 - Sair""");

            System.out.print("\n>Informe a opção: ");
            int opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    MesaCrud.AdicionarMesa(in);
                    break;
                case 2:
                    MesaCrud.ListarMesas(in);
                    break;
                case 3:
                    MesaCrud.atualizarDisponibilidadde(in);
                    break;
                case 4:
                    MesaCrud.rmoverMesa(in);
                    break;
                case 5:
                    return;
            }
        }
    }
}
