
package ahoarcado;

import java.util.Scanner;
import java.util.Arrays;
import static ahoarcado.Funciones.*;

public class Ahoarcado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fallos = 0;
        String palabraAdivinar = "Chiripoya";
        String[] palabraJuego=new String[palabraAdivinar.length()];
        for (int i = 0; i < palabraJuego.length; i++) {
            palabraJuego[i]="-";
        }
        System.out.println(Arrays.toString(palabraJuego));
        
        //Comienza nuestro programa
        System.out.println("Introduce una letra");
        String letraString = teclado.next();
        //Me quedo con la primera posici?n por si introducen 2
        char letra = letraString.charAt(0);
        letraString = String.valueOf(letra);
        if (palabraAdivinar.contains(letraString)) {
            for (int i = 0; i < palabraAdivinar.length(); i++) {
                if(palabraAdivinar.charAt(i)==letra){
                    palabraJuego[i]=letraString;
                }
            }
            System.out.println(Arrays.toString(palabraJuego));
        }else{
            System.out.println("No está");
        }
    }
    }
    

