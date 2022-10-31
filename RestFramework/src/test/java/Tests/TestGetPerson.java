package Tests;

import Helpers.PersonServiceHelpers;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.List;

public class TestGetPerson<Students> {
    private PersonServiceHelpers personServiceHelpers;

    @BeforeClass
    public void init(){
        personServiceHelpers = new PersonServiceHelpers();
    }

    @Test
    public void getStudents(){
        List<Students> stud_List = personServiceHelpers.getAllStudents();
        Assert.assertNotNull(stud_List,"Student list is not empty");
    }
}
