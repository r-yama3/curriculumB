package curriculumB;

public class Qest5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int i = 1; i <= 9; i++) { //掛けられる数
			for (int j = 1; j <= 20; j++) { //掛ける数
				int product = i * j; //掛け算
				System.out.printf("| %03d * %03d = %03d |", j, i, product);
				if (j == 0) {
					System.out.print(" || "); //左右の区切り
				}
			}
			System.out.println();
		}
	}
}