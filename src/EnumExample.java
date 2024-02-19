enum Color {
	RED, GREEN, BLUE;
}

public class EnumExample {

	public static void main(String[] args) {
		for (Color clr : Color.values()) {
			System.out.println(clr);
		}
	}
}
