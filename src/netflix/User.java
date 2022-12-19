package netflix;
import java.io.*;

public class User {

    // Instance variables 
    private String strNickname;
    private int intAge;
    private boolean blnMaturity; 

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    /**
     * set constructor 
     * @param nickname: the user's nickname 
     * @param age: the user's age
     * @param mature: the user's maturity 
     */
    public User(String strNickname, int intAge, boolean blnMaturity) {
        this.strNickname = strNickname;
        this.intAge = intAge;
        this.blnMaturity = blnMaturity;
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
     * @throws IOException read line for user nickname
     */
    public void setNickname() throws IOException {
            strNickname = input.readLine();
        }
    

    /**
     * 
     * @throws IOException read line for user age
     */
    public void setAge() throws IOException {
            intAge = Integer.parseInt(input.readLine());
        }
    
    /**
     * 
     * @return the maturity of the user 
     */
    public boolean getMaturity() {
        return blnMaturity;
    }

}
