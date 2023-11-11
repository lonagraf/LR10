package com.example.pr10.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.example.pr10.DateConverter;

import java.sql.Date;
@TypeConverters(DateConverter.class)
@Entity(tableName = "salary",
foreignKeys = {
        @ForeignKey(entity = Employee.class, parentColumns = "employeeId", childColumns = "employee")},
indices = {@Index(value = {"employee"})})
public class Salary {
    @ColumnInfo(name = "salary_id")
    @PrimaryKey(autoGenerate = true)
    public int salaryId;

    @ColumnInfo(name = "employee")
    public int employee;

    @ColumnInfo(name = "salary")
    public double salary;

    @ColumnInfo(name = "salary_date")
    public Date salaryDate;
    public Salary (){}
}
