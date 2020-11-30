package network;

import java.util.Scanner;
import java.util.StringTokenizer;

public class main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("입력");
            String input = sc.nextLine();

            String[] splitted = input.split(" ");
            for (String s : splitted) {
                System.out.println(s);
            }

            StringTokenizer st = new StringTokenizer(input, " ");
            int a = Integer.parseInt(st.nextToken());
            String operator = st.nextToken();
            int b = Integer.parseInt(st.nextToken());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
