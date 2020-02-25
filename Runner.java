public class Runner{
  public static void main(String[] args){
    Sprinters testS = new Sprinters();
    FourHundredm test4 = new FourHundredm();
    Jumpers testJ = new Jumpers();
    Throwers testT = new Throwers();
    testS.uniform();
    testS.highschool();
    testS.coach();
    testS.practice();

    test4.uniform();
    test4.highschool();
    test4.coach();
    test4.practice();

    //Jumpers
    testJ.uniform();
    testJ.highschool();
    testJ.coach();
    testJ.practice();

    //Throwers
    testT.uniform();
    testT.highschool();
    testT.coach();
    testT.practice();

  }

}
