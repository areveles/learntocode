public class StudentMain {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            LPAStudent s = new LPAStudent("S29300" + i, switch (i) {
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
            }, "05/15/1993", "Java MasterClass");

            System.out.println("Student List: " + s);

        }

        Student pojoStudent = new Student("S293006", "Ann", "05/15/1993", "Java MasterClass");
        LPAStudent recordStudent = new LPAStudent("S293007", "Bill", "05/15/1993", "Java MasterClass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 289");
        // recordStudent = recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 289");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
