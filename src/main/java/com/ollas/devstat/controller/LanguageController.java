package com.ollas.devstat.controller;

import com.ollas.devstat.entities.Language;
import com.ollas.devstat.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/languages")
public class LanguageController {

    @Autowired
    private LanguageService languageService;

    @PostMapping(value = "create")
    public Language createLanguage (Language language){
        return languageService.createLanguage(language);
    }
    @GetMapping(value = "language/{languageId}")
    public Language getLanguageById (@PathVariable("languageId") Integer languageId){
        return languageService.getLanguageById(languageId);
    }

    @DeleteMapping(value = "delete/{languageId}")
    public void deleteLanguage(@PathVariable("languageId") Integer languageId){
        languageService.deleteLanguage(languageId);
    }

}
