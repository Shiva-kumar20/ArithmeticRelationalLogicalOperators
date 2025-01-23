public class Operators {
    //arithmetic , relational ,logical operators 
    public static void main(String[] args) {
        int a =10;
        int b =20;
        //arithmetic 
        System.out.println("addition of a and b is "+(a+b));
        System.out.println("substraction of a and b is "+(a-b));
        System.out.println("multiplication of a and b is "+(a*b));
        System.out.println("division of a and b is "+(a/b));
        System.out.println("");
        //relational 
        System.out.println((a>b)?"a is bigger":"b is bigger");
        System.out.println((a<b)?"b is bigger":"a is bigger");
        System.out.println((a>=b)?"a is bigger":"b is bigger");
        System.out.println((a<=b)?"b is bigger":"a is bigger");
        System.out.println((a==b)+"a is equal to b ");
        System.out.println((a!=b)+"sorry ");
        System.out.println();
        //logical  operators 
        System.out.println(((a>=10)&&(b>=20))+"both the values are greater than 10");
        System.out.println(((a>=10)||(b>=20))+"may be one or two values are greater than 10");
        System.out.println(!(a>=10)+"condition works perfectly");

    }
}
