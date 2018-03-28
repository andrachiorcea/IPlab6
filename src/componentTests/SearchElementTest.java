package componentTests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.rules.ExpectedException;

import components.SearchElement;
import exceptions.InvalidLanguageException;

public class SearchElementTest {

    @org.junit.Test
    public void getDescription() {
        SearchElement searchElement = new SearchElement();
        String description = "ceva";
        searchElement.setDescription(description);
        assertEquals(description, searchElement.getDescription());
    }

    @org.junit.Test
    public void getKeywords() {
        SearchElement searchElement = new SearchElement();
        String keyword = "ceva";
        List<String> keywords= new ArrayList<>();
        keywords.add(keyword);
        searchElement.addKeyword(keyword);
        assertEquals(keywords, searchElement.getKeywords());
    }

    @org.junit.Test
    public void getProgrammingLanguages() {
        SearchElement searchElement = new SearchElement();
        String programmingLanguage = "Java";
        List<String> programmingLanguages= new ArrayList<>();
       
            try {
				searchElement.addProgramminglanguage(programmingLanguage);
			} catch (InvalidLanguageException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidLanguageException.class);

    }
}
