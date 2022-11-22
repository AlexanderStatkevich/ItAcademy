package by.itacademy.jd2.academyproject.countdigittask;

public class CountDigitInString {
    public static int digitsInString(String s) {
        int i = Integer.parseInt(s.replaceAll("\\D", ""));
        return Integer.toString(i).length();
    }
}