package domi.org.variable;

public class String_var {
    String var;
    //String형 변수 var 선언
    public void var() {
        var = "Hello World!";
        //변수 var의 값을 "Hello World!"로 지정
    }

    public void var2() {
        String var2 = "Hello World!";
        //String형 변수 var2 선언과 동시에 "Hello World!"로 지정
    }

    public void varpvar() {
        String var1 = "Hello";
        String var2 = "World!";
        String var3 = var1 + " " + var2;
        //String형 변수 var1, var2 선언과 동시에 "Hello", "World!"로 지정
        //String형 변수 var3 선언과 동시에 var1, var2의 값을 더한 값으로 지정
        System.out.println(var3);
    }

}
