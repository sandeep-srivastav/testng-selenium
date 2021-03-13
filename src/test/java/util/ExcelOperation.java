package util;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public abstract class ExcelOperation implements IExcelReaderWriter {

    private String excelFileName = null;
    private String excelFilePath = null;
    private File excelFile = null;
    private FileInputStream fileInputStream;
    private XSSFWorkbook workbook = null;
    private XSSFSheet sheet = null;

    @Override
    public void createNewExcel(String excelFileName, String sheetName) throws IOException {
        excelFilePath = System.getProperty("user.dir") + "/src/test/resources/" + excelFileName;
        System.out.println("Path of the excel is --> "+ excelFilePath);
        excelFile = new File(excelFilePath);
        if(!excelFile.exists()){
            excelFile.createNewFile();
            workbook = new XSSFWorkbook();
            sheet = workbook.createSheet(sheetName);
        }
        else
            System.out.println("Name of the already present excel is -->" + excelFile.getName());

    }

    @Override
    public String readExcel(String excelFileName, String sheetName, int ronNum, int colNum) throws IOException {
        excelFilePath = System.getProperty("user.dir") + "/src/test/resources/" + excelFileName;
        //System.out.println("Path of the excel is --> "+ excelFilePath);
        excelFile = new File(excelFilePath);
        fileInputStream = new FileInputStream(excelFile);
        workbook = new XSSFWorkbook(fileInputStream);

        sheet = workbook.getSheet(sheetName);
        String testData = null;
        try {
            Cell cell = sheet.getRow(ronNum).getCell(colNum);
            CellType cellType = cell.getCellType();

            switch (cellType) {
                case STRING:
                    testData =  cell.getStringCellValue();
                    break;
                case NUMERIC:
                    testData = String.valueOf(cell.getNumericCellValue());
                    break;
                case BOOLEAN:
                    testData = String.valueOf(cell.getBooleanCellValue());
                    break;
            }
        } catch(NullPointerException eception) {
            eception.printStackTrace();
        }
        return testData;
    }

    @Override
    public HashMap<String, String> readExcel(String excelFileName, String sheetName, String keyValue) throws IOException {
        sheet = captureSheet(excelFileName, sheetName);
        int rowNum = 0;
        for(int i=0; i<=sheet.getLastRowNum(); i++){
            Row rowValue = sheet.getRow(i);
            Cell cellValue = rowValue.getCell(0);
            if(cellValue.toString().equalsIgnoreCase(keyValue)){
                rowNum = i; break;
            }
        }
        System.out.println("The row num for One is --> " + rowNum);
        Row keyRow = sheet.getRow(0);
        Row valueRow = sheet.getRow(rowNum);
        HashMap<String, String> testDataMap = new HashMap<>();
        for(int i=0; i< keyRow.getLastCellNum(); i++){
            testDataMap.put(keyRow.getCell(i).toString(), valueRow.getCell(i).toString());
        }
        System.out.println("The size of the Map is --> " + testDataMap.size());
        return testDataMap;
    }

    private XSSFSheet captureSheet(String excelFileName, String sheetName) throws IOException {
        excelFilePath = System.getProperty("user.dir") + "/src/test/resources/"  + excelFileName;
        excelFile = new File(excelFilePath);
        fileInputStream = new FileInputStream(excelFile);
        workbook = new XSSFWorkbook(fileInputStream);
        sheet = workbook.getSheet(sheetName);
        return sheet;
    }

    @Override
    public void writeIntoExcel(String excelFileName) {

    }

}
