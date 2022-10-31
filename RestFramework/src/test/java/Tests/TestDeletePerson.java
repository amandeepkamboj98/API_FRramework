package Tests;

import Helpers.PersonServiceHelpers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDeletePerson {

    private PersonServiceHelpers personServiceHelpers;

    @BeforeClass
    public void init(){
        personServiceHelpers = new PersonServiceHelpers();
    }

    @Test
    public void deleteStudent(){

        personServiceHelpers.deleteStudent(7);
    }
}
