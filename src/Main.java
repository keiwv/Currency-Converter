import com.menu.Menu;
import com.api.requestAPI;

public class Main {
    public static void main(String[] args) {
        int option = -1;
        Menu menu = new Menu();
        requestAPI api = new requestAPI();
        Double total = 0.0;

        while (option != 7) {

            option = menu.getOption();

            switch (option) {
                case 1:
                    total = api.getCurrency("USD", "ARS", 10);
                    System.out.println("10 USD en Pesos Argentinos: " + total);
                    break;
                case 2:
                    total = api.getCurrency("ARS", "USD", 10);
                    System.out.println("10 Pesos Argentinos en USD: " + total);
                    break;
                case 3:
                    total = api.getCurrency("USD", "BRL", 10);
                    System.out.println("10 USD en Reales Brasileños: " + total);
                    break;
                case 4:
                    total = api.getCurrency("BRL", "USD", 10);
                    System.out.println("10 Reales Brasileños en USD: " + total);
                    break;
                case 5:
                    total = api.getCurrency("USD", "COP", 10);
                    System.out.println("10 USD en Pesos Colombianos: " + total);
                    break;
                case 6:
                    total = api.getCurrency("COP", "USD", 10);
                    System.out.println("10 Pesos Colombianos en USD: " + total);
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
