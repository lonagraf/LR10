package com.example.pr10.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.example.pr10.DateConverter;

@TypeConverters(DateConverter.class)
@Entity(tableName = "vacation_type")
public class VacationType {
    @PrimaryKey
    public int vacationTypeId;

    @ColumnInfo(name = "type_name")
    public String typeName;

    public VacationType (){}
}
