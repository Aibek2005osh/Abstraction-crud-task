package task;

import java.util.Arrays;

public class Crud {
    private Customer[] customers = new Customer[10];
    private int customerCoutn;

    public Crud() {
    }

    public Crud(int customerCoutn, Customer[] customers) {
        this.customerCoutn = customerCoutn;
        this.customers = customers;
    }

    public int getCustomer() {
        return customerCoutn;
    }

    public void setCustomer(int customer) {
        this.customerCoutn = customer;
    }

    public Customer[] getCustomers() {
        return customers;
    }




    public void setCustomers(Customer[] customers) {

        this.customers = customers;

    }
    public String toString() {
            return "Crud{" +
                   "customerCoutn=" + customerCoutn +
                   ", customers=" + Arrays.toString(customers) +
                   '}';
        }



    public void addCusromer(Customer customer) {
        this.customers[customerCoutn++] = customer;
        System.out.println("success !!");

    }

    public void getAllCusttomer() {
        for (int i = 0; i < customerCoutn; i++) {
            System.out.printf("""
                    ID : %s
                    fristName : %s
                    email : %s
                    dateOfbirth : %s
                    phonNumer : %s
                    """, customers[i].getId(), customers[i].getFristName(), customers[i].getEmail(), customers[i].getDateOfbirth(), customers[i].getPhonNumber()


            );

        }
    }

    public void getCustomerById(Long customerId) {
        boolean islaik = false;
        for (int i = 0; i < customerCoutn; i++) {
            if (customers[i].getId().equals(customerId)) {
                islaik = true;
                System.out.printf("""
                        ID : %s
                        fristName : %s
                        email : %s
                        dateOfbirth : %s
                        phonNumer : %s
                        """, customers[i].getId(), customers[i].getFristName(), customers[i].getEmail(), customers[i].getDateOfbirth(), customers[i].getPhonNumber());


            }
        }
        if (!islaik) {
            System.out.println("Customer with id" + customerId + "not fount");
        }

    }

    public void deleteCustomer(Long customerid) {
        boolean islaik = false;

        for (int i = 0; i < customerCoutn; i++) {
            if (customers[i].getId().equals(customerid)) {
                islaik = true;
                for (int v = i; v < customerCoutn ; v++) {
                    customers[v] = customers[v + 1];
                }
                customerCoutn--;
                System.out.println("daleted ! !");

            }
        }
        if (!islaik) {
            System.out.println("customer with id " + customerid + " no found ");
        }
    }

    public void updatecustomer(Long customerId, Customer newCustomer) {
        boolean islaik = false;

        for (int i = 0; i < customerCoutn; i++) {
            if (customers[i].getId().equals(customerId)) {
                islaik = true;
                customers[i] = newCustomer;

            }
            if (!islaik){
                System.out.println(" Customer with id " + customerId + " not found");
            }

        }
    }


}

