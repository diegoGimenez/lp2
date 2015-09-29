/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class LP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CustomException {
        if (1 == 2) {
            throw new CustomException("teste");
        }

        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite um número inteiro:\n");

        try {
            n = entrada.nextInt();
        } catch (InputMismatchException ex) {
            throw new CustomException("teste2");
        }

    }

}
