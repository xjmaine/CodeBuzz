import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class RandN{

    public static void main(String[] args){
        System.out.println( randomWithRange(60, 98));
    }

    private static int randomWithRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max should be > min");
		}

		for(int i = 60; i< 98 ; i++){
            Random r = new Random();
            int rem = r.nextInt((max - min) + 1) + min;
            int c = 22000-rem;
            int sum = 0;

            System.out.println("22000 - "+ rem +" = "+ c);
        }
            
        // System.out.println("Random Num: " + rem);
        //================================================================
		return 1;
	}

    private static void uniqueNum(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<98; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i=0; i<3; i++) {
            System.out.println(list.get(i));
        }
    }
}