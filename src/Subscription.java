public class Subscription {

    private String strSubscriptionType;
    private int intAmountUsers;
    private int intBalance;

    public String getSubscriptionType() {
        return strSubscriptionType;
    }

    public int getAmountUsers() {
        return intAmountUsers;
    }

    public int getBalance() {
        return intBalance;
    }
    
    public String toString() {
        return "You have purchased" + strSubscriptionType + "with" + intAmountUsers + "amount of users.";
    }
}
