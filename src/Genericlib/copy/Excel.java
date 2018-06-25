package Genericlib.copy;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements Constant
{
	public static String excelSheet( String sheet,int r, int c,String path)
	{
		String s = "";
		try {
			FileInputStream f = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(f);
			s =	wb.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
			}
		catch (Exception e) 
			{
			e.printStackTrace();
			}
		return s;
	}
}
