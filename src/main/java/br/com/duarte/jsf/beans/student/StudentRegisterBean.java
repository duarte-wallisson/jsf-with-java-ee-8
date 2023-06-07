package br.com.duarte.jsf.beans.student;

import br.com.duarte.jsf.models.Student;
import lombok.Data;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

@Named
@Data
public class StudentRegisterBean implements Serializable {
    @Inject
    private Student student;

    private String[] greetingsArray = {"Hello", ", ", "World", "!"};
    private List<String> greetingsList = asList("Hi", " There", "!");
    private Set<String> greetingsSet = new HashSet<>(asList("Bye", ", ", "Bye!"));
    private Map<String, String> greetingsMap = new HashMap<>();

    {
        greetingsMap.put("greeting", "Hi!");
        greetingsMap.put("welcome", "Welcome!");
        greetingsMap.put("farewell", "Goodbye!");
    }

    public String separator(String name) {
        return "------------- " + name + " -------------";
    }

    public String goToIndex2(){
        System.out.println("Go to index2");
        return "index2";
    }
}
