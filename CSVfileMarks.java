package com.company;
import javax.swing.*;
import java.io.IOException;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

class csvfileread {
    public static void csvread() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ELCOT\\Desktop\\Sruthirrandom.csv"));
        String line = "";
        int index = 0;
        while ((line = br.readLine()) != null) {
            String [] S = line.split(",");
            String name = " ";
            int sum = 0, i;
            int n, j, number = 0;
            float average = 0;
            System.out.print("The Student ");
            for (i = 0; i < 6; i++) {
                if (i == 0)
                    name = S[0];
                else {
                    int num = Integer.parseInt(S[i]);
                    sum = sum + num;
                }
            }
            System.out.print(name + " got ");
            System.out.print("total marks " + sum + " and the average of ");
            average = (float)sum / 5;
            System.out.format("%.2f",average);
            System.out.println(" ");
            number++;
            sum = 0;
        }
        br.close();
    }
}
public class Main {

    public static void main(String[] args) throws IOException {
        csvfileread b = new csvfileread();
        b.csvread();
    }
}
