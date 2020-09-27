import java.util.Scanner;
public class Basement {
    public static boolean end = false;
    Scanner scan = new Scanner(System.in);
    public void firstroom() {
        boolean key1 = false;
        boolean unlockdoor1 = false;
        System.out.println("You wake up in a dimly lit room.");
        System.out.println("Surrounding you are walls made of concrete.");
        System.out.println("You notice a door on the opposite side of the room.");
        while (end == false) {
            switch (scan.nextLine().toLowerCase()) {
                case "look around":
                    System.out.println("The room appears to be empty except for some trash on the ground.");
                    if (key1 == false) {
                        System.out.println("Rustling through the trash, you find a key!");
                        key1 = true;
                    }
                    System.out.println("There is a door on the opposite side of the room");
                    break;
                case "open door":
                case "look at door":
                case "walk to door":
                case "use door":
                case "inspect door":
                case "door":
                case "walk through door":
                case "enter door":
                case "enter doorway":
                case "walk through doorway":
                    if (unlockdoor1 == true) {
                        System.out.println("You walk through the door. On the other side, there is a medium size room. There is a door near the opposite wall to the right. There is a desk and a few shelves in the room.");
                        secondroom();
                    } else if (key1 == true) {
                        System.out.println(
                                "You unlock the door.");
                        unlockdoor1 = true;
                    } else {
                        System.out.println(
                                "The door seems to be made of a sturdy metal. It is locked, and you have no tool to force it open.");
                    }
                    break;
                default:
                    System.out.println("That is not an available action");
                    break;
            }
        }
        scan.close();
        return;
    }
    public void secondroom() {
        boolean key2 = false;
        boolean unlockdoor2 = false;
        boolean findkey2 = false;
        while (end == false) {
            switch(scan.nextLine().toLowerCase()) {
                case "look around":
                System.out.println("There are some empty shelves to your right.\nOn the opposite side of the room you notice a desk with a few papers on it.\nTo your left is an empty wall.");
                break;
                case "shelves":
                case "inspect shelves":
                case "look at shelves":
                case "use shelves":
                case "look shelves":
                if (findkey2 == true && key2 == false) {
                    System.out.println("Looking closer, you notice a key taped to the bottom of the lowest shelf.");
                    key2 = true;
                } else {
                System.out.println("The shelves are empty, with a fine layer of dust. You wonder why there are even shelves here if they are used for nothing.");
                }
                break;
                case "inspect desk":
                case "look at desk":
                case "look at papers":
                case "use desk":
                case "desk":
                System.out.println("There is a plain, metal desk. The papers lying on it are covered in symbols, but you don't understand them.");
                break;
                case "open door":
                case "look at door":
                case "walk to door":
                case "use door":
                case "inspect door":
                case "door":
                case "walk through door":
                case "enter door":
                case "enter doorway":
                case "look door":
                case "walk through doorway":
                if (unlockdoor2 == true) {
                    System.out.println("You open the door, but see nothing. As you stare into the void, it stares back into you. This isn't your first experience, this won't be your last.\nSoon you will hide the keys again, and soon you will lock yourself once more in the room, trying to forget the void you find yourself trapped in.\nAre you ready to start again?");
                        scan.nextLine();
                        System.out.println("As if you had a choice in the matter.");
                    end = true;
                } else if (key2 == true){
                    System.out.println("You unlock the door with a loud thunk. It seems like it is slightly rusted, and hasn't been used in a long time.");
                    unlockdoor2 = true;
                } else {
                System.out.println("Another hard metal door. Needless to say, you can't force it open either. They key might be around here if you look closer.");
                findkey2 = true;
                }
                break;
                default:
                System.out.println("That is not an available action.");
                break;
            }
        }
    }
}