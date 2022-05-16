//6
package Pokemons;

import java.util.Scanner;

public class MenuViewer {
	static Scanner sc = new Scanner(System.in);
	
	static void showMenu() {
		System.out.println("포켓몬 월드로!");
		System.out.println("1. 포켓몬 잡기");
		System.out.println("2. 잡은 포켓몬 보기");
		System.out.println("3. 포켓몬 내보내기[by.오박사]");
		System.out.println("4. 뮤츠방 입장");
		System.out.println("5. 게임 종료");
		System.out.print("선택: ==> ");
	}
}
