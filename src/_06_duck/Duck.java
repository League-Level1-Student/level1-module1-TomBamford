package _06_duck;

public class Duck {
int numberofFriends;
String favoriteFood;
	
	Duck (String favoriteFood, int numberofFriends) {
		this.favoriteFood = favoriteFood;
		this.numberofFriends = numberofFriends;
	}
	void quack() {
		System.out.println("Quack");
	}
	void waddle() {
		System.out.println("Waddle");
	}
}
