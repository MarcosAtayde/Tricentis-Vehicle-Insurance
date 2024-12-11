package aplicacao.seguro.elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	
	// Homepage
	
	public By automobile = By.id("nav_automobile");
	
	// Vehicle Data
	
	public By make = By.id("make");
	public By engine = By.id("engineperformance");
	public By year = By.id("dateofmanufacture");
	public By seats = By.id("numberofseats");
	public By fuel = By.id("fuel");
	public By price = By.id("listprice");
	public By plate = By.id("licenseplatenumber");
	public By mileAge = By.id("annualmileage");
	public By btnNextVehicle = By.id("nextenterinsurantdata");
	
	// Insurance Data
	
	public By firstname = By.id("firstname");
	public By lastname = By.id("lastname");
	public By birthdate = By.id("birthdate");
	public By gender = By.xpath("//label[@class='ideal-radiocheck-label']");
	public By gendermale = By.xpath("//*[text()='Male']/span");
	public By genderfemale = By.id("//*[text()='Female']/span\"");
	public By address = By.id("streetaddress");
	public By country = By.id("country");
	public By zipcode = By.id("zipcode");
	public By city = By.id("city");
	public By occupation = By.id("occupation");
	public By hobbies = By.xpath("//p[@class='group']/*[3]");
	public By hobbiesSpeeding = By.xpath("//*[text()=' Speeding']/span");
	public By hobbiesBungeeJumping = By.xpath("//*[text()=' Bungee Jumping']/span");
	public By hobbiesCliffDiving = By.xpath("//*[text()=' Cliff Diving']/span");
	public By hobbiesSkyDiving = By.xpath("//*[text()=' Skydiving']/span");
	public By hobbiesOther = By.xpath("//*[text()=' Other']/span");
	public By website = By.xpath("//input[@name='Website']");
	public By picture = By.id("picture");
	public By btnOpen = By.id("Open");
	public By btnPrevinsurantData = By.id("preventervehicledata");
	public By btnNextInsurant = By.id("nextenterproductdata");
	
	// Product Data
	
	public By startDate = By.id("startdate");
	public By insuranceSum = By.id("insurancesum");
	public By meritRating = By.id("meritrating");
	public By damageInsurance = By.id("damageinsurance");
	public By euroProtection = By.xpath("//*[text()='Euro Protection']/span");
	public By legalDefenseInsurance = By.xpath("//*[text()='Legal Defense Insurance']/span");
	public By courtesyCar = By.id("courtesycar");
	public By btnPrevProductData = By.id("preventerinsurancedata");
	public By btnNextProductData = By.id("nextselectpriceoption");
	
	// Selection Price selectultimate_price Next »
	
	public By ultimatePrice = By.id("selectultimate_price");
	public By ultimate = By.xpath("//label[@class='choosePrice ideal-radiocheck-label'][4]");
	public By platinum = By.id("selectplatinum");
	public By gold = By.id("selectgold");
	public By silver = By.id("selectsilver");
	public By viewQuote = By.xpath("//*[text()='View Quote']");
	public By downloadQuote = By.xpath("//*[text()='Download Quote']");
	public By btnPrevPice = By.id("preventerproductdata");
	public By btnNextPrice = By.xpath("//button[@id='nextsendquote']");
	
	// Send Quote
	
	public By email = By.id("email");
	public By phone = By.id("phone");
	public By userName = By.id("username");
	public By password = By.id("password");
	public By confirmPassword = By.id("confirmpassword");
	public By comments = By.id("Comments");
	public By btnQuotePrev = By.id("prevselectpriceoption");
	public By bntQuotesend = By.id("sendemail");
	
	
	
	

}
