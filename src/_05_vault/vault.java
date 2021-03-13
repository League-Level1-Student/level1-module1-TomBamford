package _05_vault;

import javax.swing.JOptionPane;

public class vault {
	
	public boolean cracked = false;
	int secretCode;
	public vault(int secretCode) {
		this.secretCode = secretCode;
	}
	public static void main(String[] args) {
				vault v = new vault(321651);
				v.tryCode(1);
	}
	public boolean tryCode(int secretCode2) {
			if (secretCode == secretCode2) {
				return true;
			}
			else {
				return false;
			}
	}			
}
	
	

	
	

