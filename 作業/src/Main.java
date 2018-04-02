public class Main {
    public static void main(String[] args) {
        E1 stud1 = new E1();
        E1 stud2 = new E1("00") ;
        stud1.showAll();
        stud1.setName("");
        stud1.setPow("");
        stud1.showAll();
        System.out.println("*.*.*.*.*.*.*.*.*.*");
        stud2.showAll();
        stud2.setPow("");
        stud2.setPow("");
        System.out.println(stud2.setName()+"major is"+stud2.get);
    }
}
