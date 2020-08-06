package com.greens.CucumberProject;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static WebDriver driver;

	public static void launchBrowser(String Browser) {
		try {

			if (Browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\DUKIE\\.eclipse\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (Browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\DUKIE\\.eclipse\\Selenium\\Drivers\\firefoxdriver_win32\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void launchUrl(String Url) {
		try {
			driver.get(Url);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void enterText(WebElement element, String name) {
		try {

			element.sendKeys(name);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void Click(WebElement element) {
		try {
			element.click();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void takeScreenshot(String name) throws Throwable {
		try {

			TakesScreenshot tk = (TakesScreenshot) driver;
			File source = tk.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\DUKIE\\.eclipse\\Selenium\\Drivers\\Result\\" + name + ".png");
			FileUtils.copyFile(source, des);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dropDown(WebElement element, String options, String value) {

		Select s = new Select(element);
		try {

			if (options.equalsIgnoreCase("value")) {
				s.selectByValue(value);

			} else if (options.equalsIgnoreCase("index")) {
				int x = Integer.parseInt(value);
				s.selectByIndex(x);

			} else if (options.equalsIgnoreCase("Visible Text")) {
				s.selectByVisibleText(value);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void dropDowngetOptions(WebElement element) {
		try {
			Select s = new Select(element);
			List<WebElement> options = s.getOptions();
			for (WebElement x : options) {
				System.out.println(x.getText());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dropDowngetAll(WebElement element) {
		try {
			Select s = new Select(element);
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement c1 : allSelectedOptions) {
				System.out.println(c1.getText());

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void dropDownFirstSelectedOptions(WebElement element) {
		try {
			Select s = new Select(element);
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void isMultiple(WebElement element) {
		try {
			Select s = new Select(element);
			boolean b = s.isMultiple();
			System.out.println(b);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void actionClass(WebElement element, String options) {
		Actions ac = new Actions(driver);
		try {

			if (options.equals("movetoelement")) {
				ac.moveToElement(element).build().perform();

			} else if (options.equals("rightclick")) {
				ac.contextClick(element).build().perform();

			} else if (options.equals("doubleclick")) {
				ac.doubleClick(element).build().perform();

			} else if (options.equals("click")) {
				ac.click(element).build().perform();

			}

		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}

	public static void actionsforDrag(WebElement element, WebElement element1) {
		try {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(element, element1).build().perform();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void actionsforsendKeys(WebElement element, String value) {
		try {
			Actions ac = new Actions(driver);
			ac.sendKeys(element, value).build().perform();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void javaScriptforClick(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", element);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void javaScriptforscrollDown(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", element);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void javaScriptforscrollup(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false)", element);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void javascriptforScrollbywindow(int height, int width) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.srollBy(" + height + "," + width + ")");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void alertforSimpleandConfirm(String options) {
		try {

			Alert a = driver.switchTo().alert();
			if (options.equalsIgnoreCase("simple")) {
				a.accept();

			} else if (options.equalsIgnoreCase("confirm 1")) {
				a.accept();

			} else if (options.equalsIgnoreCase("confirm 2")) {
				a.dismiss();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void alertforPrompt(String value) {
		try {
			Alert a = driver.switchTo().alert();
			a.sendKeys(value);
			a.accept();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void parentWindow() {
		try {
			String parent = driver.getWindowHandle();
			System.out.println(parent);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void childWindow(String index) {
		try {
			Set<String> allwindows = driver.getWindowHandles();
			List<String> l = new ArrayList<String>(allwindows);
			int i = Integer.parseInt(index);
			driver.switchTo().window(l.get(i));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void frame(WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void robotClass(String options) throws Throwable {
		Robot r = new Robot();
		if (options.equalsIgnoreCase("downarrow")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if (options.equalsIgnoreCase("enterbutton")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

		} else if (options.equalsIgnoreCase("copy")) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_C);

		} else if (options.equalsIgnoreCase("paste")) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
		} else if (options.equalsIgnoreCase("cut")) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_X);
			r.keyRelease(KeyEvent.VK_X);

		} else if (options.equalsIgnoreCase("selectall")) {
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_A);
			r.keyRelease(KeyEvent.VK_A);

		}

	}

	public static void navigationCommands(String options, String Url) {
		try {

			if (options.equalsIgnoreCase("forward")) {
				driver.navigate().forward();

			} else if (options.equalsIgnoreCase("back")) {
				driver.navigate().back();

			} else if (options.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();

			} else if (options.equalsIgnoreCase("navigateTo")) {
				driver.navigate().to(Url);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void webDrivermethods(String options) {
		try {

			if (options.equalsIgnoreCase("close")) {
				driver.close();
			} else if (options.equalsIgnoreCase("quit")) {
				driver.quit();

			} else if (options.equalsIgnoreCase("gettitle")) {
				driver.getTitle();

			} else if (options.equalsIgnoreCase("getcurrrentUrl")) {
				driver.getCurrentUrl();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void webelementMethods(WebElement element, String options) {

		if (options.equalsIgnoreCase("isenabled")) {
			boolean enabled = element.isEnabled();
			System.out.println(enabled);

		} else if (options.equalsIgnoreCase("isselected")) {
			boolean selected = element.isSelected();
			System.out.println(selected);

		} else if (options.equalsIgnoreCase("isdisplayed")) {
			boolean displayed = element.isDisplayed();
			System.out.println(displayed);

		} else if (options.equalsIgnoreCase("getsize")) {

			Dimension size = element.getSize();
			System.out.println(size.getHeight());
			System.out.println(size.getWidth());

		} else if (options.equalsIgnoreCase("getlocation")) {
			Point location = element.getLocation();
			System.out.println(location.getX());
			System.out.println(location.getY());
		}

	}

	public static void implicitWait() {
		try {

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
