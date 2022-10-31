package Helpers;

import Constants.Endpoints;
import Model.StudentPojo;
import Utils.ConfigManager;
import com.fasterxml.jackson.core.type.TypeReference;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import io.restassured.response.Response;


import java.lang.reflect.Type;
import java.util.List;

public class PersonServiceHelpers<Students> {

    //  we need to read the config. variable
    //  Rest Assured about the url and port
    // make a Get Request and send data to the TestGetPerson class

   private static final String Base_URL = ConfigManager.getInstance().getString("base_url");
   private static final String Port = ConfigManager.getInstance().getString("port");

   public PersonServiceHelpers() {
      RestAssured.baseURI = Base_URL;
      RestAssured.port = Integer.parseInt(Port);
      RestAssured.useRelaxedHTTPSValidation();
   }

   public List<Students> getAllStudents(){
      Response res = RestAssured.given().
              log().all().
              contentType(ContentType.JSON)
              .get(Endpoints.Get_All_Student)
              .andReturn();

      Type type = new TypeReference<List<Students>>(){}.getType();
      List<Students> studentList = res.as(type);

      return studentList;
   }

   public Response createStudent(){

      StudentPojo student = new StudentPojo();
      student.setId(8);
      student.setName("Raju");
      student.setRollNo("1801980");
      student.setSubjectId(10);


      Response res = RestAssured.given().log().all().contentType(ContentType.JSON)
              .body(student).when().post(Endpoints.Create_Student).andReturn();

      return res;
   }

   public Response updateStudent(int id){

      StudentPojo pojo = new StudentPojo();
      pojo.setName("Rakesh");
      pojo.setRollNo("1801985");
      pojo.setSubjectId(15);

      Response res = RestAssured.given().contentType(ContentType.JSON)
              .pathParams("id",id)
              .body(pojo)
              .put(Endpoints.Update_Student)
              .andReturn();


      return res;
   }

   public Response deleteStudent(int id){

      Response res = RestAssured.given().contentType(ContentType.JSON)
              .pathParams("id",id)
              .when().delete(Endpoints.Delete_Student)
              .andReturn();
      return res;
   }
   }

