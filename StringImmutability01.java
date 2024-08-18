public class StringImmutability01 {
    public static void main(String[] args) {
        String a="rohit";
        a.concat("thakur");
        System.out.println(a);
        //string modify nhi ho sakta
        //pahle a->rohit
        //bad me concat() method
    }
}
