package ua.nikiforov.tasks.codeingame.optimization.power_of_thor;import java.util.*;class Player{public static void main(String[]a){Scanner s=new Scanner(System.in);int x=s.nextInt();int y=s.nextInt();int i=s.nextInt();int j=s.nextInt();while(true){String d = "";d+=j>y?"N":j<y?"S":"";j+=j>y? -1 :j<y?1:0;d+=i>x?"W":i<x?"E":"";i+=i>x?1:i<x?-1:0;System.out.println(d);}}}