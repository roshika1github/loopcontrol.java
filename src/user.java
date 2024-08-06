import java.util.Scanner;
public class user{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Enter the command(start,hint,stop,quit): ");
                String command = sc.nextLine();
                if (command.equals("start")) {
                    System.out.println("The race has started!");
                }else if (command.equals("hint")) {
                    System.out.println("command type to start,stop to stop the car,and quit to quit"+"the game");
                }else if (command.equals("stop")) {
                    System.out.println("The race has stopped!");
                } else if (command.equals("quit")) {
                    System.out.println("The race has quited!");
                    break;
                } else{
                    System.out.println("Invalid command");
                }
            }
        }
    }
