package com.example.pr10.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "position")
public class Position {
    @ColumnInfo(name = "position_id")
    @PrimaryKey(autoGenerate = true)
    public int positionId;

    @ColumnInfo(name = "position_name")
    public String positionName;

    @Ignore
    public Position(){}

    public Position(String positionName) {
        this.positionName = positionName;
        this.positionId = 0;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
