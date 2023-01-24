package RepresentandoOMundo;

import java.util.List;

public class RespondeAi {

    User user = new User("João", "joao@gmail.com");
    List<Courses> course = List.of(
        new Courses("Java", "João"),
        new Courses("C#", "João"),
        new Courses("Python", "João")
    );

    public RespondeAi (User user, List<Courses> course) {
        this.user = user;
        this.course = course;
    };
}
