package day03;

import java.util.Arrays;

public class MusicPlayerJava {

    public static MusicPlayerJava INSTANCE=new MusicPlayerJava();

    public static MusicPlayerJava getInstance(){
        return  INSTANCE;
    }

    public static void  main(String ... args){

         MusicPlayer musicPlayer=MusicPlayer.INSTANCE;
         int [] ints=new int[]{22,662,99};
        Arrays.sort(ints);
        for(int i=0;i<ints.length;i++){
            System.out.println(ints[i]);
        }

    }
}


