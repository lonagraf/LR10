package com.example.pr10.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.example.pr10.DateConverter;

import java.sql.Date;


@Entity(tableName = "vacation",
foreignKeys = {
        @ForeignKey(entity = Employee.class, parentColumns = "employeeId", childColumns = "employee"),
        @ForeignKey(entity = VacationType.class, parentColumns = "vacationTypeId", childColumns = "vacation_type")},
        indices = {
        @Index(value = {"employee"}),
                @Index(value = {"vacation_type"})})
@TypeConverters(DateConverter.class)
public class Vacation {
    @PrimaryKey
    public int vacationId;

    @ColumnInfo(name = "employee")
    public int employee;

    @ColumnInfo(name = "vacation_type")
    public int vacationType;

    @ColumnInfo(name = "start_date")
    public Date startDate;

    @ColumnInfo(name = "end_date")
    public Date endDate;

    public Vacation (){}
}
