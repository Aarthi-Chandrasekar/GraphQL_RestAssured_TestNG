package query;

import io.restassured.response.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import payload.PayLoadAPI;
import testconfig.BaseTest;
import utilities.APIService;

public class AppTest extends BaseTest {

    private static final Logger log = LogManager.getLogger(AppTest.class.getName());

    /**Note
     *
     *  * Sample GraphQL API To Test with Rest Assured
     *  * Step 1. Clone the below repository to your local machine "git clone  https://github.com/Aarthi-Chandrasekar/Sample_GraphQL_API.git"
     *  * Step 2 Run spring-boot mvn command in command prompt "mvn spring-boot:run "
     *
     */


    @Test(description = "Get All Employees")
    public void queryTest() {

        log.info("Sending the graphQL request to the server");

        String payload = PayLoadAPI.getAllEmployees();
        Response res = APIService.sendAPIRequest(payload);

        JSONObject obj = new JSONObject(res.asString());

        Assert.assertNotNull(obj);
        Assert.assertEquals(200,res.getStatusCode());
    }


    @Test(description = "Get Single Employee By ID")
    public void getEmployeeByID() {

        log.info("Sending the graphQL request to the server");

        String payload = PayLoadAPI.getSingleEmployee();
        Response res = APIService.sendAPIRequest(payload);

        JSONObject obj = new JSONObject(res.asString());

        Assert.assertNotNull(obj);
        Assert.assertEquals(200,res.getStatusCode());
    }

    @Test(description = "Get Employees Filter by Salary")
    public void getEmployeeByFilter() {

        log.info("Sending the graphQL request to the server");

        String payload = PayLoadAPI.employeesWithFilter();
        Response res = APIService.sendAPIRequest(payload);

        JSONObject obj = new JSONObject(res.asString());

        Assert.assertNotNull(obj);
        Assert.assertEquals(200,res.getStatusCode());
    }

    @Test(description = "Create Employee")
    public void createEmployee() {

        log.info("Sending the graphQL request to the server");

        String payload = PayLoadAPI.createEmployee();
        Response res = APIService.sendAPIRequest(payload);

        JSONObject obj = new JSONObject(res.asString());

        Assert.assertNotNull(obj);
        Assert.assertEquals(200,res.getStatusCode());
    }

    @Test(description = "Update Employee")
    public void updateEmployee() {

        log.info("Sending the graphQL request to the server");

        String payload = PayLoadAPI.updateEmployee();
        Response res = APIService.sendAPIRequest(payload);

        JSONObject obj = new JSONObject(res.asString());

        Assert.assertNotNull(obj);
        Assert.assertEquals(200,res.getStatusCode());
    }

    @Test(description = "Delete Employee")
    public void deleteEmployee() {

        log.info("Sending the graphQL request to the server");

        String payload = PayLoadAPI.deleteEmployee();
        Response res = APIService.sendAPIRequest(payload);

        JSONObject obj = new JSONObject(res.asString());

        Assert.assertNotNull(obj);
        Assert.assertEquals(200,res.getStatusCode());
    }

}