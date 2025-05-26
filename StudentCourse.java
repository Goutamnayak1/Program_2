package gautam.program2;
import java.util.HashMap;

public class StudentCourse {
    HashMap<String, Integer> courses = new HashMap<>();

    public void addCourse(String name, int marks) {
        courses.put(name, marks);
    }

    public void displayCourses() {
        for (String course : courses.keySet()) {
            System.out.println(course + ": " + courses.get(course));
        }
    }

    public static void main(String[] args) {
        StudentCourse sc = new StudentCourse();
        sc.addCourse("Math", 95);
        sc.addCourse("Science", 90);
        sc.displayCourses();
    }
}


git init  
git status  
git config --global user.name "Goutamnayak1"
git config --global user.email "gautamnayak4088607@gmail.com"
git add index.html
git commit -m “Saved"
git remote add origin https://github.com/Goutamnayak1/program_1.git  
git push -u origin main    