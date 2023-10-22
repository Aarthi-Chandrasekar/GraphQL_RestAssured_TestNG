package payload;

import utilities.Utilities;

public class PayLoadAPI {


    public static String getAllEmployees() {
        String getAllEmployeesQuery = Utilities.getQuery("allEmployees");
        String payload = Utilities.graphqlToJsonString(getAllEmployeesQuery);
        return payload;
    }

    public static String getSingleEmployee() {
        String singleEmployee = Utilities.getQuery("singleEmployee");
        String payload = Utilities.graphqlToJsonString(singleEmployee);
        return payload;
    }

    public static String employeesWithFilter() {
        String employeesWithFilter = Utilities.getQuery("employeesWithFilter");
        String payload = Utilities.graphqlToJsonString(employeesWithFilter);
        return payload;
    }

    public static String createEmployee() {
        String createEmployee = Utilities.getQuery("createEmployee");
        String payload = Utilities.graphqlToJsonString(createEmployee);
        return payload;
    }

    public static String updateEmployee() {
        String createEmployee = Utilities.getQuery("updateEmployee");
        String payload = Utilities.graphqlToJsonString(createEmployee);
        return payload;
    }

    public static String deleteEmployee() {
        String createEmployee = Utilities.getQuery("deleteEmployee");
        String payload = Utilities.graphqlToJsonString(createEmployee);
        return payload;
    }


}
