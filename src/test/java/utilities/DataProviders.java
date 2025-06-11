package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;



public class DataProviders {
	
	@DataProvider(name="loginData")
	public String [][] getLoginData() throws IOException{
		
		String path = "./testdata/OpenCart_LoginData.xlsx"; //Taking xl
		
		ExcelUtils ex = new ExcelUtils(path);
		
		int row = ex.getRowCount("Sheet1");
		int column = ex.getCellCount("Sheet1", 1);
		
		String [][] logindata = new String [row][column];
		
		for(int r=1;r<=row;r++) {
			for(int c=0;c<column;c++) {
				logindata[r-1][c]=ex.getCellData("Sheet1", r, c);
			}
		}
		return logindata;
	}

}
