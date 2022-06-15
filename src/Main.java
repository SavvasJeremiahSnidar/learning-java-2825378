import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type a random word and pres Enter to start developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("Its' developer tea time!");
    }
    public static void main(String[] args) {
        announceDeveloperTeaTime();
    }

}
