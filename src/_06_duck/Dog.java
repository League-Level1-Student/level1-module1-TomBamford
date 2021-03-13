package _06_duck;

import java.util.Random;

public class Dog {
	int speed;
	String favoriteFood;
	Dog(String favoriteFood, int speed) {
		this.favoriteFood = favoriteFood;
		this.speed = speed;
	}
	void run () {
		System.out.println("Millie ran at a maximum speed of" + " " + speed);
	}
	void eat () {
		System.out.println("Millie ate" + " " + favoriteFood);
	}
}
