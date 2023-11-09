package com.example.pr10.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.pr10.database.entities.Salary;

import java.util.List;

@Dao
public interface SalaryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Salary salary);

    @Update
    void update(Salary salary);

    @Delete
    void delete(Salary salary);

    @Query("select * from salary")
    List<Salary> getAllSalaries();
}
