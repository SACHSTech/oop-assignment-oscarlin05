package netflix;
public class User {

    // Instance variables 
    private String strNickname;
    private int intAge;
    private boolean blnMaturity; 

    /**
     * 
     * @param nickname: the user's nickname 
     * @param age: the user's age
     * @param mature: the user's maturity 
     */
    public User(String nickname, int age, boolean mature) {
        strNickname = nickname;
        intAge = age;
        blnMaturity = mature;
    }

    /**
     * 
     * @return the nickname of the user 
     */
    public String getNickname() {
        return strNickname;
    }

    /**
     * 
     * @return the age of the user
     */
    public int getAge() {
        return intAge;
    }

    /**
     * 
     * @return the maturity of the user 
     */
    public boolean getMaturity() {
        return blnMaturity;
    }

}
