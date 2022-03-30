public class Recursive01 {
    public static void printNUmber(int number){
        if(number<=10){
            System.out.println(number);
            number++;
            printNUmber(number);
        }
    }

    public static void main(String[] args) {
        printNUmber(0);
    }
}
