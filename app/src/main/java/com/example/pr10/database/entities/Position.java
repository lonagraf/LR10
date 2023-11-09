package com.example.pr10.database.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Position {
    @PrimaryKey
    public int positionId;

    @ColumnInfo(name = "position_name")
    public String positionName;
    public Position(){}
}
