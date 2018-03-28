package componentTests;

import components.SearchElement;
import components.SearchElementBuilder;
import exceptions.InvalidLanguageException;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class SearchElementTest {

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(components.SearchElement.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Test
    public void getDescription() {
        SearchElement searchElement = new SearchElementBuilder().createSearchElement();
        String description = "ceva";
        searchElement.addKeyword(description);
        assertEquals(description, searchElement.getDescription());
    }

    @org.junit.Test
    public void getKeywords() {
        SearchElement searchElement = new SearchElementBuilder().createSearchElement();
        String keyword = "ceva";
        List<String> keywords= new ArrayList<>();
        searchElement.addKeyword(keyword);
        assertEquals(keywords, searchElement.getKeywords());
    }

    @org.junit.Test(expected = InvalidLanguageException.class)
    public void getProgrammingLanguages() {
        SearchElement searchElement = new SearchElementBuilder().createSearchElement();
        String programmingLanguage = "ceva";
        List<String> programmingLanguages= new ArrayList<>();
        try {
            searchElement.addProgramminglanguage(programmingLanguage);
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(InvalidLanguageException.class);
        }
        catch (InvalidLanguageException e) {
            System.out.println("ERROR");
        }
    }
}
