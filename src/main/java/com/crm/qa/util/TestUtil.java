package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {

	 public static int PAGE_LOAD_TIMEOUT=50;
	 public static int IMPLICIT_WAIT=40;

   public void switchToFrame(){
	driver.switchTo().frame("mainpanel");
   }
   
}