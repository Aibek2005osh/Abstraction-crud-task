package task;

import java.time.LocalDate;

public class Customer {
    private Long id;
    private String fristName;
    private String email;
    private LocalDate dateOfbirth;
    private String phonNumer;

    public Customer() {

    }

    public Customer(Long id, String fristName, String email, LocalDate dateOfbirth, String phonNumer) {
        this.id = id;
        this.fristName = fristName;
        this.email = email;
        this.dateOfbirth = dateOfbirth;
        this.phonNumer = phonNumer;
    }

    public Long getId() {
        return id;

    }

    public void setId(Long id) {
        this.id = id;

    }

    public String getFristName() {
        return fristName;

    }

    public void setFristName(String fristName) {
        this.fristName = fristName;

    }

    public String getEmail() {
        return email;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfbirth() {
        return dateOfbirth;

    }

    public void setDateOfbirth(LocalDate dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public String getPhonNumber() {
        return phonNumer;

    }

    public void setPhonNumber(String phonNumer) {
        this.phonNumer = phonNumer;
    }


    @Override
    public String toString() {
        return "Customer{" +
               "dateOfbirth=" + dateOfbirth +
               ", id=" + id +
               ", fristName='" + fristName + '\'' +
               ", email='" + email + '\'' +
               ", phonNumer='" + phonNumer + '\'' +
               '}';
    }

}


