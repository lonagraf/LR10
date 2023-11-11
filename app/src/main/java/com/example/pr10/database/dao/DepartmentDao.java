package com.example.pr10.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.pr10.database.entities.Department;

import java.util.List;

@Dao
public interface DepartmentDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Department department);

    @Update
    void update(Department department);

    @Delete
    void delete(Department department);

    @Query("select * from department")
    List<Department> getAllDepartments();

    @Query("select * from department where department_id == :department_id")
    public Department getDepartment(int department_id);
}
