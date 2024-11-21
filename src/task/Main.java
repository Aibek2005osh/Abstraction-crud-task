package task;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Crud crud = new Crud();
        Customer customer = new Customer(1L, "Aibek", "Aibek005.@gamil.com", LocalDate.of(2005, 1, 14), "996706046426");
        Customer customer2 = new Customer(1L, "Aibek", "Aibek005.@gamil.com", LocalDate.of(2005, 1, 14), "996706046426");


        crud.addCusromer(new Customer(1L, "Aibek", "Aibek005.@gamil.com", LocalDate.of(2005, 1, 14), "996706046426"));
        crud.addCusromer(new Customer(2L, "Amir", "Amer006.@gamil.com", LocalDate.of(2006, 11, 6), "996701134534"));
        crud.addCusromer(new Customer(3L, "Baiel", "Baiel004.@gamil.com", LocalDate.of(2004, 12, 18), "996703462362"));
        System.out.println("-----------");
        //

        crud.getAllCusttomer();
        System.out.println("_________________________");
//       crud.getCustomerById(2L);
//crud.updatecustomer(2L,new Customer(2L,"ernis","ernis008.@mail.com",LocalDate.of(2008,10,1),"996709873421"));
        crud.deleteCustomer(3L);
        crud.getAllCusttomer();


//
//        group.deleteStudent(2L);
//        System.out.println("-----------------");
//        group.getAllStudent();

    }
}
