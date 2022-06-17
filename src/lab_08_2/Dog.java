package lab_08_2;

public class Dog extends Animal {

    @Override
    public String getAnimalType() {
        return "Dog";
    }

    @Override
    public int getMaxSpeed() {
        return 60;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + getAnimalType() + '\'' +
                super.toString() +
                ", maxSpeed=" + getMaxSpeed() +
                '}';
    }
}