package bank;


public class Account {
	String accountNumber = "";
	int balance = 0;

	public String toString() {
		return "¥¥" + this.balance + "口座番号：" + this.accountNumber + ")";
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Account) {
			Account a = (Account) obj;
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if (an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}
}
