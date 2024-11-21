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


//
//public void addStudent(Student student) {
//    this.students[studentCount++] = student;
//    System.out.println("success !");
//}
//
//public void getAllStudent() {
//    for (int i = 0; i < studentCount; i++) {
//        System.out.printf("""
//                         Long id : %s
//                         String lastName: %s
//                         String firstName: %s
//                         LocalDate age: %s
//                         String gender: %s
//                         phoneNumber : %s
//                        """,students[i].getId(),students[i].getLastName(),students[i].getFirstName(),
//                students[i].getAge(),students[i].getGender(),students[i].getPhoneNumber());
//    }
//}
//
//public void getStudentById(Long studentId) {
//    boolean islaik = false;
//    for (int i = 0; i < studentCount; i++) {
//        if (students[i].getId().equals(studentId)) {
//            islaik = true;
//            System.out.printf("""
//                         Long id : %s
//                         String lastName: %s
//                         String firstName: %s
//                         LocalDate age: %s
//                         String gender: %s
//                         phoneNumber : %s
//                        """,students[i].getId(),students[i].getLastName(),students[i].getFirstName(),
//                    students[i].getAge(),students[i].getGender(),students[i].getPhoneNumber());
//        }
//    }
//
//    if (!islaik){
//        System.out.println("Student with id "+ studentId + " not found !");
//    }
//}
//
//public void deleteStudent(Long studentId) {
//    boolean islaik = false;
//
//    for (int i = 0; i < studentCount; i++) {
//        if(students[i].getId().equals(studentId)){
//            islaik = true;
//            for (int v = i; v < studentCount; v++ ) {
//                students[v] = students[v + 1];
//            }
//            studentCount -- ;
//            System.out.println("deleted !!  ");
//        }
//    }
//
//    if (!islaik){
//        System.out.println( " student with  id  "+ studentId + " not found !");
//    }
//}
//
//public void updateStudent(Long studentId, Student newStudent) {
//    boolean islaik = false;
//
//    for (int i = 0; i < studentCount; i++) {
//        if (students[i].getId().equals(studentId)){
//            islaik = true;
//            students[i] = newStudent;
//        }
//    }
//    if (!islaik){
//        System.out.println("Student with id "+ studentId + " not found !");
//    }
//
//
//}


