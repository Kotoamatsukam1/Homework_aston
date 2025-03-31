package Lesson_6;

public class Product {
    private String nazvanie;
    private String dataProizvodstva;
    private String proizvoditel;
    private String staranaProizvoditel;
    private int price;
    private boolean sostoyanieBroni;

    public Product (String nazvanie, String dataProizvodstva, String proizvoditel, String staranaProizvoditel,
                    int price, boolean sostoyanieBroni){
        this.nazvanie = nazvanie;
        this.dataProizvodstva = dataProizvodstva;
        this.proizvoditel = proizvoditel;
        this.staranaProizvoditel = staranaProizvoditel;
        this.price = price;
        this.sostoyanieBroni = sostoyanieBroni;
    }
    public void printInfo(){
        System.out.println("Название - " + nazvanie);
        System.out.println("Дата производтса - " + dataProizvodstva);
        System.out.println("Производитель - " + proizvoditel);
        System.out.println("Страна происхождения - " + staranaProizvoditel);
        System.out.println("Цена - " + price);
        System.out.println("Забронировано: - " + (sostoyanieBroni? "Да" : "Нет"));
        System.out.println();
    }
}

