package com.cg;

public class BannerApp {

    public static String[] printO(){
     return new String[]{
             "   ***    ",
             " **   **  ",
             "**     ** ",
             "**     ** ",
             "**     ** ",
             "**     ** ",
             "**     ** ",
             " **   **  ",
             "   ***    "
     };

    }



    public static String[] printP(){
        return new String[]{
                "******    ",
                "**    **  ",
                "**     ** ",
                "**    **  ",
                "******    ",
                "**        ",
                "**        ",
                "**        ",
                "**        "
        };

    }


    public static String[] printS(){
        return new String[]{
                "   ***** ",
                " **      ",
                "**       ",
                " **      ",
                "   ***   ",
                "      ** ",
                "       **",
                "      ** ",
                " *****   "
        };

    }

    public static void main(String[] args) {
        System.out.println("oops");

        String[] oPattern = printO();
        String[] pPattern = printP();
        String[] sPattern = printS();

        for(int i = 0; i < oPattern.length; i++){
            System.out.println(oPattern[i] + oPattern[i] + pPattern[i] + sPattern[i]);
        }
    }
}
