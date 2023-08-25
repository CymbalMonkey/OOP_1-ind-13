public class Ravenclaw extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wittiness;
    private int creativity;

    public Ravenclaw(String name, int spellPower, int transgressionDistance, int intelligence, int wisdom, int wittiness, int creativity) {
        super(name, spellPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    @Override
    public int calculateStatsPerHouse() {
        return intelligence + wisdom + wittiness + creativity;
    }

    @Override
    public String toString() {
        return super.toString() + " Ravenclaw stats: " + "Intelligence - " + intelligence + ", Wisdom - " + wisdom + ", Wittiness - " + wittiness + ", Creativity - " + creativity;
    }
}
