import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Desafio 18 - Filtrar os números primos da lista:
//        Com a ajuda da Stream API, filtre os números
//        primos da lista e exiba o resultado no console.
public class Desafio18 {public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    List<Integer> primos = new ArrayList<>(numeros.stream().filter(s -> s%2 !=0 && s%3!=0 || s ==2 || s ==3).toList());

        System.out.println(primos);
}

}