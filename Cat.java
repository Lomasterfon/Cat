package javaLesson;

public class Cat {
	private String name;
	private String breed;
	private String color;
	private double weight;
	private double age;

	

	public Cat(String name, String breed, String color, double weight, double age) {
		super();
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.weight = weight;
		this.age = age;
	}

	public Cat() {
		super();
	}

	public void eat() {
		System.out.println(name + " is eating ");
	}

	public void game() {
		System.out.println(name + " is playing ");
	}

	public void sleep() {
		System.out.println(name + " is sleeping ");
	}

	public void voice() {
		System.out.println(name + " meows: Meow-meow ");
	}

	@Override
	public String toString() {
		return "Cat [name = " + name + ", breed = " + breed + ", color = " + color + ", weight = " + weight + ", age = " + age
				+ "]";
	}

	

}
