/* Scanner 사용*/
/*import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), m = sc.nextInt();
        int time = m-45;

        if(time>=0){}
        else {
            time+=60;
            if(h==0)
                h = 24;
            h--;
        }
        System.out.printf("%d %d", h, time);
    }
}
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*Bufferedreader 사용*/
public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());    //StringTokenizer

        int H, M;
        H = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int time = M-45;

        if(time>=0){}
        else {
            time+=60;
            if(H==0)
                H = 24;
            H--;
        }
        System.out.printf("%d %d", H, time);
    }
}