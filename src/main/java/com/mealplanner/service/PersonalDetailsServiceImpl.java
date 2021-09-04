package com.mealplanner.service;

import com.mealplanner.dao.PersonalDetailsDao;
import com.mealplanner.model.PersonalDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonalDetailsServiceImpl implements PersonalDetailsService{

    @Autowired
    PersonalDetailsDao dao;

    @Override
    public void addDetails(PersonalDetails details) {
        dao.addDetails(details);
    }

    @Override
    public List<PersonalDetails> getDetails() {
        List<PersonalDetails> detailsList = dao.getDetails();
        return detailsList;
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }

    @Override
    public PersonalDetails editDetail(int id) {
        return dao.editDetail(id);
    }

    @Override
    public void updateDetails(PersonalDetails details) {
        dao.updateDetails(details);
    }

}
