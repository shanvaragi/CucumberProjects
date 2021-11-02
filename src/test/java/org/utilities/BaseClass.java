package org.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public  static Actions a;
	public static Robot r;
	public static void launchChrome() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void loadUrl(String url) {

		driver.get(url);

	}

	public static void winmax() {
		driver.manage().window().maximize();

	}

	public static void printTitle() {
		String title = driver.getTitle();
		System.out.println(title);


	}
	//returntype
	public static String titleReturn() {
		String title = driver.getTitle();
		return title;

	}
	public static void printCurrenturl() {
		System.out.println(driver.getCurrentUrl());

	}
	public static String currentUrlReturn() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	//webelement ref.sendkey("string")
	public static void fill(WebElement ele,String value) {
		ele.sendKeys(value);

	}

	public static void btnClick(WebElement ele) {
		ele.click();

	}
	public static void actionSendKeys(WebElement ele,String value) {
		a= new Actions(driver);
		a.sendKeys(ele,value).perform();

	}
	public static void actionClick(WebElement ele) {
		a= new Actions(driver);
		a.click(ele).perform();

	}
	public static void actionDoubleClick(WebElement ele) {
		a= new Actions(driver);
		a.doubleClick(ele).perform();

	}
	public static void actionContentClick(WebElement ele) {
		a= new Actions(driver);
		a.contextClick(ele).perform();

	}

	public static String getData(int rowNumber,int cellNumber) throws IOException {
		File f = new File("C:\\Users\\Hai\\eclipse-workspace\\CucumberProjects\\testData\\studentData.xlsx");
		FileInputStream fin = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("greens");
		Row row = s.getRow(rowNumber);
		Cell cell = row.getCell(cellNumber);
		int cellType = cell.getCellType();
		String value ="";
		if (cellType==1) {
			value = cell.getStringCellValue();

		}
		else if (cellType==0) {

			if (DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();

				SimpleDateFormat sim = new SimpleDateFormat();
				value = sim.format(d);

			}
			else {
				double d = cell.getNumericCellValue();
				long l =(long) d;
				value = String.valueOf(l);
			}



		}
		return value;

	}

	public static void robotMethod() throws AWTException {
		r= new Robot();
		for (int i = 0; i <3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}

	}

	public static void frameswitchto(WebElement ele) {
		driver.switchTo().frame(ele);

	}

	public static void closebrouserchrome() {
		driver.close();

	}
	public static void screenShot(String name) throws IOException {
		
		//takes screen Shot
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		
		File dsc = new File("C:\\Users\\Hai\\eclipse-workspace\\CucumberProjects\\target\\ScrrenShotAfter\\" + name + ".jpg");
		FileUtils.copyFile(src, dsc);
		


	}

}



