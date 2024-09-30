package net.htlgkr.friedla22021.lamda_hausuebung;

import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {


    public static void main(String[] args) {
        List<String> forEachList = new ArrayList<>();
        for (String arg : args) {
            forEachList.add(arg);
        }
        for (String s : forEachList) {
            System.out.println(s);
        }

        System.out.println("Ausgabe mit forEach Lamda: ");

        forEachList.forEach(s -> System.out.println(s));

        System.out.println("Ausgabe mit forEach(1) Lamda: ");

        forEachList.forEach(System.out::println);
    }
}
