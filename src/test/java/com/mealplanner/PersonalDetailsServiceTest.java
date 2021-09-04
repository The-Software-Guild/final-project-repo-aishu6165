package com.mealplanner;

import com.mealplanner.model.PersonalDetails;
import com.mealplanner.service.PersonalDetailsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PersonalDetailsServiceTest {
    @Autowired
    PersonalDetailsService service;



    @Test
    public void addDetailsTest(){
        PersonalDetails details = new PersonalDetails();
        details.setName("Test");
        details.setAge("24");
        details.setNumber("34567890");
        details.setEmail("test@gamil.com");
        details.setHeight("165");
        details.setWeight("65");
        details.setDiet("vegeterian");
        details.setRecipe("paneer");
        service.addDetails(details);
    }

    @Test
    public void getDetailsTest(){
        List<PersonalDetails> list =service.getDetails();
        Assertions.assertNotNull(list);
    }

    @Test
    public void editDetailTest(){
        PersonalDetails details =service.editDetail(4);
        Assertions.assertEquals(4,details.getId());
    }

    @Test
    public void updateDetailsTest(){
        PersonalDetails details = new PersonalDetails();
        details.setId(4);
        details.setName("Test");
        details.setAge("24");
        details.setNumber("34567890");
        details.setEmail("test@gamil.com");
        details.setHeight("165");
        details.setWeight("65");
        details.setDiet("vegeterian");
        details.setRecipe("paneer");
        service.updateDetails(details);
    }
}
