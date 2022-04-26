package day28_20220426;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Board board1 = new Board();
		board1.boardId = 12345;
		board1.boardPw = 1234;
		board1.boardTitle = "제목1";
		board1.boardName = "작성자1";
		board1.boardContents = "첫번째 내용입니다.";
		board1.boardHit = 0;

		Board board2 = new Board(2222, 5678, "제목2", "작성자2", "두번째 내용입니다.", 0);
		Board board3 = new Board();
		board3.save(4567835, 9012, "제목3", "작성자3", "세번째 내용입니다", 0);

		board1.findById();
//		board2.findById();
//		board3.findById();

		
		board1.update();
		board1.findById();

	}
}
// 1.글등록 2.글등록(기본생성자) 3.글조회 4.글수정 5.종료