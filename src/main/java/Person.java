import jdk.jfr.BooleanFlag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Person {

    private String emer;
    private int mosha;
}
