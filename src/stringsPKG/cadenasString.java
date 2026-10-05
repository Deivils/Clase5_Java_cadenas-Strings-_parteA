package stringsPKG;

import java.util.Arrays;
import java.util.Scanner;


public class cadenasString {
    public static void main(String[] args) {
        String cad;
        cad = "Hola";
        System.out.println(cad);

        //Símbolos
        char c = 'a';
        c = 97; // código Unicode decimal
        System.out.println(c);
        System.out.println("\u2661");

        for (int codigo=0x0000; codigo<=0xFFFF; codigo++){
            // Convertir código hexadecimal en string
            String codigoStr = Integer.toHexString(codigo);
            System.out.println("\\u" + codigoStr + ": " + (char) codigo);
        }

        //Casting --> cadena = str(1234)
        //Convertir números en cadenas
        String cadena = String.valueOf(1234);
        System.out.println(cadena);
        String cadena2 = Integer.toString(1234);
        System.out.println(cadena2);

        //Convertir cadenas en números
        //number = int("12")
        double number = Double.parseDouble("12.34");
        int numberInt = Integer.parseInt("12");
        System.out.println(number);
        System.out.println(numberInt);

        //Comparación entre Strings (no se puede usar ==)
        boolean iguales;
        String cad1 = "Hola mundo";
        String cad2 = "Hola mundo";
        String cad3 = "Hola mundo, que tal?";
        //if(cad1 == cad2){} //PROHIBIDO
        //if(cad1.equals(cad2)){} // ACEPTADO

        iguales = cad1.equals(cad2);
        System.out.println(iguales);
        iguales = cad1.equals(cad3);
        System.out.println(iguales);

        //Comparación AlfaBética
        //Si aparece >0 Positivo --> La cadena invocante (la primera) (la del punto) es mayor que el parámetro
        //Si aparece <0 Negativo --> La cadena invocante (la primera) (la del punto) es menor que el parámetro
        //Si aparece 0 son Iguales

        String nombre1 = "Antonio";
        String nombre2 = "Paco";
        String nombre3 = "Sandra";

        System.out.println(nombre2.compareTo(nombre1));
        System.out.println(nombre2.compareTo(nombre3));
        System.out.println(nombre2.compareTo(nombre2));

        //Concatenación

        String nombres = nombre1 + " " + nombre2 + " " + nombre3;
        System.out.println(nombres);

        nombres = nombres + " " + nombres;
        System.out.println(nombres);

        nombres += " " + nombres;
        System.out.println(nombres);


        //Obtención de caracteres y subcadenas

        String frase = "Me encanta el módulo de Programación";
        char c1 = frase.charAt(7); //c1 = frase[7]

        System.out.println(c1);
        System.out.println(frase.charAt(8));

        String palabra1 = frase.substring(11); // frase[11]
        System.out.println(palabra1);
        System.out.println(frase.substring(11, 20));


        //Strip()

        String cad11 = "           Hoy he dormido siesta         ";
        System.out.println(cad11.strip());
        System.out.println(cad11.stripLeading());
        System.out.println(cad11.stripTrailing());

        //lenght() --> longitud de la cadena

        System.out.println(cad11.length());
        System.out.println(cad11.strip().length());

        //Búsqueda

        System.out.println(cad11.charAt(11));
        System.out.println(cad11.strip().charAt(11));
        System.out.println(cad11.indexOf('o')); //Atención para un carácter comillas simples
        System.out.println(cad11.indexOf("siesta"));
        System.out.println(cad11.indexOf('o', 10)); // El -1 indica que no existe en la cadena
        System.out.println(cad11.lastIndexOf('o'));

        String cad12 = "su perro pequinés se llama Pepito";
        // Case sensitive
        System.out.println(cad12.lastIndexOf("pe"));
        System.out.println(cad12.lastIndexOf("Pe"));
        System.out.println("pe".equals("Pe"));
        System.out.println("pe".equals("pe"));
        // Más comprobaciones
        /*String cad13 = "";
        * String cad14 = "Hola";* */
        // Resumiendo las dos líneas de arriba en una

        String cad13 = "", cad14 = "Hola";
        System.out.println(cad13.isEmpty());
        System.out.println(cad14.isEmpty());
        System.out.println(cad12.contains("perro"));
        System.out.println(cad12.contains("gato"));
        System.out.println(cad12.startsWith("su perro"));
        System.out.println(cad12.startsWith("perro"));
        System.out.println(cad12.endsWith("Pepito"));
        System.out.println(cad12.endsWith("perro"));
        // Case Convert
        String frase1 = "Hola quÉ tAL estÁs";
        System.out.println(frase1.toLowerCase());
        System.out.println(frase1.toUpperCase());
        String cadenaEsperada = "Manolo";
        Scanner scn =  new Scanner(System.in);
        System.out.println("Instroduzca un nombre:");
        String inputCadena = scn.nextLine().toUpperCase();
        if(inputCadena.equals(cadenaEsperada.toUpperCase())){
            System.out.println("Adelante");
        }else {
            System.out.println("Prohibido");
        }

        //REPLACE

        String frase2 = "hola mundo";
        System.out.println(frase2.replace('o', 'a'));
        System.out.println(frase2.replace('o', '\u2661'));
        System.out.println("hola manolita".replace("Hola", "adiós"));

        //SPLIT - SEPARATOR

        String nombreApellido = "Miguel Sánchez Angel Benito ";
        String[] palabras = nombreApellido.split(" ");
        System.out.println(palabras[0]);
        System.out.println(palabras[1]);
        System.out.println(palabras[2]);
        System.out.println(palabras[3]);

        System.out.println(Arrays.toString(palabras));
        char letras[] = nombreApellido.toCharArray();
        System.out.println(Arrays.toString(letras));
        //SALIDA FORMATEADA

        //printf (imprimir con formato / salida formateada)
        int cantidad = 7;
        String producto = "Manzana";
        double precio = 1.80;

        System.out.printf("Me he comprado %d %s por un precio de %g euros cada una\n", cantidad, producto, precio);
        System.out.printf("Me he comprado %d %s por un precio de %g euros cada una y el total es de %g €\n", cantidad, producto, precio, cantidad*precio);




        //Colorear

        System.out.println("\033[31m Fútbol Club");
        System.out.println("\033[34m Barcelona");
        System.out.println("\033[91m Fútbol Club");

        System.out.print("\033[33m mandarina");
        System.out.print("\033[32m hierba");
        System.out.print("\033[31m tomate");
        System.out.print("\033[37m sábanas");
        System.out.print("\033[36m cielo");
        System.out.print("\033[35m nazareno");
        System.out.print("\033[34m mar");
        System.out.println();






        // Fin Main
    }


    //Fin Class
}