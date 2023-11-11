package com.example.pr10.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "employee",
foreignKeys = {
        @ForeignKey(entity = Department.class, parentColumns = "departmentId", childColumns = "department"),
        @ForeignKey(entity = Position.class, parentColumns = "positionId", childColumns = "position")},
indices = {
        @Index(value = {"department"}),
        @Index(value = {"position"})})
public class Employee {
    @ColumnInfo(name = "employee_id")
    @PrimaryKey(autoGenerate = true)
    public int employeeId;

    @ColumnInfo(name = "firstname")
    public String firstName;

    @ColumnInfo(name = "surname")
    public String surname;

    @ColumnInfo(name = "email")
    public String email;

    @ColumnInfo(name = "department")
    public int department;

    @ColumnInfo(name = "position")
    public int position;

    @Ignore
    public Employee(){}


}
