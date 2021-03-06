package json.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class People {
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;

    @JsonProperty("age")
    private int age;

    private String[] position;
    @JsonProperty
    private List<String> skills;
    @JsonProperty
    private Map<String, BigDecimal> salary;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position=" + Arrays.toString(position) +
                ", skills=" + skills +
                ", salary=" + salary +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    @JsonProperty
    public String[] getPosition() {
        return this.position;
    }
    public void setPosition(String[] position) {
        this.position = position;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public void setSalary(Map<String, BigDecimal> salary) {
        this.salary = salary;
    }
}
