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
}