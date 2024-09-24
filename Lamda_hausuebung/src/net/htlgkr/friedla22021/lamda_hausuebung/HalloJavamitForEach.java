package net.htlgkr.friedla22021.lamda_hausuebung;

import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {


    public static void main(String[] args) {
        List<String> forEachList = new ArrayList<>();
        for (String arg : args) {
            forEachList.add(arg);
        }

//        for (String string : forEachList) {
//            System.out.println(string);
//        }
        //forEachList.forEach((String line) -> System.out.println(line));

        forEachList.forEach(System.out::println);
    }
}
