package newtours.github;

import static org.testng.Assert.fail;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class newtours {

	private WebDriver driver;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass
	public void setUp() throws Exception {

		switch (3) {
		// case 0:
		// System.out.println("Exploret");
		// System.setProperty("webdriver.ie.driver", "resource/IEDriverServer64.exe");
		// driver = new InternetExplorerDriver();
		// break;
		// case 1:
		// System.out.println("Opera");
		// System.setProperty("webdriver.chrome.driver", "resource/operadriver64.exe");
		// driver = new OperaDriver();
		// break;
		case 2:
			System.out.println("Firefox");
			System.setProperty("webdriver.gecko.driver", "resource/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case 3:
			System.out.println("Chrome");
			System.setProperty("webdriver.chrome.driver", "resource/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		default:
			break;
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}

	@Test
	public void funtion_global() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.name("userName")).click();
		driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("yendry");
		
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("yendry");
		
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
		Thread.sleep(1000);
	}

	@AfterClass
	public void tearDown() throws Exception {

		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}
}
/*****
 * 
 * // menu_administrativo_contable() throws Exception
 * driver.findElement(By.xpath("//i[2]")).click();
 * driver.findElement(By.xpath("//i[2]")).click(); //
 * driver.findElement(By.xpath("//li[1]/a/i[2]")).click(); //
 * driver.findElement(By.xpath("//li[1]/a/i[2]")).click(); Thread.sleep(2000);
 * // menu_cieeres_mensuales() throws Exception
 * driver.findElement(By.xpath("//li[2]/a/i[2]")).click();
 * driver.findElement(By.xpath("//li[2]/a/i[2]")).click(); Thread.sleep(2000);
 * // menu_contabilidad_central() throws Exception {
 * driver.findElement(By.xpath("//li[3]/a/i[2]")).click();
 * driver.findElement(By.xpath("//li[3]/a/i[2]")).click(); Thread.sleep(2000);
 * // menu_reaseguros() throws Exception {
 * driver.findElement(By.xpath("//li[4]/a/i[2]")).click();
 * driver.findElement(By.xpath("//li[4]/a/i[2]")).click(); Thread.sleep(2000);
 * 
 * // test_menu() throws Exception {
 * driver.findElement(By.xpath("//div/a/i")).click();
 * driver.findElement(By.xpath("//div/a/i")).click(); Thread.sleep(2000); //
 * test_iconos_4() throws Exception {
 * driver.findElement(By.xpath("//div[4]/div/i")).click();
 * driver.findElement(By.xpath("//div[4]/div/i")).click(); Thread.sleep(2000);
 * // test_iconos_3() throws Exception {
 * driver.findElement(By.xpath("//div[3]/div/i")).click();
 * driver.findElement(By.xpath("//div[3]/div/i")).click(); Thread.sleep(2000);
 * // test_iconos_2() throws Exception {
 * driver.findElement(By.xpath("//div[2]/div/i")).click();
 * driver.findElement(By.xpath("//div[2]/div/i")).click(); Thread.sleep(2000);
 * // test_iconos_1() throws Exception {
 * driver.findElement(By.xpath("//div[1]/div/i")).click();
 * driver.findElement(By.xpath("//div[1]/div/i")).click(); Thread.sleep(1000);
 * // Test de commit #canal y bitbutcket
 *****/