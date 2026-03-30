package racingcar;
import  java.util.Scanner;
import  java.util.Random;
public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
            Random r = new Random();
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            String[][] car = new String[n][2];

            int set = sc.nextInt();

            for(int i = 0; i < n; i++) {
                car[i][0] = sc.next();
                car[i][1] = "";
            }

            for(int i = 0; i < set; i++) {
                for(int j = 0; j < n; j++) {
                    int num = r.nextInt(10);
                    if(num >= 4) {
                        car[j][1] += "-";
                    }
                }
            }

            for(int i = 0; i < n; i++) {
                System.out.println(car[i][0] + ":" + car[i][1]);
            }

            int max = 0;

            for(int i = 0; i < n; i++) {
                int distance = car[i][1].length();
                if(distance > max) {
                    max = distance;
                }
            }

            System.out.print("우승자: ");
            for(int i = 0; i < n; i++) {
                if(car[i][1].length() == max) {
                    System.out.print(car[i][0] + " ");
                }
            }
        }
    }
