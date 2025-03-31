package Lesson_6;

public class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }


    class Attraction {
        private String nameAtracction;
        private String chasiRaboti;
        private int price;

        public Attraction(String nameAtracction, String chasiRaboti, int price) {
            this.nameAtracction = nameAtracction;
            this.chasiRaboti = chasiRaboti;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + nameAtracction);
            System.out.println("Время работы: " + chasiRaboti);
            System.out.println("Стоимость: " + price + "byn");
        }
    }

    public void addAttraction(String nameAtracction, String chasiRaboti, int price) {
        Attraction attraction = new Attraction(nameAtracction, chasiRaboti, price);
        attraction.printInfo();
    }

    public void printInfo() {
        System.out.println("Название парка - " + name);
    }
}
