package com.example.pr10.database;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.pr10.database.entities.Employee;

import java.util.List;

public class EmployeeViewModel extends AndroidViewModel {
    private Database database;
    private List<Employee> employees;
    public EmployeeViewModel(@NonNull Application application) {
        super(application);
        database = Database.getDatabase(getApplication());
    }

    public void getAllEmployees(){
        Runnable allEmployeesRnb = ()->{
            employees = database.employeeDao().getAllEmployees();
        };
        Thread thread = new Thread(allEmployeesRnb);
        thread.start();
    }

    public void addEmployees(Employee employee){
        Runnable addEmployees = ()->{
            database.employeeDao().insert(employee);
        };
        Thread thread = new Thread(addEmployees);
        thread.start();
    }
}
