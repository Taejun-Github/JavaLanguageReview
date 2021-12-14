package Generic;


public class WildCardExample {
    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + course.getStudents());
    }

    public static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getStudents() + course.getName());
    }

    public static void registerCourseWorker(Course<? super Worker> course) {
        System.out.println(course.getName() + course.getStudents().toString());
    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<Person>("일반인과정", 5);
        personCourse.add(new Person());
        personCourse.add(new Worker());
        personCourse.add(new Student());

        Course<Student> studentCourse = new Course<>("학생과정", 10);
        studentCourse.add(new Student());
//        studentCourse.add(new Worker());

        Course<Worker> workerCourse = new Course<>("직장인과정", 10);
        workerCourse.add(new Worker());
    }
}
