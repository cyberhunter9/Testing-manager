package org.A_PraveenBaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver= null;
	
	public static void browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}
	
	public static void url(String url) {
		driver.get(url);
	}
	
	public static void typeData(WebElement element, String data) {
		element.sendKeys(data);
		
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public static void clear(WebElement element)
	
	{
		element.clear();
	}

	
	public static void sleep(long MilliSeconds) throws InterruptedException
	{
		Thread.sleep(MilliSeconds);
		
	}
	
	public static WebElement findElementid(String id) {
		return driver.findElement(By.id(id));
		
	}
	
	public static WebElement findElementxpath(String xpath)
	{
		return driver.findElement(By.xpath(xpath));
		
	}
	
	public static List<WebElement> findElementsXpath(String xpath)
	{
		return driver.findElements(By.xpath(xpath));
		
	}
	
	public static WebElement findElementname(String name) {
		return driver.findElement(By.name(name));
		
	}
	
	public static WebElement findElementLinkText(String text) {
		return driver.findElement(By.linkText(text));
		
	}
	
	public static void browserClose()
	{
		driver.close();
	}
	public static void browserQuit()
	{
		driver.quit();
	}
	
	public static void selectValue(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public static void selectVisibleText(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}
	
	public static void windowHandles(int windowIndex) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> l = new ArrayList(windowHandles);
		driver.switchTo().window(l.get(windowIndex));
	}
	
	
//	public static void screenshotMethod() throws IOException
//	{
//		TakesScreenshot s=(TakesScreenshot)driver;
//		File source = s.getScreenshotAs(OutputType.FILE);
//		File dest = new File("C:\\Users\\balay\\Downloads\\Java\\hotel.jpeg");
//		FileUtils.copyFile(source, dest);
//	}
	
	public static void implicitylyWait(long Number, TimeUnit unit ) {
		driver.manage().timeouts().implicitlyWait(Number, unit);
		
	}
	
	//Read All Values from Excel
static String value;	
public static void ReadCellCredentialsFromExcel(int r , int c , String sh , String fpath) {
try {

File f = new File(fpath);

FileInputStream fis = new FileInputStream(f);


Workbook wb = new XSSFWorkbook(fis);

Sheet sheet = wb.getSheet(sh);

Row row = sheet.getRow(r);

Cell cell = row.getCell(c);
int cellType = cell.getCellType();

if(cellType==1)
{
String cellValue = cell.getStringCellValue();
System.out.println(cellValue);
}
else if(cellType==0) {
if (DateUtil.isCellDateFormatted(cell))
{
Date dateCellValue = (Date) cell.getDateCellValue();
SimpleDateFormat sc = new SimpleDateFormat("dd-MM-yyyy");
String value = sc.format(dateCellValue);
System.out.println(value);
}
else
{
double numValue = cell.getNumericCellValue();
long a =(long)numValue;
String.valueOf(a);

} } }



catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();}
}


//.................................................................................................

										//Read All Values from Excel
static String Value;
public static String ReadAllCredentialsFromExcel(int r , int c , String sh, String fpath) {
	try {
	
	File f = new File(fpath);
	
		FileInputStream fis = new FileInputStream(f);
	
	
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheet(sh);

		Row row = sheet.getRow(r);
			
		Cell cell = row.getCell(c);
		//@SuppressWarnings("deprecation")
		int cellType = cell.getCellType();
		
		if(cellType==1)
		{
			 Value = cell.getStringCellValue();
			System.out.println(Value);
		}
		else if(cellType==0) {
			if (DateUtil.isCellDateFormatted(cell))
			{
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sc = new SimpleDateFormat("dd/MM/yyyy");
				Value = sc.format(dateCellValue);
				System.out.println(Value);
		}
			else
			{
				double numValue = cell.getNumericCellValue();
				long a =(long)numValue;
				Value =String.valueOf(a);
				
			} } }
			
		
		
	 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	    return Value ;
}
	
	
	//.................................Write to excel 
	
	public static String writetoexcel(WebElement element,String sheetname,int datarow,int datacell)
	{
		String orderno = element.getAttribute("value");
		
		System.out.println(orderno);

		try 
		{
			String fpath="C:\\Users\\Praveen\\eclipse-workspace\\new\\AmericanExpress\\src\\test\\resources\\DAY 1 EXCEL.xlsx";
			
			File f=new File(fpath);
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet csheet=wb.createSheet(sheetname);
			Row crow = csheet.createRow(datarow);
			Cell ccell = crow.createCell(datacell);
			ccell.setCellValue(orderno);
			FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);
			System.out.println("Created");


		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orderno;
	}
	
	//....................................................String Write to excel 

	public static void stringWriteToExcel( String data ,String sheetname,int datarow,int datacell , String fpath)
	{
		
		
		

		try 
		{
			
			
			File f=new File(fpath);
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet csheet=wb.createSheet(sheetname);
			
			Row crow = csheet.createRow(datarow);
			Cell ccell = crow.createCell(datacell);
			ccell.setCellValue(data);
			FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);
			System.out.println("Created");


		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	//......................................Get Property for File
		public static String getProperty(String fpath, String key)
		{
		String value="" ;
		File f = new File(fpath);
		try {

		FileReader read = new FileReader(f);
		Properties prop=new Properties();
		prop.load(read);
		value =prop.getProperty(key);

		} catch (FileNotFoundException e) {
		e.printStackTrace();

		} catch (IOException e) {
		e.printStackTrace();

		}
		return value;
	}
		
		//.......................................Set Property for File
		
		public static void setProperty(String fpath, String key, String value)
		{
		
			try {
		File f = new File(fpath);
		
		FileWriter w= new FileWriter(f);
		
		Properties prop = new Properties ();
		prop.setProperty(key, value);
		prop.store(w," ");
		} 
			catch (IOException e) {
		e.printStackTrace();
		}

		}
		
	
}
