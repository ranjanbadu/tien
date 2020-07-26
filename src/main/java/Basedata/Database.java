package Basedata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Database{
	public static void main(String[]args) throws Exception {
	Database d = new Database();
	ArrayList dat= d.data("stored", "tool");
	System.out.println(dat.get(1));
		
		
	}
	public ArrayList data (String rowname,String colname) throws Exception {
	ArrayList<String>list = new ArrayList<String>();
	FileInputStream fis=new FileInputStream("E:\\maven.xlsx");
	XSSFWorkbook ex = new XSSFWorkbook(fis);
	int sheet =ex.getNumberOfSheets();
	for(int i =0;i<sheet;i++) {
		if(ex.getSheetName(i).equalsIgnoreCase("sheet")) {
			XSSFSheet st = ex.getSheetAt(i);
			Iterator<Row>rows=st.iterator();
			Row r= rows.next();
			Iterator<Cell>cl=r.cellIterator();
			int col=0;
			int k =0;
			while(cl.hasNext()) {
				Cell c= cl.next();
				if(c.getStringCellValue().equalsIgnoreCase(rowname)) {
					col=k;
				}
				k++;
			}
			while(rows.hasNext()) {
				Row rt = rows.next();
				if(rt.getCell(col).getStringCellValue().equalsIgnoreCase(colname)) {
			        Iterator <Cell> t =rt.cellIterator();
			        while(t.hasNext()) {
			        	Cell cat=t.next();
			        	if(cat.getCellType()==CellType.STRING) {
			        		list.add(cat.getStringCellValue());
			        	}else {
			        		list.add(NumberToTextConverter.toText(cat.getNumericCellValue()));
			        	}
			        	
			        }
				}
				
		}
		
		}
	
	}
	return list;
}

}
