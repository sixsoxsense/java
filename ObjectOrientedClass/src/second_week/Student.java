package second_week;

public class Student {
    private String stu_name;
    private int stu_id;
    private Subject subject;
    private boolean retake = false;

    Student() {

    }

    Student(String stu_name, int stu_id, Subject subject) {
        this.stu_name = stu_name;
        this.stu_id = stu_id;
        this.subject = subject;
    }

    Student(String stu_name, int stu_id, Subject subject, boolean retake) {
        this.stu_name = stu_name;
        this.stu_id = stu_id;
        this.subject = subject;
        this.retake = retake;
    }

    public static void main(String[] args) {
        Subject rorcp = new Subject("객체지향", 100);
        Student dudwn = new Student("영주", 201658011, rorcp);
        dudwn.setRetake(true);
        dudwn.subject.setGrades(CommonMethod.getGrades(rorcp, dudwn.isRetake()));
        System.out.println(dudwn.stu_id + dudwn.stu_name + CommonMethod.getGrades(dudwn.subject, dudwn.retake));
    }

    public int getStu_id() {
        return stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public Subject getSubject() {
        return subject;
    }

    public boolean isRetake() {
        return retake;
    }

    public void setRetake(boolean retake) {
        this.retake = retake;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}

class Subject {
    private String sub_name, grades;
    private int score;

    Subject(String sub_name, int score) {
        this.sub_name = sub_name;
        this.score = score;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public int getScore() {
        return score;
    }

    public String getGrades() {
        return grades;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }
}

class CommonMethod {
    static String getGrades(Subject subject,boolean retake) {
        if (80 <= subject.getScore() && subject.getScore() <= 100) {
            if (retake) {
                return "A";
            } else {
                return "A+";
            }

        } else if (60 <= subject.getScore() && subject.getScore() <= 80) {
            return "A";
        } else {
            return "B+";
        }
    }
}