public class User {
    private String strNickname;
    private int intAge;
    private boolean blnMaturity; 


    public User(String nickname, int age, boolean mature) {
        strNickname = nickname;
        intAge = age;
        blnMaturity = mature;
    }

    public String getNickname() {
        return strNickname;
    }

    public int getAge() {
        return intAge;
    }

    public boolean getMaturity() {
        return blnMaturity;
    }

    public void setNickname(String strNickname) {
        this.strNickname = strNickname;
    }

    public void setMaturity(boolean blnMaturity) {
        this.blnMaturity = blnMaturity;
    }
}
