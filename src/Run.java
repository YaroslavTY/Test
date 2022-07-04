import java.util.Arrays;

public class Run {

    public static void main (String [] args) {
//        int i = 10;
//        switch ( i ) {
//            case 1:
//                System.out.println("1");
//            case 2:
//                System.out.println("2");
//            case 3:
//                System.out.println("3");
//            case 4:
//                System.out.println("4");
//                break;
//            case 5:
//                System.out.println("5");
//            default:
//                System.out.println("default");
//        }
//
//    }
//        int i = 0;
//        while (i <= 100) {
//            if (i%2==0)
//            System.out.println(i);
//            i++;
//        }

//        do {
//            System.out.println(i);
//            i++;
//        } while (i >= 100);
        //}
//        for (int i = 0; i <= 100; i++) {
//            System.out.println("i = " + i);
//        }
//        int i = 0;
//        for (; ;) {
//            if (i > 100) break;
//            i++;
//            if (i%2==0)  continue;
//                System.out.println(i);
//        }
        System.out.println(Arrays.toString(args));
        int a[]={1,2,3,4,5};
        System.out.println(a[2]);
        System.out.println(a[4]);
        System.out.println(a[a.length-1]);

        String s = "12";
        int parseInt = Integer.parseInt(s);
        //int i1 = parseInt + 1;
        System.out.println(parseInt + 1);
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
}

