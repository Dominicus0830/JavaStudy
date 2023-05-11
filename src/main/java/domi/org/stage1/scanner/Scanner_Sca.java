package domi.org.stage1.scanner;

import java.util.Scanner;

public class Scanner_Sca {

    public static void main(String args[]) {
        Scanner sca = new Scanner(System.in);
        //Scanner형 변수 sca 선언
        sca.close();
        //Scanner형 변수 sca 닫기

        int num = sca.nextInt();

        System.out.println(num);

    }
}
