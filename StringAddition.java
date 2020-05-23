public String addStrings(String num1, String num2) {
        if(num1.length()==0) return num2;
        if(num2.length()==0) return num1;

        String res = "";
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry =0;
        while(i>=0 && j>=0){
            int s = Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(j))+carry;
            res += s%10;
            carry = s/10;

            i--;
            j--;
        }
        while(i>=0){
            int s = Character.getNumericValue(num1.charAt(i)) +carry;
            res += s%10;
            carry = s/10;
            i--;
        }
        while(j>=0){
            int s = Character.getNumericValue(num2.charAt(j)) +carry;
            res += s%10;
            carry = s/10;
            j--;
        }
        if(carry != 0){
            res += carry;
        }

        return new StringBuilder(res).reverse().toString();
    }
