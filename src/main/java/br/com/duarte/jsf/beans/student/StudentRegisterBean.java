package br.com.duarte.jsf.beans.student;

import br.com.duarte.jsf.models.Student;
import lombok.Data;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@Data
public class StudentRegisterBean implements Serializable {
    @Inject
    private Student student;
}
