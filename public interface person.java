public interface person
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
public interface Car
{
    private String Brand;
    private int PricePerDay;
    private String Color;
    private int Number_Of_Seats;
    private String Model;
    private String Car_Status;

    public void editCar(String Brand, String Model,String Car_Status)
    {

    }
    public void EditPricing(int PricePerDay)
    {
        
    }
}