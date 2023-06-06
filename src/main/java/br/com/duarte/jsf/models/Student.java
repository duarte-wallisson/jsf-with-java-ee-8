package br.com.duarte.jsf.models;

import br.com.duarte.jsf.models.enums.Shift;
import lombok.Data;

@Data
public class Student {

    private static final long serialVersionUID = -8802273915842976081L;

    private String name = "Wallisson";
    private String lastName = "Duarte";
    private Double grade1 = 10D;
    private Double grade2 = 8.5D;
    private Double grade3 = 9D;
    private Shift shift = Shift.AFTERNOON;
}
