package PhoneNum;
import java.util.Objects;
public class PhoneNumber {

    private String areaCode;
    private String localNumber;

    public PhoneNumber(String areaCode, String localNumber) {
        if(!checkNumberLength(areaCode))
            throw new IllegalArgumentException("The input data is incorrect");
        if(!checkNumberLength(localNumber))
            throw new IllegalArgumentException("The input data is incorrect");
        setAreaCode(areaCode);
        setLocalNumber(localNumber);

    }

    private boolean checkNumberLength(String number) {
        if(number == null || number.length() == 0)
            return false;
        int length = 0;
        while(length < number.length() && Character.isDigit(number.charAt(length)))
            length++;
        return length == number.length();
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setLocalNumber(String localNumber) {
        this.localNumber = localNumber;
    }
    public String getAreaCode() {
        return areaCode;
    }

    public String getLocalNumber() {
        return localNumber;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof PhoneNumber))
            return false;
        PhoneNumber number = (PhoneNumber)o;
        return this.areaCode.equals(number.areaCode) && this.localNumber.equals(number.localNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, localNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(').append(areaCode).append(')').append(getLocalNumber().replaceFirst("(\\d{2,3})(\\d{2})(\\d{2})", "$1-$2-$3"));

        return sb.toString();

    }
}
