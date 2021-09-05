package com.mealplanner.controllers;

import com.mealplanner.model.FormClass;
import com.mealplanner.model.PersonalDetails;
import com.mealplanner.service.PersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PersonalDetailController {

    @Autowired
    PersonalDetailsService service;

    @GetMapping("/home")
    public String get() {
        return "index";
    }

    @GetMapping("/details")
    public String personalDetails(Model model) {
        List<PersonalDetails> detailsList = service.getDetails();
        model.addAttribute("details",detailsList);
        return "personalDetails";
    }

    @PostMapping("editDetail")
    public String editDetails(@ModelAttribute("form") FormClass id , Model model) {
        int id1 = Integer.parseInt(id.getId());
        System.out.println("Edit Id:"+id.getId());

        PersonalDetails detail = service.editDetail(id1);
        model.addAttribute("detail",detail);
        return "editDetail";
    }

    @PostMapping("deleteDetail")
    public String deleteDetail(@ModelAttribute("form") FormClass id, Model model) {
        System.out.println("Delete:"+id.getId());
        int id1 = Integer.parseInt(id.getId());
       service.delete(id1);
        List<PersonalDetails> detailsList = service.getDetails();
        model.addAttribute("details",detailsList);
        //heroDAO.deleteHeroById(id);

        return "personalDetails";
    }

    @PostMapping("/addDetails")
    public String addDetails(@ModelAttribute("form") PersonalDetails form, Model model) {
        //Inserting personal details
        service.addDetails(form);
        //get List of details
        List<PersonalDetails> detailsList = service.getDetails();
        model.addAttribute("details",
                detailsList );
        return "personalDetails";
    }

    @PostMapping("/updateDetails")
    public String updateDetails(@ModelAttribute("form") PersonalDetails form, Model model) {
        System.out.println("Update Details"+form.getId());

        service.updateDetails(form);
        //get List of details
        List<PersonalDetails> detailsList = service.getDetails();
        model.addAttribute("details",
                detailsList );
        return "personalDetails";
    }
}
