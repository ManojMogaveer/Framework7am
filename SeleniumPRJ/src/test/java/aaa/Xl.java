package aaa;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Xl {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream f = new FileInputStream(".\\src\\test\\resources\\ManojMM.xlsx");
		
		Workbook wb=WorkbookFactory.create(f);
		
		Sheet s = wb.getSheet("Sheet1");
		
		Row r = s.getRow(1);
		
		Cell c = r.getCell(1);
		
		String value = c.getStringCellValue();
		
		System.out.println(value);

	}

}
