public class Hufflepuff extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int spellPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, spellPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public int calculateStatsPerHouse() {
        return diligence + loyalty + honesty;
    }

    @Override
    public String toString() {
        return super.toString() + " Hufflepuff stats: " + "Diligence - " + diligence + ", Loyalty - " + loyalty + ", Honesty=" + honesty;
    }
}
