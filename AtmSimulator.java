import java.util.Scanner;
public class AtmSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your PIN:");
        int pin = sc.nextInt();
        Account a = new Account();
        if(a.PIN == pin){
            while (true) {
                
                System.out.println("Choose any one from the below options: "+"\n"+
                " 1: Balance Enquiry"+"\n"+
                " 2: Cash Withdrawl"+"\n"+
                " 3: Pin Change"+"\n"+
                " 4: Exit");
                int option = sc.nextInt();
                
                switch (option) {
                    case 1:
                        a.BalanceEnquiry();
                        break;

                    case 2:
                        System.out.println("Enter amount to be withdrawn:");
                        int Amount = sc.nextInt();
                        a.CashWithdrawl(Amount);
                        break;
    
                    case 3:
                        System.out.println("Enter New Pin to Change pin:");
                        int NewPin = sc.nextInt();
                        a.ChangePin(NewPin);
                
                    case 4:
                       a.Exit();
                    default:
                        break;
                }
        }
        }else{
            System.out.println("Enter correct pin");
        }  
    }
}
class Account{
   final int AccountNum = 1122000033;
   int PIN = 2403;
   int Balance = 10000;
    public void BalanceEnquiry(){
        System.out.println("Account Balance is: "+Balance);
    }
    public void CashWithdrawl(int Amount){
        if(Amount <= Balance){
            System.out.println("Transaction is being processed.."+"\n"+ "Please wait");
            System.out.println("Please take your amount");
        }
        else{
            System.out.println("The amount you entered is less than balance");;
        }
    }
    public void ChangePin(int NewPin){
        int PIN = NewPin;
        System.out.println("Your New updated pin is: "+ PIN);
    }
     public void Exit(){
        System.exit(0);
     }
}   



