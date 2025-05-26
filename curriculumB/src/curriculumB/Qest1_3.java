package curriculumB;

import java.util.Random;
import java.util.Scanner;

public class Qest1_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			//正常値が入力されるまで繰り返す
			String name = scanner.nextLine();
			//コンソールに名前を入力できるようにする

			if (name == null || name.isEmpty()) {
				System.out.println("名前を入力してください");
				//入力した文字列がnullか0文字の場合
			} else if (name.length() > 10) {
				System.out.println("名前を10文字以内にしてください");
				//10文字より大きい場合
			} else if (!isHalfWidthCharacters(name)) {
				System.out.println("「半角英数字のみで名前を入力してください」");
				//半角英数字以外の場合	
			} else {
				System.out.println("ユーザー名「" + name + "」を登録しました");
				//ユーザー名「name」を登録しました
				break; //ユーザー名が正常の場合じゃんけんのシステムが起動する
			}
		}

		Random random = new Random(); //ランダムクラスのインスタンスを設定する
		//じゃんけんの回数の初期値=0
		int jyankenCount = 0; //じゃんけんの回数のカウントの初期値
		String[] jyanken = { "グー", "チョキ", "パー" }; //「0はグー、1：チョキ、2：パー」とすること
		while (true) { //勝つまで繰り返す
			int jyankenName = scanner.nextInt(); //じゃんけん値を入力
			int randomValue = random.nextInt(3); //ランダムの数値を設定
			jyankenCount++; //じゃんけんの回数をカウント
			System.out.println("相手の手は「" + jyanken[randomValue] + "]"); //相手の手は「〇〇」
			System.out.println("nameの手は「" + jyanken[jyankenName] + "」"); //nameの手は「パー」
			if (jyankenName == randomValue) { //あいこの場合
				System.out.println("DRAW あいこ もう一回しましょう！");
			} else if ((jyankenName == 0 && randomValue == 1) || //自分がグー・相手がチョキ
					(jyankenName == 1 && randomValue == 2) || //自分がチョキ・相手がパー
					(jyankenName == 2 && randomValue == 0)) { //自分がパー・相手がグー
				System.out.println("やるやん。\n次は俺にリベンジさせて");
				break;
				//自分がじゃんけんに勝った場合
			} else if (jyankenName == 0) {
				System.out.println("俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ！");
				//自分がじゃんけんでグーに負けた場合
			} else if (jyankenName == 1) {
				System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
				//自分がじゃんけんでチョキに負けた場合
			} else if (jyankenName == 2) {
				System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです");
				//自分がじゃんけんでパーに負けた場合
			}
		}
		System.out.println("勝つまでにかかった合計回数は" + jyankenCount + "回です");
		//じゃんけんを行った回数を表示						
		scanner.close(); //入力を閉じる
	}

	public static boolean isHalfWidthCharacters(String name) {
		//半角英数字を判定する
		return name.matches("^[a-zA-Z0-9]+$");
	}
}


