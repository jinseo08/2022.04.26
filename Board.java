package day28_20220426;

import java.util.Scanner;

public class Board {

	// 필드값 : 글번호, 글비밀번호, 제목, 작성자, 내용, 조회수
	int boardId = 0;
	int boardPw = 0;
	String boardTitle = "";
	String boardName = "";
	String boardContents = "";
	int boardHit = 0;

	// 기본생성자
	Board() {
	}

	// 필드값 매개변수로
	Board(int boardId, int boardPw, String boardTitle, String boardName, String boardContents, int boardHit) {
		this.boardId = boardId;
		this.boardPw = boardPw;
		this.boardTitle = boardTitle;
		this.boardName = boardName;
		this.boardContents = boardContents;
		this.boardHit = boardHit;
	}

	// 글 작성
	void save(int boardId, int boardPw, String boardTitle, String boardName, String boardContents, int boardHit) {
		this.boardId = boardId;
		this.boardPw = boardPw;
		this.boardTitle = boardTitle;
		this.boardName = boardName;
		this.boardContents = boardContents;
		this.boardHit = boardHit;
	}

	// 조회수 1 올리고 정보출력
	void findById() {
		this.boardHit += 1;
		System.out.println(this.boardId);
		System.out.println(this.boardPw);
		System.out.println(this.boardTitle);
		System.out.println(this.boardName);
		System.out.println(this.boardContents);
		System.out.println(this.boardHit);
		System.out.println("");
	}

//	글수정(update)
//    수정하고자 하는 글번호와 비밀번호를 입력 받아서 두 정보가 모두 일치해야 제목, 내용을 수정할 수 있음.
//    일치하지 않으면 수정 불가능.

	
	boolean update2(int boardId, int boardPw) {
		if (boardId == this.boardId && boardPw == this.boardPw) {
			Scanner scan = new Scanner(System.in);
			System.out.print("수정 할 제목 :");
			String boardTitle = scan.nextLine();
			System.out.print("수정 할 내용 :");
			String boardContents = scan.nextLine();
			this.boardTitle = boardTitle;
			this.boardContents = boardContents;
			return true;
		} else {
			return false;
		}
	}
	
	
	
	// 리턴 boolean 타입으로 안했을 때
	void update() {
			Scanner scan = new Scanner(System.in);
			System.out.print("글번호 : ");
			int boardId = scan.nextInt();
			System.out.print("비밀번호 : ");
			int boardPw = scan.nextInt();
			scan.nextLine();
			if (boardId == this.boardId && boardPw == this.boardPw) {
			System.out.print("수정 할 제목 :");
			String boardTitle = scan.nextLine();
			System.out.print("수정 할 내용 :");
			String boardContents = scan.nextLine();
			this.boardTitle = boardTitle;
			this.boardContents = boardContents;
		} else {
			System.out.println("수정 불가능 합니다");
		}

	}

}

