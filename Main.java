import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float v1 = 2;//公升
        float v2 = 900f;//公克

        System.out.println(Math.round(v1*0.26418f*10f)/10f);//公升轉加侖
        System.out.println(Math.round(v2/600*10f)/10f);//公克轉公斤
        Scanner scn = new Scanner(System.in);




    }
}
