package components;

import exceptions.InvalidLanguageException;

import java.util.ArrayList;
import java.util.List;

public class SearchElement {
    private enum languagesEnum {Java, C, JavaScript, HTML, CSS, Python};
    private String description;
    private List<String> keywords;
    private List<String> programmingLanguages;


    public SearchElement() {
        this.keywords = new ArrayList<>();
        this.programmingLanguages = new ArrayList<>();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addKeyword(String keyword) {
        keywords.add(keyword);
    }

    public void addProgramminglanguage(String programmingLanguage) throws InvalidLanguageException {
        boolean check = false;
        for(languagesEnum languageEnum : languagesEnum.values())
            if(programmingLanguage.equals(languageEnum))
                check = true;
        if(check)
            //throw new Exception("Invalid Language");
        programmingLanguages.add(programmingLanguage);
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public List<String> getProgrammingLanguages() {
        return programmingLanguages;
    }
}
