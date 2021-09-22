import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        // Criar um arrayList de Strings e inicializá-lo com uma nova lista vazia
        ArrayList<String> listaDeAnimais = null;

        // Inicializando com valores
        // List<String> listaDeAnimais = Arrays.asList("Pato", "Cachorro", "Gato");


        // Bloco Try-Catch para proteger bloco de possível Exception
        // Criar uma cláusula try-catch para controlar a exceção anterior
        try {

        // Adicionar os seguintes valores: "Pato", "Cachorro" e "Gato"
        listaDeAnimais.add("Pato"); // index: 0
        listaDeAnimais.add("Cachorro"); // index: 1
        listaDeAnimais.add("Gato"); // index: 2

        // Imprimir o conteúdo da Posição 2
            System.out.println("Animal da posição 2: " + listaDeAnimais.get(2));
        } catch (NullPointerException e) {
            System.err.println("NullPointerException: " + e.getMessage());
        }
        // Executar o programa. O que acontece?
    }
}

