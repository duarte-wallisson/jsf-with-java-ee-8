import lombok.Data;

import javax.inject.Named;
import java.io.Serializable;

@Named
@Data
public class StudentRegisterBean implements Serializable {

    private static final long serialVersionUID = -8802273915842976081L;

    private String name = "Wallisson";
    private String lastName = "Duarte";
    private Double grade1 = 10D;
    private Double grade2 = 8.5D;
    private Double grade3 = 9D;


}
