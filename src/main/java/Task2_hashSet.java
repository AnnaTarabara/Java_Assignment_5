import java.util.HashSet;
import java.util.Scanner;

public class Task2_hashSet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashSet<String> set = new HashSet<>();
        String [] stringArr = new String[N];
        int count;
        int spamIndicator = 2;
        for(int i = 0; i < N; i++){
            stringArr[i] = scanner.next();
            set.add(stringArr[i]);
        }

        for (String item: set) {
            count = 0;
            for(String team: stringArr)
            {
                if(team.equals(item))
                {
                    if(count < spamIndicator) count++;
                    else break;
                }
            }
            if (count == spamIndicator) System.out.println(item);
        }
    }
}

