

package ahoarcado;

import java.util.Scanner;



public class Funciones {
public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fallos = 6;
        dibuja(0);
        dibuja(1);
        dibuja(2);
        dibuja(3);
        dibuja(4);
        dibuja(5);
        dibuja(6);
        }

    private static void dibuja(int fallos) {
        switch (fallos){
            case 0 ->{
                System.out.println("""
                                                   +---+
                                                   |   |
                                                       |
                                                       |
                                                       |
                                                       |
                                                   =========""" );
            }
            case 1 ->{
                System.out.println("""
                                                   +---+
                                                   |   |
                                                   O   |
                                                       |
                                                       |
                                                       |
                                                   =========""" );
            }
            case 2 ->{
                System.out.println("""
                                                   +---+
                                                   |   |
                                                   O   |
                                                   |   |
                                                       |
                                                       |
                                                       |
                                                   =========""" );
            }
            case 3 ->{
                System.out.println("""
                                                    +---+
                                                    |   |
                                                    O   |
                                                   /|   |
                                                        |
                                                        |
                                                        |
                                                    =========""" );
            }
            case 4 ->{
                System.out.println("""
                                                    +--+
                                                    |  |
                                                    O  |
                                                   /|\\|
                                                       |
                                                       |
                                                       |
                                                   =========""" );
            }
            case 5 ->{
                System.out.println("""
                                                    +---+
                                                    |   |
                                                    O   |
                                                   /|\\ |
                                                   /    |
                                                        |
                                                        |
                                                        |
                                                    =========""" );
            }
            case 6 ->{
                System.out.println("""
                                                    +---+
                                                    |   |
                                                    O   |
                                                   /|\\ |
                                                   / \\ |
                                                        |
                                                        |
                                                        |
                                                    =========""" );
            }
          }
        }
    }
