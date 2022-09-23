public class Homework02 {

    public static void main(String[] args) {

        int x=10;
        int y=20;
        int z = (++x) + (y--); //x값을 1증가시키고 z값에 할당 + y값을 할당시키고 1 마이너스
        System.out.println(z); //결론적으로 11(x값)+20(y값)=31

    }

}
