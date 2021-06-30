package com.connect;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

import lombok.Data;

public class CustomerPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Customer> pq = new PriorityQueue<Customer>(5, new CustomerComparator());

        Customer c1 = new Customer("Siri", 12.30);
        Customer c2 = new Customer("Bhuvi", 11.30);
        Customer c3 = new Customer("Pradyu", 11);
        pq.add(c1);
        pq.add(c2);
        pq.add(c3);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll().getName());
        }
          pq.toArray();
        Arrays.sort(pq.toArray());

    }
}

class CustomerComparator implements Comparator<Customer> {

    @Override
	public int compare(Customer c1, Customer c2) {
        if (c1.getTime() > c2.getTime()) {
            return -1;
        } else if (c1.getTime() < c2.getTime()) {
            return 1;
        }
        return 0;

    }
}

@Data
class Customer {
    private String name;
    private double time;

    public Customer(String name, double time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }


}
