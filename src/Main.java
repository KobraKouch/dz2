public class Main {
    public static void main(String[] args) {
        // Стоимость билета в рублях
        int ticketPrice = 13676; // Задайте стоимость билета

        // Стоимость одной мили в рублях
        int costPerMile = 20;

        // Расчет количества бонусных миль
        int bonusMiles = ticketPrice / costPerMile;

        // Вывод результата
        System.out.println("Стоимость билета: " + ticketPrice + " рублей");
        System.out.println("Количество начисленных миль: " + bonusMiles);
    }
}
