
public interface Person
{

    private String UserName;
    private String Password;
    private String Address;
    private int ID;

    public bool Login(String UserName,String Password)
    {
       this.UserName=UserName;
       this.Password=Password; 
    }

    public void ChangePassword(String Password,String NewPassword)
    {
       if(this.Password==Password)
       {
        Password=NewPassword;
       }
    }

    public void EditUser(String UserName)
    {
       this.UserName=UserName;
    }
}



public interface Actions
{
    public bool EditOrderState();
    public bool ChangeCarStatus();
    public void DailyReports();
    public void AddCar();
    public void RemoveCar();
}


public interface AdditionalActions
{
    public void Generate_Daily_Reports();
    public void Generate_Monthly_Reports();
    public void Show_Daily_Reports();
    public void Show_Monthy_Reports();
   
}
public class Manager implements Actions, Person 
{

    public bool EditOrderState()
    {

    }
    public bool ChangeCarStatus(Car car)
    {

    }
    public void DailyReports()
    {

    }
    public void AddCar(String CerType)
    {

    }
    public void RemoveCar(String CerType)
    {

    }
}

public class Admin  implements Actions, Person, AdditionalActions
{

    public bool EditOrderState()
    {

    }
    public bool ChangeCarStatus(Car car)
    {

    }
    public void DailyReports()
    {

    }
    public void AddCar(String CerType)
    {

    }
    public void RemoveCar(String CerType)
    {

    }
    public void Generate_Daily_Reports()
    {

    }
    public void Generate_Monthly_Reports()
    {

    }
    public void Show_Daily_Reports()
    {

    }
    public void Show_Monthy_Reports()
    {
        
    }
}

public class User
{
    private int Phone_Number;
    

}
