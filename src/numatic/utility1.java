package numatic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class utility1 
{

	
static Sheet sh;
	
	//@Author: Sagar varpe
	//use: To get test data from excel sheet
	//need to pass 2 inputs: 1.rowindex, 2.colindex
	
	public static String GetTestData (int rowindex, int colindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("F:\\DATA.xlsx");
	    sh = WorkbookFactory.create(file).getSheet("Sheet1"); 
	    String value = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
	    return value;
	}
}
