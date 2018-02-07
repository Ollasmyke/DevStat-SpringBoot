package com.ollas.devstat.service;

import com.ollas.devstat.dao.DataAccess;
import com.ollas.devstat.entities.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageService {

    @Autowired
    private DataAccess languageAccess;

    public Language createLanguage (Language language){
        return languageAccess.save(language);
    }
    public Language getLanguageById (Integer languageId){
        return languageAccess.findOne(languageId);
    }
    public void deleteLanguage(Integer languageId){
        languageAccess.delete(languageId);
    }


}
