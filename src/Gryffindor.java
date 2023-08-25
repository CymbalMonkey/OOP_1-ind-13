public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(String name, int spellPower, int transgressionDistance, int nobility, int honour, int bravery) {
        super(name, spellPower, transgressionDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    @Override
    public int calculateStatsPerHouse() {
        return nobility + honour + bravery;
    }

    @Override
    public String toString() {
        return super.toString() + " Gryffindor stats: " + "Nobility - " + nobility + ", Honour - " + honour + ", Bravery - " + bravery;
    }
}
