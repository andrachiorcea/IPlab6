package components;

import java.util.List;

public class SearchElementBuilder {
    private String description;
    private List<String> keywords;
    private List<String> programmingLanguages;

    public SearchElementBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public SearchElementBuilder setKeywords(List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    public SearchElementBuilder setProgrammingLanguages(List<String> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
        return this;
    }

    public SearchElement createSearchElement() {
        return new SearchElement(description, keywords, programmingLanguages);
    }
}