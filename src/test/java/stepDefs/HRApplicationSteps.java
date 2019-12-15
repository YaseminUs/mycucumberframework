package stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilities.Configurations;
import utilities.Driver;
import utilities.JDBCUtils;

import java.util.List;
import java.util.Map;

public class HRApplicationSteps {

    @Given("^Go to Database and get First name and Last name of employees who works in Europe and validate with their UI information \\(First name, Last Name\\)\\.$")
    public void go_to_Database_and_get_First_name_and_Last_name_of_employees_who_works_in_Europe_and_validate_withtheirUI_information_First_name_Last_Name() throws Throwable {
        Driver.driver.get(Configurations.getproperties("HRApp"));
        try {
            JDBCUtils.establishConnection();
            List<Map<String, Object>> expectedFirstNames = JDBCUtils.runSQLQuery("select first_name ,last_name\n" +
                    " from employees e join  departments d on\n" +
                    " e.department_id=d.department_id\n" +
                    " join locations l on d.location_id=l.location_id\n" +
                    " join countries c on l.country_id=c.country_id\n" +
                    " join regions r on c.region_id=r.region_id\n" +
                    " where region_name = 'Europe’");

            System.out.println(expectedFirstNames.get(0).get("FIRST_NAME"));
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("True");
        }

    }

    @And("^Go to Excel and update column ‘Actual # of Employees’ with number of Europe employees that you get from UI\\.$")
    public void go_to_Excel_and_update_column_Actual_of_Employees_with_number_of_Europe_employees_that_you_get_from_UI() throws Throwable {

    }

    @Then("^Compare ‘Actual # of Employees’’ with ‘expected # of Employees’ and if they matched then update ‘Test Execution Status’ cell as PASSEDif not match then update with FAILED\\.$")
    public void compare_Actual_of_Employees_with_expected_of_Employees_and_if_they_matched_then_update_Test_Execution_Status_cell_as_PASSEDif_not_match_then_update_with_FAILED() throws Throwable {

    }

}
