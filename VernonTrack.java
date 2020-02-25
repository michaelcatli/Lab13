public abstract class VernonTrack implements TrackTeams
{
  public String color;
  public VernonTrack(){
    System.out.println("Vernon Track Constructor");
    color = "Blue";
  }
  public void uniform(){if (color == "Blue"){System.out.println("Everybody needs a dark blue uniform.");}}
  public void highschool(){System.out.println("VTHS");}
  public void coach(){System.out.println("SAAAAGAAAAAN");}
  public void practice(){System.out.println("Y'all got practice.");}
}
