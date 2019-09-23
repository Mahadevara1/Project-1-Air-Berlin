package org.maha.Domain;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DomainSample extends DomainBase {
	public static void main(String[] args) throws Throwable {
		
		launchBrowser();
		
		load("https://www.alternativeairlines.com/air-berlin");
		WebElement close = driver.findElement(By.xpath("//button[@id='google-signin-close']"));
	close.click();
driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 WebElement single = driver.findElement(By.xpath("//span[text()='Single']"));
		 single.click();
		 Thread.sleep(2000);
		 WebElement from = driver.findElement(By.xpath("//input[@id='flight-search-departure-input']"));
		 from.click();
		 from.sendKeys("sha");
		 Actions acc=new Actions(driver);
	 Thread.sleep(2000);
	 WebElement source = driver.findElement(By.xpath("//div[text()='Shanghai - Shanghai Hongqiao International']"));
		 acc.moveToElement(source).perform();
		 source.click();
		 
		 WebElement to = driver.findElement(By.xpath("//input[@id='flight-search-arrival-input']"));
	 to.click();
		 to.sendKeys("Ber");
		 
	 Thread.sleep(2000);
	 WebElement to1 = driver.findElement(By.xpath("//div[@class='autocomplete-suggestion autocomplete-selected']"));
	 acc.moveToElement(to1).perform();
	JavascriptExecutor jk1=(JavascriptExecutor)driver;
		  jk1.executeScript("arguments[0].click()",to1);
		 to1.click();
		 
		 
		 
		 
		

	     WebElement date = driver.findElement(By.xpath("(//input[@name='departureDate'])[1]"));
	    	btnclick(date);	 
	    	//Thread.sleep(2000);
	    	
	    	WebElement dateselect = driver.findElement(By.xpath("(//span[@class='day-cell'])[4]"));
	    	
	    	btnclick(dateselect);	
	    	//WebElement returnDate = driver.findElement(By.xpath("(//input[@name='returnDate'])[1]"));
		    	//btnclick(returnDate);	
		    	
		    	//Thread.sleep(5000);
		    	//WebElement returndateselect = driver.findElement(By.xpath("(//span[@class='day-cell'])[27]"));
		    	//JavascriptExecutor jk=(JavascriptExecutor)driver;
				//  jk.executeScript("arguments[0].click()",returndateselect);
		    	
		    	//btnclick(returndateselect);
		    	//Thread.sleep(2000);
		    	WebElement cabinclass = driver.findElement(By.xpath("//input[@id='flight-search-travellers-toggle']"));
		    	btnclick(cabinclass);
		    	WebElement passenger = driver.findElement(By.xpath("//select[@class='flight-search-class-input data-hj-whitelist']"));
		    	Select s = new Select( passenger);
		    	s.selectByVisibleText("Economy");
		    	//WebElement passenger = driver.findElement(By.xpath("//select[@class='flight-search-class-input data-hj-whitelist']"));
		    	btnclick(passenger);
		    	WebElement done = driver.findElement(By.xpath("//a[text()='Done']"));
		    	
		    	btnclick(done);
              WebElement search = driver.findElement(By.xpath("//button[text()='Search Flights']"));
		    	
		    	btnclick(search);   
		    	WebElement select1 = driver.findElement(By.xpath("(//ins[@class='iCheck-helper'])[60]"));
		    	btnclick(select1);
		    	WebElement confirm = driver.findElement(By.xpath("(//button[text()='Confirm Selection '])[1]"));
		    	//btnclick(confirm);
		    	jk1.executeScript("arguments[0].click()",confirm);
				
				 WebElement fname = driver.findElement(By.xpath("//input[@id='first_name_a1']"));
					fill(fname,getData(1,0));
					 WebElement lname = driver.findElement(By.xpath("//input[@id='last_name_a1']"));
						fill(lname,getData(1,1));
						WebElement tit= driver.findElement(By.xpath("//select[@id='title_a1']"));
						//btnclick(tit);
						// WebElement title= driver.findElement(By.xpath("//input[@id='last_name_a1']"));
						
						Select s1 = new Select( tit);
				    	s1.selectByVisibleText("Mrs");
				    	//btnclick(tit); 
				    	WebElement day= driver.findElement(By.xpath("//select[@id='dob_day_a1']"));
				    	Select s2 = new Select( day);
				    	s2.selectByVisibleText("5");
				    	
				    	WebElement month= driver.findElement(By.xpath("//select[@id='dob_month_a1']"));
				    	Select s3 = new Select(month);
				    	s3.selectByVisibleText("November");
				    	
				    	WebElement year= driver.findElement(By.xpath("//select[@id='dob_year_a1']"));
				    	Select s4 = new Select( year);
				    	s4.selectByVisibleText("1992");
				    	
				    	 WebElement name = driver.findElement(By.xpath("//input[@id='contact_first_name']"));
							fill(name,getData(1,2));
							
							 WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
								fill(email,getData(1,3));
								
								WebElement phone = driver.findElement(By.xpath("//input[@id='number']"));
								fill(phone,getData(1,4));
								
								WebElement confirmemail = driver.findElement(By.xpath("//input[@id='confirm_email']"));
								fill(confirmemail,getData(1,5));
								
								WebElement seat= driver.findElement(By.xpath("//span[@id='seat_selection_cmd_text']"));
								btnclick(seat);
								

								WebElement seatsel= driver.findElement(By.xpath("(//button[@class='src-components-__Seat-module___seat src-components-__GlobalStyles-module___size_1 src-components-__Seat-module___seat undefined '])[18]"));
								btnclick(seatsel);
								
								
								WebElement next= driver.findElement(By.xpath("//button[text()='Next Flight']"));
								jk1.executeScript("arguments[0].click()",next);
								//btnclick(next);
								
								WebElement cont= driver.findElement(By.xpath("(//button[text()='Continue'])[2]"));
								jk1.executeScript("arguments[0].click()",cont);


							
							
				    	
		    	
		    	
		    	
		    	
	}}