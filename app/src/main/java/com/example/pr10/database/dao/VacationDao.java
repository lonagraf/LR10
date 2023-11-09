package com.example.pr10.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.pr10.database.entities.Vacation;

import java.util.List;

@Dao
public interface VacationDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Vacation vacation);

    @Update
    void update(Vacation vacation);

    @Delete
    void delete(Vacation vacation);

    @Query("select * from vacation")
    List<Vacation> getAllVacations();
}
