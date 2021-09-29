/**
 * 
 */
package com.avesdo.pages.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.avesdo.pages.AbstractPage;
import com.avesdo.utils.ConfigurationReader;

/**
 * @author Anil
 *
 */
public class UnAllocateUsingRightClick extends AbstractPage {
	
	private static final Logger log = LogManager.getLogger(BuyerSignDeal.class);
	
	public UnAllocateUsingRightClick(WebDriver driver, ConfigurationReader configurationReader){
		this.driver = driver;
		this.configurationReader = configurationReader;
		scriptFile = "Sales.xlsx";
		sheetName = "Right Click Unallocate";
		log.info("Right Click UnAllocate page with keywords from " + scriptFile + " sheet " + sheetName);
	}
	
	public boolean performUnAllocateAction() throws Exception{
		log.info("Perform UnAllocate Action ");
		return performOperation();
	}

}
