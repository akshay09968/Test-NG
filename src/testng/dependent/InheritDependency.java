package testng.dependent;

import org.testng.annotations.Test;
 
class SuperClass
{
    @Test
    public void OpenBrowser() {
        System.out.println("BrowserOpened");
    }
}
 
public class InheritDependency extends SuperClass
{
    @Test(dependsOnMethods = { "OpenBrowser" })
    public void LogIn() {
        System.out.println("Logged In");
    }
}
