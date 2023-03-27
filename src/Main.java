public class Main {
    public static void main(String[] args) {
        int ticketPrice = 10000; // 10000 рублей стоимость билета
        int pricePerMili = 20; // 1 миля за каждые потраченные 20 рублей
        int bonusPerMile = 1; // 1 бонусная миля
        int amountOfBonus = ticketPrice / pricePerMili * bonusPerMile;

        System.out.println("Начисленные мили:");
        System.out.println(amountOfBonus = ticketPrice / pricePerMili * bonusPerMile);

    }
}