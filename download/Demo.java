package download;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.xdevapi.Statement;

public class Demo {

	public static void main(String[] args) throws SQLException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreen\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		String host="localhost";
		int port=3306;
Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qadb", "root", "Bhavani123");
java.sql.Statement st=con.createStatement();	
ResultSet Q=st.executeQuery("Select * From Employee where LastName='Chittooru'");
while (Q.next())
{
driver.findElement(By.id("username")).sendKeys(Q.getString("FirstName"));
}
	System.out.println("successfully completed");		
}
}
