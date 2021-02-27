package _03_harry_potter;

public class HarryPotterRunner {
	public static void main(String[] args) {
		HarryPotter Potter = new HarryPotter();
		Potter.makeInvisible(true);
		Potter.spyOnSnape();
		Potter.makeInvisible(false);
		Potter.castSpell("spell");
	}
}
