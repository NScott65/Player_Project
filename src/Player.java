import java.util.Scanner;
public class Player {
    Scanner scan = new Scanner(System.in);

    private int x;
    private int y;
    private int z;
    private int direction;
    private int hp;
    private String name;
    private int pCount = 1;

    public Player(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.hp = 20;
        this.name = ("P" + pCount);
    }

    public String toString(){
        String s = ("Name: " + name + "\nHP: " + hp + "\nX: " + x + " Y: " + y + " Z: " + z);
        return s;
    }
}
