public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambitiousness;
    private int inventiveness;
    private int cravingForPower;

    public Slytherin(String name, int spellPower, int transgressionDistance, int cunning, int determination, int ambitiousness, int inventiveness, int cravingForPower) {
        super(name, spellPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambitiousness = ambitiousness;
        this.inventiveness = inventiveness;
        this.cravingForPower = cravingForPower;
    }

    @Override
    public int calculateStatsPerHouse() {
        return cunning + determination + ambitiousness + inventiveness + cravingForPower;
    }

    @Override
    public String toString() {
        return super.toString() + " Slytherin stats: " + "Cunning - " + cunning + ", Determination - " + determination + ", Ambitiousness - " + ambitiousness + ", Inventiveness - " + inventiveness + ", CravingForPower - " + cravingForPower;
    }
}
