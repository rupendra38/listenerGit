package formFill;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IretryAna implements IRetryAnalyzer{

	
	int a=1;
	
	
	
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(a<6)
		{
			++a;
			return true;
		}
		
		return false;
	}

}
