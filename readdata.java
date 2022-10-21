package excelfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readdata {
	@Test
	public void readData() throws IOException
	{
	FileInputStream fis=new FileInputStream("./testdata/readdata.xlsx");
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	Sheet s=wb.getSheet("data");
	Row r=s.getRow(5);
	Cell c=r.getCell(4);
	System.out.println(c.getStringCellValue());
	}

}
