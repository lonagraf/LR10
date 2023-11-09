package com.example.pr10.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Department {
    @PrimaryKey
    public int departmentId;

    @ColumnInfo(name = "department_name")
    public String departmentName;

    public Department(){}
}
