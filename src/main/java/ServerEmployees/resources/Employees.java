package ServerEmployees.resources;

import ServerEmployees.db.MySQL;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/employees")

public class Employees {
    @POST
    @Path("/salary")
    @Produces(MediaType.APPLICATION_JSON)
    public String getSalary (Employee employ) {
        String salary = new MySQL().getSalary(employ.name);
        return salary;
    }

    public static class Employee {
        @JsonProperty("name")
        public String name;
    }
}
