package _05_vault;

public class JamesBond {
	public boolean cracked = false;
		static vault v = new vault(321651);
		public static void main(String[] args) {
			JamesBond j = new JamesBond();
			j.findCode(v);
			System.out.println(j.findCode(v));
		}

public int findCode(vault v) {
	for(int i = 0; i < 1000000; i++) {
		if (v.secretCode == i) {
			return i;
		}
	}
	return -1;
	}

}


