package string;

import java.io.IOException;

// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

public class Test_1 {

	public static void main(String[] args) throws IOException {
		
		int ascii = System.in.read();
		System.out.println(ascii);
	}

}
