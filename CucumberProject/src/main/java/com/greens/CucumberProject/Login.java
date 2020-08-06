package com.greens.CucumberProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base {
	@FindBy(xpath = "(//a[text()='Dresses'])[2]")
	public static WebElement SelectDress;
	@FindBy(xpath = "(//a[@class=\"product-name\"])[3]")
	public static WebElement EveningDress;
	@FindBy(xpath = "//i[@class=\"icon-plus\"]")
	public static WebElement Quantity;
	@FindBy(xpath = "//select[@name=\"group_1\"]")
	public static WebElement Size;
	@FindBy(xpath = "//a[@class=\"color_pick\"]")
	public static WebElement colour;
	@FindBy(xpath = "//span[text()='Add to cart']")
	public static WebElement Addtocart;
	@FindBy(xpath = "//a[@class=\"btn btn-default button button-medium\"]")
	public static WebElement ProceedtoCheckout;
	@FindBy(xpath = "(//a[@title=\"Proceed to checkout\"])[2]")
	public static WebElement proceedagain;
	@FindBy(xpath = "(//input[@type=\"text\"])[2]")
	public static WebElement emailid;
	@FindBy(id = "SubmitCreate")
	public static WebElement Createaccount;
	@FindBy(id = "uniform-id_gender1")
	public static WebElement gender;
	@FindBy(id = "customer_firstname")
	public static WebElement firstname;
	@FindBy(id = "customer_lastname")
	public static WebElement lastname;
	@FindBy(id = "passwd")
	public static WebElement pass;
	@FindBy(xpath = "//select[@id=\"days\"]")
	public static WebElement days;
	@FindBy(xpath = "//select[@id=\"months\"]")
	public static WebElement months;
	@FindBy(xpath = "//select[@id=\"years\"]")
	public static WebElement years;
	@FindBy(id = "company")
	public static WebElement Company;
	@FindBy(id = "address1")
	public static WebElement add1;
	@FindBy(id = "city")
	public static WebElement City;
	@FindBy(xpath = "//select[@id=\"id_state\"]")
	public static WebElement state;
	@FindBy(id = "postcode")
	public static WebElement postcode;
	@FindBy(xpath = "//select[@id=\"id_country\"]")
	public static WebElement Country;
	@FindBy(id = "phone_mobile")
	public static WebElement mobile;
	@FindBy(id = "alias")
	public static WebElement address;
	@FindBy(id = "submitAccount")
	public static WebElement register;
	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	public static WebElement proceedagain2;
	@FindBy(id = "cgv")
	public static WebElement agree;
	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	public static WebElement proceedagain3;
	@FindBy(xpath ="//a[@class=\"bankwire\"]" )
	public static WebElement paybybankwire;
	@FindBy(xpath = "//button[@class=\"button btn btn-default button-medium\"]")
	public static WebElement connfirmmyorder;
	@FindBy(xpath = "//a[@class=\"logout\"]")
	public static WebElement signout;

	public WebElement getSelectDress() {
		return SelectDress;
	}

	public void setSelectDress(WebElement selectDress) {
		SelectDress = selectDress;
	}

	public WebElement getEveningDress() {
		return EveningDress;
	}

	public void setEveningDress(WebElement eveningDress) {
		EveningDress = eveningDress;
	}

	public WebElement getQuantity() {
		return Quantity;
	}

	public void setQuantity(WebElement quantity) {
		Quantity = quantity;
	}

	public WebElement getSize() {
		return Size;
	}

	public void setSize(WebElement size) {
		Size = size;
	}

	public WebElement getColour() {
		return colour;
	}

	public void setColour(WebElement colour) {
		this.colour = colour;
	}

	public WebElement getAddtocart() {
		return Addtocart;
	}

	public void setAddtocart(WebElement addtocart) {
		Addtocart = addtocart;
	}

	public WebElement getProceedtoCheckout() {
		return ProceedtoCheckout;
	}

	public void setProceedtoCheckout(WebElement proceedtoCheckout) {
		ProceedtoCheckout = proceedtoCheckout;
	}

	public WebElement getProceedagain() {
		return proceedagain;
	}

	public void setProceedagain(WebElement proceedagain) {
		this.proceedagain = proceedagain;
	}

	public WebElement getEmailid() {
		return emailid;
	}

	public void setEmailid(WebElement emailid) {
		this.emailid = emailid;
	}

	public WebElement getCreateaccount() {
		return Createaccount;
	}

	public void setCreateaccount(WebElement createaccount) {
		Createaccount = createaccount;
	}

	public WebElement getGender() {
		return gender;
	}

	public void setGender(WebElement gender) {
		this.gender = gender;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

	public WebElement getDays() {
		return days;
	}

	public void setDays(WebElement days) {
		this.days = days;
	}

	public WebElement getMonths() {
		return months;
	}

	public void setMonths(WebElement months) {
		this.months = months;
	}

	public WebElement getYears() {
		return years;
	}

	public void setYears(WebElement years) {
		this.years = years;
	}

	public WebElement getCompany() {
		return Company;
	}

	public void setCompany(WebElement company) {
		Company = company;
	}

	public WebElement getAdd1() {
		return add1;
	}

	public void setAdd1(WebElement add1) {
		this.add1 = add1;
	}

	public WebElement getCity() {
		return City;
	}

	public void setCity(WebElement city) {
		City = city;
	}

	public WebElement getState() {
		return state;
	}

	public void setState(WebElement state) {
		this.state = state;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public void setPostcode(WebElement postcode) {
		this.postcode = postcode;
	}

	public WebElement getCountry() {
		return Country;
	}

	public void setCountry(WebElement country) {
		Country = country;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public void setMobile(WebElement mobile) {
		this.mobile = mobile;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getRegister() {
		return register;
	}

	public void setRegister(WebElement register) {
		this.register = register;
	}

	public WebElement getProceedagain2() {
		return proceedagain2;
	}

	public void setProceedagain2(WebElement proceedagain2) {
		this.proceedagain2 = proceedagain2;
	}

	public WebElement getAgree() {
		return agree;
	}

	public void setAgree(WebElement agree) {
		this.agree = agree;
	}

	public WebElement getProceedagain3() {
		return proceedagain3;
	}

	public void setProceedagain3(WebElement proceedagain3) {
		this.proceedagain3 = proceedagain3;
	}

	public WebElement getPaybybankwire() {
		return paybybankwire;
	}

	public void setPaybybankwire(WebElement paybybankwire) {
		this.paybybankwire = paybybankwire;
	}

	public WebElement getConnfirmmyorder() {
		return connfirmmyorder;
	}

	public void setConnfirmmyorder(WebElement connfirmmyorder) {
		this.connfirmmyorder = connfirmmyorder;
	}

	public WebElement getSignout() {
		return signout;
	}

	public void setSignout(WebElement signout) {
		this.signout = signout;
	}

	public Login() {
		PageFactory.initElements(driver, this);
	}

}
