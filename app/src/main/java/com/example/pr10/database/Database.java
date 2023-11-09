package com.example.pr10.database;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.pr10.database.dao.DepartmentDao;
import com.example.pr10.database.dao.EmployeeDao;
import com.example.pr10.database.dao.PositionDao;
import com.example.pr10.database.dao.SalaryDao;
import com.example.pr10.database.dao.VacationDao;
import com.example.pr10.database.dao.VacationTypeDao;
import com.example.pr10.database.entities.Department;
import com.example.pr10.database.entities.Employee;
import com.example.pr10.database.entities.Position;
import com.example.pr10.database.entities.Salary;
import com.example.pr10.database.entities.Vacation;
import com.example.pr10.database.entities.VacationType;

@androidx.room.Database(entities = {
        Department.class,
        Employee.class,
        Position.class,
        Salary.class,
        Vacation.class,
        VacationType.class
}, version = 1)
public abstract class Database extends RoomDatabase {
    public abstract DepartmentDao departmentDao();
    public abstract EmployeeDao employeeDao();
    public abstract PositionDao positionDao();
    public abstract SalaryDao salaryDao();
    public abstract VacationDao vacationDao();
    public abstract VacationTypeDao vacationTypeDao();

    public static volatile Database INSTANCE;
    public static Database getDatabase(Context context){
        if (INSTANCE == null){
            synchronized (Database.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(
                            context.getApplicationContext(),
                            Database.class,
                            "test_database").build();
                }
            }
        }
        return INSTANCE;
    }
}
