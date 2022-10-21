package excelfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Writedata {
	
	@Test
	public void writedatamethod() throws IOException
	{
		FileInputStream fis=new FileInputStream("./testdata/readdata.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		Sheet s=wb.getSheet("data");
		//Rows r=s.createRow(4);
		//Cell c=r.
		
	}

}
