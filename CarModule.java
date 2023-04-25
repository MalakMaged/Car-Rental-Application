public interface Car
{
    private String Brand;
    private int PricePerDay;
    private String Color;
    private int Number_Of_Seats;
    private String Model;
    private String Car_Status;
    private String Truck_Size;

    public void editCar(String Brand, String Model,String Car_Status)
    {

    }
    public void EditPricing(int PricePerDay)
    {

    }
}


public class Sedan implements Car
{
    
}
public class SUV implements Car
{
    
}
public class PickUpTruck implements Car
{
    
}
public class Invoice
{

}

public class Payment
{
    private Card CreditCard;
    private Invoice Invoice;
    private double PaymentAmount;
    public bool Authenticating_Payment()
    {

    }
    private Invoice CreateInvoice()
    {

    }
    public bool Payment(Card,PaymentAmount)
    {
        
    }
}