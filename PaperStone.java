import java.util.Scanner;

public class PaperStone {
    public static void main(String[] args){
        double pi = 0;
        for (int i=1; i<=32677; i++) {
            // TODO
            pi += (Math.pow(-1, i%2+1) * 1/((double)(2*i-1)));
        }
        pi = 4*pi;
        System.out.println(pi);
    }
}

