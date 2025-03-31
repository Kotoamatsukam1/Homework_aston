package Lesson_6;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Iphone 12", "12.07.2021", "Apple.", "USA", 2559, false);
        product1.printInfo();
        Product [] productArray = new Product [5];
        productArray[0] = new Product ("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productArray[1] = new Product ("Iphone 15", "02.08.2024", "Apple.", "USA", 5000, false);
        productArray[2] = new Product ("Iphone 14", "14.07.2023", "Apple.", "USA", 4559, true);
        productArray[3] = new Product ("Iphone 13", "17.08.2022", "Apple.", "USA", 3559, true);
        productArray[4] = new Product ("Iphone 12", "12.07.2021", "Apple.", "USA", 2559, false);

        System.out.println("Товары  в налиичии:     " + "2 задание");
        for (int a = 0; a < productArray.length; a++) {
            productArray[a].printInfo();
        }
        Park park = new Park ("Парк Жилибера");
        park.addAttraction("Машинки", "10:00 - 20:00", 10);
        park.addAttraction("Колесо обозрения", "10:00 - 20:00", 12);
        park.addAttraction("Хамер", "10:00 - 20:00", 52);
        park.printInfo();
    }
}
