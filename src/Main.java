public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Harry Potter", 39, 38, 49, 59, 69);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger", 34, 45, 56, 67, 78);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley", 12, 23, 34, 45, 56);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith", 13, 24, 35, 46, 57);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory", 24, 35, 46, 57, 68);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 35, 46, 57, 68, 79);

        Ravenclaw choChang = new Ravenclaw("Cho Chang", 14, 25, 36, 47, 58, 69);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil", 25, 36, 47, 58, 69, 70);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby", 36, 47, 58, 69, 70, 14);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy", 15, 26, 37, 48, 59, 60, 71);
        Slytherin grahamMontague = new Slytherin("Graham Montague", 26, 37, 48, 59, 60, 72, 15);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle", 37, 48, 59, 60, 73, 15, 26);

        ronWeasley.compare(harryPotter);
        dracoMalfoy.compare(harryPotter);
    }
}