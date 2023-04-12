public class Main {
    public static void main(String[] args) {
        Author authorWarAndPeace = new Author("Л.Н.Толстой");
        Book warAndPeace = new Book("Война и мир", authorWarAndPeace, 1867);
        Author authorCrimeAndPunishment = new Author("Ф.М.Достоевский");
        Book crimeAndPunishment = new Book("Преступление и наказание",authorCrimeAndPunishment,1866);
        System.out.println(warAndPeace);
        System.out.println(crimeAndPunishment);
        warAndPeace.setYear(1999);
        System.out.println(warAndPeace);

    }
}