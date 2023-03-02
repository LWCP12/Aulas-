package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tdv = 0;
        int vmv = 0;
        int lit = 0;
        int dist = 0;


        System.out.println("Qual o tempo de viagem em horas?");
        tdv = scanner.nextInt();

        System.out.println("Qual a velocidade média da viagem?");
        vmv = scanner.nextInt();

        dist = tdv*vmv;
        lit = dist/12;

        System.out.println("Litros Gastos:" +lit);
    }
}
