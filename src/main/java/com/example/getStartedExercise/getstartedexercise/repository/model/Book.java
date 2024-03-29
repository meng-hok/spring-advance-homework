package com.example.getStartedExercise.getstartedexercise.repository.model;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.FetchType;
import javax.persistence.FieldResult;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.Data;

/**
 * Article
 */

@Data
@Table(name ="tb_books")
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotEmpty
    private String title;
    
    @NotEmpty
    private String author = "UNKNOWN";
    private String description =" EMPTY";
    private String thumbnail ="hehe.png" ;
    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;
    private Integer status =1 ;
    public Book(){

    }
    public Book(int id) {
        this.id = id ;
        this.title = "Harry Potter";
    }

    public Book (int id ,String title){
        this.id = id;   
        this.title =title;
    }
    public Book(String title){
        this.title =title;
    }
}