package runner;

import utilities.ExcelUtiles;

import java.io.IOException;

public class ExcelTest2 {

    public static void main(String[] args)throws IOException {
        ExcelUtiles.openExcelFile("testData","Sheet1");
        System.out.println(ExcelUtiles.getValue(1,1));
        System.out.println(ExcelUtiles.getValue(2,2));
        ExcelUtiles.setValue("New York",4,3);
        ExcelUtiles.setValue("20",4,4);
        for(int row=1; row<ExcelUtiles.getNumberOfRows(); row++){
            String age= ExcelUtiles.getValue(row,4);
            double ageint = Double.parseDouble(age);
            ExcelUtiles.setValue((ageint+1)+ "",row,4);

        }
    }
}
