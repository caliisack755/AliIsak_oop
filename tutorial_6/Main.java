import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("===== ADD TASKS =====");

        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter Task " + i + ": ");
            String task = input.nextLine();

            tasks.add(task);
        }

        System.out.println("\n===== TASK LIST =====");

        for (int i = 0; i < tasks.size(); i++) {

            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("task.txt"))) {

            for (String task : tasks) {

                writer.write(task);
                writer.newLine();
            }

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }

        System.out.println("\n===== TASKS LIST =====");

        try (BufferedReader reader = new BufferedReader(new FileReader("task.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {

                System.out.println(line);
            }

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }

        input.close();
    }
}