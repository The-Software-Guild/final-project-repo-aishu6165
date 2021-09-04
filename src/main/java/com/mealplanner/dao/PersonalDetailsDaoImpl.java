package com.mealplanner.dao;

import com.mealplanner.model.PersonalDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonalDetailsDaoImpl implements  PersonalDetailsDao{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void addDetails(PersonalDetails details) {
        String query = "INSERT INTO PersonalDetails(name, age, "
                + "number, email, height, weight, diet, recipe) VALUES(?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(query,
                details.getName(),
                details.getAge(),
                details.getNumber(),
                details.getEmail(),
                details.getHeight(),
                details.getWeight(),
                details.getDiet(),
                details.getRecipe()
               );
    }


    @Override
    public List<PersonalDetails> getDetails() {
        String query = "SELECT* FROM PersonalDetails";
        return jdbcTemplate.query(query,(rs, rowNum) ->
                new PersonalDetails(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("age"),
                        rs.getString("number"),
                        rs.getString("email"),
                        rs.getString("height"),
                        rs.getString("weight"),
                        rs.getString("diet"),
                        rs.getString("recipe")
                )
        );
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM PersonalDetails WHERE id = ?";
        jdbcTemplate.update(query,id);
    }

    @Override
    public PersonalDetails editDetail(int id) {
        String query = "Select * from PersonalDetails where id = ?";
        return jdbcTemplate.queryForObject(query,new Object[]{id},(rs, rowNum) ->
                new PersonalDetails(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("age"),
                        rs.getString("number"),
                        rs.getString("email"),
                        rs.getString("height"),
                        rs.getString("weight"),
                        rs.getString("diet"),
                        rs.getString("recipe")
                )
        );
    }

    @Override
    public void updateDetails(PersonalDetails details) {
        String query =  "UPDATE  PersonalDetails set name=?, age=?, "
                + "number=?, email=?, height=?, weight=?, diet=?, recipe=? where id = ?";
        jdbcTemplate.update(query,details.getName(),details.getAge(),details.getNumber(),
                details.getEmail(),details.getHeight(),details.getWeight(),details.getDiet(),
                details.getRecipe(),details.getId());
    }
}

