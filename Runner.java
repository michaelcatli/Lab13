import java.util.ArrayList;
public class Runner{
  public static void main(String[] args){
    Sprinters testS = new Sprinters();
    FourHundredm test4 = new FourHundredm();
    Jumpers testJ = new Jumpers();
    Throwers testT = new Throwers();
//sprinters
    testS.uniform();
    testS.highschool();
    testS.coach();
    testS.practice();
    testS.workout();
    testS.shoes();
    testS.equipment();
    testS.addStudent("Mark Smith");
    testS.addStudent("Jenna Charles");
    testS.displayRoster();
//400m
    test4.uniform();
    test4.highschool();
    test4.coach();
    test4.practice();
    test4.workout();
    test4.shoes();
    test4.equipment();
    test4.addStudent("Irena Nida");
    test4.addStudent("Dado Michael");
    test4.displayRoster();
    //Jumpers
    testJ.uniform();
    testJ.highschool();
    testJ.coach();
    testJ.practice();
    testJ.workout();
    testJ.shoes();
    testJ.equipment();
    testJ.addStudent("Abdullo Kyra");
    testJ.addStudent("Alexander Roc");
    testJ.displayRoster();
    //Throwers
    testT.uniform();
    testT.highschool();
    testT.coach();
    testT.practice();
    testT.workout();
    testT.shoes();
    testT.equipment();
    testT.addStudent("Lima Kevin");
    testT.addStudent("Calla Jelena");
    testT.displayRoster();
  }

}
