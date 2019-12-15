package runner;

import utilities.Configurations;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCTest {
    //  JDBC--> java Database Connectivity

    public static void main(String[] args) throws IOException, SQLException {
        //Connections
        //Statement
        //ResultSet
        Connection connection = DriverManager.getConnection(
                Configurations.getproperties("dbHostname"),
                Configurations.getproperties("dbUsername"),
                Configurations.getproperties("dbPassword"));


        Statement statement=connection.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);

        ResultSet resultSet=statement.executeQuery("Select * from employees");
        System.out.println(resultSet.getRow());
        resultSet.next();
        resultSet.next();
        resultSet.next();
        //String myFirstData = resultSet.getString("Employee_id");
        String myFirstData = resultSet.getString("First_name");
        System.out.println(myFirstData);
        resultSet.next();
       // System.out.println(resultSet.getString("First_name"));
        System.out.println(resultSet.getObject("First_name"));
        resultSet.next();
        System.out.println(resultSet.getObject("Employee_id"));
        System.out.println(resultSet.getRow());

        System.out.println("-----------------------");

        ResultSetMetaData rslMetadata = resultSet.getMetaData();

        System.out.println(rslMetadata.getColumnCount());
        System.out.println(rslMetadata.getColumnName(1));
        System.out.println(rslMetadata.getColumnName(5));
        System.out.println(rslMetadata.getColumnType(5));
        System.out.println(rslMetadata.getColumnClassName(5));

        System.out.println("-----------------------");
        List<Map<String,Object>> listOfMap=new ArrayList<>();
        while(resultSet.next()){
            Map<String,Object> Maprow= new HashMap<>();
            for(int i=1;i<=rslMetadata.getColumnCount();i++) {
                Maprow.put(rslMetadata.getColumnName(i),resultSet.getObject(i));
            }
            listOfMap.add(Maprow);
        }
        System.out.println("***** It gives all the list of rows  ******");
        for(int i=0;i<listOfMap.size();i++){
            for(Object key:listOfMap.get(i).keySet()){
                System.out.println(listOfMap.get(i).get(key));
            }
        }
    }
}





