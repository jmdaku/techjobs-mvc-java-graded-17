package org.launchcode.techjobsmvc.controllers;

import org.launchcode.techjobsmvc.models.Job;
import org.launchcode.techjobsmvc.models.JobData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

import static org.launchcode.techjobsmvc.controllers.ListController.columnChoices;


/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController {

    @GetMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
    }

    // TODO #3 - Create a handler to process a search request and render the updated search view.

//    @PostMapping("/results")
//    public String displaySearchResults(@ModelAttribute searchTerm, String searchType, Model model){
//        List<Job> jobs= new ArrayList<>();
//
//        if(searchTerm.equals("all")) {
//            model.addAttribute();
//            jobs.add(JobData.findAll());
//
//        }else if(searchTerm.isEmpty()){
//            JobData.findAll();
//
//        }else{
//            JobData.findByColumnAndValue(searchTerm, searchType);
//        }
//        return "/search/results";
//    }


//    In order for these last two parameters to be properly passed in by Spring Boot, you need to use the correct annotation.
//    Pass jobs into the search.html view via the model parameter.
//    Pass ListController.columnChoices into the view, as the existing search handler does.




}

