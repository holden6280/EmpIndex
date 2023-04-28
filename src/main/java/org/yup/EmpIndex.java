package org.yup;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EmpIndex {
    public static void main(String[] args) {

        try {

            BufferedReader emp = new BufferedReader(new FileReader("Emp.csv"));

            emp.readLine();

            String line;
            while ((line = emp.readLine()) != null) {

                String[] split = line.split("\\|");

                Employee anEmp = new Employee(Integer.parseInt(split[0]), split[1], Float.parseFloat(split[2]), Float.parseFloat(split[3]));

                System.out.printf("id: %d - name: %s - gross pay: $%.2f\n", anEmp.getEmployeeId(), anEmp.getName(), anEmp.getGrossPay());

            }
    }
        catch(IOException e) {

            System.out.println("CRITICAL ERROR /n Invalid input");
            throw new RuntimeException(e);

        }
    }
}
