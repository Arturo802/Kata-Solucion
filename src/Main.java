public class Main {
        public static void main(String[] args) {
            // Ejemplos de prueba
            String input1 = "the-stealth-warrior";
            String input2 = "The_Stealth_Warrior";
            String input3 = "The_Stealth-Warrior";
            String input4 = "this-is-a-test";
            String input5 = "This_Is_A_Test";
            String input6 = "This-Is_A-Test";
            String input7 = "a";
            String input8 = "";
            String input9 = null;

            // Llamadas a la función toCamelCase e impresión de resultados
            System.out.println("Entrada: " + input1 + ", Salida: " + Solucion.toCamelCase(input1));
            System.out.println("Entrada: " + input2 + ", Salida: " + Solucion.toCamelCase(input2));
            System.out.println("Entrada: " + input3 + ", Salida: " + Solucion.toCamelCase(input3));
            System.out.println("Entrada: " + input4 + ", Salida: " + Solucion.toCamelCase(input4));
            System.out.println("Entrada: " + input5 + ", Salida: " + Solucion.toCamelCase(input5));
            System.out.println("Entrada: " + input6 + ", Salida: " + Solucion.toCamelCase(input6));
            System.out.println("Entrada: " + input7 + ", Salida: " + Solucion.toCamelCase(input7));
            System.out.println("Entrada: " + input8 + ", Salida: " + Solucion.toCamelCase(input8));
            System.out.println("Entrada: " + input9 + ", Salida: " + Solucion.toCamelCase(input9));
        }
    }