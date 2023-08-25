public abstract class Hogwarts {
    private String name;
    private int spellPower;
    private int transgressionDistance;

    public Hogwarts(String name, int spellPower, int transgressionDistance) {
        this.name = name;
        this.spellPower = spellPower;
        this.transgressionDistance = transgressionDistance;
    }

    public void compare(Hogwarts student) {
        if (this.getClass().equals(student.getClass())) { //Этот блок подсмотрел в лайве, в связи с чем появился вопрос:
            compareStudentStatsPerHouse(student); // <-- этот метод нестатический, соответственно его необходимо вызвать у объекта,
        } else {                                  // а здесь он вызывается просто так (я бы написал this.compareStudentStatsPerHouse(student))
            compareBasicStats(student);           // Я что-то видимо упустил, и так можно?))
        }
    }

    private void compareBasicStats(Hogwarts student) {
        System.out.println("По школе:");
        int compareThisStudent = this.spellPower + this.transgressionDistance;
        int withThatOne = student.spellPower + student.transgressionDistance;

        if (compareThisStudent > withThatOne) {
            System.out.println(this.getName() + " сильнее чем " + student.getName());
        } else if (compareThisStudent < withThatOne) {
            System.out.println(this.getName() + " слабже чем " + student.getName());
        } else {
            System.out.println("Сила равна");
        }
    }

    public abstract int calculateStatsPerHouse();

    private void compareStudentStatsPerHouse(Hogwarts student) {
        System.out.println("На своем факультете:");
        int compareThisStudent = this.calculateStatsPerHouse();
        int withThatOne = student.calculateStatsPerHouse();

        if (compareThisStudent > withThatOne) {
            System.out.println(this.getName() + " сильнее чем " + student.getName());
        } else if (compareThisStudent < withThatOne) {
            System.out.println(this.getName() + " слабже чем " + student.getName());
        } else {
            System.out.println("Сила равна");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ": Spell Power - " + spellPower + ", Transgression Distance - " + transgressionDistance + ". ";
    }
}
