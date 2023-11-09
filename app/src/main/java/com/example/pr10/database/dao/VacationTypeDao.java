package com.example.pr10.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.pr10.database.entities.VacationType;

import java.util.List;

@Dao
public interface VacationTypeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(VacationType vacationType);

    @Update
    void update(VacationType vacationType);

    @Delete
    void delete(VacationType vacationType);

    @Query("SELECT * FROM vacation_type")
    List<VacationType> getAllVacationTypes();
}
