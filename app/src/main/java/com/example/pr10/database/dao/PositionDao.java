package com.example.pr10.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.pr10.database.entities.Position;

import java.util.List;

@Dao
public interface PositionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Position position);

    @Update
    void update(Position position);

    @Delete
    void delete(Position position);

    @Query("select * from position")
    List<Position> getAllPositions();
}
