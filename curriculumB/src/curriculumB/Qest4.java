package curriculumB;

public class Qest4 {
	public static void main(String[] args) {
		int product = 1;
		for (int i = 1; i <= 9; i++) { //掛ける数
			for (int j = 1; j <= 9; j++) { //掛けられる数
				product = i * j; //掛け算
				String formatted = String.format("| %02d * %02d = %02d |", i, j, product);
				System.out.print(formatted);
			}
			System.out.println();
		}
	}
}
