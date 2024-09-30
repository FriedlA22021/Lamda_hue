package net.htlgkr.friedla22021.lamda_hausuebung;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class NumberTester {
    //...
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    private String filename;
    public NumberTester(String filename) {
        this.filename = filename;
    }
    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }
    public void testFile() {
       //TODO
        // 1-Zahl ist gerade/Ungerade
        // 2-Zahl ist eine Primzahl/ keine Primzahl
        // 3-Zahl ist ein Palindrom
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int numberOfTests = Integer.parseInt(br.readLine());

            for (int i = 0; i < numberOfTests; i++) {
                String[] line = br.readLine().split(" ");
                int testType = Integer.parseInt(line[0]);
                int number = Integer.parseInt(line[1]);

                switch (testType) {
                    case 1:
                        if (oddTester.testNumber(number)) {
                            System.out.println("ODD");
                        } else {
                            System.out.println("EVEN");
                        }
                        break;
                    case 2:
                        if (oddTester.testNumber(number)) {
                            System.out.println("PRIME");
                        } else {
                            System.out.println("NO PRIME");
                        }
                        break;
                    case 3:
                        if (oddTester.testNumber(number)) {
                            System.out.println("PALINDROME");
                        } else {
                            System.out.println("NO PALINDROME");
                        }
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
