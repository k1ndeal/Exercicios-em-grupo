package geradorObjetos;

import restaurantManagement.model.entities.ItemCardapio;
import restaurantManagement.model.entities.Mesa;
import restaurantManagement.model.entities.Restaurante;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CriarObjetos {

    // método para instanciar atutomaticamente algumas mesas
    public static void gerarMesas(){

        String mesas = "C://JV folder//Projetos//Java//questoes-jv-java//src//geradorObjetos//mesas.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(mesas))){

            String linhaAtual = br.readLine();

            while (linhaAtual != null){
                Integer numMesa = Integer.parseInt(linhaAtual);
                Restaurante.getListamesa().add(new Mesa(numMesa));
                linhaAtual = br.readLine();
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    // métodos para instanciar automaticamente alguns items
    public static void gerarItems(){

        String mesas = "C://JV folder//Projetos//Java//questoes-jv-java//src//geradorObjetos//items.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(mesas))){

            String linhaAtual = br.readLine();

            while (linhaAtual != null){
                String[] elementos = linhaAtual.split(",");
                String nome = elementos[0];
                Double preco = Double.parseDouble(elementos[1]);
                Restaurante.getListaItems().add(new ItemCardapio(nome, preco));
                linhaAtual = br.readLine();
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
