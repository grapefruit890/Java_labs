package lava;

public class SortingStudentsByGPA {
    static Student iDNumber[] = new Student[5];

    public static void setArray(Student object) {
        for (int i = 0; i < iDNumber.length; i++) {
            if (iDNumber[i] == null) {
                iDNumber[i] = object;
            }
        }
    }

    public static void outArray() {
        for (int i = 0; i < iDNumber.length; i++) {
            System.out.printf("name: %s\nsurname: %s\ncourse: %d\n", iDNumber[i].getName(), iDNumber[i].getSurname(), iDNumber[i].getCourse());
        }
    }
}
