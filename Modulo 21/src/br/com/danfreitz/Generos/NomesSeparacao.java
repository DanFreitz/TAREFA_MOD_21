package br.com.danfreitz.Generos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Daniel
 */

public class NomesSeparacao {

    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Daniel","Rodrigo","Ana","Gabriela");

        List<String> nomesFemininos = nomes.stream().filter(nome -> {

            if (nome.endsWith("a") || nome.endsWith("e")) {
                return true;
            } else {
                return false;
            }
        })
                .collect(Collectors.toList());

        System.out.println("Nomes Femininos: " + nomesFemininos);
    }
}
