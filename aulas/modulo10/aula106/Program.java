package modulo10.aula106;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria"); // 0
        list.add("Alex"); // 1
        list.add("Bob"); // 2
        list.add("Ana"); // 3

        System.out.println("Lista original: ");
        for (String name : list) {
            System.out.println(name);
        }

        System.out.println("-----------------");
        // Como ver o tamanho da lista?
        System.out.println("Tamanho da lista: " + list.size());
        System.out.println("-----------------");

        System.out.println("Lista pós remoções: ");
        //Como inserir um novo elemento na posição 2 da lis
        list.add(2, "Marco");

        // Como remover um elemento da lista?(Ana)
        list.remove("Ana");
        // Como remover pela posição na lista?(Alex)
        list.remove(1);
        // Como remover por predicado?(remover quem inicie com a letra M)
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("-----------------");
        // Como ver o tamanho da lista?
        System.out.println("Tamanho da lista: " + list.size());
        System.out.println("-----------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("-----------------");

        list.addAll(Arrays.asList("Alex", "Ana"));
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("-----------------");
        System.out.println("Lista somente com nomes iniciados em 'A': ");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String name : result) {
            System.out.println(name);
        }
        System.out.println("-----------------");
        // Como encontrar o primeiro elemento que atenda ao predicado?(Primeiro começado com 'A')
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println("Primeiro elemento que comece com a letra 'A': " + name);

        String name2 = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println("Primeiro elemento que comece com a letra 'J': " + name2);



    }
}
