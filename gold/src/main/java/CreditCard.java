//BEGINNING OF CREDITCARD CLASS OF GOLD-1
public class CreditCard {
    private String name;
    private int amt;
    private String email;
    private int balance;
    private int limit;
    public CreditCard(String name, String email, int balance, int limit){
        this.name = name;
        this.email= email;
        this.balance = balance;
        this.limit = limit;
    }
    public CreditCard(String name, int limit){
        this.name = name;
        this.limit = limit;
    }
    public CreditCard(String name, String email, int limit){
        this.name = name;
        this.email= email;
        this.limit = limit;
    }
    //SETTERS AND GETTERS
    public void setName(String rname){
       name = rname;
    }
    public String getName(String rname){
        name = rname;
        return name;
    }

    public void setEmail(String remail){
        email = remail;
    }
    public String getEmail(String remail){
        email = remail;
        return email;
    }

    public void setBalance(int rbalance){
        balance = rbalance;
    }
    public int getBalance(int rbalance ){
        balance = rbalance;
        return balance;
    }
    public void setLimit(int rlimit){
        limit = rlimit;
    }
    public int getLimit(int rlimit ){
        limit = rlimit;
        return limit;
    }
    //END OF SETTERS AND GETTERS

    public int increaseBalance(int amount){
        amt= amount;
        if(amount + balance > limit){
            balance = balance + 0;
        }
        else{
            balance = amount + balance;
        }
        return balance;
    }
    @Override
    public String toString(){
return"Balance: " + balance + "\n"+
        "Name: " + name+  "\n"+
        "Email: " + email + "\n" +
        "Credit Limit: " + limit;
    }
} //END OF CREDITCARD CLASS OF GOLD-1
