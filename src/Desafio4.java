import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Desafio 4 - Remova todos os valores ímpares:
//        Utilize a Stream API para remover os
//        valores ímpares da lista e imprima a
//        lista resultante no console.

public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numeros2 = new ArrayList<>(numeros);
        numeros2.removeIf(s -> s % 2 != 0);

        System.out.println(numeros2);


        List<Integer> impares = new ArrayList<>();
        numeros.stream()
                .filter(s -> s % 2 != 0)
                .mapToInt(Integer::intValue)
                .forEach(impares::add);

        System.out.println(impares);

        List<Integer> pares = new ArrayList<>();
        numeros.stream()
                .filter(s -> s % 2 == 0)
                .mapToInt(Integer::intValue)
                .forEach(pares::add);

        System.out.println(pares);




    }


}