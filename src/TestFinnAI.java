package PACKAGE_NAME;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Parameters;

/* Class Name: TestFinnAI */
/*   Description: Class has 5 testmethods used for testing 5 different google query string. Each method takes query string as a parameter and open bing search */
/*                engine to search the query string. control will then pick up the first bing result and compare the domain with '.finn.ai'. Every method has */
/*				  assert which will check for desired domain. I have used testng.xml file to provide input parameters for each method. Also I have used */
/*				  TestNg framework for reporting the test result. 'emailable-report.html' can be referred for test results. */

public class TestFinnAI {

    SoftAssert sof = new SoftAssert();

    @Parameters({ "Query1" }) // PArameter passed from testng.xml
    @Test
    public void testMethod1(String param1) throws InterruptedException { // Test Method  for comparing  "Finn AI"
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        // Search query string
        driver.get("https://www.bing.com/?q="+param1); // search for query string
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#b_results:nth-of-type(1)>li>h2>a")).click(); // Click on first result
        Thread.sleep(2000);
        JavascriptExecutor j = (JavascriptExecutor) driver;
        String d = j.executeScript("return document.domain;").toString();
        sof.assertTrue(d.contains(".finn.ai")); // comparison for domain
        sof.assertAll();
        driver.close();
    }

    @Parameters({ "Query2" }) // Parameter passed from testng.xml
    @Test
    public void testMethod2(String param2) throws InterruptedException { // Test Method  for comparing  "Personal banking Chatbot"
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://www.bing.com/?q="+param2);  // search for query string
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#b_results:nth-of-type(1)>li>h2>a")).click(); // Click on first result
        Thread.sleep(2000);
        JavascriptExecutor j = (JavascriptExecutor) driver;
        String d = j.executeScript("return document.domain;").toString();
        sof.assertTrue(d.contains(".finn.ai")); // comparison for domain
        sof.assertAll();
        driver.close();

    }
    @Parameters({ "Query3" }) // PArameter passed from testng.xml
    @Test
    public void testMethod3(String param3) throws InterruptedException { // Test Method  for comparing  "Natural language chatbot"
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://www.bing.com/?q="+param3); // search for query string
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#b_results:nth-of-type(1)>li>h2>a")).click(); // Click on first result
        Thread.sleep(2000);
        JavascriptExecutor j = (JavascriptExecutor) driver;
        String d = j.executeScript("return document.domain;").toString();
        sof.assertTrue(d.contains(".finn.ai")); // comparison for domain
        sof.assertAll();
        driver.close();

    }

    @Parameters({ "Query4" }) // PArameter passed from testng.xml
    @Test
    public void testMethod4(String param4) throws InterruptedException { // Test Method  for comparing  "AI Powered banking chabot"
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://www.bing.com/?q="+param4); // search for query string
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#b_results:nth-of-type(1)>li>h2>a")).click(); // Click on first result
        Thread.sleep(2000);
        JavascriptExecutor j = (JavascriptExecutor) driver;
        String d = j.executeScript("return document.domain;").toString();
        sof.assertTrue(d.contains(".finn.ai")); // comparison for domain
        sof.assertAll();
        driver.close();

    }
    @Parameters({ "Query5" }) // PArameter passed from testng.xml
    @Test
    public void testMethod5(String param5) throws InterruptedException { // Test Method  for comparing  "AI platform for banking"
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(3000);
        driver.get("https://www.bing.com/?q="+param5); // search for query string
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#b_results:nth-of-type(1)>li>h2>a")).click(); // Click on first result
        Thread.sleep(2000);
        JavascriptExecutor j = (JavascriptExecutor) driver;
        String d = j.executeScript("return document.domain;").toString();
        sof.assertTrue(d.contains(".finn.ai"));// comparison for domain
        sof.assertAll();
        driver.close();
    }

}



