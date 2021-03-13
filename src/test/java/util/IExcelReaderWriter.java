package util;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;

public interface IExcelReaderWriter {



    abstract void  createNewExcel(String excelFileName, String sheetName) throws IOException;

    abstract String readExcel(String excelFileName, String sheetName, int ronNum, int colNum) throws IOException;

    abstract HashMap<String, String> readExcel(String excelFileName, String sheetName, String Key) throws IOException;

    abstract void writeIntoExcel(String excelFileName);

    ArrayList<HashMap<String, String>> getDataFromExcel(String excelFileName, String sheetName, String Key) throws Exception;
}
