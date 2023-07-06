package br.com.devsgeeknerd.zoologico.app;

import br.com.devsgeeknerd.zoologico.classes.Animal;
import br.com.devsgeeknerd.zoologico.classes.Cachorro;
import br.com.devsgeeknerd.zoologico.classes.Gato;

public class Programa {
    public static void main(String[] args) {
        Animal Animal = new Cachorro("Toto");
        System.out.println("Ola, seu animal é " + Animal.getEspecie() + ", o nome do " + "animal é " + Animal.getNome()
                + " e ele tem " + Animal.getIdade() + " anos.");

        if (Animal.ehAdulto()) {
            System.out.println("Seu cachorro é adulto");
        } else {
            System.out.println("Seu cachorro nao é adulto");
        }

        System.out.println("============");
        System.out.println("Barulho do cachorro: ");
        Animal.emitirBarulho();

    }

}
