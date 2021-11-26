package OopFourBasePrinciple.Encapsulation;

public class BookMain {
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 150);
        Book lordOfTheRings = new Book("Lord Of The Rings", -150);

        System.out.println(harryPotter.getPageNumber());
        harryPotter.setPageNumber(200);
        System.out.println(harryPotter.getPageNumber());
        System.out.println(lordOfTheRings.getPageNumber());
        lordOfTheRings.setPageNumber(300);
        System.out.println(lordOfTheRings.getPageNumber());
    }
}
