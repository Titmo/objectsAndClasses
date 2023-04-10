public class Main {
    public static void main(String[] args) {
        Author authorWarAndPeace = new Author("Л.Н.Толстой");
        Book warAndPeace = new Book("Война и мир",1867);
        Author authorCrimeAndPunishment = new Author("Ф.М.Достоевский");
        Book crimeAndPunishment = new Book("Преступление и наказание",1866);
        System.out.println(authorWarAndPeace.getAuthorName() + " " + warAndPeace.getBookName() + " " + warAndPeace.getYear());
        System.out.println(authorCrimeAndPunishment.getAuthorName() + " " + crimeAndPunishment.getBookName() + " " + crimeAndPunishment.getYear());
        warAndPeace.setYear(1999);
        System.out.println(authorWarAndPeace.getAuthorName() + " " + warAndPeace.getBookName() + " " + warAndPeace.getYear());
    }
}