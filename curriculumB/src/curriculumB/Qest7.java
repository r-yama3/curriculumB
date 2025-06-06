package curriculumB;

import java.util.Scanner;

public class Qest7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.print("生徒の人数を入力してください（2以上）:");
		int studentCount = scanner.nextInt(); //生徒の人数を入力
		String[] subjects = { "英語", "数学", "理科", "社会" }; //教科リスト
		int subjectCount = subjects.length; //教科数

		int[][] scores = new int[studentCount][subjectCount]; //人数・得点を保存
		for (int i = 0; i < studentCount; i++) { //〇人目
			System.out.println(); //改行
			for (int j = 0; j < subjectCount; j++) { //『教科』
				System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください:");
				//〇人目の点数を入力
				scores[i][j] = scanner.nextInt(); //各教科の点数を入力
			}
		}
		scanner.close(); //入力を閉じる

		for (int i = 0; i < studentCount; i++) { //〇人目
			int total = 0;
			System.out.println(); //改行
			for (int j = 0; j < subjectCount; j++) { //『教科』
				total += scores[i][j]; //〇人目の点数合計
			}
			double average = (double) total / subjectCount; //〇人目の平均点
			System.out.printf((i + 1) + "人目の平均点は%.2fです。", average);
		}

		System.out.println(); //改行
		for (int j = 0; j < subjectCount; j++) { //『教科』
			int subjectTotal = 0;
			System.out.println(); //改行
			for (int i = 0; i < studentCount; i++) { //〇人目
				subjectTotal += scores[i][j]; //各教科の点数の合計
			}
			double average = (double) subjectTotal / studentCount; //各教科の平均点
			System.out.printf((subjects[j]) + "の平均点は%.2fです。", average);
		}

		System.out.println(); //改行
		int totalScore = 0;
		int count = 0;
		for (int i = 0; i < studentCount; i++) { //〇人目
			for (int j = 0; j < subjectCount; j++) { //『教科』
				totalScore += scores[i][j]; //全ての点数の合計
				count++; //要素数をカウント
			}
		}
		double average = (double) totalScore / count; //全体の平均点
		System.out.printf("全体の平均点は%.2fです。", average);
	}
}
		