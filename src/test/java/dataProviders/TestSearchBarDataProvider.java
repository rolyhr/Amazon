package dataProviders;

import baseAPI.DataReader;
import testBase.TestBase;
import java.io.IOException;

public class TestSearchBarDataProvider extends TestBase {

    static String path = System.getProperty("user.dir") + "/src/test/resources/TestData/AmazonTestData.xlsx";

//    public static Object[][] getValidSearchBarTestData() throws IOException {
//
//        dataReader = new DataReader();
//        String sheetName = "TestData";
//        Object[][] testData = dataReader.fileReaderArrayStringArraysXSSF(path,sheetName);
//        return testData;
//
//    }

    public static String[][] getValidSearchBarTestData() throws IOException {

        dataReader = new DataReader();
        String sheetName = "TestData";
        String[][] testData = dataReader.fileReaderArrayStringArraysXSSF(path,sheetName);
        return testData;
    }
}
