package com.qa.testscripts;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC001 extends TestBase {

	@Test(priority = 2)
	public void dashboardVerification() {
		assertTrue(driver.getCurrentUrl().contains("dashboard"));
		DemoPage.getAdminLink().click();
		assertTrue(DemoPage.getUserManagmentLink().isDisplayed());
		assertTrue(DemoPage.getJobLink().isDisplayed());
		assertTrue(DemoPage.getOrganizationLink().isDisplayed());
		assertTrue(DemoPage.getQualificationsLink().isDisplayed());

		DemoPage.getDashboardLink().click();
		System.out.println("Dashboard Heading: " + driver.findElement(By.xpath("//div[@class='head']")).getText());

	}

	@Test(priority = 1)
	public void login() {
		System.out.println("Title of the website: " + driver.getTitle());

		DemoPage.getUsernameInput().sendKeys("Admin");
		DemoPage.getPasswordInput().sendKeys("admin123");
		DemoPage.getLoginButton().click();

	}

	@Test(priority = 3)
	public void pimScenario() throws InterruptedException {

		DemoPage.getPIMLink().click();
		Thread.sleep(5000);
		DemoPage.getEmployeeNameInput().clear();
		DemoPage.getEmployeeNameInput().sendKeys("Linda Anderson");
		Thread.sleep(5000);

	}

}