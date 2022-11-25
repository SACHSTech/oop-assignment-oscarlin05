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


}
