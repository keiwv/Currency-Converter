import com.menu.Menu;
import com.api.requestAPI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = -1;
        Menu menu = new Menu();
        requestAPI api = new requestAPI();
        Double total = 0.0;
        float amount = 0.0f;
        Scanner scanner = new Scanner(System.in);

        while (option != 7) {

            option = menu.getOption();

            if (option >= 1 && option <= 6) {
                System.out.println("Ingrese la cantidad a convertir: ");
                amount = scanner.nextFloat();
            }

            switch (option) {
                case 1:
                    total = api.getCurrency("USD", "ARS", amount);
                    System.out.println(amount + " dólares son " + total + " pesos argentinos");
                    break;
                case 2:
                    total = api.getCurrency("ARS", "USD", amount);
                    System.out.println(amount + " pesos argentinos son " + total + " dólares");
                    break;
                case 3:
                    total = api.getCurrency("USD", "BRL", amount);
                    System.out.println(amount + " dólares son " + total + " reales brasileños");
                    break;
                case 4:
                    total = api.getCurrency("BRL", "USD", amount);
                    System.out.println(amount + " reales brasileños son " + total + " dólares");
                    break;
                case 5:
                    total = api.getCurrency("USD", "COP", amount);
                    System.out.println(amount + " dólares son " + total + " pesos colombianos");
                    break;
                case 6:
                    total = api.getCurrency("COP", "USD", amount);
                    System.out.println(amount + " pesos colombianos son " + total + " dólares");
                    break;
                case 7:
                    System.out.println("Saliendo del programa. ¡Gracias por usar el conversor de monedas!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción del 1 al 7.");
                    break;
            }
        }
    }
}
