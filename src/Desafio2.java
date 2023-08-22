import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


 //Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        int soma = numeros.stream()
                .filter(s -> s % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(soma);


    }


}