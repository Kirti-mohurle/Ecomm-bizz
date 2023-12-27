package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import baseClass.BaseClass;

public class Excel_handling extends BaseClass{

	public Excel_handling() throws IOException {
		super();
		
	}
	public static String Excel_sheetpath ="../STP_magento/src/main/java/utility/STP_Credential.xlsx";
	public static Sheet sheet;
	public static Workbook workBook ;
	public static Object[][] getTestData(String sheetName) throws EncryptedDocumentException, IOException {
		
		FileInputStream fInput = new FileInputStream(Excel_sheetpath);
		
		 workBook = WorkbookFactory.create(fInput);
		
		 sheet = workBook.getSheet(sheetName);
		
		Object [][] dataObject = new Object [sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int r=0; r<sheet.getLastRowNum();r++) {
			for(int c=0; c<sheet.getRow(0).getLastCellNum(); c++) {
				
				dataObject [r][c] = sheet.getRow(r+1).getCell(c).toString();
				
			}
		}
		return dataObject;
		
	}

}
