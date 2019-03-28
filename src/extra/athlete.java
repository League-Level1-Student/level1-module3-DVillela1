package extra;

public class athlete {
	static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

void Athlete (String name, int speed){
    this.name = name;
    this.speed = speed;
}

public static void main(String[] args) {
    athlete a = new athlete();
    System.out.println(a.name + a.bibNumber + a.raceLocation);
    athlete b = new athlete();
    System.out.println(b.name + b.bibNumber + b.raceLocation);
}
}
