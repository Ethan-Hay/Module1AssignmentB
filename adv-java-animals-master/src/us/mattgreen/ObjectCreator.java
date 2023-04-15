package us.mattgreen;
import java.util.Scanner;

public class ObjectCreator {
    Scanner in = new Scanner(System.in);
    public Cat makeCat(){
        System.out.println("What is the cat's name?");
        String name = in.nextLine();
        System.out.println("How many mice has the cat caught?");
        int miceCaught = Integer.parseInt(in.nextLine());
        Cat cat = new Cat(miceCaught,name);
        return cat;
    }
    public Dog makeDog(){
        boolean friendly = true;
        System.out.println("What is the dog's name?");
        String name = in.nextLine();
        System.out.println("Is the dog friendly? Yes or no.");
        String yesOrNo = in.nextLine().toLowerCase();
        if (yesOrNo.equals("yes")){
            friendly = true;
        }
        else if (yesOrNo.equals("no")){
            friendly = false;
        }
        Dog dog = new Dog(friendly,name);
        return dog;
    }
    public Teacher makeTeacher(){
        System.out.println("What is the teacher's name?");
        String name = in.nextLine();
        System.out.println("How old is the teacher?");
        int age = Integer.parseInt(in.nextLine());
        Teacher teacher = new Teacher(age,name);
        return teacher;
    }
}
