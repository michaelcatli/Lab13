import java.util.ArrayList;
public abstract class VernonTrack<String> implements TrackTeams<String>
{
  ArrayList<String> roster = new ArrayList<String>();
  public String color = (String)"Blue";
  public VernonTrack(){
    System.out.println("Vernon Track Constructor");

  }
  public void uniform(){if (color == "Blue"){System.out.println("Everybody needs a dark blue uniform.");}}
  public void highschool(){System.out.println("VTHS");}
  public void coach(){System.out.println("SAAAAGAAAAAN");}
  public void practice(){System.out.println("Y'all got practice.");}
  }
