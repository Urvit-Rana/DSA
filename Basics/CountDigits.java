//781. Count all Digits of a Number
package Basics;
//striver Dsa series 
class CountDigits {
    public int countDigit(int n) {
         int num=0;
        if(n==0){
            return 1;
        }
         while(n!=0){
                    n=n/10;
                    num++;
                   }
                   return num;
    }
    public static void main(String args[]){
        CountDigits s=new CountDigits();
        System.out.print(s.countDigit(010));
    }
}