package generic;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.cellwalk.CellWalkContext;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ExcelUtilities {

	static final String filePath=".\\testdata\\hpdata.xlsx"; 
	/**
	 * @description readData method read the data from testdata.xlsx based on sheet, row and cell.
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	public static String readData
	(String sheetName, int rowNum, int cellNum) 
	{
		String value="";

		Workbook wb=null;
		try {
			wb = WorkbookFactory.create(new FileInputStream(new File(filePath)));
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Workbook wb = WorkbookFactory.create(new FileInputStream(new File(filePath)));  

		value = wb.getSheet(sheetName).getRow
				(rowNum).getCell(cellNum).getStringCellValue();	
		return value;
	}
}