import java.util.ArrayList;
public class Sprinters<String> extends VernonTrack<String>{
  public Sprinters()
  {
    super();
    System.out.println("Sprinters Constructor");
}
  public void workout() {System.out.println("Workout: Really easy workout");}
  public void shoes() {System.out.println("Shoes: Solid plate, more spikes");}
  public void equipment() {System.out.println("Equipment: Track, blocks, roller");}
  public void addStudent(String n){roster.add(n);}
  public void removeStudent(String n){
    for (int x = 0; x<roster.size(); x++){
      if (roster.get(x) == n){
        roster.remove(x);
      }
    }
  }
  public void displayRoster(){
    for (int x = 0; x<roster.size(); x++){
      System.out.println("Sprinter:" + roster.get(x));
    }
}
}
