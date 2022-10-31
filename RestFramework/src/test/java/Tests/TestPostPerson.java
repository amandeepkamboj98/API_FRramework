package Tests;

import Helpers.PersonServiceHelpers;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestPostPerson {

    private PersonServiceHelpers personServiceHelpers;

    @BeforeClass
    public void init(){
        personServiceHelpers = new PersonServiceHelpers();
    }

    @Test
    public void Create_Student(){
      String id = personServiceHelpers.createStudent().jsonPath().getString("id");
        System.out.println("Student id is :"+id);
        Assert.assertNotNull(id,"Student is not null");
    }

}
