public class Main {
    public static void main(String[] args) {
        GroupEmployee group = new GroupEmployee();
        /*
        Cоздал 2 экземпляра класса Attractions
         */
        Park park = new Park("Octopus");
        System.out.println("\nTask1: ");
        group.joinGoup();
        System.out.println("\nTask2: ");
        park.newAttraction("Dance", "From 10.00 to 22.00", 60);
        park.newAttraction("Last flight", "From 10.22 to 22.00", 27);
        park.info();

    }
}
