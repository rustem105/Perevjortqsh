/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perevjortqsh;

import java.util.Scanner;
import static javafx.beans.binding.Bindings.length;

/**
 *
 * @author pupil
 */
public class Perevjortqsh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Vvedite stroku: ");
        String firstString = scanner.nextLine();
        char[] charFirstString = firstString.toCharArray();
        char[] charSecondString = new char[charFirstString.length];
        for(int i = 0; i < charFirstString.length; i++){
           charSecondString[(charFirstString.length-1)-i]=charFirstString[i];
        }
        String secondString = new String(charSecondString);
        System.out.print("Vvedennaja stroka naoborot: ");
        System.out.println(secondString);
    }    
}
