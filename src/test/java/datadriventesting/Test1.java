package datadriventesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

import Locators.Basecalss;

public class Test1 extends Basecalss{
	@Test
	public void database() throws SQLException {
	//Step:1 Register to the database
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		
//Step:2 Connect to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wasa2sel","root","root");
	
//step:3 create sql query statement
		Statement statement = con.createStatement();
		String query="select * from logindetails";
	
//Step:4 execute query
		ResultSet result = statement.executeQuery(query);	
		while(result.next()) {
			String us = result.getString(1);
			String pwd = result.getString(2);
		
		
		driver.findElement(By.id("email")).sendKeys(us);
		driver.findElement(By.id("password")).sendKeys(pwd);
		
		}
		//Step:5 
		con.close();
		}
		
	}


