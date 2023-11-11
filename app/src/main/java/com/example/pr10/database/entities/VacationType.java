package com.example.pr10.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.example.pr10.DateConverter;

@TypeConverters(DateConverter.class)
@Entity(tableName = "vacation_type")
public class VacationType {
    @ColumnInfo(name = "vacation_type_id")
    @PrimaryKey(autoGenerate = true)
    public int vacationTypeId;

    @ColumnInfo(name = "type_name")
    public String typeName;

    @Ignore
    public VacationType (){}

    public VacationType(String typeName) {
        this.typeName = typeName;
        this.vacationTypeId = 0;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
