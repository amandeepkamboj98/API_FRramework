package Tests;

import Helpers.PersonServiceHelpers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestUpdatePerson {

    private PersonServiceHelpers personServiceHelpers;

    @BeforeClass
    public void init(){
        personServiceHelpers = new PersonServiceHelpers();
    }

    @Test
    public void updateStudent(){
        String id = personServiceHelpers.updateStudent(7).jsonPath().getString("id");
        System.out.println(id);
    }
}
