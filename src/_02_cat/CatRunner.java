package _02_cat;

public class CatRunner {
	public static void main(String[] args) {
		Cat cat = new Cat("Dog");
		cat.meow();
		cat.printName();
		for(int i = 1; i < 10; i++) {
		cat.kill();
		}
	}
}
