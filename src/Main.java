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
                    total = api.getCurrency("USD", "ZWL", 10);
                    System.out.println(total);
            }
        }
    }
}