package basePackage;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass {
	
	
	public static WebDriver driver;
	//builds a new report using the html template 
	
	/*
	
    ExtentHtmlReporter htmlReporter;
    
    ExtentReports extent;
    //helps to generate the logs in test report.
    ExtentTest test; 
    
    */
	
	@BeforeTest
	public void setUp()
	{
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		
		/*
		
		
		//=========================extent report=====================================
				// initialize the HtmlReporter
		        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
		        
		        //initialize ExtentReports and attach the HtmlReporter
		        extent = new ExtentReports();
		        extent.attachReporter(htmlReporter);
		        
		        //extent.config(new File(System.getProperty("user.dir")+"\\extent-config.xml");
		                
		        //configuration items to change the look and feel
		        //add content, manage tests etc
		        
		        htmlReporter.config().setChartVisibilityOnOpen(true);
		        htmlReporter.config().setDocumentTitle("Extent Report Demo");
		        htmlReporter.config().setReportName("Test Report");
		        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		        htmlReporter.config().setTheme(Theme.STANDARD);
		        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		
		*/
		
	}
	
	@AfterMethod
	
	/*
    public void getResult(ITestResult result) {
        if(result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
            test.fail(result.getThrowable());
        }
        else if(result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
        }
        else {
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
            test.skip(result.getThrowable());
        }
    }
    
    */
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		
		//extent.flush();
	}

}
