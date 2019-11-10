public class Main {

    static int myNumber = 1234;


    public static void main(String[] args) {

        System.out.println("Scoop");
        changeMyNumber();
        System.out.println("BP");



    }

    static public int changeMyNumber(){
        myNumber = 991;
        myNumber = 711;
        return myNumber;
    }

}
