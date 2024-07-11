package ejercicios.clase5;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Category {

    private int id;
    private String name;
    private List<Course> courses;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

}
