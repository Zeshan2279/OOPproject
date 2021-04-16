/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbe;

/**
 *
 * @author YDRGZM
 */
public class Validator {

    private static Validator v = new Validator();

    private Validator() {

    }

    public static Validator getInstance() {
        return v;
    }

    public boolean isValidStr(String str) {
        int len = str.length();
        if (len > 1) {
            for (int i = 0; i < len; i++) {
                if (!(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                    if (!(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                        if (!(str.charAt(i) == ' ')) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean isValidEmail(String EmailID) {
        if (EmailID.contains("@")) {
            for (int i = 0; i < EmailID.length(); i++) {
                if (!(EmailID.charAt(i) >= 'A' && EmailID.charAt(i) <= 'Z')) {
                    if (!(EmailID.charAt(i) >= 'a' && EmailID.charAt(i) <= 'z')) {
                        if (!(EmailID.charAt(i) >= '0' && EmailID.charAt(i) <= '9')) {
                            if (!(EmailID.charAt(i) >= '-')) {
                                return false;
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean isValidRegNumber(String reg) {
        if (reg.length() == 11) {
            for (int i = 0; i < 11; i++) {
                if (i < 4 || i > 7) {
                    if (!(reg.charAt(i) >= '0' && reg.charAt(i) <= '9')) {
                        return false;
                    }
                } else if (i == 5 || i == 6) {
                    if (!(reg.charAt(i) >= 'a' && reg.charAt(i) <= 'z')) {
                        if (!(reg.charAt(i) >= 'A' && reg.charAt(i) <= 'Z')) {
                            return false;
                        }
                    }
                } else {
                    if (reg.charAt(i)!='-') {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isValidContPhone(String num){
        if(num.length()==11){
            for(int i=0; i< 11;i++)
            {
                if(!(num.charAt(i)>='0'&&num.charAt(i)<='9')){
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
    
}
