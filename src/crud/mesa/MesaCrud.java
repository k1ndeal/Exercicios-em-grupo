package crud.mesa;

import aplicacao.Programa;
import restaurantManagement.model.entities.Mesa;
import restaurantManagement.model.entities.Restaurante;

import java.util.Scanner;

public class MesaCrud {

    public static void AdicionarMesa(Scanner in){
        Programa.limparTela();
        System.out.print("> Numero da mesa: ");
        int numeroMesa = in.nextInt();
        while (Restaurante.jaExisteEstaMesa(numeroMesa)){
            Programa.limparTela();
            System.out.print("ERROR - Já possui mesa com este numero!\nPor favor informe outro: ");
            numeroMesa = in.nextInt();
        }
        Programa.limparTela();
        Restaurante.getListamesa().add(new Mesa(numeroMesa));
        System.out.print("Mesa adiconada com sucesso!\nPressione enter para voltar");
        in.nextLine();
        in.nextLine();
    }

    public static void ListarMesas(Scanner in){
        Programa.limparTela();
        if (Restaurante.getListamesa().isEmpty()){
            System.out.print("Sem mesas cadastradas!\nPressione enter para voltar!");
            in.nextLine();
            in.nextLine();
        }
        else{
            System.out.println("\nMesas:\n-----------------------------");
            for (Mesa mesa : Restaurante.getListamesa()){
                System.out.println(mesa);
                System.out.println("-----------------------------");
            }
            System.out.print("\n> Pressione enter para voltar:");
            in.nextLine();
            in.nextLine();
        }
    }

    public static void atualizarDisponibilidadde(Scanner in){
        Programa.limparTela();
        System.out.print("\n> Informe o numero da mesa a atualizar: ");
        int numeroMesa = in.nextInt();
        while (!Restaurante.jaExisteEstaMesa(numeroMesa)){
            Programa.limparTela();
            System.out.println("\n> ERROR - Mesa não encontrada!");
            System.out.println("""
                    > 1 - Insirir novamente
                    > 2 - Sair""");
            System.out.print("\n> Informe a opção: ");
            int opcao = in.nextInt();
            switch (opcao){
                case 1:
                    Programa.limparTela();
                    System.out.print("> insira o numero da mesa: ");
                    numeroMesa = in.nextInt();
                    break;
                case 2:
                    return;
            }
        }
        Programa.limparTela();
        for (Mesa mesa : Restaurante.getListamesa()){
            if (mesa.getNumeroMesa().equals(numeroMesa)){
                mesa.setDisponivel(false);
                break;
            }
        }
        System.out.println("\n> mesa n° " + numeroMesa + " agora esta ocupada!");
        System.out.print("> Pressione enter para voltar:");
        in.nextLine();
        in.nextLine();
    }

    public static void rmoverMesa(Scanner in){
        Programa.limparTela();
        System.out.print("\n> Informe o numero da mesa para remover: ");
        int numeroMesa = in.nextInt();
        while (!Restaurante.jaExisteEstaMesa(numeroMesa)){
            Programa.limparTela();
            System.out.println("\n> ERROR - Mesa não encontrada!");
            System.out.println("""
                    > 1 - Insirir novamente
                    > 2 - Sair""");
            System.out.print("\n> Informe a opção: ");
            int opcao = in.nextInt();
            switch (opcao){
                case 1:
                    Programa.limparTela();
                    System.out.print("> insira o numero da mesa: ");
                    numeroMesa = in.nextInt();
                    break;
                case 2:
                    return;
            }
        }
        Programa.limparTela();
        for (Mesa mesa : Restaurante.getListamesa()){
            if (mesa.getNumeroMesa().equals(numeroMesa)){
                Restaurante.getListamesa().remove(mesa);
                break;
            }
        }
        System.out.println("\n> mesa n° " + numeroMesa + " foi removida!");
        System.out.print("> Pressione enter para voltar:");
        in.nextLine();
        in.nextLine();
    }
}
