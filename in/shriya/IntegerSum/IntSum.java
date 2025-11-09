package in.shriya.IntegerSum;

public class IntSum {
    public int add(int a ,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        IntSum sum=new IntSum();
        System.out.println(sum.add(67,97));
        System.out.println(sum.add(65,65,65));
        System.out.println(sum.add(56.12, 52.15));
    }
     
}
