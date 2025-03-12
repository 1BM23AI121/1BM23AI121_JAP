import java.util.Scanner;

public class CHESSBOARD {
    public static void main(String[] args) {
        int size = 8;


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("W ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }
    }
}
/*"C:\Program Files\Java\jdk-22\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.4\lib\idea_rt.jar=58385" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Admin\IdeaProjects\1BM23AI121\out\production\1BM23AI121 CHESSBOARD
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W
W B W B W B W B
B W B W B W B W

Process finished with exit code 0*/


