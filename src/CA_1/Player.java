package CA_1;

public class Player {
    private String name;
    private int age;
    private String position;
    private int jurseyNumber;

    private static int counter;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", jurseyNumber=" + jurseyNumber +
                "\n"+'}';
    }

    public int getJurseyNumber() {
        return jurseyNumber;
    }

    public String getPosition() {
        return position;
    }

    public Player(String name, int age, String position, int jurseyNumber) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.jurseyNumber = jurseyNumber;
        counter ++;
    }

    public int getCounter() {
        return counter;
    }
}
