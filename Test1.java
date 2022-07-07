@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yamini.baratam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		//added comments
		//added new comments
	}
	
