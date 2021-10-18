import java.net.SocketOption;

public class Main {
    public static void main(String[] args) {
        int counter=0;
        for (int i = 10; i < 99 ; i++) {
            if (i * i >= 200) {
                if (i * i <= 300){
                counter = counter + 1;
                    System.out.println(counter);
                }
            }

        }
        System.out.println("exit");

    }
}
