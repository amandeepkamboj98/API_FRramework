package Model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.processing.Generated;

//import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "roll_no",
        "subjectId"
})
@Generated("jsonschema2pojo")
public class StudentPojo {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("roll_no")
    private String rollNo;
    @JsonProperty("subjectId")
    private Integer subjectId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId(int i) {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("roll_no")
    public String getRollNo() {
        return rollNo;
    }

    @JsonProperty("roll_no")
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    @JsonProperty("subjectId")
    public Integer getSubjectId() {
        return subjectId;
    }

    @JsonProperty("subjectId")
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

