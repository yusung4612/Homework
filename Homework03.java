public class Homework03 {

    public static void main(String[] args) {

        System.out.println("시작!");

        while(true) {

            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;

            if ((num1 + num2) != 5) {
                System.out.println(" ( " + num1 + " , " + num2 + " ) ");
            }else if (((num1 + num2) == 5)){
                System.out.println(" ( " + num1 + " , " + num2 + " ) ");
                System.out.println("끝!");
                break;
            }
        }
    }
}


