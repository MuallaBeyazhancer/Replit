package replit220_234;

public class _225OOp17Dog extends _225OOP17Animal{
	private String breed;
    private int humanYears;

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public _225OOp17Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String toString() {
        return "Name: " + getName() + "\n" + "Breed: " + breed + "\n" + "Age in calendar years: " + getAge() + "\n"
                + "Age in human years: " + getAgeInHumanYears();
    }

    public int getAgeInHumanYears() {
        if (getAge() <= 2) {
            humanYears = getAge() * 11;
        } else {
            humanYears = 22 + ((getAge() - 2) * 5);
        }
        return humanYears;
    }

    public boolean equals(_225OOp17Dog ob) {
        if (getName().equals(ob.getName()) && getAge() == ob.getAge() && getBreed().equals(ob.getBreed())) {
            return true;
        }
        return false;
    }
}
