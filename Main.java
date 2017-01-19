package javaLesson;

public class Main {

	public static void main(String[] args) {
		Cat catOne = new Cat("Murchik", "Siberian", "gray", 5.3, 3.6);
		Cat catTwo = new Cat("Murzik", "Persian", "white", 4.8, 3.0);

		System.out.println(catOne);
		catOne.eat();
		catOne.sleep();
		catOne.voice();

		System.out.println(catTwo);
		catTwo.eat();
		catTwo.game();
	}

}
