package com.bunnycart.StepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bunnycart.Browser.browser;
import com.bunnycart.Pages.bunnycartPage2;
import com.bunnycart.ScreenShot.bunnycartcapture;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class scenario2 extends browser {
	@Then("User clicks on Sign in")
	public void user_clicks_on_sign_in() {
	    bunnycartPage2.clickSignIn();
	}

	@And("User enters the Sign in datas")
	public void user_enters_the_sign_in_datas(DataTable dataTable) throws Exception {
		List<List<String>> credentials = credentials(
				"C:\\Users\\M.Sajin Anto\\eclipse-workspace\\Bunnycart\\src\\test\\resources\\bunnycart datas.xlsx");
		
		dataTable = DataTable.create(credentials);
		System.out.println(dataTable.cell(0, 0));
		System.out.println(dataTable.cell(0, 1));
		bunnycartPage2.enterEmail(dataTable.cell(0, 0));
		bunnycartPage2.enterPassword(dataTable.cell(0, 1));
		
		  
	}


	public static List<List<String>> credentials(String excelFilePath) throws Exception {
		List<List<String>> credentials = new ArrayList<>();
		FileInputStream file = new FileInputStream(new File(excelFilePath));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		Sheet sheet = workbook.getSheetAt(0);
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			List<String> rowData = new ArrayList<>();
			if(row!=null) {
				for(int j=0;j<row.getLastCellNum();j++) {
					Cell cell=row.getCell(j);
					if(cell!=null) {
						rowData.add(cell.getStringCellValue());
					}else {
						rowData.add("");
					}
				}
			}
		credentials.add(rowData);
		}
	workbook.close();
	return credentials;
	}
	    

	@And("User clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {
	    bunnycartPage2.clickSignInButton();
	}

	@And("User search for a product")
	public void user_search_for_a_product() throws Exception {
		Thread.sleep(2000);
		bunnycartPage2.enterSearchProduct("Duckweed");
	}

	@Then("User select a product")
	public void user_select_a_product() throws Exception {
		
	    bunnycartPage2.clickProduct();
	}

	@And("User add a product to cart")
	public void user_add_a_product_to_cart() throws Exception {
		
	  bunnycartPage2.clickAddToCart();
	}

	@And("User close the browser")
	public void user_close_the_browser() {
	    browser.closeBrowser();
	}


}
