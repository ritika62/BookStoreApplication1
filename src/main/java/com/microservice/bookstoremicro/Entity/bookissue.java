package com.microservice.bookstoremicro.Entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="mybookissue")
public class bookissue {

    @Id
    @Column(name="bookid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookid;
    @Column(name="student_id")
    private String student_id;
    @Column(name="Date")
    private Date Date;
    @Column(name="Time")
    private Integer Time;

    public bookissue(){}

    public bookissue(String student_id, java.util.Date date, Integer time) {
        this.student_id = student_id;
        Date = date;
        Time = time;
    }

    public bookissue(Integer bookid, String student_id, java.util.Date date, Integer time) {
        this.bookid = bookid;
        this.student_id = student_id;
        Date = date;
        Time = time;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public Integer getTime() {
        return Time;
    }

    public void setTime(Integer time) {
        Time = time;
    }

    @Override
    public String toString() {
        return "bookissue{" +
                "bookid=" + bookid +
                ", student_id='" + student_id + '\'' +
                ", Date=" + Date +
                ", Time=" + Time +
                '}';
    }
}
