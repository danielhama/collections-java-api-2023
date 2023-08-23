import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    //    Desafio 19 - Verifique se todos os números da lista são iguais:
//    Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        if (numeros.stream()
                .distinct()
                .count() == 1) {
            System.out.println("Todos os numeros são iguais");
        } else {
            System.out.println("Os numeros não são todos iguais");
        }


    }
}

