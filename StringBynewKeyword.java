public class StringBynewKeyword {
    public static void main(String[] args) {
        String a="rohit";//here one object
        String b=new String("rohit");//here other object
        //because new string object in non pool or heap memeory
        System.out.println(a==b);//false
        //kyoi dono alag a;ag object ko point kar kar rha hai
        
    }
}
