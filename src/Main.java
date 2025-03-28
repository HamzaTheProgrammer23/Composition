import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Teacher java = new Teacher("Farhad","Ahmed",120000);
        ArrayList<String> javaStudents = new ArrayList<>();
        javaStudents.add("Hamza");
        javaStudents.add("Asad");
        javaStudents.add("Ismail");

        Teacher science = new Teacher("Bill","Nye",250000);
        ArrayList<String> scienceStudents = new ArrayList<>();
        scienceStudents.add("Amin");
        scienceStudents.add("Ayub");
        scienceStudents.add("Amina");

        Classroom class1 = new Classroom("Java",java,javaStudents);

        Classroom class2 = new Classroom("Science",science,scienceStudents);

        System.out.println(class1.toString());
        System.out.println(javaStudents);
        System.out.println("-------------------");
        System.out.println(class2.toString());
        System.out.println(scienceStudents);











    }
}