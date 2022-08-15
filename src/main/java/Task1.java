import java.util.HashSet;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num;
        String request;
        HashSet<Integer> set = new HashSet<>();

        while (N != 0) {
            request = scanner.next();
            switch (request.toLowerCase()) {
                case "add":
                    num = scanner.nextInt();
                    set.add(num);
                    break;
                case "present":
                    num = scanner.nextInt();
                    if (set.contains(num)) System.out.println("YES");
                    else System.out.println("NO");
                    break;
                case "count":
                    System.out.println(set.size());
                    break;
            }
            N--;
        }

    }
}

//https://informatics.msk.ru/mod/statements/view.php?chapterid=3453#1