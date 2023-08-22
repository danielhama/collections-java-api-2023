import java.util.Arrays;
import java.util.List;

//Desafio 7 - Encontrar o segundo número maior da lista:
//        Com a ajuda da Stream API, encontre o segundo número maior
//        da lista e exiba o resultado no console.

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer max = numeros.stream()
                .mapToInt(s -> s)
                .max()
                .getAsInt();

        numeros.stream()
                .filter(s -> s < max)
                .mapToInt(s -> s)
                .max()
                .ifPresent(System.out::println);





    }


}