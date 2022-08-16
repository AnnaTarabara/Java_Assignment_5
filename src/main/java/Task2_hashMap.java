import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2_hashMap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int spamIndicator = 2;
        String [] stringArr = new String[N];
        for(int i = 0; i < N; i++){
            stringArr[i] = scanner.next();
        }

        Map<String, Integer> counterMap = new HashMap<>();
        for (String team : stringArr) {
                Integer count = counterMap.get(team);
                if(count == null) {
                    count = 0;
                }
                if(count < spamIndicator){
                counterMap.put(team, ++count);}
         }

        for(String team: counterMap.keySet()) {
            if(counterMap.get(team) == spamIndicator){
                System.out.println(team);
            }
        }}}
