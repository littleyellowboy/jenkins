import lombok.Builder;
import lombok.Data;

/**
 * Created by littleyellowboy on 25/09/2017.
 */
@Data
@Builder
public class MyClass {

    private String name;

    public static void main(String[] args) {
        System.out.println("Running main app...");
        MyClass instance1 = MyClass.builder().name("name 1").build();
        System.out.println(instance1.getName());
    }
}
