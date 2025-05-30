package curriculumB;

import java.util.Random;
import java.util.Scanner;

public class Qest6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random(); //ランダムクラスのインスタンスを設定
		while (true) { //入力を繰り返す
			String itemName = scanner.nextLine(); //商品名を入力
			String[] items = itemName.split("[、]"); //「、」を分割
			for (String name : items) {
				name = name.trim(); // 前後の空白を除去
				if (!name.isEmpty()) { //最後の「、」で空の文字列ができても無視できるように
					int randomValue = random.nextInt(12);//残り台数は0〜11までのランダムな値
					switch (name) { //入力値ごとの条件
					case "パソコン":
						System.out.println(name + "の残り台数は" + randomValue + "台です\n");
						break;
					case "冷蔵庫":
						System.out.println(name + "の残り台数は" + randomValue + "台です\n");
						break;
					case "扇風機":
						System.out.println(name + "の残り台数は" + randomValue + "台です\n");
						break;
					case "洗濯機":
						System.out.println(name + "の残り台数は" + randomValue + "台です\n");
						break;
					case "加湿器":
						System.out.println(name + "の残り台数は" + randomValue + "台です\n");
						break;
					case "テレビ":
					case "ディスプレイ":
						int i = 11 - randomValue; //最大個数の11個からランダムで出た数字を引いて出力
						String result = (name.equals("テレビ")) ? "テレビ" : "ディスプレイ"; //条件演算子
						System.out.println(result + "の残り台数は" + i + "台です\n");
						break;
					default: //そのほかの値が入力
						System.out.println("『受け取った値』は指定の商品ではありません");
						break;
					}
				}
			}
		}
	}
}
