package com.mealplanner.dao;

import com.mealplanner.model.PersonalDetails;

import java.util.List;

public interface PersonalDetailsDao {
    public void addDetails(PersonalDetails details);
    public List<PersonalDetails> getDetails();
    public void delete(int id);
    public PersonalDetails editDetail(int id);
    public void updateDetails(PersonalDetails details);
}
