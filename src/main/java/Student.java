import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
public class Student {
    public List<Integer> notat=new ArrayList<>();

    public void shto (Integer nota) {
        notat.add(nota);
    }

}
