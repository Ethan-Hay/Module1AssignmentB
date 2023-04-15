package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");

    public static void main(String[] args) {
        ArrayList<Talkable> zoo = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        ObjectCreator objectCreator = new ObjectCreator();
        // Lines to Replace Begin Here
        System.out.println("What would you like to create?(Cat,Dog,Teacher)");
        String result = in.nextLine().toLowerCase();
        if (result.equals("cat")){
            zoo.add(objectCreator.makeCat());
        }
        else if(result.equals("dog")){
            zoo.add(objectCreator.makeDog());
        }
        else if (result.equals("teacher")){
            zoo.add(objectCreator.makeTeacher());
        }
        else {
            System.out.println("Your choice is invalid. Please try again.");
        }

        // End Lines to Replace

        for (Talkable thing : zoo) {
            printOut(thing);
        }
        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();

        FileInput indata = new FileInput("animals.txt");
        String line;
        while ((line = indata.fileReadLine()) != null) {
            System.out.println(line);
        }
    }

    public static void printOut(Talkable p) {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + " | " + p.talk());
    }
}
