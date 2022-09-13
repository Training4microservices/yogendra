package com.training.springboot.springbootdemo.exception;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull
    @Size(min=4, message="Name should have atleast 4 characters")
    @Column(name = "name")
    private String name;
    @NotNull
    @Size(min=7, message="Passport should have atleast 7 characters")
    @Column(name = "passport")
    private String passport;

    public Student() {
        super();
    }

    public Student(Integer id, String name, String passport) {
        super();
        this.id = id;
        this.name = name;
        this.passport = passport;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassport() {
        return passport;
    }
    public void setPassport(String passport) {
        this.passport = passport;
    }

}
