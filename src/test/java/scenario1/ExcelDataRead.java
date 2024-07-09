package scenario1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcelDataRead {
  @Test
  public void datafromfile() throws IOException 
  {
	  File f1=new File(System.getProperty("user.dir")+"//Testdata//data.xlsx");
	  FileInputStream fs=new FileInputStream(f1);
	  
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //number of rows
	  int rows=wb.getSheet("userdata").getPhysicalNumberOfRows();
	  System.out.println("Number of rows are: "+rows);
	  
	  //number of cells
	  int cells=wb.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
	  System.out.println("Number of columns are: "+cells);
	  
	  //create array as per size of file
	  Object data[][]=new Object[rows-1][cells];//2 ,2
	  for(int i=1;i<rows;i++)//rows
	  {
		  for(int j=0;j<cells;j++)
		  {
			  data[i-1][j]=wb.getSheet("userdata").getRow(i).getCell(j).getStringCellValue();
			  System.out.print(data[i-1][j]+ "   ");
		  }
		  System.out.println();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  //single data read
//	  String value=wb.getSheet("userdata").getRow(1).getCell(0).getStringCellValue();
//	  System.out.println(value);
	  
	  
//	  XSSFSheet sheet1=wb.getSheet("userdata");
//	  XSSFRow row1=sheet1.getRow(0);	  
//	  XSSFCell cell1=row1.getCell(0);
//	  
//	  String value=cell1.getStringCellValue();	  
//	  
//	  System.out.println(value);
//	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
