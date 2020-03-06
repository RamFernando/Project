package com.ramesha.ecommerce.productservice.controller;

import com.ramesha.ecommerce.productservice.model.Feedback;
import com.ramesha.ecommerce.productservice.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class FeedbackController {

    @Autowired
    FeedbackService feedbackService;

    @RequestMapping("/testFeed")
    public String test(){
        return "Hello Feedback";
    }

    @RequestMapping("/feedback/save")
    public Feedback saveFeedback(@RequestBody Feedback feedback){
        return feedbackService.saveFeedback(feedback);
    }
}
