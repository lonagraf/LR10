package com.example.pr10.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "department")
public class Department {
    @ColumnInfo(name = "department_id")
    @PrimaryKey(autoGenerate = true)
    public int departmentId;

    @ColumnInfo(name = "department_name")
    public String departmentName;

    @Ignore
    public Department(){}

    public Department(String departmentName){
        this.departmentName = departmentName;
        this.departmentId = 0;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
