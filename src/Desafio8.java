import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> digitos = new ArrayList<>();

        numeros.stream().map(Object::toString)
                .forEach(s -> {
                    if (s.length() == 1) {
                        digitos.add(Integer.parseInt(s));
                    } else {
                        for (int i = 0; i < s.length(); i++) {
                            digitos.add(Integer.parseInt(s.substring(i, i + 1)));
                        }
                    }
                });
        Integer somadigitos = digitos.stream().mapToInt(s -> s).sum();
        System.out.println(somadigitos);
//        System.out.println(numeros.stream().mapToInt(s -> s).sum());


    }
}
