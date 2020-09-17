package LuckyCarNo;
import java.util.*;

public class LuckyCarNumber {
	    private String lastFourDigits = null;
	    private int sum = 0;
	    private String result = null;
	    public String checkluckyNumber(String str) {
	        if ((str!= null)&&(!str.contentEquals(""))&&(str.matches("[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}"))) {
	            lastFourDigits = str.substring(str.length() - 4);
	            char[] ch = new char[lastFourDigits.length()];
	            for (int i = 0; i < lastFourDigits.length(); i++) {
	                ch[i] = lastFourDigits.charAt(i);
	            }
	            for (char c : ch) {
	                int a = Integer.parseInt(String.valueOf(c));
	                sum += a;
	            }
	            if (sum % 3 == 0) {
	                result = "It's a Lucky Number";
	                return result;
	            } else {
	                result = "It's not Lucky Number";
	                return result;
	            }
	        }
	        return "It's Invalid number";
	    }
	}
