class Player{
    String name;
    int age;
    Player(String name, int age){
        this.name = name;
        this.age = age;
    }
    void displayPlayerInfo(){
        System.out.println("Player Info");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
class Batsman extends Player{
    int runsScored;
    int inningsPlayed;
    Batsman(String name,int age,int runsScored,int inningsPlayed){
        super(name, age);
        this.runsScored = runsScored;
        this.inningsPlayed = inningsPlayed;
    }
    void displayPlayerInfo(){
        System.out.println("Batsman Info");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Runs Scored: " + this.runsScored);
        System.out.println("Innings Played: " + this.inningsPlayed);
    }
}
class Bowler extends Player{
    int matchesPlayed;
    int wicketsTaken;
    Bowler(String name,int age,int matchesPlayed,int wicketsTaken){
        super(name, age);
        this.matchesPlayed = matchesPlayed;
        this.wicketsTaken = wicketsTaken;
    }
    void displayPlayerInfo(){
        System.out.println("Bowler Info");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Wickets Taken: " + this.wicketsTaken);
        System.out.println("Matches Played: " + this.matchesPlayed);
    }
}
public class Cricket {
    public static void main(String[] args) {
        Player p = new Player("Johnty Rhodes", 46);
        Batsman rohit = new Batsman("Rohit Sharma", 37, 10866, 265);
        Bowler arshdeep = new Bowler("Arshdeep Singh", 25, 6, 10);
        p.displayPlayerInfo();
        System.out.println();
        rohit.displayPlayerInfo();
        System.out.println();
        arshdeep.displayPlayerInfo();
    }
}
