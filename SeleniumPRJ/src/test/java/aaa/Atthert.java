package aaa;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Atthert {
@Test(priority = 1 )

public void createcontact()
{
	System.out.println("create contact");
}
@Test(priority = 2 )


public void modifycontact()
{
	System.out.println("modify contact");
}

@Test(priority = 3 )
public void deletecontact()
{
	System.out.println("delete contact");
}


}
