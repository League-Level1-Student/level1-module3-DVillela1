package backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		new Backpack().packAndCheck();
		Pencil x = new Pencil();
		Ruler y = new Ruler();
		
		new Backpack().putInBackpack(x);
		new Backpack().putInBackpack(y);
		new Backpack().putinBackpack(z);
	}
}
