package com.project;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Comparing_Titles {
		
	public void Title_Checking(){
				System.setProperty("webdriver.chrome.driver", "D:\\selenium_qedge\\drivers\\chromedriver.exe");
				WebDriver obj=new ChromeDriver();
				obj.get("http://newtours.demoaut.com/");
				obj.manage().window().maximize();
				String expval="Welcome: Mercury Tours";
				String acval=obj.getTitle();
				if(expval.equals(acval)){
					System.out.println("expval:::"+expval+"\t"+"acval is:::::"+acval+"\t"+"title is matching");
				}
				else{
					System.out.println("expval:::"+expval+"\t"+"acval is:::::"+acval+"\t"+"title is nt matching");

				}
				
			obj.quit();
			}
			

			public static void main(String[] args) {
				// TODO Auto-generated method stubparing
				Comparing_Titles c=new Comparing_Titles();
			c.Title_Checking();
			
				

			}

		}

		

	



