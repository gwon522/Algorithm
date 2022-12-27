package beakjoon.class1.plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Scale {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Integer [] scale = new Integer [8];

        for (int i = 0; i<8; i++){
            scale[i]=Integer.parseInt(st.nextToken());
        }
        Integer [] asc = scale.clone();
        Integer [] desc = scale.clone();

        Arrays.sort(asc);
        Arrays.sort(desc, Collections.reverseOrder());

        String str = "";
        if(Arrays.equals(scale, asc)) {
            System.out.println("ascending");
        }
        else if(Arrays.equals(scale, desc)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
//        System.out.print(Arrays.equals(asc,scale)?"ascending":Arrays.equals(desc,scale)?"descending":"mixed");
    }
}
