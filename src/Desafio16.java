
import java.io.Console;
import java.util.stream.IntStream;

//Desafio 16 - Calcule o fatorial de um número:
//        Crie um programa que receba um número
//        inteiro como entrada e, utilizando a
//        Stream API, calcule o fatorial desse
//        número e exiba o resultado no console.
public class Desafio16 {
    public static void main(String[] args) {
//        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Recebe um numero pelo console
        Console console = System.console();
        String linha = console.readLine("Digite um numero inteiro: ");
        int numero = Integer.parseInt(linha);
        // Calcula fatorial com Stream API
        int fatorial = IntStream.range(1,numero)
                .reduce(1, (fat1, fat) -> fat1 * fat);

        System.out.println(fatorial);


    }
}
