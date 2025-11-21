package problems.oops.encapsulation_inheritance;

public class School2 {
    public static void main(String[] args) {
        Address teacher1Add =
                new Address("Hanuman Nagar", "Bangarga", "Kar", "s85314");
        Address teacher2Add = new Address("Mathagalli", "Aland", "Karnataka", "560056");

        Teacher teacher1 = new Teacher("EMP1",  122000, teacher1Add);
        Teacher teacher2 = new Teacher("EMP2",  122000,
                new Address("Vija", "Kalaburgi", "Andhra", "5464"));
        System.out.println(teacher1);
        System.out.println(teacher2);
    }
}
