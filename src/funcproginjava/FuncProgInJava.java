// An easier path to functional programming in Java
// Source: https://developer.ibm.com/articles/j-java8idioms1/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcproginjava;

import java.util.*;

/**
 *
 * @author francatm
 */
public class FuncProgInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // FindNemo demo
        List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

        findNemoImperative(names);
        findNemoDeclarative(names);

    }

    // Imperative Style - Example
    public static void findNemoImperative(List<String> names) {
        boolean found = false;

        for (String name : names) {
            if (name.equals("Nemo")) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found Nemo");
        } else {
            System.out.println("Sorry, Nemo not found");
        }
    }

    // Declarative Style - Example
    public static void findNemoDeclarative(List<String> names) {
        if (names.contains("Nemo")) {
            System.out.println("Found Nemo");
        } else {
            System.out.println("Sorry, Nemo not found");
        }
    }

}
