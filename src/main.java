import java.util.ArrayList;
import java.util.Collections;

public class main {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(3);
	list1.add(100);
	list1.add(500);
	list1.add(900);
	ArrayList<Integer> list2 = new ArrayList<Integer>(3);
	list1.add(800);
	list1.add(600);
	list1.add(300);
	ArrayList<Integer> list3 = new ArrayList<Integer>(3);
	list1.add(400);
	list1.add(700);
	list1.add(200);
	
	ArrayOrganizer organize = new ArrayOrganizer();
	ArrayList<Integer> list4 = organize.concatAndSort(list1, list2, list3);
	Player tom = new Player("Tom");
	Player john = new Player("John");
	Player james= new Player("James");
	Player henry = new Player("Henry");
	Die die = new Die();
	for(int i=0; i<5; i++) {
		tom.addScore(die.rollDie());
		john.addScore(die.rollDie());
		james.addScore(die.rollDie());
		henry.addScore(die.rollDie());
	}
	tom.toString();
	john.toString();
	james.toString();
	henry.toString();
	}

}
