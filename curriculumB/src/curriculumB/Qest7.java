package curriculumB;

import java.util.Scanner;

public class Qest7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.print("生徒の人数を入力してください（2以上）:");
		int studentCount = scanner.nextInt(); //生徒の人数を入力
		String[] subjects = {"英語","数学","理科","社会"}; //教科リスト
		int subjectCount = subjects.length;
		
		int[][] scores = new int[studentCount][subjectCount]; //人数・得点を保存
		for (int i = 0; i < studentCount; i++) {
			System.out.println();
			for (int j =0 ; j < subjectCount; j++) {
				System.out.print((i+1)+"人目の『"+subjects[j]+"』の点数を入力してください:");
				scores[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < studentCount; i++) {
			int total = 0;
			System.out.println();
			for (int j =0 ; j < subjectCount; j++) {
			 total += scores[i][j];
			}
			double average = (double) total/ subjectCount;
			System.out.printf((i+1)+"人目の平均点は%.2fです。\n",average);
		}
	}
}
//N人の生徒の成績を入力できるようにしてください									
//各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください									
//このプログラムの実行は必ず1回以上行われるようにしてください
//生徒の人数を入力してください（2以上）: 
//1人目の『英語』の点数を入力してください :			
//1人目の『数学』の点数を入力してください :			
//1人目の『理科』の点数を入力してください :			
//1人目の『社会』の点数を入力してください :		

//1人目の平均点は10.00点です。

//英語の平均点は10.00点です。		
//数学の平均点は10.00点です。		
//理科の平均点は10.00点です。		
//社会の平均点は10.00点です。		
//全体の平均点は10.00点です。		