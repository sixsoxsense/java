package exception;

public class Class_Exception {
    public static void main(String[] args) throws Exception{
            makePerson();
    }
    //루트에서 throws  해버리면 앱 죽어버림
    //루트메소드라면 try 식으로 처리
    static void makePerson() throws Exception {
        PersonE p = new PersonE();
        p.setGrade(7);
    }
}

class PersonE {
    int age;
    int grade;

    void setGrade(int grade) throws Exception {
        if (grade < 1 || grade > 6) {
            Exception ex = new Exception();
            throw ex;
        }
        this.grade = grade;
    }
}